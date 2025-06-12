package proyecto.pkgfinal.ui.controller;

import proyecto.pkgfinal.dominio.model.Gestor;
import proyecto.pkgfinal.dominio.model.Item_Menu;
import proyecto.pkgfinal.dominio.model.Pedido;
import proyecto.pkgfinal.dominio.model.Session;
import proyecto.pkgfinal.dominio.model.exceptions.NoSelectedOptionMenu;
import proyecto.pkgfinal.servicios.fachada.Fachada;
import proyecto.pkgfinal.servicios.observador.Observable;
import proyecto.pkgfinal.servicios.observador.Observador;
import proyecto.pkgfinal.ui.vista.VistaGestor;

import java.util.ArrayList;

public class GestorController implements Observador {
    private final Session session;
    private final VistaGestor vista;
    private Fachada fachada;

    public GestorController(VistaGestor v,Session s) {
        this.vista = v;
        this.fachada = Fachada.getInstancia();
        this.session = s;
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

    public void listarPedidosGestor(){
        vista.actualizarPedidosTomados(fachada.getPedidosByGestor((Gestor) this.session.getUsuario()));
    }
    
    public void tomarPedido(int posPedido){
        try{
            if(posPedido!=-1){
                Pedido pedido = vista.getPedidoPendientePorPoscicion(posPedido);
                fachada.tomarPedido(pedido,(Gestor) session.getUsuario());
                actualizarVista();
            }else {
                throw new NoSelectedOptionMenu("Debe seleccionar un pedido");
            }
        }catch(Exception e){
            vista.mostrarEror(e.getMessage());
        }
    }
    
    public void finalizarPedido(Pedido p){
        try{
            if(p == null) throw new NoSelectedOptionMenu("Debe seleccionar un pedido");

            //TODO si el pedido ya esta finalizado error

        }catch(Exception e){
            vista.mostrarEror(e.getMessage());
        }
    }
    
    public void entregarPedido(Pedido p){
        try{
            
        }catch(Exception e){
            vista.mostrarEror(e.getMessage());
        }
    }

    public void finarServicio() {
        //TODO Implementacion de finalizar servicio
        
    }

    @Override
    public void actualizar(Observable origen, Object evento) {
        //TODO configurar eventos
    }

    public void logout() {
        fachada.logoutGestor(session);
    }
}
