package proyecto.pkgfinal.ui.vista;

import proyecto.pkgfinal.dominio.model.Gestor;
import proyecto.pkgfinal.dominio.model.Pedido;
import proyecto.pkgfinal.dominio.model.Session;
import proyecto.pkgfinal.ui.controller.GestorController;
import proyecto.pkgfinal.ui.interfaces.IVistaGestor;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class VistaGestor extends javax.swing.JFrame implements IVistaGestor {

    private final GestorController controlador;
    
    public VistaGestor(Session s) {
        initComponents();
        this.controlador = new GestorController(this,s);
        inicializar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtGestorLogueado = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        listPedidosPendientes = new javax.swing.JList<>();
        btnTomarPedido = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablePedidosTomados = new javax.swing.JTable();
        btnFinalizarPedido = new javax.swing.JButton();
        btnEntregarPedido = new javax.swing.JButton();
        txtError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jScrollPane1.setViewportView(listPedidosPendientes);

        btnTomarPedido.setText("Tomar Pedido");
        btnTomarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTomarPedidoActionPerformed(evt);
            }
        });

        tablePedidosTomados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tablePedidosTomados);

        btnFinalizarPedido.setText("Finalizar Pedido");
        btnFinalizarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarPedidoActionPerformed(evt);
            }
        });

        btnEntregarPedido.setText("Entregar Pedido");
        btnEntregarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntregarPedidoActionPerformed(evt);
            }
        });

        txtError.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnFinalizarPedido)
                .addGap(57, 57, 57)
                .addComponent(btnEntregarPedido)
                .addGap(46, 46, 46))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnTomarPedido)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(txtGestorLogueado, javax.swing.GroupLayout.PREFERRED_SIZE, 1126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(txtError, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(txtGestorLogueado, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnTomarPedido)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFinalizarPedido)
                    .addComponent(btnEntregarPedido))
                .addGap(57, 57, 57)
                .addComponent(txtError)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinalizarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarPedidoActionPerformed
       finalizarServicio();
    }//GEN-LAST:event_btnFinalizarPedidoActionPerformed

    private void btnEntregarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntregarPedidoActionPerformed
        entregarPedido();
    }//GEN-LAST:event_btnEntregarPedidoActionPerformed

    private void btnTomarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTomarPedidoActionPerformed
        tomarPedido();
    }//GEN-LAST:event_btnTomarPedidoActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        cerrar();
    }//GEN-LAST:event_formWindowClosing

    @Override
    public void inicializar() {
        this.setTitle("Procesar Pedidos");
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        Gestor gestor = controlador.getGestor();
        this.txtGestorLogueado.setText("Gestor: " + gestor.getNombreCompleto() + " | Unidad Procesadora: " + gestor.getUnidadAsignada().getNombre());
        actualizarPedidosTomados(null);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }

    @Override
    public void mostrarEror(String error) {
        this.txtError.setText(error);
    }

    @Override
    public void cerrar() {
        controlador.logout();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntregarPedido;
    private javax.swing.JButton btnFinalizarPedido;
    private javax.swing.JButton btnTomarPedido;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JList<Pedido> listPedidosPendientes;
    private javax.swing.JTable tablePedidosTomados;
    private javax.swing.JLabel txtError;
    private javax.swing.JLabel txtGestorLogueado;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actualizarPedidosPendientes(ArrayList<Pedido> lista) {
        DefaultListModel<Pedido> modelo = new DefaultListModel<>();
        for (Pedido p : lista) {
            modelo.addElement(p);
        }
        listPedidosPendientes.setModel(modelo);
    }

    @Override
    public void tomarPedido() {
        int pos = listPedidosPendientes.getSelectedIndex();
        controlador.tomarPedido(pos);
    }

    public Pedido getPedidoPendientePorPoscicion(int pos){
       return listPedidosPendientes.getModel().getElementAt(pos);
    }

    @Override
    public void actualizarPedidosTomados(ArrayList<Pedido> lista) {
        DefaultTableModel datos = new DefaultTableModel();
        datos.addColumn("Nombre de Item");
        datos.addColumn("Descripcion");
        datos.addColumn("Cliente");
        datos.addColumn("FechaHora");
        datos.addColumn("Estado");
        
        
        if(lista != null){
            datos.setRowCount(lista.size());
            int fila = 0;
            for (Pedido pedido: lista){
                datos.setValueAt(pedido.getItem().getNombre(),fila,0);
                datos.setValueAt(pedido.getComentario(),fila,1);
                datos.setValueAt(pedido.getFechaHora(),fila,2);
                datos.setValueAt(pedido.getFechaHora(),fila,3);
                datos.setValueAt(pedido.getEstado(),fila,4);
                fila++;
            }
        }
        tablePedidosTomados.setModel(datos);
    }

    @Override
    public void finalizarServicio() {
        int filaSeleccionada = tablePedidosTomados.getSelectedRow();
        controlador.finalizarPedido(filaSeleccionada);
    }

    @Override
    public void entregarPedido() {
        int filaSeleccionada = tablePedidosTomados.getSelectedRow();
        controlador.entregarPedido(filaSeleccionada);
    }

}
