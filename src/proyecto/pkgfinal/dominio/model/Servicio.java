package proyecto.pkgfinal.dominio.model;

import java.util.ArrayList;

import proyecto.pkgfinal.dominio.model.utils.enums.ServicioStatus;

public class Servicio {
    private final int id;
    private double montoTotal;
    private ArrayList<Pedido> pedidos;
    private ServicioStatus estado;
    
    private static int contador = 0;

    public Servicio() {
        this.id = contador++;
        this.montoTotal = 0;
        this.pedidos = new ArrayList<>();
        this.estado = ServicioStatus.ACTIVO;
    }

    public int getId() {
        return id;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Servicio.contador = contador;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public ServicioStatus getEstado() {
        return estado;
    }

    public void setEstado(ServicioStatus estado) {
        this.estado = estado;
    }

    public void agregarPedido(Pedido pedido) {
        this.pedidos.add(pedido);
    }
    
    
    
    
    
}
