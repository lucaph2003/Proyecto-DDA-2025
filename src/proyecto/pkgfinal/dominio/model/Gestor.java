package proyecto.pkgfinal.dominio.model;

import proyecto.pkgfinal.dominio.model.helpers.dto.NombreCompleto;

public class Gestor extends Usuario{
    private final Unidad_Procesadora_Pedido unidadAsignada;

    public Gestor(NombreCompleto nombreCompleto, String password, String username, Unidad_Procesadora_Pedido unidadAsignada) {
        super(nombreCompleto, password, username);
        this.unidadAsignada = unidadAsignada;
    }

    public Unidad_Procesadora_Pedido getUnidadAsignada() {
        return unidadAsignada;
    }

    @Override
    public boolean equals(Object obj) {
        Gestor gestor = (Gestor) obj;
        return this.getIdentificador().equals(gestor.getIdentificador());
    }
}
