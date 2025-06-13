package proyecto.pkgfinal.dominio.logic;

import java.util.ArrayList;
import proyecto.pkgfinal.dominio.model.Session;
import proyecto.pkgfinal.dominio.model.Usuario;
import proyecto.pkgfinal.dominio.model.exceptions.SessionException;
import proyecto.pkgfinal.dominio.model.Cliente;
import proyecto.pkgfinal.dominio.model.Gestor;
import proyecto.pkgfinal.dominio.model.Dispositivo;
import proyecto.pkgfinal.servicios.fachada.Fachada;

public class SistemaAccesso {

    private final ArrayList<Cliente> listaClientes;
    
    private final ArrayList<Gestor> listaGestores;
    
    private final ArrayList<Session> SesionesActivas;

    public SistemaAccesso(Fachada pFachada) {
        this.listaGestores = new ArrayList<>();
        this.listaClientes = new ArrayList<>();
        this.SesionesActivas = new ArrayList<>();
    }
    
    public void LoginCliente(String numeroCliente, String password, Dispositivo dispositivo) throws SessionException {
        Cliente cliente = (Cliente) buscarUsuario(numeroCliente,password,listaClientes);
        if(cliente!=null){
            if(Fachada.getInstancia().existeSesionEnDispositivo(dispositivo)) throw new SessionException("Debe primero finalizar el servicio actual.");

            if(Fachada.getInstancia().existeServicio(cliente)) throw new SessionException("Ud. ya esta identificado en otro dispositivo.");

            Fachada.getInstancia().AgregarServicioDispositivo(dispositivo,cliente);
            Fachada.getInstancia().avisar(Fachada.eventos_acceso.login);
        }else {
            throw new SessionException("Credenciales incorrectas.");   
        }   
    }

    public Session LoginGestor(String username, String password) throws SessionException {
        if(existeSesion(username))throw new SessionException("Acceso denegado. El usuario ya está logueado.");

        Gestor gestor = (Gestor) buscarUsuario(username,password,listaGestores);
        if(gestor!=null){
            Session s = new Session(gestor);
            SesionesActivas.add(s);
            return s;
        }else {
            throw new SessionException("Credenciales incorrectas.");
        }
    }

    private Usuario buscarUsuario(String username, String password, ArrayList lista){
        for(Object o:lista){
            Usuario u = (Usuario) o;
            if(u.getIdentificador().equals(username) && u.getPassword().equals(password)) return u;
        }
        return null;
    }

    private Boolean existeSesion(String Username){
        for(Session session : SesionesActivas){
            if(session.getUsuario().getIdentificador().equals(Username)) return true;
        }
        return false;
    }

    public void LogoutCliente(Dispositivo d){
        d.liberar();
    }

    public void AgregarCliente(Cliente cliente){
        listaClientes.add(cliente);
    }

    public void AgregarGestor(Gestor gestor){
        listaGestores.add(gestor);
    }

    public void logoutGestor(Session session) {
        SesionesActivas.remove(session);
    }
}