package proyecto.pkgfinal.dominio.model.dto;

import java.util.ArrayList;

public class Item_Menu {
    private String nombre;
    private int precio;
    private ArrayList<Ingrediente> ingredientes;

    public Item_Menu(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientes = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }
    
    
    
}
