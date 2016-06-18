/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagosapp.Pagosapp.view;

import javax.swing.JOptionPane;
import pagosapp.Pagosapp.dto.PagoDto;
import pagosapp.Pagosapp.services.PagosServices;

/**
 *
 * @author Alumno
 */
public class PagosView extends javax.swing.JFrame {

    /**
     * Creates new form pagos
     */
    public PagosView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblhorasdia = new javax.swing.JLabel();
        lbldias = new javax.swing.JLabel();
        lblpagohora = new javax.swing.JLabel();
        txthorasdia = new javax.swing.JTextField();
        txtdias = new javax.swing.JTextField();
        txtpagoshora = new javax.swing.JTextField();
        btnprocesar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblhorasdia.setText("Horas Dia");

        lbldias.setText("Días");

        lblpagohora.setText("Pagos x Hora");

        txtpagoshora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpagoshoraActionPerformed(evt);
            }
        });

        btnprocesar.setText("Procesar");
        btnprocesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprocesarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblpagohora, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtpagoshora, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblhorasdia, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbldias, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdias)
                            .addComponent(txthorasdia))))
                .addGap(35, 35, 35)
                .addComponent(btnprocesar)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblhorasdia)
                    .addComponent(txthorasdia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldias)
                    .addComponent(txtdias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpagohora)
                    .addComponent(txtpagoshora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnprocesar))
                .addContainerGap(170, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnprocesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprocesarActionPerformed
        // Dato
        PagoDto dto = new PagoDto();
        dto.setHorasDia(Integer.parseInt( txthorasdia.getText()));
        dto.setDias(Integer.parseInt( txtdias.getText()));
        dto.setPagohora(Double.parseDouble( txtpagoshora.getText()));
        
         //Proceso
        PagosServices service=new PagosServices();
        service.procesar(dto);
        
        //Reporte
        String repo = "";
        repo +="Ingresos: "+dto.getIngresos()+ "\n";
        repo +="Renta    : "+dto.getRenta()+ "\n";
        repo +="Neto     : "+dto.getNeto()+ "\n";
                
        JOptionPane.showMessageDialog(rootPane, repo);
        
    }//GEN-LAST:event_btnprocesarActionPerformed

    private void txtpagoshoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpagoshoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpagoshoraActionPerformed

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
            java.util.logging.Logger.getLogger(PagosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PagosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PagosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PagosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PagosView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnprocesar;
    private javax.swing.JLabel lbldias;
    private javax.swing.JLabel lblhorasdia;
    private javax.swing.JLabel lblpagohora;
    private javax.swing.JTextField txtdias;
    private javax.swing.JTextField txthorasdia;
    private javax.swing.JTextField txtpagoshora;
    // End of variables declaration//GEN-END:variables
}
