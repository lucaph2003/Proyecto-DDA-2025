package proyecto.pkgfinal.dominio.model.dto;

import proyecto.pkgfinal.dominio.model.utils.dto.NombreCompleto;

public class Cliente extends Usuario{

    public Cliente(NombreCompleto nombreCompleto, String password, String numeroCliente) {
        super(nombreCompleto, password, numeroCliente);
    }
    
    
}
