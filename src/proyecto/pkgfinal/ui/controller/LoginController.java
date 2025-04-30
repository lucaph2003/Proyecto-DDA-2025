package proyecto.pkgfinal.ui.controller;

import proyecto.pkgfinal.servicios.fachada.Fachada;
import proyecto.pkgfinal.ui.vista.IVistaLogin;

public class LoginController {
     protected Fachada fachada;

    private IVistaLogin vista;

    public LoginController(IVistaLogin vista) {
        this.vista = vista;
        fachada = Fachada.getInstancia();
    }
}
