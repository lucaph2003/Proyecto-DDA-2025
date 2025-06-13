package proyecto.pkgfinal.ui.controller;

import proyecto.pkgfinal.dominio.model.Gestor;
import proyecto.pkgfinal.dominio.model.Pedido;
import proyecto.pkgfinal.dominio.model.Session;
import proyecto.pkgfinal.dominio.model.exceptions.NoSelectedOptionMenu;
import proyecto.pkgfinal.dominio.model.exceptions.PedidoException;
import proyecto.pkgfinal.servicios.fachada.Fachada;
import proyecto.pkgfinal.servicios.observador.Observable;
import proyecto.pkgfinal.servicios.observador.Observador;
import proyecto.pkgfinal.ui.vista.VistaGestor;

import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class GestorController implements Observador {
    private final Session session;
    private final VistaGestor vista;
    private Fachada fachada;
    private ArrayList<Pedido> pedidosTomados;

    public GestorController(VistaGestor v,Session s) {
        this.vista = v;
        this.fachada = Fachada.getInstancia();
        this.session = s;
        pedidosTomados = new ArrayList<>();
        fachada.agregar(this);
        actualizarVista();
    }
    
    public Gestor getGestor(){
        return (Gestor) this.session.getUsuario();
    }

    public void actualizarVista(){
        this.listarPedidosGestor();
        this.listarPedidosUnidadProcesadora();
    }

    private void listarPedidosUnidadProcesadora(){
        vista.actualizarPedidosPendientes(fachada.getPedidosByUnidadProcesadora(((Gestor) this.session.getUsuario()).getUnidadAsignada()));
    }

    private void listarPedidosGestor(){
        pedidosTomados = fachada.getPedidosByGestor((Gestor) this.session.getUsuario());
        vista.actualizarPedidosTomados(this.pedidosTomados);
    }
    
    public void tomarPedido(int posPedido){
        try{
            if(posPedido!=-1){
                Pedido pedido = vista.getPedidoPendientePorPoscicion(posPedido);
                fachada.tomarPedido(pedido,(Gestor) session.getUsuario());
                actualizarVista();
            }else {
                throw new NoSelectedOptionMenu("Debe seleccionar un pedido para tomar.");
            }
        }catch(Exception e){
            vista.mostrarEror(e.getMessage());
        }
    }
    
    public void finalizarPedido(int posPedido){
        try{
            if(posPedido!=-1){
                Pedido pedido = pedidosTomados.get(posPedido);
                fachada.finalizarPedido(pedido);
                actualizarVista();
            }else {
                throw new NoSelectedOptionMenu("Debe seleccionar un pedido para finalizar.");
            }
        }catch(Exception e){
            vista.mostrarEror(e.getMessage());
        }
    }
    
    public void entregarPedido(int posPedido){
        try{
            if(posPedido!=-1){
                Pedido pedido = pedidosTomados.get(posPedido);
                fachada.entregarPedido(pedido);
                actualizarVista();
            }else {
                throw new NoSelectedOptionMenu("Debe seleccionar un pedido para entregar.");
            }
        }catch(Exception e){
            vista.mostrarEror(e.getMessage());
        }
    }

    @Override
    public void actualizar(Observable origen, Object evento) {
        if(evento == Fachada.eventos_pedidos.pedidosConfirmados ||evento == Fachada.eventos_pedidos.pedidoEnProceso || evento == Fachada.eventos_pedidos.pedidoEliminado ){
            actualizarVista();
        }
    }

    public void logout() {
        try{
            if(fachada.tienePedidosPendientes((Gestor) session.getUsuario())) throw new PedidoException("Tiene pedidos pendientes");
            fachada.logoutGestor(session);
            vista.dispose();
        }catch(PedidoException pex){
            vista.mostrarEror(pex.getMessage());
        }
    }
}
