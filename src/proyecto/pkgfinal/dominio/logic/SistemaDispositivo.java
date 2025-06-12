package proyecto.pkgfinal.dominio.logic;

import java.util.ArrayList;

import proyecto.pkgfinal.dominio.model.*;

public class SistemaDispositivo {
    private final ArrayList<Dispositivo> listDispositivos = new ArrayList<>();
     
    public void AgregarDispositivo(Dispositivo dispositivo){
        listDispositivos.add(dispositivo);
    }
       
    public ArrayList<Dispositivo> getDispositivos(){
        return listDispositivos;
    }
    
    public boolean existeSesionEnDispositivo(Dispositivo dispositivo) {
        for(Dispositivo d : listDispositivos){
            if(d.equals(dispositivo)){
                return dispositivo.getServicioActual()!= null;
            }
        }
        return false;
    }

    public boolean existeServicio(Cliente cliente) {
        for(Dispositivo d : listDispositivos){
            if(d.getClienteLogueado() != null && d.getClienteLogueado().equals(cliente) ) return true;
        }
        return false;
    }

    public void AgregarServicioDispositivo(Dispositivo dispositivo, Cliente c) {
        for(Dispositivo d : listDispositivos){
            if(d.equals(dispositivo)){
                d.iniciarNuevoServicioCliente(c);
            }
        }
    }

    public Dispositivo getDispositivo(Dispositivo d) {
        for(Dispositivo dispositivo: this.listDispositivos){
            if(dispositivo.equals(d))  return  dispositivo;
        }
        return null;
    }

    public void AgregarPedido(Pedido pedido,Dispositivo dispositivo) {
        for(Dispositivo d : listDispositivos){
            if(d.equals(dispositivo)){
                d.agregarPedido(pedido);
            }
        }
    }


    //TODO esta bien esto en dispositivo?

    public ArrayList<Pedido> getPedidosByGestor(Gestor g){
        ArrayList<Pedido> lista = new ArrayList<>();
        for(Dispositivo d : listDispositivos){
            if(d.esLogueado()){
                lista.addAll(d.getPedidosByGestor(g));
            }
        }
        return lista;
    }

    public ArrayList<Pedido> getPedidosByUnidadProcesadora(Unidad_Procesadora_Pedido unidad){
        ArrayList<Pedido> lista = new ArrayList<>();
        for(Dispositivo d : listDispositivos){
            if(d.esLogueado()){
                lista.addAll(d.getPedidosByUnidadProcesadora(unidad));
            }
        }
        return lista;
    }

    public void tomarPedido(Pedido pedido, Gestor usuario) {
        for(Dispositivo d : listDispositivos){
            if(d.esLogueado()){
                if(d.existePedido(pedido)) d.asignarGestor(pedido,usuario);
            }
        }
    }

    public void finalizarPedido(Pedido pedido) {
        for(Dispositivo d : listDispositivos){
            if(d.esLogueado()){
                if(d.existePedido(pedido)) d.getServicioActual().finalizarPedido(pedido);
            }
        }
    }

    public void entregarPedido(Pedido pedido) {
        for(Dispositivo d : listDispositivos){
            if(d.esLogueado()){
                if(d.existePedido(pedido)) d.getServicioActual().entregarPedido(pedido);
            }
        }
    }
}
