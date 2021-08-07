/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;
import Principal.Global;
import static Visao.TelaParcial.jLchaves;
import static Visao.TelaParcial.jLkiko;
import static Visao.TelaParcial.jLnhonho;
import static Visao.TelaParcial.jLseubar;
import static Visao.TelaParcial.jLseumad;
import static Visao.TelaParcial.jLtotvotos;
/**
 *
 * @author aluno
 */
public class TelaEleitor extends javax.swing.JFrame {
   

    /**
     * Creates new form TelaEleitor
     */
    public TelaEleitor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTFtitulo = new javax.swing.JTextField();
        jBbuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLnome = new javax.swing.JLabel();
        jBvotar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Título de Eleitor ou RG:");

        jBbuscar.setText("Buscar");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome: ");

        jLnome.setText("__________________________________________");

        jBvotar.setText("Votar");
        jBvotar.setEnabled(false);
        jBvotar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBvotarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTFtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBbuscar))
                            .addComponent(jLabel2)
                            .addComponent(jLnome)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jBvotar)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBbuscar))
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLnome)
                .addGap(74, 74, 74)
                .addComponent(jBvotar)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(416, 338));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
    //jTFtitulo.getText().equals(Global.titulo[i]) || 
        int i,saida;
        saida = Integer.parseInt(jTFtitulo.getText());
        if(saida != 999){
        for(i=0;i<=3;i++){
            if(((jTFtitulo.getText().equals(Global.rg[i])) || (jTFtitulo.getText().equals(Global.titulo[i]))) && Global.javoto[i].equals("0")){
                jLnome.setText(Global.nome[i]);
                jBvotar.setEnabled(true);
                break;
            }else{ 
                jBvotar.setEnabled(false);
                jLnome.setText("Usuario não cadastrado/Usuario ja votou");
            }
           dispose();
        }
    }else{
        TelaParcial parcial =  new TelaParcial();
        parcial.setVisible(true);
        dispose();
        
        jLchaves.setText(String.valueOf(Global.chaves));
        jLkiko.setText(String.valueOf(Global.kiko));
        jLnhonho.setText(String.valueOf(Global.nhonho));
        jLseumad.setText(String.valueOf(Global.seumadruga));
        jLseubar.setText(String.valueOf(Global.seubarriga));
        Global.total = Global.chaves +  Global.kiko + Global.nhonho + Global.seumadruga + Global.seubarriga;
        jLtotvotos.setText(String.valueOf(Global.total));
        
    }
    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jBvotarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBvotarActionPerformed
    TelaEleicao feleicao =  new TelaEleicao();
    feleicao.setVisible(true);
    int registro;
        registro = Integer.parseInt(jTFtitulo.getText());
        switch(registro){
            case(101):
            Global.javoto[0] = "1";
            break;
            case(102):
            Global.javoto[1] = "1";
            break;
            case(103):
            Global.javoto[2] = "1";
            break;
        } 
        dispose();
    }//GEN-LAST:event_jBvotarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaEleitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEleitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEleitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEleitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEleitor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBvotar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLnome;
    private javax.swing.JTextField jTFtitulo;
    // End of variables declaration//GEN-END:variables
}
