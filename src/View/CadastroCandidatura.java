package View;

import Control.CandidaturaControl;
import Control.CurriculoControl;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CadastroCandidatura extends javax.swing.JFrame {
    
    private CandidaturaControl Controlador;

    public CadastroCandidatura() {
        initComponents();
         this.Controlador = new CandidaturaControl(); //instancia a classe CandidaturaControl
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        C_IDCurriculo_CCurriculo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        C_IDvaga_CCurriculo = new javax.swing.JTextField();
        B_Cancelar_Cadastro_Candidatura = new javax.swing.JButton();
        B_Cadastrar_Cadastro_Candidatura = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID do curriculo:");

        C_IDCurriculo_CCurriculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_IDCurriculo_CCurriculoActionPerformed(evt);
            }
        });

        jLabel2.setText("ID da vaga:");

        C_IDvaga_CCurriculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_IDvaga_CCurriculoActionPerformed(evt);
            }
        });

        B_Cancelar_Cadastro_Candidatura.setText("Cancelar");
        B_Cancelar_Cadastro_Candidatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Cancelar_Cadastro_CandidaturaActionPerformed(evt);
            }
        });

        B_Cadastrar_Cadastro_Candidatura.setText("Cadastrar");
        B_Cadastrar_Cadastro_Candidatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Cadastrar_Cadastro_CandidaturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(C_IDCurriculo_CCurriculo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C_IDvaga_CCurriculo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(154, 154, 154))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B_Cancelar_Cadastro_Candidatura)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(B_Cadastrar_Cadastro_Candidatura)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addComponent(C_IDCurriculo_CCurriculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(10, 10, 10)
                .addComponent(C_IDvaga_CCurriculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_Cancelar_Cadastro_Candidatura)
                    .addComponent(B_Cadastrar_Cadastro_Candidatura))
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void C_IDCurriculo_CCurriculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_IDCurriculo_CCurriculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C_IDCurriculo_CCurriculoActionPerformed

    private void C_IDvaga_CCurriculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_IDvaga_CCurriculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C_IDvaga_CCurriculoActionPerformed

    private void B_Cancelar_Cadastro_CandidaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Cancelar_Cadastro_CandidaturaActionPerformed
        this.setVisible(false); //sai da interface CadastroCandidatura
    }//GEN-LAST:event_B_Cancelar_Cadastro_CandidaturaActionPerformed

    private void B_Cadastrar_Cadastro_CandidaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Cadastrar_Cadastro_CandidaturaActionPerformed
        try {
            // recebendo e validando dados da interface grafica.
            int ID_vaga = 0;
            int ID_curriculo = 0;

            if (this.C_IDCurriculo_CCurriculo.getText().length() < 0) {
                throw new Mensagens("ID de candidatura deve conter ao menos 1 caracteres.");
            } else {
                ID_curriculo = Integer.parseInt(this.C_IDCurriculo_CCurriculo.getText());
            }
            if (this.C_IDvaga_CCurriculo.getText().length() < 0) {
                throw new Mensagens("ID de vaga deve conter ao menos 1 caracterer.");
            } else {
                ID_vaga = Integer.parseInt(this.C_IDvaga_CCurriculo.getText());
            }
            // envia os dados para o Controlador cadastrar
            if (this.Controlador.CadastrarCandidatura(ID_curriculo, ID_vaga)) {
                JOptionPane.showMessageDialog(rootPane, "Candidatura Cadastrada com Sucesso!");

                // limpa campos da interface
                this.C_IDCurriculo_CCurriculo.setText("");
                this.C_IDvaga_CCurriculo.setText("");
  
            }
            System.out.println(this.Controlador.getListacandidaturas().toString());

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um numero.");
        } catch (SQLException ex) {
            Logger.getLogger(CadastroCurriculo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_B_Cadastrar_Cadastro_CandidaturaActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroCandidatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCandidatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCandidatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCandidatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCandidatura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Cadastrar_Cadastro_Candidatura;
    private javax.swing.JButton B_Cancelar_Cadastro_Candidatura;
    private javax.swing.JTextField C_IDCurriculo_CCurriculo;
    private javax.swing.JTextField C_IDvaga_CCurriculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
