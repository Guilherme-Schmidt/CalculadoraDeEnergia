//Guilherme Schmidt Lingnau RA: 2210924

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class RelatGeral extends javax.swing.JFrame {

   private static RelatGeral relatGerUnic;
   private static Dispositivos disp;
   
    private RelatGeral() {
        initComponents();
    }
    
    public static RelatGeral getRelatGeral(){
        if(relatGerUnic == null){
            relatGerUnic = new RelatGeral();
        }
        return relatGerUnic;
    }
     public void selecTab(){
        String valLin = "";
        
        int posLin = tbFinal.getSelectedRow();
        
        for(int col = 0; col < tbFinal.getColumnCount(); col++){
            valLin += tbFinal.getModel().getValueAt(posLin, col).toString();
            
            if(col+1 < tbFinal.getColumnCount()){
                valLin+= " - ";
            }
            
        }
        JOptionPane.showMessageDialog(
                null,
                "Valor capturado: "+valLin,
                "Captura de dados da Tabela",
                1
        );
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbFinal = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstGasto = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tbFinal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Marca", "Consumo ", "Gasto"
            }
        ));
        tbFinal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btTabFinalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbFinal);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Gasto Final em R$");

        lstGasto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstGastoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(lstGasto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 33, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(390, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btTabFinalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btTabFinalMouseClicked
        selectTab();
    }//GEN-LAST:event_btTabFinalMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listarTab();
    }//GEN-LAST:event_formWindowActivated

    private void lstGastoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstGastoMouseClicked
        impGastoFinal();
    }//GEN-LAST:event_lstGastoMouseClicked

    public void selectTab(){
        String valLin = "";
        
        int posLin = tbFinal.getSelectedRow();
        
        for(int col = 0;col<tbFinal.getColumnCount();col++){
            valLin += tbFinal.getModel().getValueAt(posLin,col).toString();
            
            if(col+1<tbFinal.getColumnCount()){
                valLin+=" - ";
            }
        
        }
        JOptionPane.showMessageDialog(null,"Valor encontrado : " + valLin,"Busca de dados",1);
    }
       
    public void listarTab(){
        DefaultTableModel tabModel = (DefaultTableModel) tbFinal.getModel();
        
        int posLin = 0;
        tabModel.setRowCount(posLin);
        
        for(Computador c: Banco.getBanco().getBdComp()){
            tabModel.insertRow(posLin, new Object[]{c.getMarca(),c.calcular(),c.gastoTotal()});
            posLin++;
        }
        for(Televisao t: Banco.getBanco().getBdTele()){
            tabModel.insertRow(posLin, new Object[]{t.getMarca(),t.calcular(),t.gastoTotal()});
            posLin++;
        }
        for(Impressora i: Banco.getBanco().getBdImp()){
            tabModel.insertRow(posLin, new Object[]{i.getMarca(),i.calcular(),i.gastoTotal()});
            posLin++;
        }
        
    }
   
    
    public void impGastoFinal() {
        DefaultListModel<String> modList = new DefaultListModel<>();
        double gastoFinal = 0;
    
        for (Computador c : Banco.getBanco().getBdComp()) {
            gastoFinal += c.gastoTotal();
        }

        for (Televisao t : Banco.getBanco().getBdTele()) {
         gastoFinal += t.gastoTotal();
        }

        for (Impressora i : Banco.getBanco().getBdImp()) {
            gastoFinal += i.gastoTotal();
        }

        modList.addElement(String.valueOf(gastoFinal));
        lstGasto.setModel(modList);
}
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> lstGasto;
    private javax.swing.JTable tbFinal;
    // End of variables declaration//GEN-END:variables
}
