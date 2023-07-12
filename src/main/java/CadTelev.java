//Guilherme Schmidt Lingnau RA: 2210924

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CadTelev extends javax.swing.JFrame {
    private static CadTelev cadTelevUnic;
    public static Televisao t1;
    private static Banco disp;
    
    private CadTelev() {
        initComponents();
        this.setLocationRelativeTo(null); 
    }
    
    public static CadTelev getCadTelev(){
        if(cadTelevUnic == null){
           cadTelevUnic = new CadTelev();
        }
        return cadTelevUnic;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMarca = new javax.swing.JLabel();
        cxMarca = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        cxTipo = new javax.swing.JTextField();
        lblHoras = new javax.swing.JLabel();
        cxHoras = new javax.swing.JTextField();
        lblDias = new javax.swing.JLabel();
        cxDias = new javax.swing.JTextField();
        lblPotencia = new javax.swing.JLabel();
        cxPotencia = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btConsMarcaTele = new javax.swing.JButton();
        btAltTele = new javax.swing.JButton();
        btExcTele = new javax.swing.JButton();
        btRelatTelev = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbRelatIndivTelev = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblMarca.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMarca.setText("Marca: ");

        lblTipo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTipo.setText("Tipo (Led ou Plasma) : ");

        lblHoras.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblHoras.setText("Total de Horas ligado por dia: ");

        cxHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxHorasActionPerformed(evt);
            }
        });

        lblDias.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDias.setText("Total de dias em um mês: ");

        lblPotencia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPotencia.setText("Potencia de Consumo: ");

        cxPotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxPotenciaActionPerformed(evt);
            }
        });

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
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

        btConsMarcaTele.setText("Consultar");
        btConsMarcaTele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsMarcaTeleActionPerformed(evt);
            }
        });

        btAltTele.setText("Alterar");
        btAltTele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAltTeleActionPerformed(evt);
            }
        });

        btExcTele.setText("Excluir");
        btExcTele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcTeleActionPerformed(evt);
            }
        });

        btRelatTelev.setText("Relatorio Geral");
        btRelatTelev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRelatTelevActionPerformed(evt);
            }
        });

        tbRelatIndivTelev.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Marca", "Tipo", "Horas", "Dias", "Potencia", "Gasto"
            }
        ));
        tbRelatIndivTelev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbRelatIndivTelevMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbRelatIndivTelev);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSair))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblMarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cxMarca)
                                    .addComponent(cxTipo, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btCadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btConsMarcaTele)
                                .addGap(18, 18, 18)
                                .addComponent(btAltTele)
                                .addGap(18, 18, 18)
                                .addComponent(btRelatTelev)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btExcTele))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblPotencia)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cxPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblDias)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cxDias, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblHoras)
                                    .addGap(18, 18, 18)
                                    .addComponent(cxHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 130, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarca)
                    .addComponent(cxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipo)
                    .addComponent(cxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHoras)
                    .addComponent(cxHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDias)
                    .addComponent(cxDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblPotencia))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btConsMarcaTele)
                    .addComponent(btAltTele)
                    .addComponent(btExcTele)
                    .addComponent(btRelatTelev))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimpar)
                    .addComponent(btSair))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cxHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxHorasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxHorasActionPerformed

    private void cxPotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxPotenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxPotenciaActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        cadastrarTelev();
        limpar();
       
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btConsMarcaTeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsMarcaTeleActionPerformed
        consultar();
        listarTab();
    }//GEN-LAST:event_btConsMarcaTeleActionPerformed

    private void btAltTeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAltTeleActionPerformed
        alterarTelev();
        listarTab();
       
    }//GEN-LAST:event_btAltTeleActionPerformed

    private void btExcTeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcTeleActionPerformed
        excluirTelev();
        limpar();
       
       
    }//GEN-LAST:event_btExcTeleActionPerformed

    private void btRelatTelevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelatTelevActionPerformed
       RelatTelevisao.getRelatTelevisao().setVisible(true);
    }//GEN-LAST:event_btRelatTelevActionPerformed

    private void tbRelatIndivTelevMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbRelatIndivTelevMouseClicked
        listarTab();
    }//GEN-LAST:event_tbRelatIndivTelevMouseClicked

  public void cadastrarTelev(){
        t1 = new Televisao();
      
        t1.setMarca(cxMarca.getText());
        try{
            t1.setTipo(cxTipo.getText());
        }
        catch (TipoTvErrException tee){
            JOptionPane.showMessageDialog(null, "Deve ser Laser ou Tinta !", "Cadastro Invalido", 1);
            cxTipo.setText("");
            cxTipo.requestFocus();
            return;
        }
        try {
            t1.setHoras(Integer.parseInt(cxHoras.getText()));
        } 
        catch (HorasDiaException ex) {
            JOptionPane.showMessageDialog(null, "Devera ser entre 1 e 24 horas !", "Cadastro Invalido", 1);
            cxHoras.setText("");
            cxHoras.requestFocus();
            return;
            
        }
        catch (NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Horas de vem ser Numero Inteiro !", "Cadastro Invalido", 1);
            cxHoras.setText("");
            cxHoras.requestFocus();
            return;
        }
        try{
            t1.setDias(Integer.parseInt(cxDias.getText()));
        }
        catch (NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "o dia deve ser numero inteiro !", "Cadastro Invalido", 1);
            cxDias.setText("");
            cxDias.requestFocus();
            return;
        }
        try{
            t1.setPotencia(Integer.parseInt(cxPotencia.getText()));
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "A potencia deve ser numero inteiro !", "Cadastro Invalido", 1);
            cxPotencia.setText("");
            cxPotencia.requestFocus();
            return;
        }

        Banco.getBdTele().add(t1);
        if(t1 != null){
            JOptionPane.showMessageDialog(null, "Televisão cadastrada com sucesso!", "Cadastro OK", 1);
         
        }
  }
  
  public void consultar(){
      t1 = new Televisao();
      
      t1.setMarca(cxMarca.getText());
      
      t1 = disp.consTelev(t1);
      
      if(t1 != null){
        cxMarca.setText(t1.getMarca());
        cxTipo.setText(t1.getTipo());
        cxHoras.setText(Integer.toString(t1.getHoras()));
        cxDias.setText(Integer.toString(t1.getDias()));
        cxPotencia.setText(Integer.toString(t1.getPotencia()));
          
        JOptionPane.showMessageDialog(null,"Confirme a marca da Televisão","Consultar Televisão", JOptionPane.INFORMATION_MESSAGE);
      }
       else {
            JOptionPane.showMessageDialog(null,"Não existe nenhuma Televisão dessa marca","Maquina Inexistente", JOptionPane.INFORMATION_MESSAGE);
            limpar();
 
        }
  }
  
  
  
   public void alterarTelev(){
        t1 = new Televisao();
        
        t1.setMarca(cxMarca.getText());
       
        t1 = Banco.getBanco().altTelev(t1);
        
        if(t1 != null){
            cxMarca.setText(t1.getMarca());
            cxTipo.setText(t1.getTipo());
            cxHoras.setText(Integer.toString(t1.getHoras()));
            cxDias.setText(Integer.toString(t1.getDias()));
            cxPotencia.setText(Integer.toString(t1.getPotencia()));
            JOptionPane.showMessageDialog(null,"Verifique os dados ALTERADOS!","Verificar Computador",   1   );      
        }
        else{
            JOptionPane.showMessageDialog(null,"Maquina não encontrada","Alteração de Computador", 1 );
        }
    }
   
      public void excluirTelev(){
       t1 = new Televisao();
        
       t1.setMarca(cxMarca.getText());
       
       t1 = Banco.getBanco().excTelev(t1);
        
        
        if(t1 == null){
            JOptionPane.showMessageDialog(null,   "Televisão excluida com sucesso!","Exclusao da Televisao", 1 );

        }
        else{
            JOptionPane.showMessageDialog(null,"Marca não encontrada","Exclusao da Televisao", 1); 
        }
    }
      
      public void selectTab(){
        String valLin = "";
        
        int posLin = tbRelatIndivTelev.getSelectedRow();
        
        for(int col = 0;col<tbRelatIndivTelev.getColumnCount();col++){
            valLin += tbRelatIndivTelev.getModel().getValueAt(posLin,col).toString();
            
            if(col+1<tbRelatIndivTelev.getColumnCount()){
                valLin+=" - ";
            }
        
        }
        JOptionPane.showMessageDialog(null,"Valor encontrado : " + valLin,"Busca de dados",1);
    }
       
    public void listarTab(){
        DefaultTableModel tabModel = (DefaultTableModel) tbRelatIndivTelev.getModel();
        
        int posLin = 0;
        tabModel.setRowCount(posLin);
        
        for(Televisao t: Banco.getBanco().getBdTele()){
            tabModel.insertRow(posLin, new Object[]{t.getMarca(),t.getTipo(),t.getHoras(),t.getDias(),t.getPotencia(),t.calcular(),t.gastoTotal()});
            posLin++;
     
        
    }
 }
   

    public void limpar(){
        cxMarca.setText("");
        cxTipo.setText("");
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
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAltTele;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btConsMarcaTele;
    private javax.swing.JButton btExcTele;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btRelatTelev;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cxDias;
    private javax.swing.JTextField cxHoras;
    private javax.swing.JTextField cxMarca;
    private javax.swing.JTextField cxPotencia;
    private javax.swing.JTextField cxTipo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDias;
    private javax.swing.JLabel lblHoras;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblPotencia;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JTable tbRelatIndivTelev;
    // End of variables declaration//GEN-END:variables
}
