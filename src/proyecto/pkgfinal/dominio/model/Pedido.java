package proyecto.pkgfinal.dominio.model;

import java.util.Date;
import proyecto.pkgfinal.dominio.model.exceptions.NoStockException;
import proyecto.pkgfinal.dominio.model.exceptions.PedidoException;
import proyecto.pkgfinal.dominio.model.helpers.enums.PedidoStatus;
import proyecto.pkgfinal.servicios.fachada.Fachada;

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

    public String getComentario() {
        return Comentario;
    }

    public void confirmar() throws NoStockException {
        if(!this.item.tieneStock()) throw new NoStockException(item.getNombre());
        this.item.descontarStock();
        this.estado = PedidoStatus.CONFIRMADO;
        Fachada.getInstancia().avisar(PedidoStatus.CONFIRMADO);
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
        return item.toString() +
                "- Cliente: "+
                " " + fechaHora.toString();
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    boolean esSinConfirmar() {
        return ( this.estado == PedidoStatus.NO_CONFIRMADO );
    }

    public boolean estaElaborandose() {
        return this.estado.equals(PedidoStatus.EN_PROCESO);
    }

    public boolean esConfirmado() {
        return ( this.estado == PedidoStatus.CONFIRMADO );
    }

    public void devolverStock() {
        this.item.devolverStock();
    }

    public void verificarStock() throws NoStockException {
        if(!this.item.tieneStock()) throw new NoStockException(item) ;
    }

    public boolean esUnidad(Unidad_Procesadora_Pedido unidad) {
        return this.item.esUnidad(unidad);
    }

    public void finalizar() throws PedidoException {
        if (this.getEstado().equals(PedidoStatus.FINALIZADO)) throw new PedidoException("El pedido ya es finalizado.");
        this.setEstado(PedidoStatus.FINALIZADO);
        Fachada.getInstancia().avisar(Fachada.eventos_pedidos.pedidoFinalizado);
    }

    public void asignarGestor(Gestor usuario) {
        this.setGestor(usuario);
        this.setEstado(PedidoStatus.EN_PROCESO);
        Fachada.getInstancia().avisar(Fachada.eventos_pedidos.pedidoEnProceso);
    }

    public void entregar() throws PedidoException {
        if(this.getEstado().equals(PedidoStatus.ENTREGADO)) throw new PedidoException("El pedido ya fue entregado.");
        if(!this.getEstado().equals(PedidoStatus.FINALIZADO)) throw new PedidoException("Debe Finalizar el pedido antes de entregarlo.");
        this.setEstado(PedidoStatus.ENTREGADO);
        Fachada.getInstancia().avisar(Fachada.eventos_pedidos.pedidoEntregado);
    }

}
