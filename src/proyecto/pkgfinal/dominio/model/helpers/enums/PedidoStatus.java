package proyecto.pkgfinal.dominio.model.utils.enums;

public enum PedidoStatus {
    NO_CONFIRMADO, //El pedido puede confirmarse y eliminarse del servicio. 
    CONFIRMADO, //El pedido puede ser eliminado del servicio, cobrado al cliente y tomado por un gestor. 
    EN_PROCESO, // El pedido puede ser finalizado por un gestor y cobrado al cliente. 
    FINALIZADO, //El pedido puede ser entregado al cliente y cobrado al cliente. 
    ENTREGADO // El pedido puede ser cobrado al cliente.
}
