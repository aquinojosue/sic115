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
public class PTKardex extends javax.swing.JInternalFrame {

    /**
     * Creates new form PTKardex
     */
    public PTKardex() {
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
        tablaPT.setColumnModel(tColumn);
        
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lPt = new javax.swing.JLabel();
        lEntrada3 = new javax.swing.JLabel();
        lSalida3 = new javax.swing.JLabel();
        lSaldo3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPT = new javax.swing.JTable();

        lPt.setText("Costos de Producto Terminado");

        lEntrada3.setText("Entradas");

        lSalida3.setText("Salidas");

        lSaldo3.setText("Saldos");

        tablaPT.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaPT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(lEntrada3)
                .addGap(161, 161, 161)
                .addComponent(lSalida3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lSaldo3)
                .addGap(116, 116, 116))
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lPt))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lPt)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lSalida3)
                    .addComponent(lSaldo3)
                    .addComponent(lEntrada3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lEntrada3;
    private javax.swing.JLabel lPt;
    private javax.swing.JLabel lSaldo3;
    private javax.swing.JLabel lSalida3;
    private javax.swing.JTable tablaPT;
    // End of variables declaration//GEN-END:variables
}