package proyecto.pkgfinal;

import proyecto.pkgfinal.dominio.model.Categoria;
import proyecto.pkgfinal.dominio.model.Cliente;
import proyecto.pkgfinal.dominio.model.Dispositivo;
import proyecto.pkgfinal.dominio.model.Gestor;
import proyecto.pkgfinal.dominio.model.Ingrediente;
import proyecto.pkgfinal.dominio.model.Insumo;
import proyecto.pkgfinal.dominio.model.Item_Menu;
import proyecto.pkgfinal.dominio.model.Unidad_Procesadora_Pedido;
import proyecto.pkgfinal.dominio.model.helpers.dto.NombreCompleto;
import proyecto.pkgfinal.dominio.model.strategy.ClienteComun;
import proyecto.pkgfinal.dominio.model.strategy.ClienteDeLaCasa;
import proyecto.pkgfinal.dominio.model.strategy.ClientePreferencial;
import proyecto.pkgfinal.servicios.fachada.Fachada;

public class Datos {
    private final static Fachada fachada = Fachada.getInstancia();
    public static void precarga(){
        fachada.AgregarDispositivo(new Dispositivo(100));
        fachada.AgregarDispositivo(new Dispositivo(101));
        fachada.AgregarDispositivo(new Dispositivo(102));

        fachada.AgregarCliente(new Cliente(new NombreCompleto("Luca","Podesta"),"1234","2000",new ClienteComun()));
        fachada.AgregarCliente(new Cliente(new NombreCompleto("Santiago","Caceres"),"1234","2001",new ClienteDeLaCasa()));
        fachada.AgregarCliente(new Cliente(new NombreCompleto("Lionel","Messi"),"1234","2003",new ClientePreferencial()));

        Unidad_Procesadora_Pedido unidad_1 = new Unidad_Procesadora_Pedido(100,"Bar");
        Unidad_Procesadora_Pedido unidad_2 = new Unidad_Procesadora_Pedido(101,"Cocina");
        
        fachada.AgregarUnidadProcesadora(unidad_1);
        fachada.AgregarUnidadProcesadora(unidad_2);

        fachada.AgregarGestor(new Gestor(new NombreCompleto("Miguel","Fuentes"),"1234","2000",unidad_1));
        fachada.AgregarGestor(new Gestor(new NombreCompleto("Camila","Rayon"),"1234","2001",unidad_1));
        fachada.AgregarGestor(new Gestor(new NombreCompleto("Luis","Suarez"),"1234","2003",unidad_2));

        //TODO: Insumos
        Insumo insumo_1 = new Insumo("Carne Vacuna",20,40);
        Insumo insumo_2 = new Insumo("Tomate",10,100);
        Insumo insumo_3 = new Insumo("Harina",20,200);
        Insumo insumo_4 = new Insumo("Agua",20,300);
        Insumo insumo_5 = new Insumo("Calabaza",20,1);
        
        fachada.AgregarInsumo(insumo_1);
        fachada.AgregarInsumo(insumo_2);
        fachada.AgregarInsumo(insumo_3);
        fachada.AgregarInsumo(insumo_4);
        fachada.AgregarInsumo(insumo_5);
        
        //TODO: Ingredientes
        Ingrediente ingrediente_1 = new Ingrediente(2,insumo_1);
        Ingrediente ingrediente_2 = new Ingrediente(2,insumo_2);
        Ingrediente ingrediente_3 = new Ingrediente(2,insumo_3);
        Ingrediente ingrediente_4 = new Ingrediente(2,insumo_4);
        Ingrediente ingrediente_5 = new Ingrediente(2,insumo_5);
        
        fachada.AgregarIngrediente(ingrediente_1);
        fachada.AgregarIngrediente(ingrediente_2);
        fachada.AgregarIngrediente(ingrediente_3);
        fachada.AgregarIngrediente(ingrediente_4);
        fachada.AgregarIngrediente(ingrediente_5);
        
        //TODO: Items del menu
        Item_Menu item_1 = new Item_Menu("Ensalada Cesar", 300,unidad_1);
        Item_Menu item_2 = new Item_Menu("Sopa de Calabaza", 250,unidad_1);
        item_2.addIngrediente(ingrediente_4);
        item_2.addIngrediente(ingrediente_5);
        Item_Menu item_3 = new Item_Menu("Bruschettas",280,unidad_2);
        Item_Menu item_4 = new Item_Menu("Empanadas",200,unidad_2);
        
        fachada.AgregarItemsMenu(item_1);
        fachada.AgregarItemsMenu(item_2);
        fachada.AgregarItemsMenu(item_3);
        fachada.AgregarItemsMenu(item_4);
        
        //TODO: Categorias
        Categoria categoria_1 = new Categoria("Entradas");
        categoria_1.addItem(item_1);
        categoria_1.addItem(item_2);
        categoria_1.addItem(item_3);
        categoria_1.addItem(item_4);
        
        Categoria categoria_2 = new Categoria("Platos Principales");
        
        Categoria categoria_3 = new Categoria("Postres");
        
        Categoria categoria_4 = new Categoria("Bebidas");
        
        Categoria categoria_5 = new Categoria("Vinos");
        
        Categoria categoria_6 = new Categoria("Cafes");
        
        fachada.AgregarCategoria(categoria_1);
        fachada.AgregarCategoria(categoria_2);
        fachada.AgregarCategoria(categoria_3);
        fachada.AgregarCategoria(categoria_4);
        fachada.AgregarCategoria(categoria_5);
        fachada.AgregarCategoria(categoria_6);
        
    }
}
