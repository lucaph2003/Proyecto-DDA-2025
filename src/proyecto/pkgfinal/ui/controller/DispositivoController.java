package proyecto.pkgfinal.ui.controller;

import proyecto.pkgfinal.dominio.model.dto.Dispositivo;
import proyecto.pkgfinal.dominio.model.dto.Session;
import proyecto.pkgfinal.dominio.model.exceptions.SessionException;
import proyecto.pkgfinal.servicios.fachada.Fachada;
import proyecto.pkgfinal.servicios.observador.Observable;
import proyecto.pkgfinal.servicios.observador.Observador;
import proyecto.pkgfinal.ui.vista.VentanaDispositivo;

public class DispositivoController implements Observador {
    
    private Session session;
    private VentanaDispositivo vista;
    private Fachada fachada;

    public DispositivoController(VentanaDispositivo v) {
        this.vista = v;
        this.fachada = Fachada.getInstancia();
        inicializarVista();
    }

    @Override
    public void actualizar(Observable origen, Object evento) {
        //TODO aca verificar eventos y mosttrar en la lista
        if(evento == null){
            
        }
    }

    private void inicializarVista() {
        vista.inicializar();
    }
    
    
    //Eventos del usuario
    public void login(String numeroUsuario,String password,Dispositivo dispositivo){
        try{
            Session sesion = fachada.LoginCliente(numeroUsuario, password, dispositivo); 
            this.session = sesion;
            vista.mostrarSesion();
            vista.mostrarOk("Logueado con exito! Bienvenido, "+ session.getUsuario().getNombreCompleto().show());
        }catch(SessionException ex){
            vista.mostrarEror(ex.getMessage());
        } 
    }
    
    public void logout(){
        fachada.Logout(session);
    }
    
    
    
}
