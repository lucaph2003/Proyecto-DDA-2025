package proyecto.pkgfinal.dominio.model.helpers.enums;

public enum PedidoStatus {
    NO_CONFIRMADO("No confirmado"),
    CONFIRMADO("Confirmado"),
    EN_PROCESO("En proceso"),
    FINALIZADO("Finalizado"),
    ENTREGADO("Entregado");

    private final String descripcion;

    PedidoStatus(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return descripcion;
    }

}
