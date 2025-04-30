package proyecto.pkgfinal.dominio.model.dto;

import proyecto.pkgfinal.dominio.model.utils.dto.NombreCompleto;

public class Usuario {
    private NombreCompleto nombreCompleto;
    private String password;
    private String identificador;

    public Usuario(NombreCompleto nombreCompleto, String password, String identificador) {
        this.nombreCompleto = nombreCompleto;
        this.password = password;
        this.identificador = identificador;
    }

    public NombreCompleto getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(NombreCompleto nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
    
    
}
