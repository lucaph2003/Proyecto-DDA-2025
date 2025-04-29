package proyecto.pkgfinal.dominio.logic;

import java.util.ArrayList;
import java.util.List;

import proyecto.pkgfinal.dominio.model.dto.Session;
import proyecto.pkgfinal.dominio.model.dto.Usuario;
import proyecto.pkgfinal.dominio.model.exceptions.SessionException;
import proyecto.pkgfinal.dominio.model.dto.Cliente;
import proyecto.pkgfinal.dominio.model.dto.Gestor;
import proyecto.pkgfinal.dominio.model.utils.enums.SessionTypesErrors;

public class SistemaAccesso {

    private ArrayList<Cliente> listaClientes = new ArrayList<>();
    private ArrayList<Gestor> listaGestores = new ArrayList<>();
    private ArrayList<Session> SesionesActivas = new ArrayList<>();

     public Session LoginGestor(String ci, String password) throws SessionException {
        if(!existeSesion(ci, SesionesActivas)){
            Gestor gestor = (Gestor) buscarUsuario(ci,password,listaGestores);
            Session s = null;
            if(gestor!=null){
                s = new Session(gestor);
                SesionesActivas.add(s);
            }else {
                throw new SessionException("Credenciales incorrectas.", SessionTypesErrors.BAD_CREDENTIALS);
            }
            return s;
        }else{
            throw new SessionException("Acceso denegado. El usuario ya está logueado.", SessionTypesErrors.SESION_EXISTENTE);
        }
    }

    public Session LoginCliente(String ci, String password) throws SessionException {
        if(!existeSesion(ci, SesionesActivas)){
            Cliente cliente = (Cliente) buscarUsuario(ci,password,listaClientes);
            Session s = null;
            if(cliente!=null){
                s = new Session(cliente);
                SesionesActivas.add(s);
            }else {
                throw new SessionException("Credenciales incorrectas.", SessionTypesErrors.BAD_CREDENTIALS);
            }
            return s;
        }else{
            throw new SessionException("Acceso denegado. El usuario ya está logueado.", SessionTypesErrors.SESION_EXISTENTE);
        }
    }


    private Usuario buscarUsuario(String username, String password, ArrayList lista){
        Usuario u;
        for(Object o:lista){
            u = (Usuario) o;
            if(u.getUsername().equals(username) && u.getPassword().equals(password)){
                return u;
            }
        }
        return null;
    }

    private Boolean existeSesion(String Username, List<Session> lista){
        Session s;
        for(Session session : lista){
            s =  session;
            if(s.getUsuario().getUsername().equals(Username)){
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
