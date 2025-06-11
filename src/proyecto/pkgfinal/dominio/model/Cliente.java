package proyecto.pkgfinal.dominio.model;

import proyecto.pkgfinal.dominio.model.helpers.dto.NombreCompleto;
import proyecto.pkgfinal.dominio.model.strategy.TipoCliente;

public class Cliente extends Usuario{
    
    private TipoCliente tipoCliente;

    public Cliente(NombreCompleto nombreCompleto, String password, String numeroCliente,TipoCliente tipo) {
        super(nombreCompleto, password, numeroCliente);
        this.tipoCliente = tipo;
    }


    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}
