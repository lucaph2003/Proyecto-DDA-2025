package proyecto.pkgfinal.dominio.logic;

import java.util.ArrayList;
import proyecto.pkgfinal.dominio.model.Categoria;

public class SistemaCategoria {
    private final ArrayList<Categoria> listaCategorias = new ArrayList<>();
     
    public void AgregarCategoria(Categoria categoria){
        listaCategorias.add(categoria);
    }
       
    public ArrayList<Categoria> getCategorias(){
        return listaCategorias;
    }
    
}
