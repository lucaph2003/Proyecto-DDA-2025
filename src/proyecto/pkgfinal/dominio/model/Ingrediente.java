package proyecto.pkgfinal.dominio.model;

public class Ingrediente {
    private final int cantidad;
    private final  Insumo insumo;

    public Ingrediente(int cantidad, Insumo insumo) {
        this.cantidad = cantidad;
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
