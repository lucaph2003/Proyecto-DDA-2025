package proyecto.pkgfinal.ui.vista;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import proyecto.pkgfinal.dominio.model.Categoria;
import proyecto.pkgfinal.dominio.model.Dispositivo;
import proyecto.pkgfinal.dominio.model.Item_Menu;
import proyecto.pkgfinal.dominio.model.Pedido;
import proyecto.pkgfinal.dominio.model.helpers.utils;
import proyecto.pkgfinal.ui.controller.DispositivoController;
import proyecto.pkgfinal.ui.interfaces.IVistaDispositivo;

public class VentanaDispositivo extends javax.swing.JFrame implements IVistaDispositivo {

    private final DispositivoController controlador;
    private String valorTitleInicial;

    public VentanaDispositivo(Dispositivo dispositivo) {
        initComponents();
        controlador = new DispositivoController(this, dispositivo);
        inicializar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNumeroCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        jpanelMenu = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ListItems = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        btnAgregarPedido = new javax.swing.JButton();
        btnEliminarPedido = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListCategorias = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaComentario = new javax.swing.JTextArea();
        jPanelPedidos = new javax.swing.JPanel();
        btnConfirmarPedidos = new javax.swing.JButton();
        btnFinalizarServicio = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablePedidos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtMontoTotal = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Identificarse"));

        jLabel1.setText("Numero de Cliente");

        jLabel2.setText("Contraseña:");

        btnLogin.setText("Aceptar");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtNumeroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNumeroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnLogin)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jpanelMenu.setBorder(javax.swing.BorderFactory.createTitledBorder("Menú"));

        jScrollPane3.setViewportView(ListItems);

        jLabel3.setText("Items:");

