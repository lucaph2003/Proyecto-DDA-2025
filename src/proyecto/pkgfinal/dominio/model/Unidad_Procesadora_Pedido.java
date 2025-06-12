package proyecto.pkgfinal.dominio.model;

public class Unidad_Procesadora_Pedido {
    private final int id;
    private final String Nombre;

    public Unidad_Procesadora_Pedido(int id,String Nombre) {
        this.id = id;
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Unidad_Procesadora_Pedido that)) return false;
        return id == that.id;
    }

}
