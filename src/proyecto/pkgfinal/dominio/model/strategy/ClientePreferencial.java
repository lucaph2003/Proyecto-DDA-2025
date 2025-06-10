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
                descuento += pedido.getItem().getPrecio();
            }
        }
        if (servicio.getMontoTotal() > 2000) {
            double total = (servicio.getMontoTotal() - descuento);
            descuento += total * 0.05;
        }
        return descuento;
    }

    
}
