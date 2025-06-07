package proyecto.pkgfinal.dominio.model.strategy;

public class ClientePreferencial extends TipoCliente{

    public ClientePreferencial() {
        super(true);
    }

    @Override
    public double calcularDescuento(double montoTotal) {
        /*TODO implementar esto*/
        return 0.0;
    }

    
}
