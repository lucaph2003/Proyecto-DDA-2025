
package proyecto.pkgfinal.ui.interfaces;

import java.util.ArrayList;
import proyecto.pkgfinal.dominio.model.Categoria;
import proyecto.pkgfinal.dominio.model.Item_Menu;
import proyecto.pkgfinal.dominio.model.Pedido;

public interface IVistaDispositivo extends IVista{
    public void login();
    public void agregarPedido();
    public void eliminarPedido();
    public void confirmarPedidos();
    public void finalizarServicio();
    public void mostrarCategorias(ArrayList<Categoria> lista);
    public void mostrarSesion(String nombreCompleto);
    public void mostrarOk(String mensaje);
    public void mostrarItems(ArrayList<Item_Menu> lis);
    public void actualizarPedidos(ArrayList<Pedido> lista);
}
