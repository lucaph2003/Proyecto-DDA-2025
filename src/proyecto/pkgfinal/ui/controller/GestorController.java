package proyecto.pkgfinal.ui.controller;

import proyecto.pkgfinal.dominio.model.Gestor;
import proyecto.pkgfinal.dominio.model.Pedido;
import proyecto.pkgfinal.dominio.model.Session;
import proyecto.pkgfinal.servicios.fachada.Fachada;
import proyecto.pkgfinal.ui.vista.VistaGestor;

public class GestorController {
    private final Session session;
    private final VistaGestor vista;
    private Fachada fachada;

    public GestorController(VistaGestor v,Session s) {
        this.vista = v;
        this.fachada = Fachada.getInstancia();
        this.session = s;
    }
    
    public Gestor getGestor(){
        return (Gestor) this.session.getUsuario();
    }
    
    public void tomarPedido(Pedido p){
        try{
            
        }catch(Exception e){
            vista.mostrarEror(e.getMessage());
        }
    }
    
    public void finalizarPedido(Pedido p){
        try{
            
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
}
