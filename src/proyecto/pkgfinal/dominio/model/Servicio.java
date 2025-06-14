package proyecto.pkgfinal.dominio.model;

import java.util.ArrayList;
import proyecto.pkgfinal.dominio.model.exceptions.NoStockException;
import proyecto.pkgfinal.dominio.model.exceptions.PedidoException;
import proyecto.pkgfinal.dominio.model.helpers.enums.ServicioStatus;
import proyecto.pkgfinal.servicios.fachada.Fachada;

public class Servicio {
    private final int id;
    private double montoTotal;
    private final ArrayList<Pedido> pedidos;
    private ServicioStatus estado;
    private String beneficioAsignado;
    private final Cliente cliente;
    
    private static int contador = 0;

    public Servicio(Cliente cli) {
        this.id = contador++;
        this.montoTotal = 0;
        this.pedidos = new ArrayList<>();
        this.estado = ServicioStatus.ACTIVO;
        this.cliente = cli;
    }

    public String getBeneficioAsignado() {
        return beneficioAsignado;
    }

    public void setBeneficioAsignado(String beneficioAsignado) {
        this.beneficioAsignado = beneficioAsignado;
    }

    public int getId() {
        return id;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void agregarPedido(Pedido pedido) {
        this.pedidos.add(pedido);
        this.montoTotal += pedido.calcularPrecio();
        Fachada.getInstancia().avisar(Fachada.eventos_pedidos.pedidoAgregado);
    }

    public Cliente getCliente(){
        return this.cliente;
    }

    @Override
    public String toString() {
        return "Servicio{" +
                "id=" + id +
                ", montoTotal=" + montoTotal +
                ", pedidos=" + pedidos +
                ", estado=" + estado.toString() +
                '}';
    }

    public void eliminarPedido(Pedido pedido) throws PedidoException {
        if(pedido.estaElaborandose()) throw new PedidoException("Un poco tarde...Ya estamos elaborando este pedido!");
        if(pedido.esConfirmado()) pedido.devolverStock();
        this.pedidos.remove(pedido);
        this.montoTotal -= pedido.calcularPrecio();
        Fachada.getInstancia().avisar(Fachada.eventos_pedidos.pedidoEliminado);
    }

    public void confirmarPedidos() throws PedidoException {
        for(Pedido p : this.pedidos){
            if(p.esSinConfirmar()){
                try{
                    p.confirmar();
                }catch(NoStockException nse){
                    eliminarPedido(p);
                    throw nse;
                }
            }
        }
        Fachada.getInstancia().avisar(Fachada.eventos_pedidos.pedidosConfirmados);
    }


    public boolean tienePedidosSinConfirmar() {
        for(Pedido p : pedidos){
            if (p.esSinConfirmar()) return true;
        }
        return false;
    }

    public int pedidosProcesados(){
        int contador = 0;
        for(Pedido p : pedidos){
            if (p.estaElaborandose()) contador++;
        }
        return contador;
    }

    public void finalizar(double descuentoAplicado) throws PedidoException {
        if(tienePedidosSinConfirmar()) throw new PedidoException("Tiene pedidos sin confirmar!");

        if(pedidosProcesados() > 0) throw new PedidoException("Tienes "+ pedidosProcesados() +" pedidos en proceso, recuerda ir a retirarlos!");

        this.montoTotal -= descuentoAplicado;
        this.estado = ServicioStatus.FINALIZADO;
    }

    public void verificarStockPedidos() throws PedidoException {
        for(Pedido p : pedidos){
            try{
                if(p.esSinConfirmar()) p.verificarStock();
            }catch (NoStockException nse){
                this.eliminarPedido(p);
                throw nse;
            }
        }
    }

    public ArrayList<Pedido> getPedidosByGestor(Gestor g) {
        ArrayList<Pedido> lista = new ArrayList<>();
        for (Pedido p : this.pedidos){
            if(p.getGestorAsignado() != null){
                if(p.getGestorAsignado().equals(g)) lista.add(p);
            }
        }
        return lista;
    }

    public ArrayList<Pedido> getPedidosByUnidadProcesadora(Unidad_Procesadora_Pedido unidad) {
        ArrayList<Pedido> lista = new ArrayList<>();
        for (Pedido p : this.pedidos){
            if(p.esUnidad(unidad) && p.esConfirmado()) lista.add(p);
        }
        return lista;
    }

    public boolean existePedido(Pedido pedido) {
        for (Pedido p : this.pedidos){
            if(p.equals(pedido)) return true;
        }
        return false;
    }

    public void asignarGestor(Pedido pedido, Gestor usuario) {
        for (Pedido p : this.pedidos){
            if(p.equals(pedido)) p.asignarGestor(usuario);
        }
    }

    public void finalizarPedido(Pedido pedido) throws PedidoException {
        for (Pedido p : this.pedidos){
            if(p.equals(pedido)) p.finalizar();
        }
    }

    public void entregarPedido(Pedido pedido) throws PedidoException {
        for (Pedido p : this.pedidos){
            if(p.equals(pedido)) p.entregar();
        }
    }

    public boolean tienePedidosPendientes(Gestor usuario) {
        for(Pedido p : pedidos){
            if(p.getGestorAsignado().equals(usuario) && p.estaElaborandose()) return true;
        }
        return false;
    }
}
