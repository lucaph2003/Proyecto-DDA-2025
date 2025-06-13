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
import proyecto.pkgfinal.dominio.model.strategy.ClienteFrecuente;
import proyecto.pkgfinal.dominio.model.strategy.ClientePreferencial;
import proyecto.pkgfinal.servicios.fachada.Fachada;

public class Datos {
    private final static Fachada fachada = Fachada.getInstancia();
    public static void precarga(){
        fachada.AgregarDispositivo(new Dispositivo(100));
        fachada.AgregarDispositivo(new Dispositivo(101));
        fachada.AgregarDispositivo(new Dispositivo(102));

        fachada.AgregarCliente(new Cliente(new NombreCompleto("Luca","Podestá"),"1234","2000",new ClienteComun()));
        fachada.AgregarCliente(new Cliente(new NombreCompleto("Santiago","Cáceres"),"1234","2001",new ClienteDeLaCasa()));
        fachada.AgregarCliente(new Cliente(new NombreCompleto("Lionel","Messi"),"1234","2002",new ClientePreferencial()));
        fachada.AgregarCliente(new Cliente(new NombreCompleto("Lebron","James"),"1234","2003",new ClienteFrecuente()));

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
        Insumo insumo_5 = new Insumo("Calabaza",20,4);
        Insumo insumo_6 = new Insumo("Pollo", 10, 30);
        Insumo insumo_7 = new Insumo("Queso", 10, 50);
        Insumo insumo_8 = new Insumo("Papas", 15, 80);
        Insumo insumo_9 = new Insumo("Chocolate", 5, 40);
        Insumo insumo_10 = new Insumo("Crema", 10, 60);
        Insumo insumo_11 = new Insumo("Vino Tinto", 5, 20);
        Insumo insumo_12 = new Insumo("Café", 10, 100);
        Insumo insumo_13 = new Insumo("Leche", 15, 70);
        Insumo insumo_14 = new Insumo("Fideos", 20, 90);
        Insumo insumo_15 = new Insumo("Salsa", 10, 100);
        
        fachada.AgregarInsumo(insumo_1);
        fachada.AgregarInsumo(insumo_2);
        fachada.AgregarInsumo(insumo_3);
        fachada.AgregarInsumo(insumo_4);
        fachada.AgregarInsumo(insumo_5);
        fachada.AgregarInsumo(insumo_6);
        fachada.AgregarInsumo(insumo_7);
        fachada.AgregarInsumo(insumo_8);
        fachada.AgregarInsumo(insumo_9);
        fachada.AgregarInsumo(insumo_10);
        fachada.AgregarInsumo(insumo_11);
        fachada.AgregarInsumo(insumo_12);
        fachada.AgregarInsumo(insumo_13);
        fachada.AgregarInsumo(insumo_14);
        fachada.AgregarInsumo(insumo_15);
        
        //TODO: Ingredientes
        Ingrediente ingrediente_1 = new Ingrediente(40,insumo_1);
        Ingrediente ingrediente_2 = new Ingrediente(2,insumo_2);
        Ingrediente ingrediente_3 = new Ingrediente(2,insumo_3);
        Ingrediente ingrediente_4 = new Ingrediente(150,insumo_4);
        Ingrediente ingrediente_5 = new Ingrediente(2,insumo_5);
        Ingrediente ingPollo = new Ingrediente(1, insumo_6);
        Ingrediente ingQueso = new Ingrediente(1, insumo_7);
        Ingrediente ingPapas = new Ingrediente(3, insumo_8);
        Ingrediente ingChoco = new Ingrediente(2, insumo_9);
        Ingrediente ingCrema = new Ingrediente(2, insumo_10);
        Ingrediente ingVino = new Ingrediente(1, insumo_11);
        Ingrediente ingCafe = new Ingrediente(1, insumo_12);
        Ingrediente ingLeche = new Ingrediente(1, insumo_13);
        Ingrediente ingFideos = new Ingrediente(2, insumo_14);
        Ingrediente ingSalsa = new Ingrediente(1, insumo_15);


        //TODO: Items del menu
        Item_Menu item_1 = new Item_Menu("Ensalada Cesar", 300,unidad_1);
        Item_Menu item_2 = new Item_Menu("Sopa de Calabaza", 250,unidad_1);
        item_2.addIngrediente(ingrediente_4);
        item_2.addIngrediente(ingrediente_5);
        Item_Menu item_3 = new Item_Menu("Bruschettas",280,unidad_2);
        Item_Menu item_4 = new Item_Menu("Empanadas",200,unidad_2);

        Item_Menu item_5 = new Item_Menu("Agua Mineral",40,unidad_1);

        item_1.addIngrediente(ingrediente_2); // Tomate
        item_1.addIngrediente(ingQueso);      // Queso
        item_3.addIngrediente(ingrediente_3); // Harina
        item_4.addIngrediente(ingrediente_1); // Carne
        item_4.addIngrediente(ingrediente_2); // Tomate
        
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
        Item_Menu plato_1 = new Item_Menu("Milanesa con Papas", 580, unidad_1);
        plato_1.addIngrediente(ingrediente_1); // Carne
        plato_1.addIngrediente(ingPapas);

        Item_Menu plato_2 = new Item_Menu("Pollo al horno", 600, unidad_1);
        plato_2.addIngrediente(ingPollo);
        plato_2.addIngrediente(ingPapas);

        Item_Menu plato_3 = new Item_Menu("Pasta con salsa", 550, unidad_1);
        plato_3.addIngrediente(ingFideos);
        plato_3.addIngrediente(ingSalsa);
        plato_3.addIngrediente(ingQueso);

        Item_Menu plato_4 = new Item_Menu("Hamburguesa completa", 590, unidad_1);
        plato_4.addIngrediente(ingrediente_1); // Carne
        plato_4.addIngrediente(ingQueso);
        plato_4.addIngrediente(ingrediente_2); // Tomate

        categoria_2.addItem(plato_1);
        categoria_2.addItem(plato_2);
        categoria_2.addItem(plato_3);
        categoria_2.addItem(plato_4);

// POSTRES
        Item_Menu postre_1 = new Item_Menu("Mousse de chocolate", 250, unidad_1);
        postre_1.addIngrediente(ingChoco);
        postre_1.addIngrediente(ingCrema);

        Item_Menu postre_2 = new Item_Menu("Flan con crema", 220, unidad_1);
        postre_2.addIngrediente(ingCrema);

        Item_Menu postre_3 = new Item_Menu("Tarta de frutas", 300, unidad_1);
        postre_3.addIngrediente(ingrediente_2); // Tomate como fruta (para test)

        Item_Menu postre_4 = new Item_Menu("Brownie con helado", 330, unidad_1);
        postre_4.addIngrediente(ingChoco);
        postre_4.addIngrediente(ingCrema);

        categoria_3.addItem(postre_1);
        categoria_3.addItem(postre_2);
        categoria_3.addItem(postre_3);
        categoria_3.addItem(postre_4);

// BEBIDAS
        Item_Menu bebida_1 = new Item_Menu("Agua Mineral", 40, unidad_2);
        bebida_1.addIngrediente(ingrediente_4);

        Item_Menu bebida_2 = new Item_Menu("Coca Cola", 70, unidad_2);
        bebida_2.addIngrediente(ingrediente_4);

        Item_Menu bebida_3 = new Item_Menu("Jugo de naranja", 80, unidad_2);
        bebida_3.addIngrediente(ingrediente_4);

        Item_Menu bebida_4 = new Item_Menu("Sprite", 70, unidad_2);
        bebida_4.addIngrediente(ingrediente_4);

        categoria_4.addItem(bebida_1);
        categoria_4.addItem(bebida_2);
        categoria_4.addItem(bebida_3);
        categoria_4.addItem(bebida_4);

// VINOS
        Item_Menu vino_1 = new Item_Menu("Vino Tinto Reserva", 800, unidad_2);
        vino_1.addIngrediente(ingVino);

        Item_Menu vino_2 = new Item_Menu("Vino Blanco", 750, unidad_2);
        vino_2.addIngrediente(ingVino);

        Item_Menu vino_3 = new Item_Menu("Malbec", 820, unidad_2);
        vino_3.addIngrediente(ingVino);

        Item_Menu vino_4 = new Item_Menu("Cabernet Sauvignon", 850, unidad_2);
        vino_4.addIngrediente(ingVino);

        categoria_5.addItem(vino_1);
        categoria_5.addItem(vino_2);
        categoria_5.addItem(vino_3);
        categoria_5.addItem(vino_4);

// CAFÉS
        Item_Menu cafe_1 = new Item_Menu("Café solo", 60, unidad_2);
        cafe_1.addIngrediente(ingCafe);

        Item_Menu cafe_2 = new Item_Menu("Café con leche", 70, unidad_2);
        cafe_2.addIngrediente(ingCafe);
        cafe_2.addIngrediente(ingLeche);

        Item_Menu cafe_3 = new Item_Menu("Capuccino", 90, unidad_2);
        cafe_3.addIngrediente(ingCafe);
        cafe_3.addIngrediente(ingLeche);
        cafe_3.addIngrediente(ingCrema);

        Item_Menu cafe_4 = new Item_Menu("Café cortado", 65, unidad_2);
        cafe_4.addIngrediente(ingCafe);
        cafe_4.addIngrediente(ingLeche);

        categoria_6.addItem(cafe_1);
        categoria_6.addItem(cafe_2);
        categoria_6.addItem(cafe_3);
        categoria_6.addItem(cafe_4);
        
        fachada.AgregarCategoria(categoria_1);
        fachada.AgregarCategoria(categoria_2);
        fachada.AgregarCategoria(categoria_3);
        fachada.AgregarCategoria(categoria_4);
        fachada.AgregarCategoria(categoria_5);
        fachada.AgregarCategoria(categoria_6);
        
    }
}
