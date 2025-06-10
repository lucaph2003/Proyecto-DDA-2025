package proyecto.pkgfinal.dominio.model.exceptions;

import proyecto.pkgfinal.dominio.model.Item_Menu;

public class NoStockException extends PedidoException{

    public NoStockException(Item_Menu item) {

        super("Lo sentimos, nos hemos quedado sin stock de " + item.getNombre() + " por lo que hemos quitado el pedido del servicio.");
    }
}
