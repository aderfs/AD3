
package View;

import Control.VagaControl;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class CadastroVaga extends javax.swing.JFrame {

    private VagaControl Controlador;
  
    public CadastroVaga() {
        initComponents();
        this.Controlador = new VagaControl(); //instancia a classe VagaControl
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        C_DV_CVaga = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        C_PR_CVaga = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        C_Espec_CVaga = new javax.swing.JTextField();
        B_Cadastrar_Vaga = new javax.swing.JButton();
        B_Cancelar_Vaga = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        C_Contato_CVaga = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Descricao da vaga: ");

        C_DV_CVaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_DV_CVagaActionPerformed(evt);
            }
        });

        jLabel2.setText("Pre-requisitos: ");

        C_PR_CVaga.setAlignmentX(0.0F);
        C_PR_CVaga.setAlignmentY(0.0F);
        C_PR_CVaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_PR_CVagaActionPerformed(evt);
            }
        });

        jLabel3.setText("Especificacoes:");

        B_Cadastrar_Vaga.setText("Cadastrar");
        B_Cadastrar_Vaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Cadastrar_VagaActionPerformed(evt);
            }
        });

        B_Cancelar_Vaga.setText("Cancelar");
        B_Cancelar_Vaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Cancelar_VagaActionPerformed(evt);
            }
        });

        jLabel4.setText("Contato:");

        C_Contato_CVaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_Contato_CVagaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C_PR_CVaga, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(C_Espec_CVaga, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(C_DV_CVaga)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(B_Cancelar_Vaga)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(B_Cadastrar_Vaga))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C_Contato_CVaga))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addGap(20, 20, 20)
                .addComponent(C_Contato_CVaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addComponent(C_DV_CVaga, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(20, 20, 20)
                .addComponent(C_PR_CVaga, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(20, 20, 20)
                .addComponent(C_Espec_CVaga, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_Cancelar_Vaga)
                    .addComponent(B_Cadastrar_Vaga))
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void C_DV_CVagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_DV_CVagaActionPerformed

    }//GEN-LAST:event_C_DV_CVagaActionPerformed

    private void C_PR_CVagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_PR_CVagaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C_PR_CVagaActionPerformed

    private void C_Contato_CVagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_Contato_CVagaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C_Contato_CVagaActionPerformed

    private void B_Cancelar_VagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Cancelar_VagaActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_B_Cancelar_VagaActionPerformed

    private void B_Cadastrar_VagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Cadastrar_VagaActionPerformed
         try {
            // recebendo e validando dados da interface grafica.
            String Descricaovaga = "";
            String Prerequisito = "";
            String Especificacoes = "";
            String Contato = "";

            if (this.C_Contato_CVaga.getText().length() < 2) {
                throw new Mensagens("Contato deve conter ao menos 2 caracteres.");
            } else {
                Contato = this.C_Contato_CVaga.getText();
            }
            if (this.C_DV_CVaga.getText().length() < 2) {
                throw new Mensagens("A descricao da vaga deve conter ao menos 2 caractereres.");
            } else {
                Descricaovaga = this.C_DV_CVaga.getText();
            }
            if (this.C_PR_CVaga.getText().length() < 2) {
                throw new Mensagens("O pre-requisito deve conter ao menos 2 caracteres.");
            } else {
                Prerequisito = this.C_PR_CVaga.getText();
            }
            if (this.C_Espec_CVaga.getText().length() < 2) {
                throw new Mensagens("As especificacoes devem conter ao menos 2 caracteres.");
            } else {
                Especificacoes = this.C_Espec_CVaga.getText();
            }
           
            // envia os dados para o Controlador cadastrar
            if (this.Controlador.CastrarVaga(Descricaovaga, Prerequisito, Especificacoes, Contato)) {
                JOptionPane.showMessageDialog(rootPane, "Vaga Cadastrada com Sucesso!");

                // limpa campos da interface
                this.C_Contato_CVaga.setText("");
                this.C_DV_CVaga.setText("");
                this.C_PR_CVaga.setText("");
                this.C_Espec_CVaga.setText("");
            }
            System.out.println(this.Controlador.getListaVagas().toString());

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um numero.");
        } catch (SQLException ex) {
            Logger.getLogger(CadastroCurriculo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_B_Cadastrar_VagaActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroVaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroVaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroVaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroVaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroVaga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Cadastrar_Vaga;
    private javax.swing.JButton B_Cancelar_Vaga;
    private javax.swing.JTextField C_Contato_CVaga;
    private javax.swing.JTextField C_DV_CVaga;
    private javax.swing.JTextField C_Espec_CVaga;
    private javax.swing.JTextField C_PR_CVaga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
