package proyecto.pkgfinal.dominio.model.strategy;

import proyecto.pkgfinal.dominio.model.Servicio;

public abstract class TipoCliente {
    
    boolean tieneBeneficios;
    
    public TipoCliente(boolean tieneBeneficios){
        this.tieneBeneficios = tieneBeneficios;
    }
    
    public abstract double calcularDescuento(Servicio servicio);
}
