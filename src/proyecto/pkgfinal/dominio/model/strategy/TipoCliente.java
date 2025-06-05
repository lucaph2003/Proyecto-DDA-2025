package proyecto.pkgfinal.dominio.model.strategy;

public interface TipoCliente {
    double calcularDescuento(double montoTotal);
    int getPrioridad(); 
}
