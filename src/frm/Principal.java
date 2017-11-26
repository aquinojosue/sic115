/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frm;

import db.Consulta;
import java.awt.Dimension;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import modelo.Cuenta;
import modelo.Sesiones;
import modelo.Usuario;
import sesion.UserValidator;

/**
 *
 * @author jaquino
 */
public class Principal extends javax.swing.JFrame {
    public static Sesiones sesion;
    public Point centrar(JInternalFrame frame){
        Dimension desktopSize = desktop.getSize();
        Dimension jInternalFrameSize = frame.getSize();
        Point punto = new Point((desktopSize.width - jInternalFrameSize.width)/2,(desktopSize.height- jInternalFrameSize.height)/2);
        
        return punto;
    }
    /**
     * Creates new form Main
     */
    public Principal() {
        initComponents();
        consultaInicial_Cuentas();
    }
    
    List<Cuenta> lista = new ArrayList<>();
    
    public void consultaInicial_Cuentas(){
        Consulta nueva = new Consulta();
        nueva.inicializar();
        lista = nueva.obtener("Cuenta");
        nueva.cerrarConexion();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuArchivo = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuCuentas = new javax.swing.JMenu();
        jMenuItemCatalogo = new javax.swing.JMenuItem();
        jMenuItemAgregarCuenta = new javax.swing.JMenuItem();
        jMenuItemCrearPartida = new javax.swing.JMenuItem();
        jMenuItemAjuste = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SIC-115");
        setExtendedState(6);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        desktop.setDragMode(javax.swing.JDesktopPane.OUTLINE_DRAG_MODE);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 949, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 534, Short.MAX_VALUE)
        );

        jMenu1.setText("Archivo");

        menuArchivo.setText("Iniciar sesión");
        menuArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArchivoActionPerformed(evt);
            }
        });
        jMenu1.add(menuArchivo);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Cerrar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenuCuentas.setText("Cuentas");
        jMenuCuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCuentasActionPerformed(evt);
            }
        });

        jMenuItemCatalogo.setText("Catalogo de Cuentas");
        jMenuItemCatalogo.setEnabled(false);
        jMenuItemCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCatalogoActionPerformed(evt);
            }
        });
        jMenuCuentas.add(jMenuItemCatalogo);

        jMenuItemAgregarCuenta.setText("Agregar Cuenta");
        jMenuItemAgregarCuenta.setEnabled(false);
        jMenuItemAgregarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAgregarCuentaActionPerformed(evt);
            }
        });
        jMenuCuentas.add(jMenuItemAgregarCuenta);

        jMenuItemCrearPartida.setText("Partidas");
        jMenuItemCrearPartida.setEnabled(false);
        jMenuItemCrearPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCrearPartidaActionPerformed(evt);
            }
        });
        jMenuCuentas.add(jMenuItemCrearPartida);

        jMenuItemAjuste.setText("Ajustes");
        jMenuItemAjuste.setEnabled(false);
        jMenuItemAjuste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAjusteActionPerformed(evt);
            }
        });
        jMenuCuentas.add(jMenuItemAjuste);

        jMenuBar1.add(jMenuCuentas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArchivoActionPerformed
        if(jMenuCuentas.isEnabled())
            logout();
        else
            login();
    }//GEN-LAST:event_menuArchivoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        login();
    }//GEN-LAST:event_formWindowOpened
    
      public Catalogo abrir;
      
      public Catalogo getCatalogo(){
      return this.abrir;
      }
    
    private void jMenuItemCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCatalogoActionPerformed
        //Verificar que la sesion es válida antes de mostrar el contenido
        if(UserValidator.isSesionValida()){
            abrir = new Catalogo(lista);
            abrir.setLocation(centrar(abrir));
            desktop.add(abrir);
            abrir.show();
        }else{
            logout();
        }
        
    }//GEN-LAST:event_jMenuItemCatalogoActionPerformed

    private void jMenuCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCuentasActionPerformed
        System.out.println("aaa");
    }//GEN-LAST:event_jMenuCuentasActionPerformed

    private void jMenuItemAgregarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAgregarCuentaActionPerformed
        if(UserValidator.isSesionValida()){
            AddCuenta abrir = new AddCuenta(lista);
            abrir.setLocation(centrar(abrir));
            desktop.add(abrir);
            abrir.show();
        }else{
            logout();
        }
    }//GEN-LAST:event_jMenuItemAgregarCuentaActionPerformed

    private void jMenuItemCrearPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCrearPartidaActionPerformed
        if(UserValidator.isSesionValida()){
            Partida abrir = new Partida(this.lista);
            abrir.setLocation(centrar(abrir));
            desktop.add(abrir);
            abrir.show();
        }else{
            logout();
        }
        
    }//GEN-LAST:event_jMenuItemCrearPartidaActionPerformed

    private void jMenuItemAjusteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAjusteActionPerformed
        if(UserValidator.isSesionValida()){
            Ajuste abrir = new Ajuste(lista);
            abrir.setLocation(centrar(abrir));
            desktop.add(abrir);
            abrir.show();
        }else{
            logout();
        }
        
    }//GEN-LAST:event_jMenuItemAjusteActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    private void login(){
        Login abrir = new Login(menuArchivo,jMenuCuentas);
        abrir.setLocation(centrar(abrir));
        desktop.add(abrir);
        abrir.show();
    }
    private void logout(){
        menuArchivo.setText("Iniciar sesión...");
        for(JInternalFrame frame : desktop.getAllFrames())
            frame.dispose();
        jMenuCuentas.setEnabled(false);
        sesion.setActiva(false);
        sesion.setFin(new Date());
        
        Consulta c = new Consulta();
        c.inicializar();
        c.actualizar(sesion);
        c.cerrarConexion();
        sesion = null;
    }
    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
         /*Set the Nimbus look and feel
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Principal newMain = new Principal();
                newMain.setVisible(true);
                //newMain.setExtendedState(newMain.getExtendedState() | JFrame.MAXIMIZED_BOTH);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCuentas;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemAgregarCuenta;
    private javax.swing.JMenuItem jMenuItemAjuste;
    private javax.swing.JMenuItem jMenuItemCatalogo;
    private javax.swing.JMenuItem jMenuItemCrearPartida;
    private javax.swing.JMenuItem menuArchivo;
    // End of variables declaration//GEN-END:variables
}
