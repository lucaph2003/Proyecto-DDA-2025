package proyecto.pkgfinal.dominio.model.dto;

import proyecto.pkgfinal.dominio.model.utils.dto.NombreCompleto;

public class Usuario {
    private NombreCompleto nombreCompleto;
    private String password;
    private String username;

    public Usuario(NombreCompleto nombreCompleto, String password, String username) {
        this.nombreCompleto = nombreCompleto;
        this.password = password;
        this.username = username;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    
}
