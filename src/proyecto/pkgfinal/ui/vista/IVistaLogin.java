package proyecto.pkgfinal.ui.vista;

import proyecto.pkgfinal.dominio.model.dto.Session;

public interface IVistaLogin extends IVista {
    abstract void ejecutarSiguienteCU(Session session);
}
