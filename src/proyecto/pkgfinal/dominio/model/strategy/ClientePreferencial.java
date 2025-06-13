package proyecto.pkgfinal.dominio.model.strategy;

import proyecto.pkgfinal.dominio.model.Pedido;
import proyecto.pkgfinal.dominio.model.Servicio;

public class ClientePreferencial extends TipoCliente{

    public ClientePreferencial() {
        super(true);
    }

    @Override
    public double calcularDescuento(Servicio servicio) {
        double descuento = 0.0;
        for(Pedido pedido : servicio.getPedidos()){
            if (pedido.getItem().esItem("Agua Mineral")){
                servicio.setBeneficioAsignado("Descuento de Agua!");
                descuento += pedido.getItem().getPrecio();
            }
        }
        if (servicio.getMontoTotal() > 2000) {
            double total = (servicio.getMontoTotal() - descuento);
            descuento += total * 0.05;
            servicio.setBeneficioAsignado((servicio.getBeneficioAsignado() != null ? servicio.getBeneficioAsignado() + " y " : " ") + "5% de descuento");
        }
        return descuento;
    }

    
}
