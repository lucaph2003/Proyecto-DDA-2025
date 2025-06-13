package proyecto.pkgfinal.dominio.model.strategy;

import proyecto.pkgfinal.dominio.model.Pedido;
import proyecto.pkgfinal.dominio.model.Servicio;

public class ClienteFrecuente extends TipoCliente{

    public ClienteFrecuente() {
        super(true);
    }

    @Override
    public double calcularDescuento(Servicio servicio) {
        double descuento = 0.0;
        for(Pedido pedido : servicio.getPedidos()){
            if (pedido.getItem().esItem("Cafe")){
                descuento += pedido.getItem().getPrecio();
            }
        }
        if(descuento > 0.0) servicio.setBeneficioAsignado("Cafe Gratis!");
        return descuento;
    }

    
}
