package proyecto.pkgfinal.dominio.model.strategy;

public abstract class TipoCliente {
    
    boolean tieneBeneficios;
    
    public TipoCliente(boolean tieneBeneficios){
        this.tieneBeneficios = tieneBeneficios;
    }
    
    abstract double calcularDescuento(double montoTotal);
}
