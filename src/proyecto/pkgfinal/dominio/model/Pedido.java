package proyecto.pkgfinal.dominio.model;

import java.util.Date;

import proyecto.pkgfinal.dominio.model.exceptions.NoStockException;
import proyecto.pkgfinal.dominio.model.helpers.enums.PedidoStatus;

public class Pedido {
    private final int id;
    private Item_Menu item;
    private String Comentario;
    private PedidoStatus estado;
    private Gestor gestorAsignado;
    private Date fechaHora;
    
    private static int contador = 0;

    public Pedido(Item_Menu item, String Comentario) throws NoStockException {
        //TODO crear un evento que gestione cada vez que se confirma se verifique el stock de los demas
        if(! item.tieneStock()) throw new NoStockException(item);
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

    public void confirmar() throws NoStockException {
        if(!this.item.tieneStock()) throw new NoStockException(item.getNombre());
        this.item.descontarStock();
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

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", item=" + item.toString() +
                ", Comentario='" + Comentario + '\'' +
                ", estado=" + estado +
                ", fechaHora=" + fechaHora.toString() +
                '}';
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    boolean esSinConfirmar() {
        return ( this.estado == PedidoStatus.NO_CONFIRMADO );
    }


    public void tieneStock() {


    }

    public boolean estaElaborandose() {
        return this.estado.equals(PedidoStatus.EN_PROCESO);
    }
}
