package proyecto.pkgfinal.dominio.logic;

import proyecto.pkgfinal.dominio.model.Unidad_Procesadora_Pedido;

import java.util.ArrayList;

public class SistemaUnidadProcesadora {
    private final ArrayList<Unidad_Procesadora_Pedido> listUnidadesProcesadoras = new ArrayList<>();

    public void AgregarUnidadProcesadora(Unidad_Procesadora_Pedido u){
        listUnidadesProcesadoras.add(u);
    }

    public ArrayList<Unidad_Procesadora_Pedido> getUnidadesProcesadoras(){
        return listUnidadesProcesadoras;
    }

}
