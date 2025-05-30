package proyecto.pkgfinal;

import proyecto.pkgfinal.dominio.model.dto.Cliente;
import proyecto.pkgfinal.dominio.model.dto.Dispositivo;
import proyecto.pkgfinal.dominio.model.utils.dto.NombreCompleto;
import proyecto.pkgfinal.servicios.fachada.Fachada;

public class Datos {
    public static void precarga(){
        //TODO implementar las precargas llamando a fachada

        //TODO: Altas de Dispositivos
        Fachada.getInstancia().AgregarDispositivo(new Dispositivo(100));
        Fachada.getInstancia().AgregarDispositivo(new Dispositivo(101));
        Fachada.getInstancia().AgregarDispositivo(new Dispositivo(102));

        //TODO: Altas de Clientes
        Fachada.getInstancia().AgregarCliente(new Cliente(new NombreCompleto("Luca","Podesta"),"1234","2000"));
        Fachada.getInstancia().AgregarCliente(new Cliente(new NombreCompleto("Santiago","Caceres"),"1234","2001"));
        Fachada.getInstancia().AgregarCliente(new Cliente(new NombreCompleto("Lionel","Messi"),"1234","2003"));

        //TODO: GEstores

        //TODO: Unidades PRocesadoras de pedidos

        //TODO: Categorias

        //TODO: Items del menu

        //TODO: Insumos

        //TODO: Ingredientes
    }
}
