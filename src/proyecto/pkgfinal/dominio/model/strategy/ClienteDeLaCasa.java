package proyecto.pkgfinal.dominio.model.strategy;

import proyecto.pkgfinal.dominio.model.Servicio;

public class ClienteDeLaCasa extends TipoCliente {

    public ClienteDeLaCasa() {
        super(true);
    }

    @Override
    public double calcularDescuento(Servicio servicio) {
        return 500.0;
    }

    
}
