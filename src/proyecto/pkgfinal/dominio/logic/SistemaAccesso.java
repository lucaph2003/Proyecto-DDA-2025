package proyecto.pkgfinal.dominio.logic;

import java.util.ArrayList;
import java.util.List;

import proyecto.pkgfinal.dominio.model.dto.Session;
import proyecto.pkgfinal.dominio.model.dto.Usuario;
import proyecto.pkgfinal.dominio.model.exceptions.SessionException;
import proyecto.pkgfinal.dominio.model.dto.Cliente;
import proyecto.pkgfinal.dominio.model.dto.Gestor;
import proyecto.pkgfinal.dominio.model.dto.Dispositivo;

public class SistemaAccesso {

    private ArrayList<Cliente> listaClientes = new ArrayList<>();
    private ArrayList<Gestor> listaGestores = new ArrayList<>();
    private ArrayList<Session> SesionesActivas = new ArrayList<>();

     public Session LoginCliente(String numeroCliente, String password, Dispositivo dispositivo) throws SessionException {

        if(existeSesionEnDispositivo(dispositivo)){
            throw new SessionException("Debe primero finalizar el servicio actual.");
        }

        if(existeSesion(numeroCliente)){
            throw new SessionException("Ud. ya esta identificado en otro dispositivo.");
        }
        
        Gestor gestor = (Gestor) buscarUsuario(numeroCliente,password,listaGestores);
        Session s = null;
        if(gestor!=null){
            s = new Session(gestor, dispositivo);
                SesionesActivas.add(s);
        }else {
            throw new SessionException("Credenciales incorrectas.");   
        }
        return s;        
    }

    public Session LoginGestor(String username, String password,Dispositivo dispositivo) throws SessionException {
        if(existeSesion(username)){
            throw new SessionException("Acceso denegado. El usuario ya está logueado.");
        }

        Cliente cliente = (Cliente) buscarUsuario(username,password,listaClientes);
        Session s = null;
        if(cliente!=null){
            s = new Session(cliente,dispositivo);
            SesionesActivas.add(s);
        }else {
            throw new SessionException("Credenciales incorrectas.");
        }
        return s;
    }


    private Usuario buscarUsuario(String username, String password, ArrayList lista){
        Usuario u;
        for(Object o:lista){
            u = (Usuario) o;
            if(u.getIdentificador().equals(username) && u.getPassword().equals(password)){
                return u;
            }
        }
        return null;
    }

    private Boolean existeSesionEnDispositivo(Dispositivo dispositivo){
        Session s;
        for(Session session : SesionesActivas){
            s =  session;
            if(s.getDispositivo().equals(dispositivo)){
                return true;
            }
        }
        return false;
    }

    private Boolean existeSesion(String Username){
        Session s;
        for(Session session : SesionesActivas){
            s =  session;
            if(s.getUsuario().getIdentificador().equals(Username)){
                return true;
            }
        }
        return false;
    }

    public void Logout(Session s){
        SesionesActivas.remove(s);
    }

    public void AgregarCliente(Cliente cliente){
        listaClientes.add(cliente);
    }

    public void AgregarGestor(Gestor gestor){
        listaGestores.add(gestor);
    }
    
}
