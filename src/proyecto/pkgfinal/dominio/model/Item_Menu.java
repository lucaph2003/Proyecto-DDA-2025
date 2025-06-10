package proyecto.pkgfinal.dominio.model;

import java.util.ArrayList;

public class Item_Menu {
    private String nombre;
    private int precio;
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

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }
    
    public void addIngrediente(Ingrediente ingrediente){
        ingredientes.add(ingrediente);
    }

    public void removeIngrediente(Ingrediente ingrediente){
        ingredientes.remove(ingrediente);
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
        return this.getNombre().equals(itemName);
    }

    public void descontarStock() {
        for(Ingrediente i : ingredientes){
            i.descontarStock();
        }
    }
}
