package proyecto.pkgfinal.dominio.model;

public class Insumo {
    private final  String nombre;
    private final  int stockMinimo;
    private int stockActual;

    public Insumo(String nombre, int stockMinimo, int stockActual) {
        this.nombre = nombre;
        this.stockMinimo = stockMinimo;
        this.stockActual = stockActual;
    }

    public int getStockActual() {
        return stockActual;
    }

    public void desconstarStockActual(int cantidad) {
        this.stockActual -= cantidad;
    }

    public void agregarStock(int cantidad) {
        this.stockActual += cantidad;
    }
}
