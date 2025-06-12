package proyecto.pkgfinal.dominio.model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

public class Dispositivo {
    private int numeroIdentificador;
    private Cliente clienteLogueado;
    private Servicio servicioActual;

    public Dispositivo(int numeroIdentificador) {
        this.numeroIdentificador = numeroIdentificador;
    }
    
    public int getNumeroIdentificador() {
        return numeroIdentificador;
    }

    public void setNumeroIdentificador(int numeroIdentificador) {
        this.numeroIdentificador = numeroIdentificador;
    }

    public Cliente getClienteLogueado() {
        return clienteLogueado;
    }

    public void setClienteLogueado(Cliente clienteLogueado) {
        this.clienteLogueado = clienteLogueado;
    }

    public Servicio getServicioActual() {
        return servicioActual;
    }

    public void setServicioActual(Servicio servicioActual) {
        this.servicioActual = servicioActual;
    }
    
    public void iniciarNuevoServicioCliente(Cliente c){
        this.clienteLogueado = c;
        this.servicioActual = new Servicio();
    }

    public void liberar(){
        this.servicioActual = null;
        this.clienteLogueado = null;
    }

    @Override
    public boolean equals(Object obj) {
        Dispositivo dispo = (Dispositivo) obj;
        return this.numeroIdentificador == dispo.getNumeroIdentificador();
    }

    @Override
    public String toString() {
        return "Dispositivo{" + "numeroIdentificador=" + numeroIdentificador + ", clienteLogueado=" + clienteLogueado + ", servicioActual=" + servicioActual.toString() + '}';
    }


    public boolean esLogueado() {
        return this.clienteLogueado != null;
    }

    public void agregarPedido(Pedido pedido) {
        this.servicioActual.agregarPedido(pedido);
    }

    public ArrayList<Pedido> getPedidosByGestor(Gestor g) {
        return this.servicioActual.getPedidosByGestor(g);
    }

    public ArrayList<Pedido> getPedidosByUnidadProcesadora(Unidad_Procesadora_Pedido unidad) {
        return this.servicioActual.getPedidosByUnidadProcesadora(unidad);
    }

    public boolean existePedido(Pedido pedido) {
        return this.servicioActual.existePedido(pedido);
    }

    public void asignarGestor(Pedido p,Gestor usuario) {
        this.servicioActual.asignarGestor(p,usuario);
    }
}
