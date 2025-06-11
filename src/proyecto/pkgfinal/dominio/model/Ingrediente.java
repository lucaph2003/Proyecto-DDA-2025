package proyecto.pkgfinal.dominio.model;

public class Ingrediente {
    private int cantidad;
    private Insumo insumo;

    public Ingrediente(int cantidad, Insumo insumo) {
        this.cantidad = cantidad;
        this.insumo = insumo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Insumo getInsumo() {
        return insumo;
    }

    public void setInsumo(Insumo insumo) {
        this.insumo = insumo;
    }
    
    public boolean estaDisponible(){
        return cantidad <= insumo.getStockActual();
    }

    public void descontarStock() {
        this.insumo.desconstarStockActual(this.cantidad);
    }

    public void devolverStock() {
        this.insumo.agregarStock(this.cantidad);
    }
}
