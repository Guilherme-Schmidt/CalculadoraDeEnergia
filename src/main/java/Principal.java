// Versão utilizada do NetBeans foi IDE 17  
//Guilherme Schmidt Lingnau RA: 2210924

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        bmPrincipal = new javax.swing.JMenuBar();
        mnPrincipal = new javax.swing.JMenu();
        itCadastro = new javax.swing.JMenu();
        itCadComp = new javax.swing.JMenuItem();
        itCadTele = new javax.swing.JMenuItem();
        itCadImp = new javax.swing.JMenuItem();
        itRelatGeral = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Projeto Pessoal");

        mnPrincipal.setText("Principal");

        itCadastro.setText("Cadastrar Dipositivos");

        itCadComp.setText("Cadastrar Computador");
        itCadComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itCadCompActionPerformed(evt);
            }
        });
        itCadastro.add(itCadComp);

        itCadTele.setText("Cadastrar Televisão");
        itCadTele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itCadTeleActionPerformed(evt);
            }
        });
        itCadastro.add(itCadTele);

        itCadImp.setText("Cadastrar Impressora");
        itCadImp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itCadImpActionPerformed(evt);
            }
        });
        itCadastro.add(itCadImp);

        mnPrincipal.add(itCadastro);

        itRelatGeral.setText("Relatório Final");
        itRelatGeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itRelatGeralActionPerformed(evt);
            }
        });
        mnPrincipal.add(itRelatGeral);

        bmPrincipal.add(mnPrincipal);

        setJMenuBar(bmPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itCadCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itCadCompActionPerformed
       CadComp.getCadComp().setVisible(true);
    }//GEN-LAST:event_itCadCompActionPerformed

    private void itCadTeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itCadTeleActionPerformed
       CadTelev.getCadTelev().setVisible(true);
    }//GEN-LAST:event_itCadTeleActionPerformed

    private void itCadImpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itCadImpActionPerformed
        CadImp.getCadImp().setVisible(true);
    }//GEN-LAST:event_itCadImpActionPerformed

    private void itRelatGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itRelatGeralActionPerformed
        RelatGeral.getRelatGeral().setVisible(true);
    }//GEN-LAST:event_itRelatGeralActionPerformed

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar bmPrincipal;
    private javax.swing.JMenuItem itCadComp;
    private javax.swing.JMenuItem itCadImp;
    private javax.swing.JMenuItem itCadTele;
    private javax.swing.JMenu itCadastro;
    private javax.swing.JMenuItem itRelatGeral;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu mnPrincipal;
    // End of variables declaration//GEN-END:variables
}
