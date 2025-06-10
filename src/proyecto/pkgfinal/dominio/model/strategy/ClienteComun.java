package proyecto.pkgfinal.dominio.model.strategy;

import proyecto.pkgfinal.dominio.model.Servicio;

public class ClienteComun extends TipoCliente {

    public ClienteComun() {
        super(false);
    }

    @Override
    public double calcularDescuento(Servicio servicio) {
        return servicio.getMontoTotal();
    }

    
}
