package proyecto.pkgfinal.servicios.observador;

import java.util.ArrayList;

public class Observable {
    private ArrayList<Observador> observadores = new ArrayList<>();

    public void agregar(Observador observador) {
        observadores.add(observador);
    }

    public void quitar(Observador observador) {
        observadores.remove(observador);
    }

    public void avisar(Object evento) {
        for (Observador o : observadores) {
            o.actualizar(this, evento);
        }
    }
}
