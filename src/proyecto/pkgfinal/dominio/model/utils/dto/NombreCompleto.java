package proyecto.pkgfinal.dominio.model.utils.dto;

public class NombreCompleto {
    private String nombre;
    private String segundoNombre;
    private String apellido;
    private String segundoApellido;

    public NombreCompleto(String Nombre){
        this.nombre = Nombre;
    }

    public NombreCompleto(String Nombre, String Apellido){
        this.nombre = Nombre;
        this.apellido = Apellido;
    }

    public NombreCompleto(String Nombre,String SegundoNombre, String Apellido,String SegundoApellido){
        this.nombre = Nombre;
        this.segundoNombre = SegundoNombre;
        this.apellido = Apellido;
        this.segundoApellido = SegundoApellido;
    }

    public String getNombre() {
        return nombre;
    }


    public String getApellido() {
        return apellido;
    }
    public String show(){
        String nombreCompleto = "";
        nombreCompleto += (this.nombre !=null ? this.nombre + " ": "");
        nombreCompleto += (this.segundoNombre !=null ? this.segundoNombre + " " : "");
        nombreCompleto += (this.apellido !=null ? this.apellido : "");
        nombreCompleto += (this.segundoApellido !=null ? " " +this.segundoApellido+ " " : "");
        return nombreCompleto;
    }
}
