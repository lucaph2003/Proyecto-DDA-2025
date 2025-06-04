package proyecto.pkgfinal.ui.interfaces;

import java.util.ArrayList;
import proyecto.pkgfinal.dominio.model.Pedido;

public interface IVistaGestor extends IVista {
    void actualizarPedidosPendientes(ArrayList<Pedido> lista);
    void tomarPedido();
    void actualizarPedidosTomados(ArrayList<Pedido> lista);
    void finalizarServicio();
    void entregarPedido();
}
