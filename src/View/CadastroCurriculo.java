package View;

import Control.CurriculoControl;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CadastroCurriculo extends javax.swing.JFrame {

    private CurriculoControl Controlador; 

    public CadastroCurriculo() {
        initComponents();
        this.Controlador = new CurriculoControl(); //instancia a classe CurriculoControl
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        L_Nome_Curriculo = new javax.swing.JLabel();
        C_Nome_Curriculo = new javax.swing.JTextField();
        L_Idade_Curriculo = new javax.swing.JLabel();
        C_Idade_Curriculo = new javax.swing.JTextField();
        L_CPF_Curriculo = new javax.swing.JLabel();
        C_CPF_Curriculo = new javax.swing.JTextField();
        L_RG_Curriculo = new javax.swing.JLabel();
        C_RG_Curriculo = new javax.swing.JTextField();
        L_Curriculo = new javax.swing.JLabel();
        C_Curriculo = new javax.swing.JTextField();
        B_Cancelar_Curriculo = new javax.swing.JButton();
        B_Cadastrar_Curriculo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        L_Nome_Curriculo.setText("Nome:");

        C_Nome_Curriculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_Nome_CurriculoActionPerformed(evt);
            }
        });

        L_Idade_Curriculo.setText("Idade:");

        C_Idade_Curriculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_Idade_CurriculoActionPerformed(evt);
            }
        });

        L_CPF_Curriculo.setText("CPF:");

        L_RG_Curriculo.setText("RG:");

        L_Curriculo.setText("Curriculo:");

        C_Curriculo.setToolTipText("");
        C_Curriculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_CurriculoActionPerformed(evt);
            }
        });

        B_Cancelar_Curriculo.setText("Cancelar");
        B_Cancelar_Curriculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Cancelar_CurriculoActionPerformed(evt);
            }
        });

        B_Cadastrar_Curriculo.setText("Cadastrar");
        B_Cadastrar_Curriculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Cadastrar_CurriculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(B_Cancelar_Curriculo)
                        .addGap(100, 100, 100)
                        .addComponent(B_Cadastrar_Curriculo))
                    .addComponent(C_RG_Curriculo)
                    .addComponent(C_CPF_Curriculo)
                    .addComponent(C_Nome_Curriculo)
                    .addComponent(C_Curriculo)
                    .addComponent(C_Idade_Curriculo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L_Idade_Curriculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(L_CPF_Curriculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(L_RG_Curriculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(L_Curriculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(L_Nome_Curriculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(L_Nome_Curriculo)
                .addGap(20, 20, 20)
                .addComponent(C_Nome_Curriculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(L_Idade_Curriculo)
                .addGap(20, 20, 20)
                .addComponent(C_Idade_Curriculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(L_CPF_Curriculo)
                .addGap(20, 20, 20)
                .addComponent(C_CPF_Curriculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(L_RG_Curriculo)
                .addGap(20, 20, 20)
                .addComponent(C_RG_Curriculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(L_Curriculo)
                .addGap(20, 20, 20)
                .addComponent(C_Curriculo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_Cancelar_Curriculo)
                    .addComponent(B_Cadastrar_Curriculo))
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void C_Nome_CurriculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_Nome_CurriculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C_Nome_CurriculoActionPerformed

    private void C_Idade_CurriculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_Idade_CurriculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C_Idade_CurriculoActionPerformed

    private void B_Cancelar_CurriculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Cancelar_CurriculoActionPerformed
        this.setVisible(false); //sai da tela CadastroCurriculo
    }//GEN-LAST:event_B_Cancelar_CurriculoActionPerformed

    private void C_CurriculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_CurriculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C_CurriculoActionPerformed

    private void B_Cadastrar_CurriculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Cadastrar_CurriculoActionPerformed
        try {
            // recebendo e validando dados da interface grafica.
            String Nome = "";
            int Idade = 0;
            String CPF = "";
            String RG = "";
            String Curriculo = "";

            if (this.C_Nome_Curriculo.getText().length() < 2) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres.");
            } else {
                Nome = this.C_Nome_Curriculo.getText();
            }
            if (this.C_Idade_Curriculo.getText().length() < 0) {
                throw new Mensagens("Idade deve conter ao menos 1 caracterer.");
            } else {
                Idade = Integer.parseInt(this.C_Idade_Curriculo.getText());
            }
            if (this.C_CPF_Curriculo.getText().length() < 2) {
                throw new Mensagens("CPF deve conter ao menos 2 caracteres.");
            } else {
                CPF = this.C_CPF_Curriculo.getText();
            }
            if (this.C_RG_Curriculo.getText().length() < 2) {
                throw new Mensagens("RG deve conter ao menos 2 caracteres.");
            } else {
                RG = this.C_RG_Curriculo.getText();
            }
            if (this.C_Curriculo.getText().length() < 2) {
                throw new Mensagens("Curriculo deve conter ao menos 2 caracteres.");
            } else {
                Curriculo = this.C_Curriculo.getText();
            }
            // envia os dados para o Controlador cadastrar
            if (this.Controlador.CadastrarCurriculo(Nome, Curriculo, CPF, RG, Idade)) {
                JOptionPane.showMessageDialog(rootPane, "Aluno Cadastrado com Sucesso!");

                // limpa campos da interface
                this.C_Nome_Curriculo.setText("");
                this.C_Idade_Curriculo.setText("");
                this.C_CPF_Curriculo.setText("");
                this.C_RG_Curriculo.setText("");
                this.C_Curriculo.setText("");
            }
            System.out.println(this.Controlador.getListacurriculos().toString());

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um numero.");
        } catch (SQLException ex) {
            Logger.getLogger(CadastroCurriculo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_B_Cadastrar_CurriculoActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroCurriculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCurriculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCurriculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCurriculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCurriculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Cadastrar_Curriculo;
    private javax.swing.JButton B_Cancelar_Curriculo;
    private javax.swing.JTextField C_CPF_Curriculo;
    private javax.swing.JTextField C_Curriculo;
    private javax.swing.JTextField C_Idade_Curriculo;
    private javax.swing.JTextField C_Nome_Curriculo;
    private javax.swing.JTextField C_RG_Curriculo;
    private javax.swing.JLabel L_CPF_Curriculo;
    private javax.swing.JLabel L_Curriculo;
    private javax.swing.JLabel L_Idade_Curriculo;
    private javax.swing.JLabel L_Nome_Curriculo;
    private javax.swing.JLabel L_RG_Curriculo;
    // End of variables declaration//GEN-END:variables
}
