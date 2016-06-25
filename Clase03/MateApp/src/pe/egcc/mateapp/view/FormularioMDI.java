package pe.egcc.mateapp.view;

import javax.swing.JInternalFrame;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog wwww.desarrollasoftware.com
 */
public class FormularioMDI extends javax.swing.JFrame {

  private final int OP_FACTORIAL = 1;
  private final int OP_MCD_MCM = 2;
  private final int OP_FIBONACCI = 3;
  private final int OP_PRIMO = 4;

  public FormularioMDI() {
    initComponents();
    this.setExtendedState(MAXIMIZED_BOTH);
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jToolBar1 = new javax.swing.JToolBar();
    btnFactorial = new javax.swing.JButton();
    btnMcdMcm = new javax.swing.JButton();
    btnFibonacci = new javax.swing.JButton();
    btnPrimo = new javax.swing.JButton();
    jSeparator1 = new javax.swing.JToolBar.Separator();
    btnSalir = new javax.swing.JButton();
    desktopPane = new javax.swing.JDesktopPane();
    menuBar = new javax.swing.JMenuBar();
    menuArchivo = new javax.swing.JMenu();
    menuArchivoSalir = new javax.swing.JMenuItem();
    menuMate = new javax.swing.JMenu();
    menuMateFactorial = new javax.swing.JMenuItem();
    menuMateMcdMcm = new javax.swing.JMenuItem();
    menuMateFinonacci = new javax.swing.JMenuItem();
    menuMatePrimo = new javax.swing.JMenuItem();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("MATEMATICA PARA TODOS");

    jToolBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jToolBar1.setFloatable(false);
    jToolBar1.setRollover(true);

    btnFactorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/egcc/mateapp/img/fibonacci.png"))); // NOI18N
    btnFactorial.setToolTipText("Fatorial");
    btnFactorial.setFocusable(false);
    btnFactorial.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btnFactorial.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    btnFactorial.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnFactorialActionPerformed(evt);
      }
    });
    jToolBar1.add(btnFactorial);

    btnMcdMcm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/egcc/mateapp/img/mcd.png"))); // NOI18N
    btnMcdMcm.setToolTipText("MCD y MCM");
    btnMcdMcm.setFocusable(false);
    btnMcdMcm.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btnMcdMcm.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    btnMcdMcm.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnMcdMcmActionPerformed(evt);
      }
    });
    jToolBar1.add(btnMcdMcm);

    btnFibonacci.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/egcc/mateapp/img/numbers.png"))); // NOI18N
    btnFibonacci.setToolTipText("Fibonacci");
    btnFibonacci.setFocusable(false);
    btnFibonacci.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btnFibonacci.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    btnFibonacci.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnFibonacciActionPerformed(evt);
      }
    });
    jToolBar1.add(btnFibonacci);

    btnPrimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/egcc/mateapp/img/calculator.png"))); // NOI18N
    btnPrimo.setToolTipText("Primo");
    btnPrimo.setFocusable(false);
    btnPrimo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btnPrimo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    btnPrimo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnPrimoActionPerformed(evt);
      }
    });
    jToolBar1.add(btnPrimo);
    jToolBar1.add(jSeparator1);

    btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/egcc/mateapp/img/man-sprinting.png"))); // NOI18N
    btnSalir.setToolTipText("Salir");
    btnSalir.setFocusable(false);
    btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    btnSalir.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSalirActionPerformed(evt);
      }
    });
    jToolBar1.add(btnSalir);

    menuArchivo.setText("Archivo");

    menuArchivoSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
    menuArchivoSalir.setText("Salir");
    menuArchivoSalir.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        menuArchivoSalirActionPerformed(evt);
      }
    });
    menuArchivo.add(menuArchivoSalir);

    menuBar.add(menuArchivo);

    menuMate.setText("Mate");

    menuMateFactorial.setText("Factorial");
    menuMateFactorial.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        menuMateFactorialActionPerformed(evt);
      }
    });
    menuMate.add(menuMateFactorial);

    menuMateMcdMcm.setText("MCD y MCM");
    menuMateMcdMcm.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        menuMateMcdMcmActionPerformed(evt);
      }
    });
    menuMate.add(menuMateMcdMcm);

    menuMateFinonacci.setText("Fibonacci");
    menuMateFinonacci.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        menuMateFinonacciActionPerformed(evt);
      }
    });
    menuMate.add(menuMateFinonacci);

    menuMatePrimo.setText("Primo");
    menuMatePrimo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        menuMatePrimoActionPerformed(evt);
      }
    });
    menuMate.add(menuMatePrimo);

    menuBar.add(menuMate);

    setJMenuBar(menuBar);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
      .addComponent(desktopPane)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void menuArchivoSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArchivoSalirActionPerformed
    System.exit(0);
  }//GEN-LAST:event_menuArchivoSalirActionPerformed

  private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
    System.exit(0);
  }//GEN-LAST:event_btnSalirActionPerformed

  private void menuMateFactorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMateFactorialActionPerformed
    cargarFormulario(OP_FACTORIAL);
  }//GEN-LAST:event_menuMateFactorialActionPerformed

  private void menuMateMcdMcmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMateMcdMcmActionPerformed
    cargarFormulario(OP_MCD_MCM);
  }//GEN-LAST:event_menuMateMcdMcmActionPerformed

  private void menuMateFinonacciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMateFinonacciActionPerformed
    cargarFormulario(OP_FIBONACCI);
  }//GEN-LAST:event_menuMateFinonacciActionPerformed

  private void menuMatePrimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMatePrimoActionPerformed
    cargarFormulario(OP_PRIMO);
  }//GEN-LAST:event_menuMatePrimoActionPerformed

  private void btnFactorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFactorialActionPerformed
    cargarFormulario(OP_FACTORIAL);
  }//GEN-LAST:event_btnFactorialActionPerformed

  private void btnMcdMcmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMcdMcmActionPerformed
    cargarFormulario(OP_MCD_MCM);
  }//GEN-LAST:event_btnMcdMcmActionPerformed

  private void btnFibonacciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFibonacciActionPerformed
    cargarFormulario(OP_FIBONACCI);
  }//GEN-LAST:event_btnFibonacciActionPerformed

  private void btnPrimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimoActionPerformed
    cargarFormulario(OP_PRIMO);
  }//GEN-LAST:event_btnPrimoActionPerformed

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
      java.util.logging.Logger.getLogger(FormularioMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(FormularioMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(FormularioMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(FormularioMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new FormularioMDI().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnFactorial;
  private javax.swing.JButton btnFibonacci;
  private javax.swing.JButton btnMcdMcm;
  private javax.swing.JButton btnPrimo;
  private javax.swing.JButton btnSalir;
  private javax.swing.JDesktopPane desktopPane;
  private javax.swing.JToolBar.Separator jSeparator1;
  private javax.swing.JToolBar jToolBar1;
  private javax.swing.JMenu menuArchivo;
  private javax.swing.JMenuItem menuArchivoSalir;
  private javax.swing.JMenuBar menuBar;
  private javax.swing.JMenu menuMate;
  private javax.swing.JMenuItem menuMateFactorial;
  private javax.swing.JMenuItem menuMateFinonacci;
  private javax.swing.JMenuItem menuMateMcdMcm;
  private javax.swing.JMenuItem menuMatePrimo;
  // End of variables declaration//GEN-END:variables

  private void cargarFormulario(int op) {
    switch (op) {
      case OP_FACTORIAL:
        cargarFormInterno(FactorialView.class);
        break;
      case OP_MCD_MCM:
        cargarFormInterno(McdMcmView.class);
        break;
      case OP_FIBONACCI:
        cargarFormInterno(FibonacciView.class);
        break;
      case OP_PRIMO:
        cargarFormInterno(PrimoView.class);
        break;
    }
  }

  private void cargarFormInterno(Class<?> aClass) {
    try {
      // Variable de control
      JInternalFrame view = null;
      // Buscar objeto en desktopPane
      for(JInternalFrame form: desktopPane.getAllFrames()){
        if(aClass.isInstance(form)){
          view = form;
          break;
        }
      }
      // Crear instancia
      if(view == null){
        view = (JInternalFrame) Class.forName(aClass.getName()).newInstance();
        desktopPane.add(view);
        view.setVisible(true);
      }
      // Activar formulario
      view.setSelected(true);
    } catch (Exception e) {
    }
  }

}
