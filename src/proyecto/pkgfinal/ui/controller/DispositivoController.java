package proyecto.pkgfinal.ui.controller;

import proyecto.pkgfinal.dominio.model.Categoria;
import proyecto.pkgfinal.dominio.model.Dispositivo;
import proyecto.pkgfinal.dominio.model.Item_Menu;
import proyecto.pkgfinal.dominio.model.Pedido;
import proyecto.pkgfinal.dominio.model.exceptions.NoSelectedOptionMenu;
import proyecto.pkgfinal.dominio.model.exceptions.PedidoException;
import proyecto.pkgfinal.dominio.model.exceptions.SessionException;
import proyecto.pkgfinal.servicios.fachada.Fachada;
import proyecto.pkgfinal.servicios.observador.Observable;
import proyecto.pkgfinal.servicios.observador.Observador;
import proyecto.pkgfinal.ui.vista.VentanaDispositivo;

import java.util.ArrayList;

public class DispositivoController implements Observador {
    
    private Dispositivo dispositivo;
    private final VentanaDispositivo vista;
    private final Fachada fachada;

    public DispositivoController(VentanaDispositivo v,Dispositivo d) {
        this.vista = v;
        this.fachada = Fachada.getInstancia();
        this.dispositivo = d;
        fachada.agregar(this);
    }

    @Override
    public void actualizar(Observable origen, Object evento) {
        if(evento == Fachada.eventos_pedidos.pedidoAgregado || evento == Fachada.eventos_pedidos.pedidoEliminado ||  evento == Fachada.eventos_pedidos.pedidosConfirmados ||  evento == Fachada.eventos_pedidos.pedidoEnProceso ||  evento == Fachada.eventos_pedidos.pedidoFinalizado ||  evento == Fachada.eventos_pedidos.pedidoEntregado){
            if(dispositivo.esLogueado()){
                if(evento == Fachada.eventos_pedidos.pedidosConfirmados){
                    this.verificarStockPedidos();
                    actualizarVista(false);
                }else{
                    actualizarVista(true);
                }
            }
        }
        
        if(evento == Fachada.eventos_acceso.login){

            if(dispositivo.esLogueado()){
                vista.mostrarSesion(dispositivo.getClienteLogueado().getNombreCompleto());
                vista.mostrarOk("Logueado con exito! Bienvenido, "+ dispositivo.getClienteLogueado().getNombreCompleto());
            }
        }
    }
    
    private void actualizarVista(boolean limpiarError){
        vista.actualizarPedidos(dispositivo.getServicioActual().getPedidos());
        vista.actualizarMontoTotal(dispositivo.getServicioActual().getMontoTotal());
        if(limpiarError) vista.mostrarEror("");
    }
    
    //Eventos del usuario
    public void login(String numeroUsuario,String password){
        try{
            fachada.LoginCliente(numeroUsuario, password, dispositivo);
            this.dispositivo = fachada.getDispositivo(dispositivo);
        }catch(SessionException ex){
            vista.mostrarEror(ex.getMessage());
        } 
    }

    public ArrayList<Categoria> getCategorias(){
        return fachada.VerCategorias();
    }
    
    public void logout(){
        dispositivo.liberar();
        fachada.quitar(this);
    }
    
    public void cargarItems(int categoriaPos){
        try{
            if(categoriaPos!=-1){
                ArrayList<Item_Menu> items = fachada.VerCategorias().get(categoriaPos).getItemsStock();
                vista.mostrarItems(items);
            }else {
                vista.mostrarItems(null);
            }
        }catch(Exception ex){
            vista.mostrarEror(ex.getMessage());
        } 
    }

    public void agregarPedido(String comentario,  Item_Menu item) {
        try{
            if(!this.dispositivo.esLogueado()) throw new SessionException("Debe identificarse antes de realizar pedidos.");
            if(item == null) throw new NoSelectedOptionMenu("Debe Seleccionar un item.");

            Pedido pedido = new Pedido(item, comentario,dispositivo.getServicioActual());
            dispositivo.getServicioActual().agregarPedido(pedido);
        }catch(Exception ex){
            vista.mostrarEror(ex.getMessage());
        } 
    }

    public Dispositivo getDispositivo() {
        return this.dispositivo;
    }

    private void verificarStockPedidos(){
        try{
            dispositivo.getServicioActual().verificarStockPedidos();
        }catch(PedidoException nse){
            vista.mostrarEror(nse.getMessage());
        }
    }
    
    public void eliminarPedido(int filaSeleccionada){

        try{
            if(!this.dispositivo.esLogueado()) throw new SessionException("Debe identificarse antes de eliminar pedidos.");

            if(filaSeleccionada == -1) throw new NoSelectedOptionMenu("Debe Seleccionar un pedido.");

            ArrayList<Pedido> lista = dispositivo.getServicioActual().getPedidos() ;
            Pedido pedido = lista.get(filaSeleccionada);

            dispositivo.getServicioActual().eliminarPedido(pedido);
        }catch(Exception ex){
            vista.mostrarEror(ex.getMessage());
        }
    }
    
    public void confirmarPedidos(){
        try{
            if(!this.dispositivo.esLogueado()) throw new SessionException("Debe identificarse antes de confirmar el servicio.");

            if(!dispositivo.getServicioActual().tienePedidosSinConfirmar()) throw new NoSelectedOptionMenu("No hay pedidos nuevos.");

            dispositivo.getServicioActual().confirmarPedidos();
        }catch(Exception ex){
            vista.mostrarEror(ex.getMessage());
        }
    }

    public void finalizarServicio() {
        try{
            if(!this.dispositivo.esLogueado()) throw new SessionException("Debe identificarse antes de finalizar el servicio.");

            if(!dispositivo.getServicioActual().getPedidos().isEmpty()){
                double beneficio = dispositivo.getClienteLogueado().getTipoCliente().calcularDescuento(dispositivo.getServicioActual());
                dispositivo.getServicioActual().finalizar(beneficio);
                vista.mostrarFacturaFinal("Pago Realizado!",String.valueOf(dispositivo.getServicioActual().getMontoTotal()), dispositivo.getServicioActual().getBeneficioAsignado(),String.valueOf(beneficio));
            }

            vista.cerrar();
        }catch(Exception ex){
            vista.mostrarEror(ex.getMessage());
        }
    }
}
