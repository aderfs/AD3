package View;

import Control.CandidaturaControl;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GerenciamentoCandidatura extends javax.swing.JFrame {

    private CandidaturaControl Controlador;
    
    public GerenciamentoCandidatura() {
        initComponents();
         this.Controlador = new CandidaturaControl();
        this.carregaTabela(); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela_GCandidatura = new javax.swing.JTable();
        B_Cancelar_GCandidatura = new javax.swing.JButton();
        B_Apagar_GCandidatura = new javax.swing.JButton();
        B_Alterar_GCandidatura = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        C_IDCandidatura_GCandidatura = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        C_IDCurriculo_GCandidatura = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        C_IDV_GCandidatura1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tabela_GCandidatura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID_Candidatura", "ID_Curriculo", "ID_Vaga"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabela_GCandidatura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabela_GCandidaturaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabela_GCandidatura);

        B_Cancelar_GCandidatura.setText("Cancelar");
        B_Cancelar_GCandidatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Cancelar_GCandidaturaActionPerformed(evt);
            }
        });

        B_Apagar_GCandidatura.setText("Apagar");
        B_Apagar_GCandidatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Apagar_GCandidaturaActionPerformed(evt);
            }
        });

        B_Alterar_GCandidatura.setText("Alterar");
        B_Alterar_GCandidatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Alterar_GCandidaturaActionPerformed(evt);
            }
        });

        jLabel1.setText("ID da candidatura:");

        C_IDCandidatura_GCandidatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_IDCandidatura_GCandidaturaActionPerformed(evt);
            }
        });

        jLabel2.setText("ID do curriculo:");

        C_IDCurriculo_GCandidatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_IDCurriculo_GCandidaturaActionPerformed(evt);
            }
        });

        jLabel3.setText("ID da vaga:");

        C_IDV_GCandidatura1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_IDV_GCandidatura1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C_IDV_GCandidatura1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(C_IDCandidatura_GCandidatura, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(C_IDCurriculo_GCandidatura, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(B_Cancelar_GCandidatura))
                        .addGap(65, 65, 65)
                        .addComponent(B_Apagar_GCandidatura)
                        .addGap(65, 65, 65)
                        .addComponent(B_Alterar_GCandidatura)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addComponent(C_IDCandidatura_GCandidatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(10, 10, 10)
                .addComponent(C_IDCurriculo_GCandidatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(10, 10, 10)
                .addComponent(C_IDV_GCandidatura1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_Apagar_GCandidatura)
                    .addComponent(B_Alterar_GCandidatura)
                    .addComponent(B_Cancelar_GCandidatura))
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void B_Cancelar_GCandidaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Cancelar_GCandidaturaActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_B_Cancelar_GCandidaturaActionPerformed

    private void B_Apagar_GCandidaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Apagar_GCandidaturaActionPerformed
        try {
            // validando dados da interface gr�fica.
            int ID_candidatura = 0;
            int ID_vaga = 0;
            int ID_curriculo = 0;
            
            if (this.Tabela_GCandidatura.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro Selecione um candidato para APAGAR");
            } else {
                ID_candidatura = Integer.parseInt(this.Tabela_GCandidatura.getValueAt(this.Tabela_GCandidatura.getSelectedRow(), 0).toString());
            }
            // retorna 0 -> primeiro bot�o | 1 -> segundo bot�o | 2 -> terceiro bot�o
            int resposta_usuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja APAGAR esta candidatura?");

            if (resposta_usuario == 0) {// clicou em SIM

                // envia os dados para o Controlador processar
                if (this.Controlador.ApagarCandidatura(ID_candidatura)) {
                    
                    // limpa campos da interface
                    this.C_IDCandidatura_GCandidatura.setText("");
                    this.C_IDCurriculo_GCandidatura.setText("");
                    
                    JOptionPane.showMessageDialog(rootPane, "Candidatura APAGADA com Sucesso!");
                }
            }

            System.out.println(this.Controlador.getListacandidaturas().toString());

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
            // atualiza a tabela.
            carregaTabela();
        }
    }//GEN-LAST:event_B_Apagar_GCandidaturaActionPerformed

    private void B_Alterar_GCandidaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Alterar_GCandidaturaActionPerformed
        try {
            // recebendo e validando dados da interface gr�fica.
            int ID_candidatura = 0;
            int ID_vaga = 0;
            int ID_curriculo = 0;
            

            if (this.C_IDCurriculo_GCandidatura.getText().length() < 0) {
                throw new Mensagens("ID de curriculo deve conter ao menos 1 caracteres.");
            } else {
                ID_curriculo = Integer.parseInt(this.C_IDCurriculo_GCandidatura.getText());
            }
            if (this.C_IDV_GCandidatura1.getText().length() < 0) {
                throw new Mensagens("ID de vaga deve conter ao menos 1 caracterer.");
            } else {
                ID_vaga = Integer.parseInt(this.C_IDV_GCandidatura1.getText());
            }
            

            // envia os dados para o Controlador processar
            if (this.Controlador.EditarCandidatura(ID_candidatura,ID_curriculo, ID_vaga)){

                // limpa campos da interface
                this.C_IDCandidatura_GCandidatura.setText("");
                this.C_IDCurriculo_GCandidatura.setText("");
                JOptionPane.showMessageDialog(rootPane, "Candidatura Alterada com Sucesso!");
            }
            System.out.println(this.Controlador.getListacandidaturas().toString());

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um numero.");
        } finally {
            carregaTabela(); // atualiza a tabela.
        }
    
    }//GEN-LAST:event_B_Alterar_GCandidaturaActionPerformed

    private void C_IDCandidatura_GCandidaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_IDCandidatura_GCandidaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C_IDCandidatura_GCandidaturaActionPerformed

    private void C_IDCurriculo_GCandidaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_IDCurriculo_GCandidaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C_IDCurriculo_GCandidaturaActionPerformed

    private void Tabela_GCandidaturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabela_GCandidaturaMouseClicked
             if (this.Tabela_GCandidatura.getSelectedRow() != -1) {

            String ID_candidatura = this.Tabela_GCandidatura.getValueAt(this.Tabela_GCandidatura.getSelectedRow(), 1).toString();
            String ID_vaga = this.Tabela_GCandidatura.getValueAt(this.Tabela_GCandidatura.getSelectedRow(), 3).toString();
            String ID_curriculo = this.Tabela_GCandidatura.getValueAt(this.Tabela_GCandidatura.getSelectedRow(), 2).toString();

            this.C_IDCandidatura_GCandidatura.setText(ID_candidatura);
            this.C_IDCurriculo_GCandidatura.setText(ID_curriculo);
            this.C_IDV_GCandidatura1.setText(ID_vaga);
        }
    }//GEN-LAST:event_Tabela_GCandidaturaMouseClicked

    private void C_IDV_GCandidatura1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_IDV_GCandidatura1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C_IDV_GCandidatura1ActionPerformed

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("unchecked")
     public void carregaTabela() {
        DefaultTableModel modelo = (DefaultTableModel) this.Tabela_GCandidatura.getModel();
        modelo.setNumRows(0);

        String linhasMatriz[][] = Controlador.getMatrizCandidatura();
        for (int i = 0; i < linhasMatriz.length; i++) {
//            JOptionPane.showMessageDialog(null, linhasMatriz[i][0]);
//            JOptionPane.showMessageDialog(null, linhasMatriz[i][1]);
//            JOptionPane.showMessageDialog(null, linhasMatriz[i][2]);
            modelo.addRow(new Object[]{
                linhasMatriz[i][0],
                linhasMatriz[i][1],
                linhasMatriz[i][2]});

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
            java.util.logging.Logger.getLogger(GerenciamentoCandidatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciamentoCandidatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciamentoCandidatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciamentoCandidatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciamentoCandidatura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Alterar_GCandidatura;
    private javax.swing.JButton B_Apagar_GCandidatura;
    private javax.swing.JButton B_Cancelar_GCandidatura;
    private javax.swing.JTextField C_IDCandidatura_GCandidatura;
    private javax.swing.JTextField C_IDCurriculo_GCandidatura;
    private javax.swing.JTextField C_IDV_GCandidatura1;
    private javax.swing.JTable Tabela_GCandidatura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
