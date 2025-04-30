package proyecto.pkgfinal.dominio.model.dto;

public class Pedido {
    private int id;
    private Item_Menu item;
    private String Comentario;
    
    private static int contador = 0;

    public Pedido(Item_Menu item, String Comentario) {
        this.id = contador++;
        this.item = item;
        this.Comentario = Comentario;
    }

    public int getId() {
        return id;
    }

    public Item_Menu getItem() {
        return item;
    }

    public void setItem(Item_Menu item) {
        this.item = item;
    }

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String Comentario) {
        this.Comentario = Comentario;
    }

    
    
    
    
}
