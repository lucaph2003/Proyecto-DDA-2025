package proyecto.pkgfinal.dominio.model;

import java.time.Instant;
import java.util.Date;

public class Session {
    private final Date fecha ;
    public final Usuario usuario;

    public Session(Usuario usuario) {
        this.usuario = usuario;
        this.fecha = Date.from(Instant.now());
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
        Session s = (Session) obj;
        return this.usuario == s.usuario;
    }

}
