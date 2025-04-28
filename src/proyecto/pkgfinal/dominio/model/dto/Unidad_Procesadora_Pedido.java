package proyecto.pkgfinal.dominio.model.dto;

public class Unidad_Procesadora_Pedido {
    private String Nombre;

    public Unidad_Procesadora_Pedido(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

}
