package proyecto.pkgfinal.dominio.logic;

import proyecto.pkgfinal.dominio.model.Gestor;
import proyecto.pkgfinal.dominio.model.Pedido;
import proyecto.pkgfinal.dominio.model.Servicio;

import java.util.ArrayList;

public class SistemaServicio {

    private final ArrayList<Servicio> listaServicios;

    public SistemaServicio() {
        this.listaServicios = new ArrayList<>();
    }

    public void AgregarServicio(Servicio s){
        listaServicios.add(s);
    }

    public ArrayList<Pedido> getPedidosByGestor(Gestor g){
        ArrayList<Pedido> lista = new ArrayList<>();
        for(Servicio s : listaServicios){
            lista.addAll(s.getPedidosByGestor(g));
        }
        return lista;
    }

}
