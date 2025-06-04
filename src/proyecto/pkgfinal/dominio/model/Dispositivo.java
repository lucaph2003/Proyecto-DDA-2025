package proyecto.pkgfinal.dominio.model;

public class Dispositivo {
    private int numeroIdentificador;
    private Cliente clienteLogueado;
    private Servicio servicioActual;

    public Dispositivo(int numeroIdentificador) {
        this.numeroIdentificador = numeroIdentificador;
    }
    
    public int getNumeroIdentificador() {
        return numeroIdentificador;
    }

    public void setNumeroIdentificador(int numeroIdentificador) {
        this.numeroIdentificador = numeroIdentificador;
    }

    public Cliente getClienteLogueado() {
        return clienteLogueado;
    }

    public void setClienteLogueado(Cliente clienteLogueado) {
        this.clienteLogueado = clienteLogueado;
    }

    public Servicio getServicioActual() {
        return servicioActual;
    }

    public void setServicioActual(Servicio servicioActual) {
        this.servicioActual = servicioActual;
    }
    
    public void iniciarNuevoServicioCliente(Cliente c){
        this.clienteLogueado = c;
        this.servicioActual = new Servicio();
    }

    public void liberar(){
        this.servicioActual = null;
        this.clienteLogueado = null;
    }
    
    
    
    //TODO agregar Equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dispositivo other = (Dispositivo) obj;
        return this.numeroIdentificador == other.numeroIdentificador;
    }

    @Override
    public String toString() {
        return "Dispositivo{" + "numeroIdentificador=" + numeroIdentificador + ", clienteLogueado=" + clienteLogueado + ", servicioActual=" + servicioActual + '}';
    }
    
    
    
}
