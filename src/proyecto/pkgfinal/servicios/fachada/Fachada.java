package proyecto.pkgfinal.servicios.fachada;

import java.util.ArrayList;
import proyecto.pkgfinal.dominio.logic.SistemaAccesso;
import proyecto.pkgfinal.dominio.logic.SistemaCategoria;
import proyecto.pkgfinal.dominio.logic.SistemaDispositivo;
import proyecto.pkgfinal.dominio.logic.SistemaPedido;
import proyecto.pkgfinal.dominio.model.Categoria;
import proyecto.pkgfinal.dominio.model.Cliente;
import proyecto.pkgfinal.dominio.model.Dispositivo;
import proyecto.pkgfinal.dominio.model.Gestor;
import proyecto.pkgfinal.dominio.model.Ingrediente;
import proyecto.pkgfinal.dominio.model.Insumo;
import proyecto.pkgfinal.dominio.model.Item_Menu;
import proyecto.pkgfinal.dominio.model.Pedido;
import proyecto.pkgfinal.dominio.model.Session;
import proyecto.pkgfinal.dominio.model.Unidad_Procesadora_Pedido;
import proyecto.pkgfinal.dominio.model.exceptions.SessionException;
import proyecto.pkgfinal.servicios.observador.Observable;

public class Fachada extends Observable {

    //Sistemas
    private final SistemaAccesso sAcceso;
    private final SistemaDispositivo sDispositivo;
    private final SistemaCategoria sCategoria;
    private final SistemaPedido sPedido;


    
    //Eventos
    public enum eventos_pedidos {pedidoAgregado, pedidoEliminado};
    
    public enum eventos_acceso { login};
    
    //Singleton
    private static Fachada instancia;
    private Fachada(){
        sAcceso = new SistemaAccesso();
        sDispositivo = new SistemaDispositivo();
        sCategoria = new SistemaCategoria();
        sPedido = new SistemaPedido();
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
        sCategoria.AgregarCategoria(categoria);
    }

    public void AgregarItemsMenu(Item_Menu item){

    }

    public void AgregarInsumo(Insumo insumo){

    }
    
    public void AgregarIngrediente(Ingrediente ingrediente){

    }
    

    //Metodos para Sistema de Acceso al Sistema
     public Session LoginGestor(String username, String password) throws SessionException {
        return sAcceso.LoginGestor(username, password);
    }

    public Dispositivo LoginCliente(String username, String password,Dispositivo dispositivo) throws SessionException {
        return sAcceso.LoginCliente(username, password,dispositivo);
    }
    
    public void Logout(Dispositivo d){
        this.sAcceso.LogoutCliente(d);
    }
    
    //MEtodos para Sistema Dispositivo
     public ArrayList<Dispositivo> getDispositivos(){
        return sDispositivo.getDispositivos();
    }
     
    public boolean existeSesionEnDispositivo(Dispositivo dispositivo) {
        return sDispositivo.existeSesionEnDispositivo(dispositivo);
    }

    public boolean existeServicio(Cliente cliente) {
        return sDispositivo.existeServicio(cliente);
    }

    public Dispositivo AgregarServicioDispositivo(Dispositivo dispositivo,Cliente c) {
        return sDispositivo.AgregarServicioDispositivo(dispositivo,c);
    }
    
    
    //Metodos para Sistema de Categorias
    public ArrayList<Categoria> VerCategorias(){
        return sCategoria.getCategorias();
    }

    //Metodos para Sistem de Pedidos
    public void AgregarPedido(Pedido pedido) {
        sPedido.AgregarPedido(pedido);
    }
    
    public ArrayList<Pedido> getPedidos(){
        return sPedido.getPedidos();
    }

    
}
