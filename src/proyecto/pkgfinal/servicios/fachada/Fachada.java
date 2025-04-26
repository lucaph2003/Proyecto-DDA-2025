package proyecto.pkgfinal.servicios.fachada;

import proyecto.pkgfinal.dominio.logic.SistemaAccesso;

public class Fachada {
    private static Fachada instancia;

    private SistemaAccesso sAcceso;
    
    private Fachada(){
        sAcceso = new SistemaAccesso();
    }
    
    public Fachada getInstancia(){
        if(instancia == null) {
            instancia = new Fachada();
        }
        return this.instancia;
    }
    
    
}
