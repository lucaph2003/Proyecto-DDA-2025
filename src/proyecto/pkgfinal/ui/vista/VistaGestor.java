package proyecto.pkgfinal.ui.vista;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import proyecto.pkgfinal.dominio.model.Gestor;
import proyecto.pkgfinal.dominio.model.Pedido;
import proyecto.pkgfinal.dominio.model.Session;
import proyecto.pkgfinal.ui.controller.GestorController;
import proyecto.pkgfinal.ui.interfaces.IVistaGestor;

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(txtGestorLogueado, javax.swing.GroupLayout.PREFERRED_SIZE, 1126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnTomarPedido)
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnFinalizarPedido)
                        .addGap(37, 37, 37)
                        .addComponent(btnEntregarPedido)
                        .addGap(43, 43, 43))))
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
                .addGap(18, 18, 18)
                .addComponent(btnTomarPedido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFinalizarPedido)
                    .addComponent(btnEntregarPedido))
                .addGap(31, 31, 31))
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
                .addGap(0, 22, Short.MAX_VALUE))
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

    @Override
    public void inicializar() {
        this.setTitle("Procesar Pedidos");
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        Gestor gestor = controlador.getGestor();
        this.txtGestorLogueado.setText("Gestor: " + gestor.getNombreCompleto() + " | Unidad Procesadora: " + gestor.getUnidadAsignada().getNombre());
        actualizarPedidosTomados(null);
    }

    @Override
    public void mostrarEror(String error) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void cerrar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
    private javax.swing.JList<String> listPedidosPendientes;
    private javax.swing.JTable tablePedidosTomados;
    private javax.swing.JLabel txtGestorLogueado;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actualizarPedidosPendientes(ArrayList<Pedido> lista) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void tomarPedido() {
        //Obtener pedido y mandarlo al controlador
        //Pedido pedido = 
        ///this.controlador.tomarPedido(pedido);
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
                datos.setValueAt(pedido.getFechaHora(),fila,3);
                datos.setValueAt(pedido.getItem().getNombre(),fila,4);
                datos.setValueAt(pedido.getEstado(),fila,2);
                fila++;
            }
        }
        tablePedidosTomados.setModel(datos);
    }

    @Override
    public void finalizarServicio() {
        controlador.finarServicio();
    }

    @Override
    public void entregarPedido() {
        //Pedido p = Lista pedido seleccionado
        //controlador.entregarPedido(p);
    }
}
