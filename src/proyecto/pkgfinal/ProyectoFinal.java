package proyecto.pkgfinal;

import proyecto.pkgfinal.ui.vista.VentanaInicial;

public class ProyectoFinal {

    public static void main(String[] args) {
        Datos.precarga();
        VentanaInicial frame = new VentanaInicial();
        frame.setVisible(true);
    }
    
}
