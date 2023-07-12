//Guilherme Schmidt Lingnau RA: 2210924

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadComp extends javax.swing.JFrame {
    
    private static CadComp cadCompUnic;
    public static Computador c1;
    
    private CadComp() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public static CadComp getCadComp(){
        if(cadCompUnic == null){
           cadCompUnic = new CadComp();
        }
        return cadCompUnic;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblMarca = new javax.swing.JLabel();
        cxMarca = new javax.swing.JTextField();
        lblMemoria = new javax.swing.JLabel();
        cxMemoria = new javax.swing.JTextField();
        lblProcessador = new javax.swing.JLabel();
        cxProcessador = new javax.swing.JTextField();
        lblVideo = new javax.swing.JLabel();
        cxVideo = new javax.swing.JTextField();
        lblMonitor = new javax.swing.JLabel();
        cxMonitor = new javax.swing.JTextField();
        lblResolucao = new javax.swing.JLabel();
        cxResolucao = new javax.swing.JTextField();
        lblHoras = new javax.swing.JLabel();
        cxHoras = new javax.swing.JTextField();
        lblDias = new javax.swing.JLabel();
        cxDias = new javax.swing.JTextField();
        lblPotencia = new javax.swing.JLabel();
        cxPotencia = new javax.swing.JTextField();
        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btCadComp = new javax.swing.JButton();
        btConsMarca = new javax.swing.JButton();
        btAltComp = new javax.swing.JButton();
        btExcComp = new javax.swing.JButton();
        btRelatGeralComp = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbRelatIndivComp = new javax.swing.JTable();

        jMenu1.setText("jMenu1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro do Computador");

        lblMarca.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMarca.setText("Marca: ");

        cxMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxMarcaActionPerformed(evt);
            }
        });

        lblMemoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMemoria.setText("Memória Ram: ");

        cxMemoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxMemoriaActionPerformed(evt);
            }
        });

        lblProcessador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblProcessador.setText("Processador:");

        lblVideo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblVideo.setText("Placa de Video: ");

        cxVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxVideoActionPerformed(evt);
            }
        });

        lblMonitor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMonitor.setText("Monitor:");

        lblResolucao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblResolucao.setText("Resolução: ");

        cxResolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxResolucaoActionPerformed(evt);
            }
        });

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

        btCadComp.setText("Cadastrar");
        btCadComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadCompActionPerformed(evt);
            }
        });

        btConsMarca.setText("Consultar");
        btConsMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsMarcaActionPerformed(evt);
            }
        });

        btAltComp.setText("Alterar");
        btAltComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAltCompActionPerformed(evt);
            }
        });

        btExcComp.setText("Excluir");
        btExcComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcCompActionPerformed(evt);
            }
        });

        btRelatGeralComp.setText("Relatório Geral");
        btRelatGeralComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRelatGeralCompActionPerformed(evt);
            }
        });

        tbRelatIndivComp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Marca", "Memoria RAM", "Processador", "Placa de Video", "Monitor", "Resolução", "Horas", "Dias", "Potencia", "Gasto"
            }
        ));
        tbRelatIndivComp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbRelatIndivCompMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbRelatIndivComp);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPotencia)
                            .addComponent(lblVideo)
                            .addComponent(lblMarca)
                            .addComponent(lblMemoria)
                            .addComponent(lblProcessador)
                            .addComponent(lblMonitor)
                            .addComponent(lblResolucao)
                            .addComponent(lblHoras)
                            .addComponent(lblDias))
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cxMemoria, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cxProcessador, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cxVideo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cxMarca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cxMonitor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cxHoras, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cxDias, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cxPotencia, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cxResolucao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btCadComp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btConsMarca)
                                .addGap(18, 18, 18)
                                .addComponent(btAltComp)
                                .addGap(18, 18, 18)
                                .addComponent(btRelatGeralComp)
                                .addGap(50, 50, 50)
                                .addComponent(btExcComp))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btLimpar)
                                .addGap(18, 18, 18)
                                .addComponent(btSair)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarca)
                    .addComponent(cxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMemoria)
                    .addComponent(cxMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxProcessador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProcessador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVideo)
                    .addComponent(cxVideo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMonitor)
                    .addComponent(cxMonitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResolucao)
                    .addComponent(cxResolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHoras)
                    .addComponent(cxHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDias)
                    .addComponent(cxDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPotencia)
                    .addComponent(cxPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadComp)
                    .addComponent(btConsMarca)
                    .addComponent(btAltComp)
                    .addComponent(btExcComp)
                    .addComponent(btRelatGeralComp))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btLimpar)
                            .addComponent(btSair)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cxMemoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxMemoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxMemoriaActionPerformed

    private void cxVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxVideoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxVideoActionPerformed

    private void cxResolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxResolucaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxResolucaoActionPerformed

    private void cxHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxHorasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxHorasActionPerformed

    private void cxPotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxPotenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxPotenciaActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btCadCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadCompActionPerformed
        cadastrarComp();
        limpar();
        listarTab();
        
        
    }//GEN-LAST:event_btCadCompActionPerformed

    private void btConsMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsMarcaActionPerformed
        consultar();
        
        
    }//GEN-LAST:event_btConsMarcaActionPerformed

    private void cxMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxMarcaActionPerformed

    private void btAltCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAltCompActionPerformed
        altComp();
        listarTab();
    }//GEN-LAST:event_btAltCompActionPerformed

    private void btExcCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcCompActionPerformed
        excComp();
        limpar();
    }//GEN-LAST:event_btExcCompActionPerformed

    private void btRelatGeralCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelatGeralCompActionPerformed
        RelatComputador.getRelatComputador().setVisible(true);
    }//GEN-LAST:event_btRelatGeralCompActionPerformed

    private void tbRelatIndivCompMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbRelatIndivCompMouseClicked
        listarTab();
    }//GEN-LAST:event_tbRelatIndivCompMouseClicked
   

    public void consultar(){
        c1 = new Computador();
        
        c1.setMarca(cxMarca.getText());
        
        c1 = Banco.consComp(c1);
        
        if(c1 != null){
            
            cxMarca.setText(c1.getMarca());
            cxMemoria.setText(Integer.toString(c1.getQtdMemoria()));
            cxProcessador.setText(c1.getProcessador());
            cxVideo.setText(c1.getVideo());
            cxMonitor.setText(c1.getMonitorMarca());
            cxResolucao.setText(Integer.toString(c1.getMonitorRes()));
            cxHoras.setText(Integer.toString(c1.getHoras()));
            cxDias.setText(Integer.toString(c1.getDias()));
            cxPotencia.setText(Integer.toString(c1.getPotencia()));
            
            JOptionPane.showMessageDialog(null,"Confirme a marca do computador","Consultar Maquina", JOptionPane.INFORMATION_MESSAGE);
           
        }
        else {
            JOptionPane.showMessageDialog(null,"Não existe nenhum computador dessa marca","Maquina Inexistente", JOptionPane.INFORMATION_MESSAGE);
            limpar();
 
        }
    }         
    
    public void cadastrarComp(){
        
        c1 = new Computador();
        c1.setMarca(cxMarca.getText());
        try {
            try{
                c1.setQtdMemoria(Integer.parseInt(cxMemoria.getText()));
        } 
            catch (MemPeqException ex) {
                JOptionPane.showMessageDialog(null, "Memoria invalida !", "Cadastro Invalido", 1);
                cxMemoria.setText("");
                cxMemoria.requestFocus();
                return;
            }
        }
        catch (NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Memoria deve ser numero inteiro !", "Cadastro Invalido", 1);
            cxMemoria.setText("");
            cxMemoria.requestFocus();
            return;
        }
        try{
            c1.setProcessador(cxProcessador.getText());
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "O processador não pode ser numero !", "Cadastro Invalido", 1);
        }
     
            c1.setVideo(cxVideo.getText());
            c1.setMonitorMarca(cxMonitor.getText());
            
        try{
            c1.setMonitorRes(Integer.parseInt(cxResolucao.getText()));
        }
        catch (NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "A resolução deve ser numero inteiro !", "Cadastro OK", 1);
            cxResolucao.setText("");
            cxResolucao.requestFocus();
            return;
        }
       
        try {
            c1.setHoras(Integer.parseInt(cxHoras.getText()));
        } catch (HorasDiaException ex) {
           JOptionPane.showMessageDialog(null, "Horas invalidas !", "Cadastro OK", 1);
           cxHoras.setText("");
           cxHoras.requestFocus();
           return;
        }
         catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "As Horas devem deve ser numero inteiro !", "Cadastro OK", 1);
            cxHoras.setText("");
            cxHoras.requestFocus();
            return;
        }
        
        try{
            c1.setDias(Integer.parseInt(cxDias.getText()));
        }
        catch (NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "o dia deve ser numero inteiro !", "Cadastro Invalido", 1);
            cxDias.setText("");
            cxDias.requestFocus();
            return;
        }
        try{
            c1.setPotencia(Integer.parseInt(cxPotencia.getText()));
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "A potencia deve ser numero inteiro !", "Cadastro Invalido", 1);
            cxPotencia.setText("");
            cxPotencia.requestFocus();
            return;
        }
        Banco.getBdComp().add(c1);
        if(c1 != null){
            JOptionPane.showMessageDialog(null, "Computador cadastrado com sucesso!", "Cadastro OK", 1);
            limpar();
        }
            
    }
    
    public void altComp(){
        c1 = new Computador();
        
        c1.setMarca(cxMarca.getText());
       
        c1 = Banco.getBanco().altComp(c1);
        
        if(c1 != null){
            cxMarca.setText(c1.getMarca());
            cxMemoria.setText(Integer.toString(c1.getQtdMemoria()));
            cxProcessador.setText(c1.getProcessador());
            cxVideo.setText(c1.getVideo());
            cxMonitor.setText(c1.getMonitorMarca());
            cxResolucao.setText(Integer.toString(c1.getMonitorRes()));
            cxHoras.setText(Integer.toString(c1.getHoras()));
            cxDias.setText(Integer.toString(c1.getDias()));
            cxPotencia.setText(Integer.toString(c1.getPotencia()));
            JOptionPane.showMessageDialog(null,"Verifique os dados ALTERADOS!","Verificar Computador",  1);        
        }
        else{
            JOptionPane.showMessageDialog(null,"Maquina não encontrada","Alteração de Computador",1  );    
        }
    }
    
    public void excComp(){
        c1 = new Computador();
        
        c1.setMarca(cxMarca.getText());
       
        c1 = Banco.getBanco().excComp(c1);
        
        if(c1 == null){
            JOptionPane.showMessageDialog(null,"Computador excluido com sucesso!","Exclusao do Computador",1  );
        }
        else{
            JOptionPane.showMessageDialog(null,"Marca não encontrada","Exclusao do Computador",1);    
        }
    }
    
    public void selectTab(){
        String valLin = "";
        
        int posLin = tbRelatIndivComp.getSelectedRow();
        
        for(int col = 0;col<tbRelatIndivComp.getColumnCount();col++){
            valLin += tbRelatIndivComp.getModel().getValueAt(posLin,col).toString();
            
            if(col+1<tbRelatIndivComp.getColumnCount()){
                valLin+=" - ";
            }
        
        }
        JOptionPane.showMessageDialog(null,"Valor encontrado : " + valLin,"Busca de dados",1);
    }
       
    public void listarTab(){
        DefaultTableModel tabModel = (DefaultTableModel) tbRelatIndivComp.getModel();
        
        int posLin = 0;
        tabModel.setRowCount(posLin);
        
        for(Computador c: Banco.getBanco().getBdComp()){
            tabModel.insertRow(posLin, new Object[]{c.getMarca(),c.getQtdMemoria(),c.getProcessador(),c.getVideo(),c.getMonitorMarca(),c.getMonitorRes()
                    ,c.getHoras(),c.getDias(),c.getPotencia(),c.calcular(),c.gastoTotal()});
            posLin++;
     
        
    }
 }
   
    
    public void limpar(){
        cxMarca.setText("");
        cxMemoria.setText("");
        cxProcessador.setText("");
        cxVideo.setText("");
        cxMonitor.setText("");
        cxResolucao.setText("");
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
    private javax.swing.JButton btAltComp;
    private javax.swing.JButton btCadComp;
    private javax.swing.JButton btConsMarca;
    private javax.swing.JButton btExcComp;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btRelatGeralComp;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cxDias;
    private javax.swing.JTextField cxHoras;
    private javax.swing.JTextField cxMarca;
    private javax.swing.JTextField cxMemoria;
    private javax.swing.JTextField cxMonitor;
    private javax.swing.JTextField cxPotencia;
    private javax.swing.JTextField cxProcessador;
    private javax.swing.JTextField cxResolucao;
    private javax.swing.JTextField cxVideo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblDias;
    private javax.swing.JLabel lblHoras;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblMemoria;
    private javax.swing.JLabel lblMonitor;
    private javax.swing.JLabel lblPotencia;
    private javax.swing.JLabel lblProcessador;
    private javax.swing.JLabel lblResolucao;
    private javax.swing.JLabel lblVideo;
    private javax.swing.JTable tbRelatIndivComp;
    // End of variables declaration//GEN-END:variables
}
