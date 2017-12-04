/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frm;

import db.Consulta;
import static frm.Partida.sesion;
import java.awt.Color;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import modelo.Cuenta;
import modelo.LineaDePartida;
import modelo.PeriodoContable;
import sesion.UserValidator;

/**
 *
 * @author jaquino
 */
public class Ajuste extends javax.swing.JInternalFrame {

    List<Cuenta> lista;

    /**
     * Creates new form Ajuste
     */
    public Ajuste(List<Cuenta> lista) {
        initComponents();
        this.lista = lista;
        initTablaCuentas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAjustes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        tfBusquedaNombre = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCuentas = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        etiquetaTotal = new javax.swing.JLabel();
        totalDebe = new javax.swing.JLabel();
        totalHaber = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        errorPartidaDoble = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Ajustes");

        jTableAjustes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Cuenta", "Debe", "Haber"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableAjustes.getModel().addTableModelListener(
            new TableModelListener()
            {
                public void tableChanged(TableModelEvent evt)
                {
                    revisarTablaAjustes();
                }

            });
            jScrollPane1.setViewportView(jTableAjustes);
            if (jTableAjustes.getColumnModel().getColumnCount() > 0) {
                jTableAjustes.getColumnModel().getColumn(0).setPreferredWidth(35);
                jTableAjustes.getColumnModel().getColumn(1).setPreferredWidth(250);
                jTableAjustes.getColumnModel().getColumn(2).setPreferredWidth(100);
                jTableAjustes.getColumnModel().getColumn(3).setPreferredWidth(100);
            }

            jLabel1.setText("Búsqueda por nombre o código:");

