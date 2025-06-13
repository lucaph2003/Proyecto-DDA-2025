package proyecto.pkgfinal.dominio.model;

import java.util.ArrayList;

public class Categoria {
    private final String nombre;
    private final ArrayList<Item_Menu> items;

    public Categoria(String Nombre) {
        this.nombre = Nombre;
        this.items = new ArrayList<>();
    }
    
     public ArrayList<Item_Menu> getItemsStock() {
        ArrayList<Item_Menu> items_Disponibles =  new ArrayList<>();
        for(Item_Menu item : items){
            if(item.tieneStock()) items_Disponibles.add(item);
        }
        return items_Disponibles;
    }

    public void addItem(Item_Menu item){
        items.add(item);
    }

    @Override
    public String toString() {
        return nombre;
    }
}