        btnAgregarPedido.setText("Agregar Pedido");
        btnAgregarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPedidoActionPerformed(evt);
            }
        });

        btnEliminarPedido.setText("Eliminar Pedido");
        btnEliminarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPedidoActionPerformed(evt);
            }
        });

        ListCategorias.setBorder(javax.swing.BorderFactory.createTitledBorder("Categorias"));
        ListCategorias.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListCategoriasValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(ListCategorias);

        txtAreaComentario.setColumns(20);
        txtAreaComentario.setRows(5);
        txtAreaComentario.setBorder(javax.swing.BorderFactory.createTitledBorder("Comentario"));
        jScrollPane2.setViewportView(txtAreaComentario);

        javax.swing.GroupLayout jpanelMenuLayout = new javax.swing.GroupLayout(jpanelMenu);
        jpanelMenu.setLayout(jpanelMenuLayout);
        jpanelMenuLayout.setHorizontalGroup(
            jpanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jpanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelMenuLayout.createSequentialGroup()
                        .addComponent(btnAgregarPedido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpanelMenuLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jpanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jpanelMenuLayout.setVerticalGroup(
            jpanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelMenuLayout.createSequentialGroup()
                .addGroup(jpanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregarPedido)
                            .addComponent(btnEliminarPedido)))
                    .addGroup(jpanelMenuLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanelPedidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Pedidos del Servicio"));

        btnConfirmarPedidos.setText("Confirmar Pedidos");
        btnConfirmarPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarPedidosActionPerformed(evt);
            }
        });

        btnFinalizarServicio.setText("Finalizar Servicio");
        btnFinalizarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarServicioActionPerformed(evt);
            }
        });

        tablePedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Item", "Comentario", "Estado", "Unidad", "Gestor", "Precio"
            }
        ));
        jScrollPane4.setViewportView(tablePedidos);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Monto total: $");

        txtMontoTotal.setText("0");

        javax.swing.GroupLayout jPanelPedidosLayout = new javax.swing.GroupLayout(jPanelPedidos);
        jPanelPedidos.setLayout(jPanelPedidosLayout);
        jPanelPedidosLayout.setHorizontalGroup(
            jPanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPedidosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPedidosLayout.createSequentialGroup()
                        .addGap(823, 823, 823)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtMontoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPedidosLayout.createSequentialGroup()
                        .addGroup(jPanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPedidosLayout.createSequentialGroup()
                                .addComponent(btnConfirmarPedidos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFinalizarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 939, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelPedidosLayout.setVerticalGroup(
            jPanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPedidosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmarPedidos)
                    .addComponent(btnFinalizarServicio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMontoTotal))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Mensajes del Servicio"));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(txtError, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(txtError)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnLoginActionPerformed
        login();
    }// GEN-LAST:event_btnLoginActionPerformed

    private void btnAgregarPedidoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnAgregarPedidoActionPerformed
        agregarPedido();
    }// GEN-LAST:event_btnAgregarPedidoActionPerformed

    private void ListCategoriasValueChanged(javax.swing.event.ListSelectionEvent evt) {// GEN-FIRST:event_ListCategoriasValueChanged
        controlador.cargarItems(ListCategorias.getSelectedIndex());
    }// GEN-LAST:event_ListCategoriasValueChanged

    private void btnEliminarPedidoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnEliminarPedidoActionPerformed
        eliminarPedido();
    }// GEN-LAST:event_btnEliminarPedidoActionPerformed

    private void btnFinalizarServicioActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnFinalizarServicioActionPerformed
        finalizarServicio();
    }// GEN-LAST:event_btnFinalizarServicioActionPerformed

    private void btnConfirmarPedidosActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnConfirmarPedidosActionPerformed
        confirmarPedidos();
    }// GEN-LAST:event_btnConfirmarPedidosActionPerformed

    @Override
    public void inicializar() {
        this.setVisible(true);
        this.valorTitleInicial = "Pollo-Morfismo  | DISPOSITIVO: "
                + controlador.getDispositivo().getNumeroIdentificador();
        this.setTitle(valorTitleInicial);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }

    @Override
    public void mostrarEror(String error) {
        this.txtError.setForeground(Color.RED);
        this.txtError.setText(error);
    }

    @Override
    public void cerrar() {
        this.setTitle(valorTitleInicial);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<Categoria> ListCategorias;
    private javax.swing.JList<Item_Menu> ListItems;
    private javax.swing.JButton btnAgregarPedido;
    private javax.swing.JButton btnConfirmarPedidos;
    private javax.swing.JButton btnEliminarPedido;
    private javax.swing.JButton btnFinalizarServicio;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelPedidos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel jpanelMenu;
    private javax.swing.JTable tablePedidos;
    private javax.swing.JTextArea txtAreaComentario;
    private javax.swing.JLabel txtError;
    private javax.swing.JLabel txtMontoTotal;
    private javax.swing.JTextField txtNumeroCliente;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables

    @Override
    public void login() {
        String numeroCliente = txtNumeroCliente.getText();
        String password = txtPassword.getText();
        controlador.login(numeroCliente, password);
    }

    @Override
    public void agregarPedido() {
        String comentario = txtAreaComentario.getText();
        Item_Menu item = ListItems.getSelectedValue();
        controlador.agregarPedido(comentario, item);
    }

    @Override
    public void eliminarPedido() {
        int filaSeleccionada = tablePedidos.getSelectedRow();
        controlador.eliminarPedido(filaSeleccionada);
    }

    @Override
    public void confirmarPedidos() {
        controlador.confirmarPedidos();
    }

    @Override
    public void finalizarServicio() {
        controlador.finalizarServicio();
    }

    @Override
    public void mostrarSesion(String nombreCompleto) {
        this.setTitle(valorTitleInicial + " | Cliente " + nombreCompleto);
    }

    @Override
    public void mostrarOk(String mensaje) {
        this.txtError.setForeground(Color.BLUE);
        this.txtError.setText(mensaje);
    }

    @Override
    public void mostrarFacturaFinal(String mensajePago, String montoTotal, String nombreBeneficio, String descuento) {
        this.mostrarOk(mensajePago + " \t Monto Total: $"+ montoTotal + " \t Beneficio: "+ nombreBeneficio + " \t Descuento Aplicado: - $"+ descuento);
    }

    @Override
    public void mostrarCategorias(ArrayList<Categoria> lista) {
        DefaultListModel<Categoria> modelo = new DefaultListModel<>();
        for (Categoria c : lista) {
            modelo.addElement(c);
        }
        ListCategorias.setModel(modelo);
    }

    @Override
    public void mostrarItems(List<Item_Menu> lista) {
        DefaultListModel<Item_Menu> modelo = new DefaultListModel<>();

        if (lista != null && !lista.isEmpty()) {
            lista.forEach(modelo::addElement);
        }

        ListItems.setModel(modelo);
    }

    @Override
    public void actualizarPedidos(ArrayList<Pedido> lista) {
        DefaultTableModel datos = new DefaultTableModel();
        datos.addColumn("Item");
        datos.addColumn("Comentario");
        datos.addColumn("Estado");
        datos.addColumn("Unidad");
        datos.addColumn("Gestor");
        datos.addColumn("Precio");
        datos.setRowCount(lista.size());
        int fila = 0;

        for (Pedido pedido : lista) {
            datos.setValueAt(pedido.getItem().getNombre(), fila, 0);
            datos.setValueAt(pedido.getComentario(), fila, 1);
            datos.setValueAt(pedido.getEstado().toString(), fila, 2);
            datos.setValueAt(pedido.getItem().getUnidadProcesaora().getNombre(), fila, 3);
            datos.setValueAt((pedido.getGestorAsignado() != null ? pedido.getGestorAsignado().toString() : "-"), fila, 4);
            datos.setValueAt(utils.formatearPrecio(pedido.calcularPrecio()), fila, 5);
            fila++;
        }
        tablePedidos.setModel(datos);
    }

    @Override
    public void actualizarMontoTotal(double montoTotal) {
        this.txtMontoTotal.setText(String.valueOf(montoTotal));
    }

}
