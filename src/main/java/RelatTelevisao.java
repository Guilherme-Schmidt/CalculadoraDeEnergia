//Guilherme Schmidt Lingnau RA: 2210924

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class RelatTelevisao extends javax.swing.JFrame {

    private static RelatTelevisao relatTelevUnic;
    
    public RelatTelevisao() {
        initComponents();
    }
    
    public static RelatTelevisao getRelatTelevisao(){
        if(relatTelevUnic == null){
            relatTelevUnic = new RelatTelevisao();
        }
        return relatTelevUnic;
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbTelev = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tbTelev.setModel(new javax.swing.table.DefaultTableModel(
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
        tbTelev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTelevMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbTelev);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbTelevMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTelevMouseClicked
        selectTab();
    }//GEN-LAST:event_tbTelevMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listarTab();
    }//GEN-LAST:event_formWindowActivated
    
    public void selectTab(){
        String valLin = "";
        
        int posLin = tbTelev.getSelectedRow();
        
        for(int col = 0;col<tbTelev.getColumnCount();col++){
            valLin += tbTelev.getModel().getValueAt(posLin,col).toString();
            
            if(col+1<tbTelev.getColumnCount()){
                valLin+=" - ";
            }
        
        }
        JOptionPane.showMessageDialog(null,"Valor encontrado : " + valLin,"Busca de dados",1);
    }
    
    public void listarTab(){
        DefaultTableModel tabModel = (DefaultTableModel) tbTelev.getModel();
        
        int posLin = 0;
        tabModel.setRowCount(posLin);
        
        for(Televisao t: Banco.getBanco().getBdTele()){
            tabModel.insertRow(posLin, new Object[]{t.getMarca(),t.calcular(),t.gastoTotal()});
            posLin++;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbTelev;
    // End of variables declaration//GEN-END:variables
}
