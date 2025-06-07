package proyecto.pkgfinal.dominio.model;

import java.util.ArrayList;
import java.util.List;
import proyecto.pkgfinal.dominio.model.exceptions.SessionException;

public class SessionGestor extends Session {
    private List<Pedido> pedidosAsignados;
    private Unidad_Procesadora_Pedido unidadAsignada;

    public SessionGestor(Usuario usuario) throws SessionException {
        super(usuario);
        if (!validarTipoUsuario()) {
            throw new SessionException("Usuario no es un gestor");
        }
        this.pedidosAsignados = new ArrayList<>();
    }

    @Override
    protected boolean validarTipoUsuario() {
        return usuario instanceof Gestor;
    }

    public void asignarUnidad(Unidad_Procesadora_Pedido unidad) {
        unidadAsignada = unidad;
    }
    
    public Unidad_Procesadora_Pedido getUnidad(){
        return this.unidadAsignada;
    }

    public Gestor getGestor() {
        return (Gestor) usuario;
    }

    public void agregarPedido(Pedido pedido) {
        pedidosAsignados.add(pedido);
    }
}