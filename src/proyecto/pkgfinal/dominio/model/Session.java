package proyecto.pkgfinal.dominio.model;

import java.time.Instant;
import java.util.Date;

public class Session {
    private Date fecha = new Date();
    private Usuario usuario;
    private Dispositivo dispositivo;

    public Session(Usuario usuario, Dispositivo dis) {
        this.usuario = usuario;
        this.dispositivo = dis;
        this.fecha = Date.from(Instant.now());
    }

    public Date getFecha() {
        return fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Dispositivo getDispositivo() {
        return dispositivo;
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
