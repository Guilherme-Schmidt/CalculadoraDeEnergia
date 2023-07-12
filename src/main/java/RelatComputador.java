//Guilherme Schmidt Lingnau RA: 2210924

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author guili
 */
public class RelatComputador extends javax.swing.JFrame {
    
    private static RelatComputador relatCompUnic;
  
    public RelatComputador() {
        initComponents();
    }
    
    public static RelatComputador getRelatComputador(){
        if(relatCompUnic == null){
            relatCompUnic = new RelatComputador();
        }
        return relatCompUnic;
    }

     public void selectTab(){
        String valLin = "";
        
        int posLin = tbComp.getSelectedRow();
        
        for(int col = 0;col<tbComp.getColumnCount();col++){
            valLin += tbComp.getModel().getValueAt(posLin,col).toString();
            
            if(col+1<tbComp.getColumnCount()){
                valLin+=" - ";
            }
        
        }
        JOptionPane.showMessageDialog(null,"Valor encontrado : " + valLin,"Busca de dados",1);
    }
    
    public void listarTab(){
        DefaultTableModel tabModel = (DefaultTableModel) tbComp.getModel();
        
        int posLin = 0;
        tabModel.setRowCount(posLin);
        
        for(Computador c: Banco.getBanco().getBdComp()){
            tabModel.insertRow(posLin, new Object[]{c.getMarca(),c.calcular(),c.gastoTotal()});
            posLin++;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbComp = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tbComp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Marca", "Consumo", "Gasto"
            }
        ));
        tbComp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCompMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbComp);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listarTab();
    }//GEN-LAST:event_formWindowActivated

    private void tbCompMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCompMouseClicked
        selectTab();
    }//GEN-LAST:event_tbCompMouseClicked
    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbComp;
    // End of variables declaration//GEN-END:variables
}
