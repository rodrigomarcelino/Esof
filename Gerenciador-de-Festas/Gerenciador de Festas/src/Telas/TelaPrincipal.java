/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

/**
 *
 * @author tomas_000
 */
public class TelaPrincipal extends javax.swing.JFrame {

    TelaLogin tAnterior;
    
    private TelaPrincipal() {
        initComponents();
    }
    
    public TelaPrincipal(TelaLogin tela){
        this();
        this.tAnterior = tela;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotaoSair = new javax.swing.JButton();
        BotaoCadastrarFesta = new javax.swing.JButton();
        BotaoCadastrarCliente = new javax.swing.JButton();
        BotaoVerFestas = new javax.swing.JButton();
        BotaoVerFornecedor = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BotaoVerificarTemas = new javax.swing.JButton();
        FundoTelaPrincipal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Principal");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(null);

        BotaoSair.setText("Sair");
        BotaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSairActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoSair);
        BotaoSair.setBounds(230, 180, 140, 35);

        BotaoCadastrarFesta.setText("Cadastrar Festa");
        BotaoCadastrarFesta.setMaximumSize(new java.awt.Dimension(51, 23));
        BotaoCadastrarFesta.setMinimumSize(new java.awt.Dimension(51, 23));
        BotaoCadastrarFesta.setPreferredSize(new java.awt.Dimension(51, 23));
        BotaoCadastrarFesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastrarFestaActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoCadastrarFesta);
        BotaoCadastrarFesta.setBounds(40, 60, 140, 35);

        BotaoCadastrarCliente.setText("Cadastrar Cliente");
        BotaoCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastrarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoCadastrarCliente);
        BotaoCadastrarCliente.setBounds(230, 60, 140, 35);

        BotaoVerFestas.setText("Festas do Dia");
        BotaoVerFestas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVerFestasActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoVerFestas);
        BotaoVerFestas.setBounds(40, 120, 140, 35);

        BotaoVerFornecedor.setText("Ver Fornecedor");
        BotaoVerFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVerFornecedorActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoVerFornecedor);
        BotaoVerFornecedor.setBounds(230, 120, 140, 35);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Selecione Uma Opção");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 20, 140, 20);

        BotaoVerificarTemas.setText("Verificar Temas");
        BotaoVerificarTemas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVerificarTemasActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoVerificarTemas);
        BotaoVerificarTemas.setBounds(40, 180, 140, 35);

        FundoTelaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Planodefundo.jpg"))); // NOI18N
        getContentPane().add(FundoTelaPrincipal);
        FundoTelaPrincipal.setBounds(0, 0, 450, 330);

        setSize(new java.awt.Dimension(405, 302));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSairActionPerformed
        //Fechar a tela atual
        this.dispose();
        //Habilitar a tela anterior
        tAnterior.setEnabled(true);
        tAnterior.toFront();
    }//GEN-LAST:event_BotaoSairActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        //Habilitar a tela anterior
        tAnterior.setEnabled(true);
        tAnterior.toFront();
    }//GEN-LAST:event_formWindowClosed

    private void BotaoCadastrarFestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastrarFestaActionPerformed
        //Desabilita Tela Atual
        this.setEnabled(false);
        // Chama Tela Cadastrar Festa
        new TelaCadastrarFesta(this).setVisible(true);   
    }//GEN-LAST:event_BotaoCadastrarFestaActionPerformed

    private void BotaoVerificarTemasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVerificarTemasActionPerformed
        //Desabilita Tela Atual
        //this.setEnabled(false);
        // Chama Tela Verificar Temas
        new TelaVerificarTemas(this).setVisible(true);   
    }//GEN-LAST:event_BotaoVerificarTemasActionPerformed

    private void BotaoCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastrarClienteActionPerformed
        //Desabilita Tela Atual
        this.setEnabled(false);
        // Chama Tela Cadastrar Cliente
        new TelaCadastrarCliente(this).setVisible(true);   
    }//GEN-LAST:event_BotaoCadastrarClienteActionPerformed

    private void BotaoVerFestasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVerFestasActionPerformed
        //Desabilita Tela Atual
        this.setEnabled(false);
        // Chama Tela VerFestas
        new TelaFestasdoDia(this).setVisible(true);   
    }//GEN-LAST:event_BotaoVerFestasActionPerformed

    private void BotaoVerFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVerFornecedorActionPerformed
        //Desabilita Tela Atual
        this.setEnabled(false);
        // Chama Tela VerFornecedor
        new TelaVerFornecedor(this).setVisible(true);   
    }//GEN-LAST:event_BotaoVerFornecedorActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCadastrarCliente;
    private javax.swing.JButton BotaoCadastrarFesta;
    private javax.swing.JButton BotaoSair;
    private javax.swing.JButton BotaoVerFestas;
    private javax.swing.JButton BotaoVerFornecedor;
    private javax.swing.JButton BotaoVerificarTemas;
    private javax.swing.JLabel FundoTelaPrincipal;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
