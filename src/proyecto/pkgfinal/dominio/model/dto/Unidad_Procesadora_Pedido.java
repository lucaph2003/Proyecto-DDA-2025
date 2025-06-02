package proyecto.pkgfinal.dominio.model.dto;

public class Unidad_Procesadora_Pedido {
    private int id;
    private String Nombre;

    public Unidad_Procesadora_Pedido(int id,String Nombre) {
        this.id = id;
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

}
