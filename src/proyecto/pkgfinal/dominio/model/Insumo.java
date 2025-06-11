package proyecto.pkgfinal.dominio.model;

public class Insumo {
    private String nombre;
    private int stockMinimo;
    private int stockActual;

    public Insumo(String nombre, int stockMinimo, int stockActual) {
        this.nombre = nombre;
        this.stockMinimo = stockMinimo;
        this.stockActual = stockActual;
    }

    public String getNombre() {
        return nombre;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    public int getStockActual() {
        return stockActual;
    }

    public void setStockActual(int stockActual) {
        this.stockActual = stockActual;
    }


    public void desconstarStockActual(int cantidad) {
        this.stockActual -= cantidad;
    }

    public void agregarStock(int cantidad) {
        this.stockActual += cantidad;
    }
}
