/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Controles.Singleton;
import java.util.*;
import Entidades.*;
import javax.swing.JOptionPane;

public class TelaCadastrarFesta extends javax.swing.JFrame {

    TelaPrincipal tAnterior;
    private ArrayList<String> infantis = Singleton.getInstance().getListaTemasInfantis();
    private ArrayList<String> especiais = Singleton.getInstance().getListaTemasEspeciais();
    private ArrayList<FestaConcreta> listaFestas;
    private String CPF;
    private Data data = new Data();
    private String tema;
    private boolean flor, borboleta, armario, baleiro, aux;
    private double valor;
    private int count = 0, flag = 0;
    private String nomeOP1 = " ", nomeOP2 = " ";

    private TelaCadastrarFesta() {
        initComponents();
    }

    public TelaCadastrarFesta(TelaPrincipal tela) {
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

        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        CampoData = new javax.swing.JTextField();
        BotaoVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CampoCPF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jCheckBoxFlores = new javax.swing.JCheckBox();
        jCheckBoxBorboleta = new javax.swing.JCheckBox();
        jCheckBoxArmario = new javax.swing.JCheckBox();
        jCheckBoxBaleiro = new javax.swing.JCheckBox();
        CampoTema = new javax.swing.JTextField();
        jComboBoxDia = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxMes = new javax.swing.JComboBox();
        jComboBoxAno = new javax.swing.JComboBox();

        jCheckBox6.setText("jCheckBox6");

        jCheckBox5.setText("jCheckBox5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(null);

        BotaoVoltar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BotaoVoltar.setText("Voltar");
        BotaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoVoltar);
        BotaoVoltar.setBounds(320, 240, 100, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Digite um Tema");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 11, 132, 27);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Selecione os Opcionais");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 80, 132, 26);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Selecione uma Data");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(270, 10, 132, 27);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Digite o CPF do Cliente");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(270, 100, 132, 21);

        CampoCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCPFActionPerformed(evt);
            }
        });
        getContentPane().add(CampoCPF);
        CampoCPF.setBounds(270, 130, 150, 25);

        jButton1.setText("Criar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 240, 100, 30);

        jCheckBoxFlores.setText("Flores de Balões");
        getContentPane().add(jCheckBoxFlores);
        jCheckBoxFlores.setBounds(10, 110, 120, 23);

        jCheckBoxBorboleta.setText("Borboletas de Balões");
        jCheckBoxBorboleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxBorboletaActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxBorboleta);
        jCheckBoxBorboleta.setBounds(140, 110, 125, 23);

        jCheckBoxArmario.setText("Armario Provensal");
        getContentPane().add(jCheckBoxArmario);
        jCheckBoxArmario.setBounds(10, 140, 120, 23);

        jCheckBoxBaleiro.setText("Baleiro Provensal");
        getContentPane().add(jCheckBoxBaleiro);
        jCheckBoxBaleiro.setBounds(140, 140, 120, 23);
        getContentPane().add(CampoTema);
        CampoTema.setBounds(10, 40, 170, 25);

        jComboBoxDia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        getContentPane().add(jComboBoxDia);
        jComboBoxDia.setBounds(270, 70, 40, 20);

        jLabel5.setText("Dia");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(270, 50, 40, 14);

        jLabel6.setText("Mes");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(320, 50, 34, 14);

        jLabel7.setText("Ano");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(370, 50, 19, 14);

        jComboBoxMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jComboBoxMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMesActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxMes);
        jComboBoxMes.setBounds(320, 70, 40, 20);

        jComboBoxAno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2015", "2016", "2017", "2018" }));
        getContentPane().add(jComboBoxAno);
        jComboBoxAno.setBounds(370, 70, 50, 20);

        setSize(new java.awt.Dimension(454, 320));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVoltarActionPerformed
        //Fechar a tela atual
        this.dispose();
        //Habilitar a tela anterior
        tAnterior.setEnabled(true);
        tAnterior.toFront();
    }//GEN-LAST:event_BotaoVoltarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        //Habilitar a tela anterior
        tAnterior.setEnabled(true);
        tAnterior.toFront();
    }//GEN-LAST:event_formWindowClosed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tema = CampoTema.getText();
        data.setDia(jComboBoxDia.getSelectedIndex() + 1);
        data.setMes(jComboBoxMes.getSelectedIndex() + 1);
        data.setAno(jComboBoxAno.getSelectedIndex() + 2015);
        CPF = CampoCPF.getText();
        flor = jCheckBoxFlores.isSelected();
        borboleta = jCheckBoxBorboleta.isSelected();
        armario = jCheckBoxArmario.isSelected();
        baleiro = jCheckBoxBaleiro.isSelected();
        valor = 300.00;
        Cliente c = new Cliente("a", CPF, "1", "w", 0);
        
       for(int n1=0; n1<infantis.size();n1++){
           if(tema.equals(infantis.get(n1)))
                flag = 1;   
       }
       for(int n2=0; n2<especiais.size();n2++){
            if(tema.equals(especiais.get(n2)))
                flag = 1;
        }
        if(flag==0){
            Singleton.getInstance().adicionarTema(tema);
            valor += 50;
        }
        aux = c.verificaCliente(CPF);     
        if (aux) {
            if (baleiro || armario) {

                Componentes opcionais1 = new Provensal();
                if (baleiro) {
                    opcionais1 = new Baleiro(opcionais1);
                }
                if (armario) {
                    opcionais1 = new Armario(opcionais1);
                }
                valor += opcionais1.getPreco();
                nomeOP1 = opcionais1.getNome();
            }
            if (flor || borboleta) {

                Componentes opcionais2 = new Baloes();
                if (flor) {
                    opcionais2 = new Flores(opcionais2);
                }
                if (borboleta) {
                    opcionais2 = new Borboleta(opcionais2);
                }
                valor += opcionais2.getPreco();
                nomeOP2 = opcionais2.getNome();
            }
            
            nomeOP1 = nomeOP1+" "+nomeOP2;
            listaFestas = Singleton.getInstance().getListaFestas();

            for (int i = 0; i < listaFestas.size(); i++) {
                FestaConcreta f1 = listaFestas.get(i);
                if (f1.getData() == data) {
                    count++;
                }
            }
            if (count >= 2) {
                JOptionPane.showMessageDialog(rootPane, "Dia indisponivel");
            } else {

                FestaConcreta f = new FestaConcreta(tema, nomeOP1, data, valor);

                aux = f.cadastrarFesta(f, CPF);
                if (aux == true) {
                    JOptionPane.showMessageDialog(rootPane, "Festa : " + tema + "\nOpcionais : " + nomeOP1 + "\nValor: " + valor + " \nCadastrada com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Festa nao pode ser cadastrada");
                }
            }
        }else
            JOptionPane.showMessageDialog(rootPane, "Usuário não cadastrado");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBoxBorboletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxBorboletaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxBorboletaActionPerformed

    private void jComboBoxMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxMesActionPerformed

    private void CampoCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCPFActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastrarFesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarFesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarFesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarFesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastrarFesta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoVoltar;
    private javax.swing.JTextField CampoCPF;
    private javax.swing.JTextField CampoData;
    private javax.swing.JTextField CampoTema;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBoxArmario;
    private javax.swing.JCheckBox jCheckBoxBaleiro;
    private javax.swing.JCheckBox jCheckBoxBorboleta;
    private javax.swing.JCheckBox jCheckBoxFlores;
    private javax.swing.JComboBox jComboBoxAno;
    private javax.swing.JComboBox jComboBoxDia;
    private javax.swing.JComboBox jComboBoxMes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
