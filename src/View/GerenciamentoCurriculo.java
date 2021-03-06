package View;

import Control.CurriculoControl;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GerenciamentoCurriculo extends javax.swing.JFrame {

    private CurriculoControl Controlador;

    public GerenciamentoCurriculo() {
        initComponents();
        this.Controlador = new CurriculoControl(); //instancia a classe CuriculoControl
        this.carregaTabela(); //carrega a tabela de curriculos vindo do BD
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela_GCurriculo = new javax.swing.JTable();
        L_Nome_GCurriculo = new javax.swing.JLabel();
        C_Nome_GCurriculo = new javax.swing.JTextField();
        L_Idade_GCurriculo = new javax.swing.JLabel();
        C_Idade_GCurriculo = new javax.swing.JTextField();
        C_CPF_GCurriculo = new javax.swing.JTextField();
        C_RG_GCurriculo = new javax.swing.JTextField();
        C_Curriculo_GCurriculo = new javax.swing.JTextField();
        L_CPF_GCurriculo = new javax.swing.JLabel();
        L_RG_GCurriculo = new javax.swing.JLabel();
        L_Curriculo_GCurriculo = new javax.swing.JLabel();
        B_Alterar_GCurriculo = new javax.swing.JButton();
        B_Cancelar_GCurriculo = new javax.swing.JButton();
        B_Apagar_GCurriculo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tabela_GCurriculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID ", "Nome ", "Curriculo", "CPF", "RG", "Idade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabela_GCurriculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabela_GCurriculoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabela_GCurriculo);

        L_Nome_GCurriculo.setText("Nome:");

        L_Idade_GCurriculo.setText("Idade:");

        C_Idade_GCurriculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_Idade_GCurriculoActionPerformed(evt);
            }
        });

        C_CPF_GCurriculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_CPF_GCurriculoActionPerformed(evt);
            }
        });

        C_RG_GCurriculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_RG_GCurriculoActionPerformed(evt);
            }
        });

        C_Curriculo_GCurriculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_Curriculo_GCurriculoActionPerformed(evt);
            }
        });

        L_CPF_GCurriculo.setText("CPF:");

        L_RG_GCurriculo.setText("RG:");

        L_Curriculo_GCurriculo.setText("Curriculo:");

        B_Alterar_GCurriculo.setText("Alterar");
        B_Alterar_GCurriculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Alterar_GCurriculoActionPerformed(evt);
            }
        });

        B_Cancelar_GCurriculo.setText("Cancelar");
        B_Cancelar_GCurriculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Cancelar_GCurriculoActionPerformed(evt);
            }
        });

        B_Apagar_GCurriculo.setText("Apagar");
        B_Apagar_GCurriculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Apagar_GCurriculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(C_Curriculo_GCurriculo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L_Nome_GCurriculo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C_Nome_GCurriculo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C_CPF_GCurriculo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C_RG_GCurriculo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L_RG_GCurriculo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(B_Cancelar_GCurriculo)
                        .addGap(65, 65, 65)
                        .addComponent(B_Apagar_GCurriculo)
                        .addGap(65, 65, 65)
                        .addComponent(B_Alterar_GCurriculo))
                    .addComponent(L_Curriculo_GCurriculo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(C_Idade_GCurriculo, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(L_CPF_GCurriculo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(L_Idade_GCurriculo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)))
                .addContainerGap(325, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(L_Nome_GCurriculo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(C_Nome_GCurriculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(L_Idade_GCurriculo)
                .addGap(10, 10, 10)
                .addComponent(C_Idade_GCurriculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(L_CPF_GCurriculo)
                .addGap(10, 10, 10)
                .addComponent(C_CPF_GCurriculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(L_RG_GCurriculo)
                .addGap(10, 10, 10)
                .addComponent(C_RG_GCurriculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(L_Curriculo_GCurriculo)
                .addGap(10, 10, 10)
                .addComponent(C_Curriculo_GCurriculo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_Apagar_GCurriculo)
                    .addComponent(B_Alterar_GCurriculo)
                    .addComponent(B_Cancelar_GCurriculo))
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void C_Idade_GCurriculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_Idade_GCurriculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C_Idade_GCurriculoActionPerformed

    private void C_CPF_GCurriculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_CPF_GCurriculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C_CPF_GCurriculoActionPerformed

    private void C_RG_GCurriculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_RG_GCurriculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C_RG_GCurriculoActionPerformed

    private void C_Curriculo_GCurriculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_Curriculo_GCurriculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C_Curriculo_GCurriculoActionPerformed

    private void B_Alterar_GCurriculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Alterar_GCurriculoActionPerformed
        try {
            // recebendo e validando dados da interface grafica.
            int id = 0;
            String Nome = "";
            int Idade = 0;
            String CPF = "";
            String RG = "";
            String Curriculo = "";

            if (this.C_Nome_GCurriculo.getText().length() < 2) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres.");
            } else {
                Nome = this.C_Nome_GCurriculo.getText();
            }
            if (this.C_Idade_GCurriculo.getText().length() < 0) {
                throw new Mensagens("Idade deve conter ao menos 1 caracterer.");
            } else {
                Idade = Integer.parseInt(this.C_Idade_GCurriculo.getText());
            }
            if (this.C_CPF_GCurriculo.getText().length() < 2) {
                throw new Mensagens("CPF deve conter ao menos 2 caracteres.");
            } else {
                CPF = this.C_CPF_GCurriculo.getText();
            }
            if (this.C_RG_GCurriculo.getText().length() < 2) {
                throw new Mensagens("RG deve conter ao menos 2 caracteres.");
            } else {
                RG = this.C_RG_GCurriculo.getText();
            }
            if (this.C_Curriculo_GCurriculo.getText().length() < 2) {
                throw new Mensagens("Curriculo deve conter ao menos 2 caracteres.");
            } else {
                Curriculo = this.C_Curriculo_GCurriculo.getText();
            }

            if (this.Tabela_GCurriculo.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro Selecione um curriculo para alterar");
            } else {
                id = Integer.parseInt(this.Tabela_GCurriculo.getValueAt(this.Tabela_GCurriculo.getSelectedRow(), 0).toString());
            }

            // envia os dados para o Controlador processar
            if (this.Controlador.EditarCurriculo(id, Nome, Curriculo, CPF, RG, Idade)) {

                // limpa campos da interface
                this.C_Nome_GCurriculo.setText("");
                this.C_Idade_GCurriculo.setText("");
                this.C_CPF_GCurriculo.setText("");
                this.C_RG_GCurriculo.setText("");
                this.C_Curriculo_GCurriculo.setText("");
                JOptionPane.showMessageDialog(rootPane, "Curriculo Alterado com Sucesso!");
            }
            System.out.println(this.Controlador.getListacurriculos().toString());

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um numero.");
        } finally {
            carregaTabela(); // atualiza a tabela.
        }
    }//GEN-LAST:event_B_Alterar_GCurriculoActionPerformed

    private void B_Cancelar_GCurriculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Cancelar_GCurriculoActionPerformed
        this.setVisible(false); //sai da interface GerenciamentoCurriculo
    }//GEN-LAST:event_B_Cancelar_GCurriculoActionPerformed

    private void B_Apagar_GCurriculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Apagar_GCurriculoActionPerformed
        try {
            // validando dados da interface grafica.
            int id = 0;
            if (this.Tabela_GCurriculo.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro Selecione um candidato para APAGAR");
            } else {
                id = Integer.parseInt(this.Tabela_GCurriculo.getValueAt(this.Tabela_GCurriculo.getSelectedRow(), 0).toString());
            }
            // retorna 0 -> primeiro bot�o | 1 -> segundo bot�o | 2 -> terceiro bot�o
            int resposta_usuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja APAGAR este candidato?");

            if (resposta_usuario == 0) {// clicou em SIM

                // envia os dados para o Controlador processar
                if (this.Controlador.DeletarCurriculo(id)) {

                    // limpa campos da interface
                    this.C_Nome_GCurriculo.setText("");
                    this.C_Idade_GCurriculo.setText("");
                    this.C_CPF_GCurriculo.setText("");
                    this.C_RG_GCurriculo.setText("");
                    this.C_Curriculo_GCurriculo.setText("");
                    JOptionPane.showMessageDialog(rootPane, "Candidato APAGADO com Sucesso!");
                }
            }

            System.out.println(this.Controlador.getListacurriculos().toString());

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
            // atualiza a tabela.
            carregaTabela();
        }
    }//GEN-LAST:event_B_Apagar_GCurriculoActionPerformed

    private void Tabela_GCurriculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabela_GCurriculoMouseClicked
        if (this.Tabela_GCurriculo.getSelectedRow() != -1) { //quando clicado carrega os dados do objeto selecionado

            String Nome = this.Tabela_GCurriculo.getValueAt(this.Tabela_GCurriculo.getSelectedRow(), 1).toString();
            String Idade = this.Tabela_GCurriculo.getValueAt(this.Tabela_GCurriculo.getSelectedRow(), 5).toString();
            String CPF = this.Tabela_GCurriculo.getValueAt(this.Tabela_GCurriculo.getSelectedRow(), 3).toString();
            String RG = this.Tabela_GCurriculo.getValueAt(this.Tabela_GCurriculo.getSelectedRow(), 4).toString();
            String Curriculo = this.Tabela_GCurriculo.getValueAt(this.Tabela_GCurriculo.getSelectedRow(), 2).toString();

            this.C_Nome_GCurriculo.setText(Nome);
            this.C_Idade_GCurriculo.setText(Idade);
            this.C_CPF_GCurriculo.setText(CPF);
            this.C_RG_GCurriculo.setText(RG);
            this.C_Curriculo_GCurriculo.setText(Curriculo);
        }
    }//GEN-LAST:event_Tabela_GCurriculoMouseClicked

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("unchecked")
    public void carregaTabela() { //carrega a lista do BD na tabela
        DefaultTableModel modelo = (DefaultTableModel) this.Tabela_GCurriculo.getModel();
        modelo.setNumRows(0);

        String linhasMatriz[][] = Controlador.getMatrizCurriculo();
        for (int i = 0; i < linhasMatriz.length; i++) {
            modelo.addRow(new Object[]{
                linhasMatriz[i][0],
                linhasMatriz[i][1],
                linhasMatriz[i][2],
                linhasMatriz[i][3],
                linhasMatriz[i][4],
                linhasMatriz[i][5]});

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
            java.util.logging.Logger.getLogger(GerenciamentoCurriculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciamentoCurriculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciamentoCurriculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciamentoCurriculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciamentoCurriculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Alterar_GCurriculo;
    private javax.swing.JButton B_Apagar_GCurriculo;
    private javax.swing.JButton B_Cancelar_GCurriculo;
    private javax.swing.JTextField C_CPF_GCurriculo;
    private javax.swing.JTextField C_Curriculo_GCurriculo;
    private javax.swing.JTextField C_Idade_GCurriculo;
    private javax.swing.JTextField C_Nome_GCurriculo;
    private javax.swing.JTextField C_RG_GCurriculo;
    private javax.swing.JLabel L_CPF_GCurriculo;
    private javax.swing.JLabel L_Curriculo_GCurriculo;
    private javax.swing.JLabel L_Idade_GCurriculo;
    private javax.swing.JLabel L_Nome_GCurriculo;
    private javax.swing.JLabel L_RG_GCurriculo;
    private javax.swing.JTable Tabela_GCurriculo;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
