package proyecto.pkgfinal.dominio.model;

import java.util.Date;
import proyecto.pkgfinal.dominio.model.helpers.enums.PedidoStatus;

public class Pedido {
    private final int id;
    private Item_Menu item;
    private String Comentario;
    private PedidoStatus estado;
    private Gestor gestorAsignado;
    private Date fechaHora;
    
    private static int contador = 0;

    public Pedido(Item_Menu item, String Comentario) {
        this.id = contador++;
        this.item = item;
        this.estado = PedidoStatus.NO_CONFIRMADO;
        this.Comentario = Comentario;
        this.fechaHora = new Date();
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

    public void confirmar(){
        this.estado = PedidoStatus.CONFIRMADO;
    }

    public void cancelar(){

    }

    public void setGestor(Gestor gestor){
        this.gestorAsignado = gestor;
    }

    public PedidoStatus getEstado() {
        return estado;
    }

    public void setEstado(PedidoStatus estado) {
        this.estado = estado;
    }
   

    public Gestor getGestorAsignado() {
        return gestorAsignado;
    }

    public int calcularPrecio() {
        return this.item.getPrecio();
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    boolean esSinConfirmar() {
        return ( this.estado == PedidoStatus.NO_CONFIRMADO );
    }
    
    
    
    
    
    
}
