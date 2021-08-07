/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Principal.Global;
import static Principal.Global.chaves;
import javax.swing.JOptionPane;

public class TelaEleicao extends javax.swing.JFrame {
String numero;
    public TelaEleicao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTF2 = new javax.swing.JTextField();
        jTF1 = new javax.swing.JTextField();
        jB8 = new javax.swing.JButton();
        jB9 = new javax.swing.JButton();
        jB7 = new javax.swing.JButton();
        jB5 = new javax.swing.JButton();
        jB6 = new javax.swing.JButton();
        jB4 = new javax.swing.JButton();
        jB2 = new javax.swing.JButton();
        jB3 = new javax.swing.JButton();
        jB1 = new javax.swing.JButton();
        jB0 = new javax.swing.JButton();
        jLpartidocand = new javax.swing.JLabel();
        jLFoto = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jBconfirmar = new javax.swing.JButton();
        jLpartido = new javax.swing.JLabel();
        jLnomecand = new javax.swing.JLabel();
        jLnome = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("PRESIDENTE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(200, 11, 170, 33);

        jLabel2.setText("Numero:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 90, 60, 14);

        jTF2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jTF2.setEnabled(false);
        jTF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTF2);
        jTF2.setBounds(120, 70, 36, 63);

        jTF1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jTF1.setEnabled(false);
        jTF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTF1);
        jTF1.setBounds(80, 70, 37, 63);

