package proyecto.pkgfinal.dominio.model.dto;

import proyecto.pkgfinal.dominio.model.utils.dto.NombreCompleto;

public class Gestor extends Usuario{
    private Unidad_Procesadora_Pedido unidadAsignada;

    public Gestor(NombreCompleto nombreCompleto, String password, String username,Unidad_Procesadora_Pedido unidadAsignada) {
        super(nombreCompleto, password, username);
        this.unidadAsignada = unidadAsignada;
    }
    
    

    public Unidad_Procesadora_Pedido getUnidadAsignada() {
        return unidadAsignada;
    }

    public void setUnidadAsignada(Unidad_Procesadora_Pedido unidadAsignada) {
        this.unidadAsignada = unidadAsignada;
    }
    
    
    
    
}
