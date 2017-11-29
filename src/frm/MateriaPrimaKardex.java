/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frm;

import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Sony
 */
public class MateriaPrimaKardex extends javax.swing.JInternalFrame {

    /**
     * Creates new form MateriaPrimaKardex
     */
    public MateriaPrimaKardex() {
        initComponents();
        
        inicializarColumnas();
    }
    
    private void inicializarColumnas(){
        TableColumnModel tColumn = new DefaultTableColumnModel();
        
        for (int i=0; i<10; i++){
            TableColumn col= new TableColumn(i);
            
            switch (i){
                case 0:
                    col.setHeaderValue("Fecha");
                    break;
                case 1:
                    col.setHeaderValue("Cantidad");
                    break;
                case 2:
                    col.setHeaderValue("Costo Unitario");
                    break;
                case 3:
                    col.setHeaderValue("Monto");
                    break;
                case 4:
                    col.setHeaderValue("Cantidad");
                    break;
                case 5:
                    col.setHeaderValue("Costo Unitario");
                    break;
                case 6:
                    col.setHeaderValue("Monto");
                    break;
                case 7:
                    col.setHeaderValue("Cantidad");
                    break;
                case 8:
                    col.setHeaderValue("Costo Unitario");
                    break;
                case 9:
                    col.setHeaderValue("Monto");
                
            }
            tColumn.addColumn(col);
        }
        tablaMateriaP.setColumnModel(tColumn);
        
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lMateriaP = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMateriaP = new javax.swing.JTable();
        lEntrada1 = new javax.swing.JLabel();
        lSalida1 = new javax.swing.JLabel();
        lSaldo1 = new javax.swing.JLabel();

        lMateriaP.setText("Costo de Materia Prima");

        tablaMateriaP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaMateriaP);

        lEntrada1.setText("Entradas");

        lSalida1.setText("Salidas");

        lSaldo1.setText("Saldos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(lEntrada1)
                .addGap(148, 148, 148)
                .addComponent(lSalida1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                .addComponent(lSaldo1)
                .addGap(75, 75, 75))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lMateriaP))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lMateriaP)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEntrada1)
                    .addComponent(lSalida1)
                    .addComponent(lSaldo1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lEntrada1;
    private javax.swing.JLabel lMateriaP;
    private javax.swing.JLabel lSaldo1;
    private javax.swing.JLabel lSalida1;
    private javax.swing.JTable tablaMateriaP;
    // End of variables declaration//GEN-END:variables
}