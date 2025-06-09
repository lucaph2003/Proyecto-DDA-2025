package proyecto.pkgfinal.dominio.logic;

import java.util.ArrayList;
import proyecto.pkgfinal.dominio.model.Pedido;
import proyecto.pkgfinal.servicios.fachada.Fachada;

public class SistemaPedido{
    
    private final ArrayList<Pedido> listaPedidos = new ArrayList<>();

     
    public void AgregarPedido(Pedido pedido){
        listaPedidos.add(pedido);
        Fachada.getInstancia().avisar(Fachada.eventos_pedidos.pedidoAgregado);
    }
       
    public ArrayList<Pedido> getPedidos(){
        return listaPedidos;
    }
}
