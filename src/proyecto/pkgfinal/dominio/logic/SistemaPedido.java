package proyecto.pkgfinal.dominio.logic;

import java.util.ArrayList;
import proyecto.pkgfinal.dominio.model.dto.Pedido;
import proyecto.pkgfinal.servicios.fachada.Fachada;

public class SistemaPedido{
    
    private ArrayList<Pedido> listaPedidos = new ArrayList<>();

     
    public void AgregarPedido(Pedido pedido){
        System.out.println("Entramo");
        listaPedidos.add(pedido);
        Fachada.getInstancia().avisar(Fachada.eventos_pedidos.pedidoAgregado);
    }
       
    public ArrayList<Pedido> getPedidos(){
        return listaPedidos;
    }
}
