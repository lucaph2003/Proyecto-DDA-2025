package proyecto.pkgfinal.dominio.logic;

import java.util.ArrayList;
import proyecto.pkgfinal.dominio.model.Cliente;
import proyecto.pkgfinal.dominio.model.Dispositivo;

public class SistemaDispositivo {
    private final ArrayList<Dispositivo> listDispositivos = new ArrayList<>();
     
    public void AgregarDispositivo(Dispositivo dispositivo){
        listDispositivos.add(dispositivo);
    }
       
    public ArrayList<Dispositivo> getDispositivos(){
        return listDispositivos;
    }
    
    public boolean existeSesionEnDispositivo(Dispositivo dispositivo) {
        for(Dispositivo d : listDispositivos){
            if(d.equals(dispositivo)){
                return dispositivo.getServicioActual()!= null;
            }
        }
        return false;
    }

    public boolean existeServicio(Cliente cliente) {
        for(Dispositivo d : listDispositivos){
            if(d.getClienteLogueado() != null && d.getClienteLogueado().equals(cliente) ) return true;
        }
        return false;
    }

    public Dispositivo AgregarServicioDispositivo(Dispositivo dispositivo, Cliente c) {
        for(Dispositivo d : listDispositivos){
            if(d.equals(dispositivo)){
                d.iniciarNuevoServicioCliente(c);
                return d;
            }
        }
        return null;
    }

    public Dispositivo getDispositivo(Dispositivo d) {
        for(Dispositivo dispositivo: this.listDispositivos){
            if(dispositivo.equals(d))  return  dispositivo;
        }
        return null;
    }
    
}
