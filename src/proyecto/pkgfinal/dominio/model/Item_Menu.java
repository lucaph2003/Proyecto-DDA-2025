package proyecto.pkgfinal.dominio.model;

import java.util.ArrayList;

public class Item_Menu {
    private final String nombre;
    private final int precio;
    private final Unidad_Procesadora_Pedido unidadProcesaora;
    private final ArrayList<Ingrediente> ingredientes;

    public Item_Menu(String nombre, int precio,Unidad_Procesadora_Pedido uni) {
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientes = new ArrayList<>();
        this.unidadProcesaora = uni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }
    
    public void addIngrediente(Ingrediente ingrediente){
        ingredientes.add(ingrediente);
    }

    public Unidad_Procesadora_Pedido getUnidadProcesaora() {
        return unidadProcesaora;
    }

    public boolean tieneStock(){
        for(Ingrediente i : ingredientes){
            if(!i.estaDisponible()) return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nombre + " - $" + precio ;
    }

    public boolean esItem(String itemName) {
        return this.getNombre().contains(itemName);
    }

    public void descontarStock() {
        for(Ingrediente i : ingredientes){
            i.descontarStock();
        }
    }

    public void devolverStock() {
        for(Ingrediente i : ingredientes){
            i.devolverStock();
        }
    }

    public boolean esUnidad(Unidad_Procesadora_Pedido unidad) {
        return this.unidadProcesaora.equals(unidad);
    }
}
