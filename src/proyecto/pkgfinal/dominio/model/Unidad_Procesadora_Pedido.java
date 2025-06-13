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
        Unidad_Procesadora_Pedido s = (Unidad_Procesadora_Pedido) o;
        return this.id == s.id;
    }

}
