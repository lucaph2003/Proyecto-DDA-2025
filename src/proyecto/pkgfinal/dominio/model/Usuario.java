package proyecto.pkgfinal.dominio.model;

import proyecto.pkgfinal.dominio.model.helpers.dto.NombreCompleto;

public class Usuario {
    private NombreCompleto nombreCompleto;
    private String password;
    private String identificador;

    public Usuario(NombreCompleto nombreCompleto, String password, String identificador) {
        this.nombreCompleto = nombreCompleto;
        this.password = password;
        this.identificador = identificador;
    }

    public String getNombreCompleto() {
        return nombreCompleto.show();
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

    @Override
    public String toString() {
        return "Usuario{" +
                "nombreCompleto=" + nombreCompleto.show() +
                '}';
    }
}
