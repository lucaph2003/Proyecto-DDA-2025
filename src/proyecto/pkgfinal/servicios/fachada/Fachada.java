package proyecto.pkgfinal.servicios.fachada;

import java.util.ArrayList;
import proyecto.pkgfinal.dominio.logic.SistemaAccesso;
import proyecto.pkgfinal.dominio.logic.SistemaDispositivo;
import proyecto.pkgfinal.dominio.model.dto.Categoria;
import proyecto.pkgfinal.dominio.model.dto.Cliente;
import proyecto.pkgfinal.dominio.model.dto.Dispositivo;
import proyecto.pkgfinal.dominio.model.dto.Gestor;
import proyecto.pkgfinal.dominio.model.dto.Insumo;
import proyecto.pkgfinal.dominio.model.dto.Item_Menu;
import proyecto.pkgfinal.dominio.model.dto.Session;
import proyecto.pkgfinal.dominio.model.dto.Unidad_Procesadora_Pedido;
import proyecto.pkgfinal.dominio.model.exceptions.SessionException;
import proyecto.pkgfinal.servicios.observador.Observable;

public class Fachada extends Observable {

    //Sistemas
    private SistemaAccesso sAcceso;
    private SistemaDispositivo sDispositivo;
    
    //Singleton
    private static Fachada instancia;
    private Fachada(){
        sAcceso = new SistemaAccesso();
        sDispositivo = new SistemaDispositivo();
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

    public void AgregarDispositivo(Dispositivo dispositivo){
        sDispositivo.AgregarDispositivo(dispositivo);
    }

    public void AgregarUnidadProcesadora(Unidad_Procesadora_Pedido unidad){

    }

    public void AgregarCategoria(Categoria categoria){

    }

    public void AgregarItemsMenu(Item_Menu item){

    }

    public void AgregarInsumo(Insumo insumo){

    }

    //Metodos para Sistema de Acceso al Sistema
     public Session LoginGestor(String username, String password,Dispositivo dispositivo) throws SessionException {
        return sAcceso.LoginGestor(username, password,dispositivo);
    }

    public Session LoginCliente(String username, String password,Dispositivo dispositivo) throws SessionException {
        return sAcceso.LoginCliente(username, password,dispositivo);
    }
    
    public void Logout(Session s){
        this.sAcceso.Logout(s);
    }
    
    //MEtodos para Sistema Dispositivo
     public ArrayList<Dispositivo> getDispositivos(){
        return sDispositivo.getDispositivos();
    }
    
    
    //Metodos para Sistema de Categorias
    // public ArrayList<Categoria> VerCategorias(){
        
    // }

    
}
