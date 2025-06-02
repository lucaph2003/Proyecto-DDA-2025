package proyecto.pkgfinal.ui.controller;

import proyecto.pkgfinal.dominio.model.dto.Session;
import proyecto.pkgfinal.servicios.fachada.Fachada;
import proyecto.pkgfinal.ui.vista.VistaGestor;

public class GestorController {
    private Session session;
    private VistaGestor vista;
    private Fachada fachada;

    public GestorController(VistaGestor v) {
        this.vista = v;
        this.fachada = Fachada.getInstancia();
        v.inicializar();
    }
}
