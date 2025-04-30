package proyecto.pkgfinal.servicios.fachada;

import proyecto.pkgfinal.dominio.logic.SistemaAccesso;
import proyecto.pkgfinal.dominio.model.dto.Cliente;
import proyecto.pkgfinal.dominio.model.dto.Dispositivo;
import proyecto.pkgfinal.dominio.model.dto.Gestor;
import proyecto.pkgfinal.dominio.model.dto.Session;
import proyecto.pkgfinal.dominio.model.exceptions.SessionException;

public class Fachada {

    //Sistemas
    private SistemaAccesso sAcceso;
    
    //Singleton
    private static Fachada instancia;
    private Fachada(){
        sAcceso = new SistemaAccesso();
    }
    
    public static Fachada getInstancia(){
        if(instancia == null) {
            instancia = new Fachada();
        }
        return instancia;
    }
    
    //Metodos para las precargas
    public void AgregarCliente(Cliente cliente){
        sAcceso.AgregarCliente(cliente);
    }

    public void AgregarGestor(Gestor gestor){
        sAcceso.AgregarGestor(gestor);
    }

    //Metodos para Sistema de Acceso al Sistema
     public Session LoginGestor(String username, String password,Dispositivo dispositivo) throws SessionException {
        return sAcceso.LoginGestor(username, password,dispositivo);
    }

    public Session LoginCliente(String username, String password,Dispositivo dispositivo) throws SessionException {
        return sAcceso.LoginCliente(username, password,dispositivo);
    }
    
    
}
