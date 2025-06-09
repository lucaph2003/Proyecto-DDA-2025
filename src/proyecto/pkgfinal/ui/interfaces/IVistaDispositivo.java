
package proyecto.pkgfinal.ui.interfaces;

import java.util.ArrayList;
import java.util.List;
import proyecto.pkgfinal.dominio.model.Categoria;
import proyecto.pkgfinal.dominio.model.Item_Menu;
import proyecto.pkgfinal.dominio.model.Pedido;

public interface IVistaDispositivo extends IVista{
    void login();
    void agregarPedido();
    void eliminarPedido();
    void confirmarPedidos();
    void finalizarServicio();
    void mostrarCategorias(ArrayList<Categoria> lista);
    void mostrarSesion(String nombreCompleto);
    void mostrarOk(String mensaje);
    void mostrarItems(List<Item_Menu> lis);
    void actualizarPedidos(ArrayList<Pedido> lista);
    void actualizarMontoTotal(double montoTotal);
}