            tfBusquedaNombre.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyReleased(java.awt.event.KeyEvent evt) {
                    tfBusquedaNombreKeyReleased(evt);
                }
            });

            jTableCuentas.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                    "Codigo", "Nombre"
                }
            ) {
                Class[] types = new Class [] {
                    java.lang.Integer.class, java.lang.String.class
                };
                boolean[] canEdit = new boolean [] {
                    false, false
                };

                public Class getColumnClass(int columnIndex) {
                    return types [columnIndex];
                }

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            });
            jScrollPane2.setViewportView(jTableCuentas);
            if (jTableCuentas.getColumnModel().getColumnCount() > 0) {
                jTableCuentas.getColumnModel().getColumn(0).setPreferredWidth(20);
                jTableCuentas.getColumnModel().getColumn(1).setResizable(false);
                jTableCuentas.getColumnModel().getColumn(1).setPreferredWidth(200);
            }

            jButton1.setText("Guardar cambios");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });

            jButton2.setText("Agregar a la tabla");
            jButton2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton2ActionPerformed(evt);
                }
            });

            etiquetaTotal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
            etiquetaTotal.setText("Total:");

            totalDebe.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
            totalDebe.setText("0.0");

            totalHaber.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
            totalHaber.setText("0.0");

            jButton3.setText("Eliminar Seleccionada");
            jButton3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton3ActionPerformed(evt);
                }
            });

            errorPartidaDoble.setForeground(java.awt.Color.red);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfBusquedaNombre)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(177, 177, 177)
                            .addComponent(etiquetaTotal)
                            .addGap(79, 79, 79)
                            .addComponent(totalDebe, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(totalHaber, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(24, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(errorPartidaDoble, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addContainerGap())))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfBusquedaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton2)
                                .addComponent(jButton3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(errorPartidaDoble, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaTotal)
                            .addComponent(totalDebe)
                            .addComponent(totalHaber)))
                    .addContainerGap())
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void tfBusquedaNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBusquedaNombreKeyReleased
        String nombre = tfBusquedaNombre.getText();

        if (!tfBusquedaNombre.getText().isEmpty()) {
            nombre = nombre.toLowerCase();
            DefaultTableModel modelo = (DefaultTableModel) jTableCuentas.getModel();
            modelo.getDataVector().removeAllElements();
            for (Cuenta i : lista) {
                if ((i.getAjustable() && i.getOperable()) && (i.getNombreCuenta().toLowerCase().contains(nombre) || String.valueOf(i.getCodigo()).contains(nombre))) {
                    modelo.addRow(new Object[]{i.getCodigo(), i.getNombreCuenta()});
                }
            }
            jTableCuentas.revalidate();
        } else {
            DefaultTableModel modelo = (DefaultTableModel) jTableCuentas.getModel();
            modelo.getDataVector().removeAllElements();
            jTableCuentas.revalidate();
            initTablaCuentas();
        }
    }//GEN-LAST:event_tfBusquedaNombreKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String elementoNombre = "";
        String elementoCodigo = "";

        DefaultTableModel modelo = (DefaultTableModel) jTableAjustes.getModel();
        try {
            int filaSeleccionada = jTableCuentas.getSelectedRow();

            elementoNombre = (String) jTableCuentas.getValueAt(filaSeleccionada, 1);
            elementoCodigo = String.valueOf(jTableCuentas.getValueAt(filaSeleccionada, 0));

            elementoNombre = elementoNombre.trim();
            elementoCodigo = elementoCodigo.trim();
            boolean cuentaExistente = false;
            for (int i = 0; i < modelo.getRowCount(); i++) {
                String aux = String.valueOf(modelo.getValueAt(i, 0));
                if (elementoCodigo.equals(aux)) {
                    cuentaExistente = true;
                }
            }
            if (!cuentaExistente) {
                for (Cuenta x : lista) {
                    if (x.getNombreCuenta().equals(elementoNombre) && String.valueOf(x.getCodigo()).equals(elementoCodigo)) {
                        modelo.addRow(new Object[]{x.getCodigo(), x.getNombreCuenta(), 0.0, 0.0});
                        modelo.fireTableDataChanged();
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ya ingreso esa cuenta.");
            }

        } catch (ArrayIndexOutOfBoundsException e) {

        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!UserValidator.isSesionValida()) {
            JOptionPane.showMessageDialog(null, "Inicia sesión para continuar!");
        } else if (jTableCuentas.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "No deje la tabla sin contenido");
        } else if (revisarTabla()) {
            JOptionPane.showMessageDialog(null, "Agregue datos a las cuentas.");
        } else if (!errorPartidaDoble.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Asegurese de cumplir partida doble.");
        } else {
            errorPartidaDoble.setText("");
            Consulta con = new Consulta();

            for (int i = 0; i < jTableAjustes.getRowCount(); i++) {
                con.inicializar();
                //Obteniendo datos de la tabla
                Integer codigo = (Integer) jTableAjustes.getValueAt(i, 0);
                String nombre = (String) jTableAjustes.getValueAt(i, 1);
                List<Cuenta> arreglo = con.obtenerYFiltrar("modelo.Cuenta", "idCuenta =" + codigo);
                Cuenta cuenta = arreglo.get(0);
                BigDecimal debe = new BigDecimal((Double) jTableAjustes.getValueAt(i, 2));
                BigDecimal haber = new BigDecimal((Double) jTableAjustes.getValueAt(i, 3));

                //Obteniendo valores de la Cuenta para la suma acumulada.
                Double debeCuenta = cuenta.getSumaDebe().doubleValue();
                Double haberCuenta = cuenta.getSumaHaber().doubleValue();

                //Asignando valores a la cuenta correspondiente, sumatoria acumulada.
                BigDecimal debeTotalCuenta = new BigDecimal(debeCuenta + debe.doubleValue());
                BigDecimal haberTotalCuenta = new BigDecimal(haberCuenta + haber.doubleValue());
                cuenta.setSumaDebe(debeTotalCuenta);
                cuenta.setSumaHaber(haberTotalCuenta);
                Double saldo = Math.abs(debeCuenta - haberCuenta);
                BigDecimal saldoCuenta = new BigDecimal(saldo);
                cuenta.setSumaDebe(debeTotalCuenta);
                cuenta.setSumaHaber(haberTotalCuenta);
                cuenta.setSaldo(saldoCuenta);
                con.actualizar(cuenta);
                con.cerrarConexion();
                con.inicializar();
                lista = con.obtener("Cuenta");
                con.cerrarConexion();
                JOptionPane.showMessageDialog(this, "Cuentas Ajustadas con éxito");
            }

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableAjustes.getModel();
            if (modelo.getRowCount() > 0) {
                modelo.getDataVector().remove(jTableAjustes.getSelectedRow());
                jTableAjustes.revalidate();
                revisarTablaAjustes();
            }
        } catch (ArrayIndexOutOfBoundsException e) {

        }
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel errorPartidaDoble;
    private javax.swing.JLabel etiquetaTotal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableAjustes;
    private javax.swing.JTable jTableCuentas;
    private javax.swing.JTextField tfBusquedaNombre;
    private javax.swing.JLabel totalDebe;
    private javax.swing.JLabel totalHaber;
    // End of variables declaration//GEN-END:variables

    private void initTablaCuentas() {
        DefaultTableModel modelo = (DefaultTableModel) jTableCuentas.getModel();
        for (Cuenta c : lista) {
            if (c.getAjustable() && c.getOperable()) {
                modelo.addRow(new Object[]{c.getCodigo(), c.getNombreCuenta()});
            }
        }
    }

    private void revisarTablaAjustes() {
        double sumaDebe = 0;
        double sumaHaber = 0;
        for (int i = 0; i < jTableAjustes.getRowCount(); i++) {
            Double debe = (Double) jTableAjustes.getValueAt(i, 2);
            Double haber = (Double) jTableAjustes.getValueAt(i, 3);
            sumaDebe = sumaDebe + debe;
            sumaHaber = sumaHaber + haber;
        }
        totalDebe.setText(String.valueOf(sumaDebe));
        totalHaber.setText(String.valueOf(sumaHaber));

        if (sumaDebe != sumaHaber) {
            errorPartidaDoble.setText("No se cumple partida doble");
            totalDebe.setForeground(Color.RED);
            totalHaber.setForeground(Color.RED);
            etiquetaTotal.setForeground(Color.RED);
        } else {
            errorPartidaDoble.setText("");
            totalDebe.setForeground(Color.BLACK);
            totalHaber.setForeground(Color.BLACK);
            etiquetaTotal.setForeground(Color.BLACK);
        }

    }

    private boolean revisarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) jTableAjustes.getModel();
        for (int i = 0; i < modelo.getRowCount(); i++) {
            Double debe = Double.parseDouble(String.valueOf(modelo.getValueAt(i, 2)));
            Double haber = Double.parseDouble(String.valueOf(modelo.getValueAt(i, 3)));
            if (debe == 0 && haber == 0) {
                return true;
            }
        }
        return false;
    }

}
