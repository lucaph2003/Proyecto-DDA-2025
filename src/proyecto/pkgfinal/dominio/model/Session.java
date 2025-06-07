package proyecto.pkgfinal.dominio.model;

import java.time.Instant;
import java.util.Date;

public abstract class Session {
    private Date fecha = new Date();
    public final Usuario usuario;

    public Session(Usuario usuario) {
        this.usuario = usuario;
        this.fecha = Date.from(Instant.now());
    }

    public Date getFecha() {
        return fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    @Override
    public String toString() {
        return usuario.getNombreCompleto();
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

    protected abstract boolean validarTipoUsuario();
}
