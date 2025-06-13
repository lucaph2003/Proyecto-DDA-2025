package proyecto.pkgfinal.ui.controller;

import proyecto.pkgfinal.dominio.model.Session;
import proyecto.pkgfinal.dominio.model.exceptions.SessionException;
import proyecto.pkgfinal.servicios.fachada.Fachada;
import proyecto.pkgfinal.ui.vista.VistaGestor;
import proyecto.pkgfinal.ui.vista.VistaLoginGestor;

public class LoginGestorController {
    private final VistaLoginGestor vista;
    private final Fachada fachada;

    public LoginGestorController(VistaLoginGestor vista) {
        this.vista = vista;
        this.fachada = Fachada.getInstancia();
        vista.inicializar();
    }
    
    public void login(String usuario, String password){
        try{
            Session s = fachada.LoginGestor(usuario, password);
            new VistaGestor(s);
            vista.cerrar();
        }catch(SessionException ex){
            vista.mostrarEror(ex.getMessage());
        }
    }

}
