package proyecto.pkgfinal.dominio.model;

import proyecto.pkgfinal.dominio.model.helpers.dto.NombreCompleto;

public class Usuario {
    private final NombreCompleto nombreCompleto;
    private final String password;
    private final String identificador;

    public Usuario(NombreCompleto nombreCompleto, String password, String identificador) {
        this.nombreCompleto = nombreCompleto;
        this.password = password;
        this.identificador = identificador;
    }

    public String getNombreCompleto() {
        return nombreCompleto.show();
    }

    public String getPassword() {
        return password;
    }

    public String getIdentificador() {
        return identificador;
    }

    @Override
    public String toString() {
        return nombreCompleto.show() ;
    }
}
