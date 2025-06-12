package proyecto.pkgfinal.dominio.model;

import proyecto.pkgfinal.dominio.model.helpers.dto.NombreCompleto;

import java.util.Objects;

public class Gestor extends Usuario{
    private Unidad_Procesadora_Pedido unidadAsignada;

    public Gestor(NombreCompleto nombreCompleto, String password, String username, Unidad_Procesadora_Pedido unidadAsignada) {
        super(nombreCompleto, password, username);
        this.unidadAsignada = unidadAsignada;
    }
    
    

    public Unidad_Procesadora_Pedido getUnidadAsignada() {
        return unidadAsignada;
    }

    public void setUnidadAsignada(Unidad_Procesadora_Pedido unidadAsignada) {
        this.unidadAsignada = unidadAsignada;
    }


    @Override
    public boolean equals(Object o) {
        System.out.println("Entro al equals");
        if(o == null) return false;
        if (!(o instanceof Gestor gestor)) return false;
        return Objects.equals(unidadAsignada, gestor.unidadAsignada);
    }

}