        jB8.setText("8");
        jB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB8ActionPerformed(evt);
            }
        });
        getContentPane().add(jB8);
        jB8.setBounds(438, 133, 52, 42);

        jB9.setText("9");
        jB9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB9ActionPerformed(evt);
            }
        });
        getContentPane().add(jB9);
        jB9.setBounds(500, 133, 52, 42);

        jB7.setText("7");
        jB7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB7ActionPerformed(evt);
            }
        });
        getContentPane().add(jB7);
        jB7.setBounds(376, 133, 52, 42);

        jB5.setText("5");
        jB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB5ActionPerformed(evt);
            }
        });
        getContentPane().add(jB5);
        jB5.setBounds(438, 181, 52, 42);

        jB6.setText("6");
        jB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB6ActionPerformed(evt);
            }
        });
        getContentPane().add(jB6);
        jB6.setBounds(500, 181, 52, 42);

        jB4.setText("4");
        jB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB4ActionPerformed(evt);
            }
        });
        getContentPane().add(jB4);
        jB4.setBounds(376, 181, 52, 42);

        jB2.setText("2");
        jB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB2ActionPerformed(evt);
            }
        });
        getContentPane().add(jB2);
        jB2.setBounds(438, 229, 52, 42);

        jB3.setText("3");
        jB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB3ActionPerformed(evt);
            }
        });
        getContentPane().add(jB3);
        jB3.setBounds(500, 229, 52, 42);

        jB1.setText("1");
        jB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB1ActionPerformed(evt);
            }
        });
        getContentPane().add(jB1);
        jB1.setBounds(376, 229, 52, 42);

        jB0.setText("0");
        jB0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB0ActionPerformed(evt);
            }
        });
        getContentPane().add(jB0);
        jB0.setBounds(438, 277, 52, 42);

        jLpartidocand.setText("Partido: ");
        getContentPane().add(jLpartidocand);
        jLpartidocand.setBounds(10, 210, 60, 14);

        jLFoto.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        getContentPane().add(jLFoto);
        jLFoto.setBounds(376, 11, 176, 104);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Branco");
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 240, 90, 54);

        jButton2.setBackground(new java.awt.Color(204, 153, 0));
        jButton2.setText("Corrigir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(110, 240, 102, 54);

        jBconfirmar.setBackground(new java.awt.Color(51, 153, 0));
        jBconfirmar.setText("Confirmar");
        jBconfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBconfirmarActionPerformed(evt);
            }
        });
        getContentPane().add(jBconfirmar);
        jBconfirmar.setBounds(218, 240, 92, 54);
        getContentPane().add(jLpartido);
        jLpartido.setBounds(70, 210, 150, 20);

        jLnomecand.setText("Nome: ");
        getContentPane().add(jLnomecand);
        jLnomecand.setBounds(10, 180, 40, 14);
        getContentPane().add(jLnome);
        jLnome.setBounds(60, 174, 170, 20);

        setSize(new java.awt.Dimension(578, 357));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTF2ActionPerformed

    private void jTF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTF1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTF1.setText("");
        jTF2.setText("");
        jLnome.setText("");
        jLpartido.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jB7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB7ActionPerformed
    numero("7");
    }//GEN-LAST:event_jB7ActionPerformed

    private void jB0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB0ActionPerformed
    numero("0");
    }//GEN-LAST:event_jB0ActionPerformed

    private void jB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB1ActionPerformed
    numero("1");
    }//GEN-LAST:event_jB1ActionPerformed

    private void jB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB2ActionPerformed
    numero("2");
    }//GEN-LAST:event_jB2ActionPerformed

    private void jB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB3ActionPerformed
    numero("3");
    }//GEN-LAST:event_jB3ActionPerformed

    private void jB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB4ActionPerformed
    numero("4");
    }//GEN-LAST:event_jB4ActionPerformed

    private void jB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB5ActionPerformed
    numero("5");
    }//GEN-LAST:event_jB5ActionPerformed

    private void jB6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB6ActionPerformed
    numero("6");
    }//GEN-LAST:event_jB6ActionPerformed

    private void jB8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB8ActionPerformed
    numero("8");
    }//GEN-LAST:event_jB8ActionPerformed

    private void jB9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB9ActionPerformed
    numero("9");
    }//GEN-LAST:event_jB9ActionPerformed

    private void jBconfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBconfirmarActionPerformed
        int cvoto = Integer.parseInt(jTF1.getText() + jTF2.getText());
        switch(cvoto){
            case(10):
                Global.chaves++;
                break;
            case(12):
                Global.nhonho++;
                break;
            case(14):
                Global.kiko++;
                break;
            case(16):
                Global.seumadruga++;
                break;
            case(18):
                Global.seubarriga++;
                break;
            }
    TelaEleitor tela= new TelaEleitor();
    tela.setVisible(true);
    dispose();
    }//GEN-LAST:event_jBconfirmarActionPerformed

    private void numero(String numero){
        if(jTF1.getText().equals("")){
        jTF1.setText(numero);
        } else { 
            jTF2.setText(numero);
        }
        int nvoto = Integer.parseInt(jTF1.getText() + jTF2.getText());
        switch(nvoto){
            case(10):
              jLnome.setText("Chaves");
              jLpartido.setText("PQ");
                break;
            case(12):
                jLnome.setText("Nhonho");
                jLpartido.setText("PW");
                break;
            case(14):
                jLnome.setText("Kiko");
                jLpartido.setText("PE");
                break;
            case(16):
                jLnome.setText("Seu Madruga");
                jLpartido.setText("PR");
                break;
            case(18):
                jLnome.setText("Seu Barriga");
                jLpartido.setText("PY");
                break;
            }
       
    }

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
            java.util.logging.Logger.getLogger(TelaEleicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEleicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEleicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEleicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEleicao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB0;
    private javax.swing.JButton jB1;
    private javax.swing.JButton jB2;
    private javax.swing.JButton jB3;
    private javax.swing.JButton jB4;
    private javax.swing.JButton jB5;
    private javax.swing.JButton jB6;
    private javax.swing.JButton jB7;
    private javax.swing.JButton jB8;
    private javax.swing.JButton jB9;
    private javax.swing.JButton jBconfirmar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLFoto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLnome;
    private javax.swing.JLabel jLnomecand;
    private javax.swing.JLabel jLpartido;
    private javax.swing.JLabel jLpartidocand;
    private javax.swing.JTextField jTF1;
    private javax.swing.JTextField jTF2;
    // End of variables declaration//GEN-END:variables
}
