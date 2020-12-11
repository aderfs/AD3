package View;

import javax.swing.table.DefaultTableModel;
import Control.VagaControl;
import java.util.*;
import javax.swing.JOptionPane;

public class GerenciamentoVaga extends javax.swing.JFrame {

    private VagaControl Controlador;

    public GerenciamentoVaga() {
        initComponents();
        this.Controlador = new VagaControl(); //instancia a classe Vaga control
        this.carregaTabela(); //carrega a tabela do BD
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela_GVaga = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        C_DV_GVaga = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        C_PR_GVaga = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        C_Espec_GVaga = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        C_Contato_GVaga = new javax.swing.JTextField();
        B_Alterar_GVaga = new javax.swing.JButton();
        B_Cancelar_GVaga = new javax.swing.JButton();
        B_Apagar_GVaga = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tabela_GVaga.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID_vaga", "Descrição da vaga", "Pré-Requisitos", "Especificações", "Contato"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabela_GVaga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabela_GVagaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabela_GVaga);

        jLabel1.setText("Descricao da vaga:");

        C_DV_GVaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_DV_GVagaActionPerformed(evt);
            }
        });

        jLabel2.setText("Pre-requisitos: ");

        C_PR_GVaga.setAlignmentX(0.0F);
        C_PR_GVaga.setAlignmentY(0.0F);
        C_PR_GVaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_PR_GVagaActionPerformed(evt);
            }
        });

        jLabel3.setText("Especificacoes:");

        jLabel4.setText("Contato:");

        C_Contato_GVaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_Contato_GVagaActionPerformed(evt);
            }
        });

        B_Alterar_GVaga.setText("Alterar");
        B_Alterar_GVaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Alterar_GVagaActionPerformed(evt);
            }
        });

        B_Cancelar_GVaga.setText("Cancelar");
        B_Cancelar_GVaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Cancelar_GVagaActionPerformed(evt);
            }
        });

        B_Apagar_GVaga.setText("Apagar");
        B_Apagar_GVaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Apagar_GVagaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(C_PR_GVaga)
                            .addComponent(C_Espec_GVaga)
                            .addComponent(C_DV_GVaga)
                            .addComponent(C_Contato_GVaga, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(B_Cancelar_GVaga)
                        .addGap(60, 60, 60)
                        .addComponent(B_Apagar_GVaga)
                        .addGap(60, 60, 60)
                        .addComponent(B_Alterar_GVaga)))
                .addContainerGap(220, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addGap(10, 10, 10)
                .addComponent(C_Contato_GVaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addComponent(C_DV_GVaga, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(10, 10, 10)
                .addComponent(C_PR_GVaga, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(10, 10, 10)
                .addComponent(C_Espec_GVaga, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_Apagar_GVaga)
                    .addComponent(B_Alterar_GVaga)
                    .addComponent(B_Cancelar_GVaga))
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void C_DV_GVagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_DV_GVagaActionPerformed

    }//GEN-LAST:event_C_DV_GVagaActionPerformed

    private void C_PR_GVagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_PR_GVagaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C_PR_GVagaActionPerformed

    private void C_Contato_GVagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_Contato_GVagaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C_Contato_GVagaActionPerformed

    private void B_Alterar_GVagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Alterar_GVagaActionPerformed
        try {
            // recebendo e validando dados da interface grafica.
            int id = 0;
            String Descrivaovaga = "";
            String Prerequisito = "";
            String Especificacoes = "";
            String Contato = "";

            if (this.C_Contato_GVaga.getText().length() < 2) {
                throw new Mensagens("Contato deve conter ao menos 2 caracteres.");
            } else {
                Contato = this.C_Contato_GVaga.getText();
            }
            if (this.C_DV_GVaga.getText().length() < 2) {
                throw new Mensagens("A descricao da vaga deve conter ao menos 2 caracteres.");
            } else {
                Descrivaovaga = this.C_DV_GVaga.getText();
            }
            if (this.C_PR_GVaga.getText().length() < 2) {
                throw new Mensagens("O pre-requisito deve conter ao menos 2 caracteres.");
            } else {
                Prerequisito = this.C_PR_GVaga.getText();
            }
            if (this.C_Espec_GVaga.getText().length() < 2) {
                throw new Mensagens("A especificacao deve conter ao menos 2 caracteres.");
            } else {
                Especificacoes = this.C_Espec_GVaga.getText();
            }

            if (this.Tabela_GVaga.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro Selecione uma vaga para alterar");
            } else {
                id = Integer.parseInt(this.Tabela_GVaga.getValueAt(this.Tabela_GVaga.getSelectedRow(), 0).toString());
            }

            // envia os dados para o Controlador processar
            if (this.Controlador.EditarVaga(id, Descrivaovaga, Prerequisito, Especificacoes, Contato)) {

                // limpa campos da interface
                this.C_Contato_GVaga.setText("");
                this.C_DV_GVaga.setText("");
                this.C_PR_GVaga.setText("");
                this.C_Espec_GVaga.setText("");
                JOptionPane.showMessageDialog(rootPane, "Vaga Alterada com Sucesso!");
            }
            System.out.println(this.Controlador.getListaVagas().toString());

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um numero.");
        } finally {
            carregaTabela(); // atualiza a tabela.
        }
    }//GEN-LAST:event_B_Alterar_GVagaActionPerformed

    private void B_Cancelar_GVagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Cancelar_GVagaActionPerformed
        this.setVisible(false); //sai da interface GerenciamentoVaga
    }//GEN-LAST:event_B_Cancelar_GVagaActionPerformed

    private void B_Apagar_GVagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Apagar_GVagaActionPerformed
        try {
            // validando dados da interface grafica.
            int id = 0;
            if (this.Tabela_GVaga.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro Selecione uma vaga para APAGAR");
            } else {
                id = Integer.parseInt(this.Tabela_GVaga.getValueAt(this.Tabela_GVaga.getSelectedRow(), 0).toString());
            }
            // retorna 0 -> primeiro bot�o | 1 -> segundo bot�o | 2 -> terceiro bot�o
            int resposta_usuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja APAGAR esta vaga?");

            if (resposta_usuario == 0) {// clicou em SIM

                // envia os dados para o Controlador processar
                if (this.Controlador.ApagarVaga(id)) {

                    // limpa campos da interface
                    this.C_Contato_GVaga.setText("");
                    this.C_DV_GVaga.setText("");
                    this.C_PR_GVaga.setText("");
                    this.C_Espec_GVaga.setText("");
                    JOptionPane.showMessageDialog(rootPane, "Vaga APAGADA com Sucesso!");
                }
            }

            System.out.println(this.Controlador.getListaVagas().toString());

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
            // atualiza a tabela.
            carregaTabela();
        }
    }//GEN-LAST:event_B_Apagar_GVagaActionPerformed

    private void Tabela_GVagaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabela_GVagaMouseClicked
        if (this.Tabela_GVaga.getSelectedRow() != -1) { //quando clicado carrega os dados do objeto selecionado

            String Contato = this.Tabela_GVaga.getValueAt(this.Tabela_GVaga.getSelectedRow(), 4).toString();
            String Descricaovaga = this.Tabela_GVaga.getValueAt(this.Tabela_GVaga.getSelectedRow(), 1).toString();
            String Prerequsito = this.Tabela_GVaga.getValueAt(this.Tabela_GVaga.getSelectedRow(), 2).toString();
            String Especificacoes = this.Tabela_GVaga.getValueAt(this.Tabela_GVaga.getSelectedRow(), 3).toString();

            this.C_Contato_GVaga.setText(Contato);
            this.C_DV_GVaga.setText(Descricaovaga);
            this.C_PR_GVaga.setText(Prerequsito);
            this.C_Espec_GVaga.setText(Especificacoes);
        }
    }//GEN-LAST:event_Tabela_GVagaMouseClicked

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("unchecked")
    public void carregaTabela() { //coloca a lista vindo do BD na tabela
        DefaultTableModel modelo = (DefaultTableModel) this.Tabela_GVaga.getModel();
        modelo.setNumRows(0);

        String linhasMatriz[][] = Controlador.getMatrizVaga();
        for (int i = 0; i < linhasMatriz.length; i++) {
//            JOptionPane.showMessageDialog(null, linhasMatriz[i][4]);
            modelo.addRow(new Object[]{
                linhasMatriz[i][0],
                linhasMatriz[i][1],
                linhasMatriz[i][2],
                linhasMatriz[i][3],
                linhasMatriz[i][4]});

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
            java.util.logging.Logger.getLogger(GerenciamentoVaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciamentoVaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciamentoVaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciamentoVaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciamentoVaga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Alterar_GVaga;
    private javax.swing.JButton B_Apagar_GVaga;
    private javax.swing.JButton B_Cancelar_GVaga;
    private javax.swing.JTextField C_Contato_GVaga;
    private javax.swing.JTextField C_DV_GVaga;
    private javax.swing.JTextField C_Espec_GVaga;
    private javax.swing.JTextField C_PR_GVaga;
    private javax.swing.JTable Tabela_GVaga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
