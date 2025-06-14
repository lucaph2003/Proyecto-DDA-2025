package proyecto.pkgfinal.dominio.logic;

import proyecto.pkgfinal.dominio.model.Insumo;
import java.util.ArrayList;

public class SistemaInsumo {

    private final ArrayList<Insumo> listaInsumos;

    public SistemaInsumo() {
        listaInsumos = new ArrayList<>();
    }

    public void AgregarInsumo(Insumo Insumo){
        listaInsumos.add(Insumo);
    }
}
