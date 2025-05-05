package proyecto.pkgfinal.dominio.model.dto;

public class Dispositivo {
    private int numeroIdentificador;
    private Cliente clienteLogueado;
    private Servicio servicioActual;

    public int getNumeroIdentificador() {
        return numeroIdentificador;
    }

    public void setNumeroIdentificador(int numeroIdentificador) {
        this.numeroIdentificador = numeroIdentificador;
    }

    public void liberar(){
        this.servicioActual = null;
        this.clienteLogueado = null;
    }
    
    //TODO agregar Equals
    
}
