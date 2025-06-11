package proyecto.pkgfinal.dominio.model;

import java.util.ArrayList;

public class Categoria {
    private String nombre;
    private ArrayList<Item_Menu> items;

    public Categoria(String Nombre) {
        this.nombre = Nombre;
        this.items = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public ArrayList<Item_Menu> getItems() {
        return items;
    }
    
     public ArrayList<Item_Menu> getItemsStock() {
        ArrayList<Item_Menu> items_Disponibles =  new ArrayList<>();
        for(Item_Menu item : items){
            if(item.tieneStock()) items_Disponibles.add(item);
        }
        return items_Disponibles;
    }

    public void setItems(ArrayList<Item_Menu> items) {
        this.items = items;
    }
    
    public void addItem(Item_Menu item){
        items.add(item);
    }

    public void removeItem(Item_Menu item){
        items.remove(item);
    }

    @Override
    public String toString() {
        return nombre;
    }

    public Item_Menu getItemByPos(int posItem) {
        return items.get(posItem);
    }
    

    
}
