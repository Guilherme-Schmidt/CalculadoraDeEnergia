//Guilherme Schmidt Lingnau RA: 2210924

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadImp extends javax.swing.JFrame {
    private static CadImp cadImpUnic;
    public static Impressora i1;
   
    public CadImp(){
        initComponents();
        
    }
    public static CadImp getCadImp(){
      if(cadImpUnic == null){
           cadImpUnic = new CadImp();
        }
        return cadImpUnic;
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMarca = new javax.swing.JLabel();
        cxMarca = new javax.swing.JTextField();
        lblTecnologia = new javax.swing.JLabel();
        cxTecnologia = new javax.swing.JTextField();
        lblConexao = new javax.swing.JLabel();
        cxConexao = new javax.swing.JTextField();
        lblHoras = new javax.swing.JLabel();
        lblDias = new javax.swing.JLabel();
        lblPotencia = new javax.swing.JLabel();
        cxHoras = new javax.swing.JTextField();
        cxDias = new javax.swing.JTextField();
        cxPotencia = new javax.swing.JTextField();
        btCadImp = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        btAltImp = new javax.swing.JButton();
        btExcImp = new javax.swing.JButton();
        btRelatImp = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbRelatIndivImp = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblMarca.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMarca.setText("Marca: ");

        cxMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxMarcaActionPerformed(evt);
            }
        });

        lblTecnologia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTecnologia.setText("Tecnologia(Laser ou tinta):");

        cxTecnologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxTecnologiaActionPerformed(evt);
            }
        });

        lblConexao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblConexao.setText("Conexao (Wifi ou Usb):");

        cxConexao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxConexaoActionPerformed(evt);
            }
        });

        lblHoras.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblHoras.setText("Total de Horas ligado por dia: ");

        lblDias.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDias.setText("Total de dias em um mês: ");

        lblPotencia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPotencia.setText("Potencia de Consumo: ");

        cxHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxHorasActionPerformed(evt);
            }
        });

        btCadImp.setText("Cadastrar");
        btCadImp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadImpActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btConsultar.setText("Consultar");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        btAltImp.setText("Alterar");
        btAltImp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAltImpActionPerformed(evt);
            }
        });

        btExcImp.setText("Excluir");
        btExcImp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcImpActionPerformed(evt);
            }
        });

        btRelatImp.setText("Relatorio Geral");
        btRelatImp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRelatImpActionPerformed(evt);
            }
        });

        tbRelatIndivImp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Marca", "Tecnologia", "Conexao", "Horas", "Dias", "Potencia", "Gasto"
            }
        ));
        tbRelatIndivImp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbRelatIndivImpMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbRelatIndivImp);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSair)
                        .addGap(4, 4, 4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblConexao)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cxConexao, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblTecnologia)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cxTecnologia, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblMarca)
                                        .addGap(18, 18, 18)
                                        .addComponent(cxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 100, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblHoras)
                                    .addComponent(lblDias)
                                    .addComponent(lblPotencia))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cxPotencia)
                                    .addComponent(cxHoras)
                                    .addComponent(cxDias))))
                        .addGap(126, 126, 126))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btCadImp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btConsultar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btAltImp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btRelatImp)))
                        .addGap(18, 18, 18)
                        .addComponent(btExcImp)
                        .addContainerGap(97, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarca)
                    .addComponent(cxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTecnologia)
                    .addComponent(cxTecnologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConexao)
                    .addComponent(cxConexao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cxHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDias)
                    .addComponent(cxDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPotencia)
                    .addComponent(cxPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadImp)
                    .addComponent(btConsultar)
                    .addComponent(btAltImp)
                    .addComponent(btExcImp)
                    .addComponent(btRelatImp))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimpar)
                    .addComponent(btSair))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cxMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxMarcaActionPerformed

    private void cxTecnologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxTecnologiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxTecnologiaActionPerformed

    private void cxConexaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxConexaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxConexaoActionPerformed

    private void cxHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxHorasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxHorasActionPerformed

    private void btCadImpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadImpActionPerformed
        cadastrarImpre();
        limpar();
        listarTab();
       
    }//GEN-LAST:event_btCadImpActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
       consultar();
       limpar();
       
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btAltImpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAltImpActionPerformed
        altImp();
        listarTab();
    }//GEN-LAST:event_btAltImpActionPerformed

    private void btExcImpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcImpActionPerformed
        excImp();
        limpar();
    }//GEN-LAST:event_btExcImpActionPerformed

    private void btRelatImpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelatImpActionPerformed
       RelatImpressora.getRelatImpressora().setVisible(true);
    }//GEN-LAST:event_btRelatImpActionPerformed

    private void tbRelatIndivImpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbRelatIndivImpMouseClicked
        listarTab();
    }//GEN-LAST:event_tbRelatIndivImpMouseClicked
    
   
    public void cadastrarImpre(){
        i1 = new Impressora();
        
        i1.setMarca(cxMarca.getText());
        i1.setTecnologia(cxTecnologia.getText());
        try {
            i1.setConexao(cxConexao.getText());
        } catch (ConecErrException ex) {
            JOptionPane.showMessageDialog(null, "Conexao deve ser WIFI ou USB !", "Cadastro OK", 1);
            return;
        }
        try {
            i1.setHoras(Integer.parseInt(cxHoras.getText()));
        } catch (HorasDiaException ex) {
           JOptionPane.showMessageDialog(null, "Horas invalidas !", "Cadastro OK", 1);
                return;
        }
        catch (NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Devera ser numero inteiro !", "Cadastro OK", 1);
            cxHoras.setText("");
            cxHoras.requestFocus();
            return;
        }
        try{
            i1.setDias(Integer.parseInt(cxDias.getText()));
        }
        catch (NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "o dia deve ser numero inteiro !", "Cadastro Invalido", 1);
            cxDias.setText("");
            cxDias.requestFocus();
            return;
        }
        try{
            i1.setPotencia(Integer.parseInt(cxPotencia.getText()));
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "A potencia deve ser numero inteiro !", "Cadastro Invalido", 1);
            cxPotencia.setText("");
            cxPotencia.requestFocus();
            return;
        }

        Banco.getBdImp().add(i1);
        
        if(i1 != null){
            JOptionPane.showMessageDialog(null, "Impressora cadastrada com sucesso!", "Cadastro OK", 1);

        }
    }
    public void consultar(){
        i1 = new Impressora();
      
        i1.setMarca(cxMarca.getText());
      
        i1 = Banco.consImpre(i1);
      
        if(i1 != null){
            cxMarca.setText(i1.getMarca());
            cxTecnologia.setText(i1.getTecnologia());
            cxConexao.setText(i1.getConexao());
            cxHoras.setText(Integer.toString(i1.getHoras()));
            cxDias.setText(Integer.toString(i1.getDias()));
            cxPotencia.setText(Integer.toString(i1.getPotencia()));

            JOptionPane.showMessageDialog(null,"Confirme a marca da Impressora","Consultar Televisão", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null,"Não existe nenhuma Impressora dessa marca","Maquina Inexistente", JOptionPane.INFORMATION_MESSAGE);
            limpar();

            }
  }
    
    
    public void altImp(){
        i1= new Impressora();
        
        i1.setMarca(cxMarca.getText());
        
        i1 = Banco.getBanco().altImpre(i1);
        
        if(i1 != null){
            cxMarca.setText(i1.getMarca());
            cxTecnologia.setText(i1.getTecnologia());
            cxConexao.setText(i1.getConexao());
            cxHoras.setText(Integer.toString(i1.getHoras()));
            cxDias.setText(Integer.toString(i1.getDias()));
            cxPotencia.setText(Integer.toString(i1.getPotencia()));
            JOptionPane.showMessageDialog(null,"Verifique os dados ALTERADOS!","Verificar Computador",1  ); 
        }
         else{
            JOptionPane.showMessageDialog(
                    null,
                    "Maquina não encontrada",
                    "Alteração de Computador",
                    1
            );
     }
   }
    
     public void excImp(){
        i1= new Impressora();
        
        i1.setMarca(cxMarca.getText());
        
        i1 = Banco.getBanco().excImpre(i1);
        
        
        if(i1 == null){
            JOptionPane.showMessageDialog(
                    null,
                    "Impressora excluida com sucesso!",
                    "Exclusao da Impressora",
                    1
            );
        }
        else{
            JOptionPane.showMessageDialog(
                    null,
                    "Marca não encontrada",
                    "Exclusao da Impressora",
                    1
            );
        }
    }
    
      public void selectTab(){
        String valLin = "";
        
        int posLin = tbRelatIndivImp.getSelectedRow();
        
        for(int col = 0;col<tbRelatIndivImp.getColumnCount();col++){
            valLin += tbRelatIndivImp.getModel().getValueAt(posLin,col).toString();
            
            if(col+1<tbRelatIndivImp.getColumnCount()){
                valLin+=" - ";
            }
        
        }
        JOptionPane.showMessageDialog(null,"Valor encontrado : " + valLin,"Busca de dados",1);
    }
       
    public void listarTab(){
        DefaultTableModel tabModel = (DefaultTableModel) tbRelatIndivImp.getModel();
        
        int posLin = 0;
        tabModel.setRowCount(posLin);
        
        for(Impressora i: Banco.getBanco().getBdImp()){
            tabModel.insertRow(posLin, new Object[]{i.getMarca(),i.getTecnologia(),i.getConexao(),i.getHoras(),i.getDias(),i.getPotencia(),i.calcular(),i.gastoTotal()});
            posLin++;
     
        
    }
 }
   
    
    public void limpar(){
        cxMarca.setText("");
        cxTecnologia.setText("");
        cxConexao.setText("");
        cxHoras.setText("");
        cxDias.setText("");
        cxPotencia.setText("");
        cxMarca.requestFocus();
    }
    
    public void sair(){
        int resp = JOptionPane.showConfirmDialog(null,"Deseja realmente sair?","Sair",JOptionPane.YES_NO_CANCEL_OPTION);
        if(resp == 0){
            this.dispose();
        }
    }
    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAltImp;
    private javax.swing.JButton btCadImp;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btExcImp;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btRelatImp;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cxConexao;
    private javax.swing.JTextField cxDias;
    private javax.swing.JTextField cxHoras;
    private javax.swing.JTextField cxMarca;
    private javax.swing.JTextField cxPotencia;
    private javax.swing.JTextField cxTecnologia;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblConexao;
    private javax.swing.JLabel lblDias;
    private javax.swing.JLabel lblHoras;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblPotencia;
    private javax.swing.JLabel lblTecnologia;
    private javax.swing.JTable tbRelatIndivImp;
    // End of variables declaration//GEN-END:variables
}
