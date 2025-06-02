package proyecto.pkgfinal.dominio.logic;

import java.util.ArrayList;
import proyecto.pkgfinal.dominio.model.dto.Dispositivo;

public class SistemaDispositivo {
     private ArrayList<Dispositivo> listDispositivos = new ArrayList<>();
     
    public void AgregarDispositivo(Dispositivo dispositivo){
        listDispositivos.add(dispositivo);
    }
       
    public ArrayList<Dispositivo> getDispositivos(){
        return listDispositivos;
    }
}
