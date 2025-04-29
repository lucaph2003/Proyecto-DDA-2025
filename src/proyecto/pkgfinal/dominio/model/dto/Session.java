package proyecto.pkgfinal.dominio.model.dto;

import java.util.Date;

public class Session {
    private Date fecha = new Date();
    private Usuario usuario;

    public Session(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    @Override
    public String toString() {
        return usuario.getNombreCompleto().show();
    }

    @Override
    public boolean equals(Object obj) {
        // Verificar si es el mismo objeto
        Session s = (Session) obj;
        if (this.usuario == s.usuario) {
            return true;
        }
        return false;
    }
}
