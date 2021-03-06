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
import javax.swing.JOptionPane;
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
    public boolean cicloContable = true;
    public  Point centrar(JInternalFrame frame){
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
        jMenuKardex = new javax.swing.JMenu();
        jMenuItemMateriaPrima = new javax.swing.JMenuItem();
        jMenuItemProductoTerminado = new javax.swing.JMenuItem();
        jMenuInformes = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuBalances = new javax.swing.JMenu();
        jMenuBG = new javax.swing.JMenuItem();
        jMenuBC = new javax.swing.JMenuItem();
        jMenuBCA = new javax.swing.JMenuItem();
        jMenuEstadoCiclo = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

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

        jMenuKardex.setText("Kardex");
        jMenuKardex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuKardexActionPerformed(evt);
            }
        });

        jMenuItemMateriaPrima.setText("Plastico PET");
        jMenuItemMateriaPrima.setEnabled(false);
        jMenuItemMateriaPrima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMateriaPrimaActionPerformed(evt);
            }
        });
        jMenuKardex.add(jMenuItemMateriaPrima);

        jMenuItemProductoTerminado.setText("Producto Terminado");
        jMenuItemProductoTerminado.setEnabled(false);
        jMenuItemProductoTerminado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProductoTerminadoActionPerformed(evt);
            }
        });
        jMenuKardex.add(jMenuItemProductoTerminado);

        jMenuBar1.add(jMenuKardex);

        jMenuInformes.setText("Informes");
        jMenuInformes.setEnabled(false);

        jMenuItem2.setText("Estado de Resultados");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenuInformes.add(jMenuItem2);

        jMenuItem3.setText("Estado de Capital");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenuInformes.add(jMenuItem3);

        jMenuBar1.add(jMenuInformes);

        jMenuBalances.setText("Balances");
        jMenuBalances.setEnabled(false);
        jMenuBalances.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuBalancesActionPerformed(evt);
            }
        });

        jMenuBG.setLabel("Balance General");
        jMenuBG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuBGActionPerformed(evt);
            }
        });
        jMenuBalances.add(jMenuBG);

        jMenuBC.setLabel("Balance de Comprobacion");
        jMenuBC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuBCActionPerformed(evt);
            }
        });
        jMenuBalances.add(jMenuBC);

        jMenuBCA.setLabel("Balance de Comprobación AJUSTES");
        jMenuBCA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuBCAActionPerformed(evt);
            }
        });
        jMenuBalances.add(jMenuBCA);

        jMenuBar1.add(jMenuBalances);

        jMenuEstadoCiclo.setText("Estado del Ciclo: Abierto");

        jMenuItem4.setText("Cerrar Ciclo Contable");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenuEstadoCiclo.add(jMenuItem4);

        jMenuBar1.add(jMenuEstadoCiclo);

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
            Consulta c = new Consulta();
            c.inicializar();
            this.lista = c.obtener("Cuenta");
            c.cerrarConexion();
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
            Consulta c = new Consulta();
            c.inicializar();
            this.lista = c.obtener("Cuenta");
            c.cerrarConexion();
            Partida abrir = new Partida(this.lista, this.sesion);
            abrir.setLocation(centrar(abrir));
            desktop.add(abrir);
            abrir.show();
        }else{
            logout();
        }
        
    }//GEN-LAST:event_jMenuItemCrearPartidaActionPerformed

    private void jMenuItemAjusteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAjusteActionPerformed
        if(cicloContable){
            JOptionPane.showMessageDialog(this,"El ciclo contable actualmente está abierto.");
        }
        else if(UserValidator.isSesionValida()){
            Consulta c = new Consulta();
            c.inicializar();
            this.lista = c.obtener("Cuenta");
            c.cerrarConexion();
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

    private void jMenuItemMateriaPrimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMateriaPrimaActionPerformed
        if(UserValidator.isSesionValida()){
            MateriaPrimaKardex mpk = new MateriaPrimaKardex();
            mpk.setLocation(centrar(mpk));
            desktop.add(mpk);
            mpk.show();
        }else{
            logout();
        }
    }//GEN-LAST:event_jMenuItemMateriaPrimaActionPerformed

    private void jMenuItemProductoTerminadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProductoTerminadoActionPerformed
        if(UserValidator.isSesionValida()){
            PTKardex ptk = new PTKardex();
            ptk.setLocation(centrar(ptk));
            desktop.add(ptk);
            ptk.show();
        }else{
            logout();
        }
    }//GEN-LAST:event_jMenuItemProductoTerminadoActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        //Para abrir un formulario nuevo validamos si la sesión es, válida :v
        //La parte de la lista se hace con todas las ventanas en las que queramos manipular/leer Cuentas
        //por el hecho que se hace más fácil que estar haciendo consultas cada vez que se quiera usar.
        if(UserValidator.isSesionValida()){
            Consulta c = new Consulta();
            c.inicializar();
            this.lista = c.obtener("Cuenta");
            c.cerrarConexion();
            EstadoDeResultados edr = new EstadoDeResultados(lista); //Con todo y la lista iniciamos la ventana
            edr.setLocation(centrar(edr));
            desktop.add(edr);
            edr.show();
        }else{
            logout();
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        if(UserValidator.isSesionValida()){
            Consulta c = new Consulta();
            c.inicializar();
            this.lista = c.obtener("Cuenta");
            c.cerrarConexion();
            EstadoDeCapital edr = new EstadoDeCapital(lista); //Con todo y la lista iniciamos la ventana
            edr.setLocation(centrar(edr));
            desktop.add(edr);
            edr.show();
        }else{
            logout();
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuBGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuBGActionPerformed
        // TODO add your handling code here:
        if(UserValidator.isSesionValida()){
            BalanceGeneral bca = new BalanceGeneral();
            bca.setLocation(centrar(bca));
            desktop.add(bca);
            bca.show();
        }else{
            logout();
        }
    }//GEN-LAST:event_jMenuBGActionPerformed

    private void jMenuBCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuBCActionPerformed
        // TODO add your handling code here:
        if(UserValidator.isSesionValida()){
            BalanceDeComprobacion bc = new BalanceDeComprobacion();
            bc.setLocation(centrar(bc));
            desktop.add(bc);
            bc.show();
        }else{
            logout();
        }
    }//GEN-LAST:event_jMenuBCActionPerformed

    private void jMenuBCAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuBCAActionPerformed
        // TODO add your handling code here:
        if(UserValidator.isSesionValida()){
            BalanceDeComprobacionAjustado bg = new BalanceDeComprobacionAjustado();
            bg.setLocation(centrar(bg));
            desktop.add(bg);
            bg.show();
        }else{
            logout();
        }
    }//GEN-LAST:event_jMenuBCAActionPerformed

    private void jMenuBalancesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuBalancesActionPerformed
        // TODO add your handling code here:
        //aquíii
        
    }//GEN-LAST:event_jMenuBalancesActionPerformed

    private void jMenuKardexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuKardexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuKardexActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        cicloContable=!cicloContable;
        jMenuItem4.setEnabled(cicloContable);
        jMenuItemCrearPartida.setEnabled(cicloContable);
        jMenuEstadoCiclo.setText("Estado del Ciclo: CERRADO");
        jMenuInformes.setEnabled(true);
        jMenuBalances.setEnabled(true);
        jMenuKardex.setEnabled(false);
    }//GEN-LAST:event_jMenuItem4ActionPerformed
    private void login(){
        Login abrir = new Login(menuArchivo,jMenuCuentas,jMenuKardex);
        abrir.setLocation(centrar(abrir));
        desktop.add(abrir);
        abrir.show();
    }
    private void logout(){
        menuArchivo.setText("Iniciar sesión...");
        for(JInternalFrame frame : desktop.getAllFrames())
            frame.dispose();
        jMenuCuentas.setEnabled(false);
        jMenuKardex.setEnabled(false);
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
    private javax.swing.JMenuItem jMenuBC;
    private javax.swing.JMenuItem jMenuBCA;
    private javax.swing.JMenuItem jMenuBG;
    private javax.swing.JMenu jMenuBalances;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCuentas;
    private javax.swing.JMenu jMenuEstadoCiclo;
    private javax.swing.JMenu jMenuInformes;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItemAgregarCuenta;
    private javax.swing.JMenuItem jMenuItemAjuste;
    private javax.swing.JMenuItem jMenuItemCatalogo;
    private javax.swing.JMenuItem jMenuItemCrearPartida;
    private javax.swing.JMenuItem jMenuItemMateriaPrima;
    private javax.swing.JMenuItem jMenuItemProductoTerminado;
    private javax.swing.JMenu jMenuKardex;
    private javax.swing.JMenuItem menuArchivo;
    // End of variables declaration//GEN-END:variables
}
