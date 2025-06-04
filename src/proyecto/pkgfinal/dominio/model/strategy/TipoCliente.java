package proyecto.pkgfinal.dominio.model.dto.strategy;

public interface TipoCliente {
    double calcularDescuento(double montoTotal);
    int getPrioridad(); 
}
