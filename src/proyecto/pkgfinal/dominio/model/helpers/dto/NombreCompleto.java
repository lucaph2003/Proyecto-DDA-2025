package proyecto.pkgfinal.dominio.model.helpers.dto;

public class NombreCompleto {
    private final String nombre;
    private final String apellido;

    public NombreCompleto(String Nombre, String Apellido){
        this.nombre = Nombre;
        this.apellido = Apellido;
    }

    public String show(){
        String nombreCompleto = "";
        nombreCompleto += (this.nombre !=null ? this.nombre + " ": "");
        nombreCompleto += (this.apellido !=null ? this.apellido : "");
        return nombreCompleto;
    }
}
