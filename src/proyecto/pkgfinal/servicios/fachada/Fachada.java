package proyecto.pkgfinal.servicios.fachada;

import java.util.ArrayList;

import proyecto.pkgfinal.dominio.logic.*;
import proyecto.pkgfinal.dominio.model.Categoria;
import proyecto.pkgfinal.dominio.model.Cliente;
import proyecto.pkgfinal.dominio.model.Dispositivo;
import proyecto.pkgfinal.dominio.model.Gestor;
import proyecto.pkgfinal.dominio.model.Insumo;
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
    private final SistemaUnidadProcesadora sUnidadProcesadora;
    private final SistemaInsumo sInsumo;

    //Eventos
    public enum eventos_pedidos {pedidoAgregado, pedidoEliminado, pedidoFinalizado, pedidosConfirmados, pedidoEnProceso, pedidoEntregado};
    
    public enum eventos_acceso { login };
    
    //Singleton
    private static Fachada instancia;
    private Fachada(){
        sAcceso = new SistemaAccesso(this);
        sDispositivo = new SistemaDispositivo();
        sCategoria = new SistemaCategoria();
        sUnidadProcesadora = new SistemaUnidadProcesadora();
        sInsumo = new SistemaInsumo();
    }
    
    public static Fachada getInstancia(){
        if(instancia == null) {
            instancia = new Fachada();
        }
        return instancia;
    }
    
    //Métodos para las precargas
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
        sUnidadProcesadora.AgregarUnidadProcesadora(unidad);
    }

    public void AgregarCategoria(Categoria categoria){
        sCategoria.AgregarCategoria(categoria);
    }

    public void AgregarInsumo(Insumo insumo){
        sInsumo.AgregarInsumo(insumo);
    }

    //Metodos para Sistema de Acceso al Sistema
     public Session LoginGestor(String username, String password) throws SessionException {
        return sAcceso.LoginGestor(username, password);
    }

    public void LoginCliente(String username, String password,Dispositivo dispositivo) throws SessionException {
        sAcceso.LoginCliente(username, password,dispositivo);
    }
    
    public void Logout(Dispositivo d){
        this.sAcceso.LogoutCliente(d);
    }


    public void logoutGestor(Session session) {
        this.sAcceso.logoutGestor(session);
    }

    //Métodos para Sistema Dispositivo
    public ArrayList<Dispositivo> getDispositivos(){
        return sDispositivo.getDispositivos();
    }
     
     public Dispositivo getDispositivo(Dispositivo d) {
        return sDispositivo.getDispositivo(d);
    }
     
    public boolean existeSesionEnDispositivo(Dispositivo dispositivo) {
        return sDispositivo.existeSesionEnDispositivo(dispositivo);
    }

    public boolean existeServicio(Cliente cliente) {
        return sDispositivo.existeServicio(cliente);
    }

    public void AgregarServicioDispositivo(Dispositivo dispositivo,Cliente c) {
        sDispositivo.AgregarServicioDispositivo(dispositivo,c);
    }

    public void AgregarPedido(Pedido pedido, Dispositivo dispositivo) {
        sDispositivo.AgregarPedido(pedido,dispositivo);
    }
    
    //Métodos para Sistema de Categorias
    public ArrayList<Categoria> VerCategorias(){
        return sCategoria.getCategorias();
    }

    //Métodos para sistema de Servicio
    public ArrayList<Pedido> getPedidosByGestor(Gestor g){
        return sDispositivo.getPedidosByGestor(g);
    }

    public ArrayList<Pedido> getPedidosByUnidadProcesadora(Unidad_Procesadora_Pedido unidad){
        return sDispositivo.getPedidosByUnidadProcesadora(unidad);
    }

    public void tomarPedido(Pedido pedido, Gestor usuario) {
        sDispositivo.tomarPedido(pedido,usuario);
    }

    public void finalizarPedido(Pedido pedido) {
        sDispositivo.finalizarPedido(pedido);
    }

    public void entregarPedido(Pedido pedido) {
        sDispositivo.entregarPedido(pedido);
    }


}
