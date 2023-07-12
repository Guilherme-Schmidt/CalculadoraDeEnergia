//Guilherme Schmidt Lingnau RA: 2210924

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RelatImpressora extends javax.swing.JFrame {

    private static RelatImpressora relatImpUnic;
    
    public RelatImpressora() {
        initComponents();
    }

     public static RelatImpressora getRelatImpressora(){
        if(relatImpUnic == null){
            relatImpUnic = new RelatImpressora();
        }
        return relatImpUnic;
    }
     
      public void selectTab(){
        String valLin = "";
        
        int posLin = tbImp.getSelectedRow();
        
        for(int col = 0;col<tbImp.getColumnCount();col++){
            valLin += tbImp.getModel().getValueAt(posLin,col).toString();
            
            if(col+1<tbImp.getColumnCount()){
                valLin+=" - ";
            }
        
        }
        JOptionPane.showMessageDialog(null,"Valor encontrado : " + valLin,"Busca de dados",1);
    }
    
    public void listarTab(){
        DefaultTableModel tabModel = (DefaultTableModel) tbImp.getModel();
        
        int posLin = 0;
        tabModel.setRowCount(posLin);
        
        for(Impressora i: Banco.getBanco().getBdImp()){
            tabModel.insertRow(posLin, new Object[]{i.getMarca(),i.calcular(),i.gastoTotal()});
            posLin++;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbImp = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tbImp.setModel(new javax.swing.table.DefaultTableModel(
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
        tbImp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbImpMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbImp);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbImpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbImpMouseClicked
        selectTab();
    }//GEN-LAST:event_tbImpMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listarTab();
    }//GEN-LAST:event_formWindowActivated

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbImp;
    // End of variables declaration//GEN-END:variables
}
