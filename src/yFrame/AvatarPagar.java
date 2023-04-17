/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package yFrame;

import java.util.ArrayList;

/**
 *
 * @author angel
 */
public class AvatarPagar extends javax.swing.JFrame {
     private int boletosSeleccionados;
    private ArrayList<Integer> asientosSeleccionados;
    
    /**
     * Creates new form KimetsuPagar
     * @param boletosSeleccionados
     */
    public AvatarPagar(ArrayList<Integer> asientosSeleccionados, int boletosSeleccionados) {
        initComponents();
         this.setLocationRelativeTo(null);
         
         this.boletosSeleccionados = boletosSeleccionados;
         this.asientosSeleccionados = asientosSeleccionados;
        System.out.println("dato "+ asientosSeleccionados +"" + boletosSeleccionados);
        lblInfo.setText( asientosSeleccionados.toString());
        
        int valor = 40;
        int resultado = boletosSeleccionados * valor;
        
        lblPago.setText(Integer.toString(resultado));
        
        
    }

   

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        PagarBtn = new javax.swing.JButton();
        dulceria = new javax.swing.JButton();
        lblInfo = new javax.swing.JLabel();
        lblPago = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        text = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Total a pagar:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 66, 320, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("su asiento es:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 320, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("¡Disfrute su pelicula y vuelva pronto!");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 320, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/avaChi.gif"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 120, 180));

        jButton1.setBackground(new java.awt.Color(202, 151, 166));
        jButton1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Regresar");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 120, 30));

        PagarBtn.setBackground(new java.awt.Color(255, 153, 153));
        PagarBtn.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        PagarBtn.setForeground(new java.awt.Color(0, 0, 0));
        PagarBtn.setText("Pagar");
        PagarBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PagarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PagarBtnMouseClicked(evt);
            }
        });
        PagarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagarBtnActionPerformed(evt);
            }
        });
        jPanel1.add(PagarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 390, 130, 30));

        dulceria.setBackground(new java.awt.Color(255, 153, 153));
        dulceria.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        dulceria.setForeground(new java.awt.Color(0, 0, 0));
        dulceria.setText("Dulceria");
        dulceria.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dulceria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dulceriaMouseClicked(evt);
            }
        });
        dulceria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dulceriaActionPerformed(evt);
            }
        });
        jPanel1.add(dulceria, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 290, 130, 30));

        lblInfo.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblInfo.setForeground(new java.awt.Color(0, 0, 0));
        lblInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 320, 40));

        lblPago.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblPago.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 320, 50));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("$");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 50, 50));

        text.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        text.setForeground(new java.awt.Color(255, 204, 204));
        text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ticket.png"))); // NOI18N
        jPanel1.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 320, 420));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Login.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        AvatarPagina principal = new AvatarPagina();
        dispose();
        principal.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void PagarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PagarBtnMouseClicked
        Inicio principal = new Inicio();
        dispose();
        principal.setVisible(true);
    }//GEN-LAST:event_PagarBtnMouseClicked

    private void PagarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PagarBtnActionPerformed

    private void dulceriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dulceriaMouseClicked
        // TODO add your handling code here:
        Dulceria principal = new Dulceria();
        dispose();
        principal.setVisible(true);
    }//GEN-LAST:event_dulceriaMouseClicked

    private void dulceriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dulceriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dulceriaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AvatarPagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AvatarPagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AvatarPagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AvatarPagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PagarBtn;
    private javax.swing.JButton dulceria;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblPago;
    private javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables
}
