package proyecto.pkgfinal.ui.vista;

import java.util.ArrayList;
import proyecto.pkgfinal.dominio.model.Dispositivo;
import proyecto.pkgfinal.servicios.fachada.Fachada;

public class VentanaInicial extends javax.swing.JFrame {

    public VentanaInicial() {
        initComponents();
        config(); 
    }
    
    private void config(){
        this.setTitle("Proyecto Facultad");
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnGestor = new javax.swing.JButton();
        btnCargarDispositivos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 204, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Pollo-Morfismo");

        btnGestor.setBackground(new java.awt.Color(0, 102, 204));
        btnGestor.setFont(new java.awt.Font("Yu Gothic", 0, 48)); // NOI18N
        btnGestor.setForeground(new java.awt.Color(255, 255, 255));
        btnGestor.setText("Nuevo Gestor");
        btnGestor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGestor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestorActionPerformed(evt);
            }
        });

        btnCargarDispositivos.setFont(new java.awt.Font("Yu Gothic", 0, 36)); // NOI18N
        btnCargarDispositivos.setText("Cargar Dispositivos");
        btnCargarDispositivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarDispositivosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGestor)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCargarDispositivos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGestor, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCargarDispositivos)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGestorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestorActionPerformed
       new VistaLoginGestor();      
    }//GEN-LAST:event_btnGestorActionPerformed

    private void btnCargarDispositivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarDispositivosActionPerformed
        ArrayList<Dispositivo> dispositivos = Fachada.getInstancia().getDispositivos();
        for(Dispositivo d : dispositivos){
            new VentanaDispositivo(d);
        }
    }//GEN-LAST:event_btnCargarDispositivosActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargarDispositivos;
    private javax.swing.JButton btnGestor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
