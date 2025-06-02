package proyecto.pkgfinal.dominio.model.dto;

import java.util.ArrayList;

import proyecto.pkgfinal.dominio.model.utils.enums.ServicioStatus;

public class Servicio {
    private final int id;
    private double montoTotal;
    private ArrayList<Pedido> pedidos;
    private ServicioStatus estado;
    private Cliente cliente;
    
    private static int contador = 0;

    public Servicio(double montoTotal, ArrayList<Pedido> pedidos) {
        this.id = contador++;
        this.montoTotal = montoTotal;
        this.pedidos = pedidos;
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
    
    
    
    
}
