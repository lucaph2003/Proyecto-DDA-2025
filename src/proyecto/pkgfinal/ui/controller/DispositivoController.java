package proyecto.pkgfinal.ui.controller;

import java.util.ArrayList;
import proyecto.pkgfinal.dominio.model.Categoria;
import proyecto.pkgfinal.dominio.model.Dispositivo;
import proyecto.pkgfinal.dominio.model.Item_Menu;
import proyecto.pkgfinal.dominio.model.Pedido;
import proyecto.pkgfinal.dominio.model.exceptions.SessionException;
import proyecto.pkgfinal.servicios.fachada.Fachada;
import proyecto.pkgfinal.servicios.observador.Observable;
import proyecto.pkgfinal.servicios.observador.Observador;
import proyecto.pkgfinal.ui.vista.VentanaDispositivo;

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
        //TODO aca verificar eventos y mosttrar en la lista
        if(evento == Fachada.eventos_pedidos.pedidoAgregado || evento == Fachada.eventos_pedidos.pedidoEliminado){
            actualizarVista();
        }
        
        if(evento == Fachada.eventos_acceso.login){
            System.out.println("Se logueo por evento!");
        }
    }
    
    private void actualizarVista(){
        vista.actualizarPedidos(dispositivo.getServicioActual().getPedidos());
    }
    
    //Eventos del usuario
    public void login(String numeroUsuario,String password){
        try{
            Dispositivo dispositivo1 = fachada.LoginCliente(numeroUsuario, password, dispositivo); 
            this.dispositivo = dispositivo1;
            vista.mostrarSesion(dispositivo1.getClienteLogueado().getNombreCompleto());
            vista.mostrarCategorias(fachada.VerCategorias());
            vista.mostrarOk("Logueado con exito! Bienvenido, "+ dispositivo.getClienteLogueado().getNombreCompleto());
        }catch(SessionException ex){
            vista.mostrarEror(ex.getMessage());
        } 
    }
    
    public void logout(){
        fachada.Logout(dispositivo);
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

    public void agregarPedido(String comentario, int posCategoria, int posItem) {
        try{
            if(posCategoria!=-1){
                Categoria categoria = fachada.VerCategorias().get(posCategoria);
                Item_Menu item = categoria.getItemByPos(posItem);
                Pedido pedido = new Pedido(item, comentario);
                
                //TODO hacer por fachada que mande un evento y el actualizar lo recibe por evento solamente
                dispositivo.getServicioActual().agregarPedido(pedido);
                actualizarVista();
            }else {
                vista.mostrarItems(null);
            }
        }catch(Exception ex){
            vista.mostrarEror(ex.getMessage());
        } 
    }

    public Dispositivo getDispositivo() {
        return this.dispositivo;
    }
    
    
}
