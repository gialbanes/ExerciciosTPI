/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Paciente;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fatec-dsm2
 */
public class FrmPaciente extends javax.swing.JFrame {

    /**
     * Creates new form FrmPaciente
     */
    public FrmPaciente() {
        initComponents();
    }
    
    Paciente p = new Paciente();

    public void ObterDados(){
       ResultSet tabela;
       tabela = null;
       tabela = p.consultarCampoEspecifico();
       DefaultTableModel modelo = (DefaultTableModel) jtblPacientes.getModel();
       modelo.setNumRows(0);
       try
       {
        do{
            modelo.addRow(new String[] {tabela.getString(2),tabela.getString(3), tabela.getString(4),tabela.getString(5),tabela.getString(6),tabela.getString(7),tabela.getString(8),tabela.getString(9),tabela.getString(10)});
          }
        while(tabela.next());
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Erro ao preencher tabela"+ erro) ;    
        }
      }

    public void consultarDados(){
         ResultSet tabela;
        tabela = null;
        
        //CHAMAR O MÉTODO CONSULTAR
        tabela = p.consultar();

        DefaultTableModel modelo = (DefaultTableModel) jtblPacientes.getModel();
        modelo.setNumRows(0);

        try{
            do{
                modelo.addRow(new String[] {tabela.getString(2),tabela.getString(3), tabela.getString(4),tabela.getString(5),tabela.getString(6),tabela.getString(7),tabela.getString(8),tabela.getString(9),tabela.getString(10)});
            }
            while(tabela.next());
        }
        catch(SQLException erro){
            JOptionPane.showMessageDialog(null,"Erro preencher tabela" + erro);

        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtblPacientes = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        lblCodigo2 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        txtnome = new javax.swing.JTextField();
        lblNome2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtpesquisar = new javax.swing.JTextField();
        btnConsultar2 = new javax.swing.JButton();
        txtlogin = new javax.swing.JTextField();
        lblNome3 = new javax.swing.JLabel();
        lblNome4 = new javax.swing.JLabel();
        lblNome5 = new javax.swing.JLabel();
        txtendereco = new javax.swing.JTextField();
        lblNome6 = new javax.swing.JLabel();
        txtcomplemento = new javax.swing.JTextField();
        lblNome7 = new javax.swing.JLabel();
        lblNome8 = new javax.swing.JLabel();
        lblNome9 = new javax.swing.JLabel();
        txtsenha = new javax.swing.JPasswordField();
        txtrg = new javax.swing.JFormattedTextField();
        txtcpf = new javax.swing.JFormattedTextField();
        txtnascimento = new javax.swing.JFormattedTextField();
        jPanel4 = new javax.swing.JPanel();
        btnCadastrar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtblPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Login", "Senha", "Endereço", "Complemento", "RG", "CPF", "Nascimento"
            }
        ));
        jtblPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblPacientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtblPacientes);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados paciente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        lblCodigo2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCodigo2.setText("Código:");

        lblNome2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNome2.setText("Nome:");

        jLabel3.setText("Pesquisar");

        btnConsultar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconesclinica/consultar.png"))); // NOI18N
        btnConsultar2.setText("Consultar");
        btnConsultar2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnConsultar2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnConsultar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultar2ActionPerformed(evt);
            }
        });

        lblNome3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNome3.setText("Login:");

        lblNome4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNome4.setText("Senha:");

        lblNome5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNome5.setText("Endereço:");

        lblNome6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNome6.setText("Complemento:");

        lblNome7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNome7.setText("RG:");

        lblNome8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNome8.setText("CPF:");

        lblNome9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNome9.setText("Nascimento:");

        try {
            txtrg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtcpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtnascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome2)
                    .addComponent(lblNome3)
                    .addComponent(lblNome4)
                    .addComponent(lblNome5)
                    .addComponent(lblNome6)
                    .addComponent(lblNome7)
                    .addComponent(lblNome8)
                    .addComponent(lblNome9)
                    .addComponent(lblCodigo2))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtnome, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                    .addComponent(txtlogin, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                    .addComponent(txtendereco, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                    .addComponent(txtcomplemento, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                    .addComponent(txtsenha)
                    .addComponent(txtrg)
                    .addComponent(txtcpf)
                    .addComponent(txtnascimento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtpesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnConsultar2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(33, 33, 33))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(txtpesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblCodigo2, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnConsultar2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome2)
                            .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome3)
                            .addComponent(txtlogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome4)
                            .addComponent(txtsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome5)
                            .addComponent(txtendereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome6)
                            .addComponent(txtcomplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome7)
                            .addComponent(txtrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome8)
                            .addComponent(txtcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome9)
                            .addComponent(txtnascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconesclinica/cadastrar.png"))); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconesclinica/alterar_1.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconesclinica/excluir.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconesclinica/consultar.png"))); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCadastrar)
                .addGap(18, 18, 18)
                .addComponent(btnAlterar)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir)
                .addGap(27, 27, 27)
                .addComponent(btnLimpar)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnLimpar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 889, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(216, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtblPacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblPacientesMouseClicked
        // TODO add your handling code here:
        //para pegar o numero da linha selecionada na tabela
        int linhaSelecionada = jtblPacientes.getSelectedRow();

        //mostra as informações da linha selecionada na tabela na caixa de texto
        txtcodigo.setText(jtblPacientes.getValueAt(linhaSelecionada , 0).toString());
        txtnome.setText(jtblPacientes.getValueAt(linhaSelecionada , 1).toString());
        txtlogin.setText(jtblPacientes.getValueAt(linhaSelecionada , 2).toString());
        txtsenha.setText(jtblPacientes.getValueAt(linhaSelecionada , 3).toString());
        txtendereco.setText(jtblPacientes.getValueAt(linhaSelecionada , 4).toString());
        txtcomplemento.setText(jtblPacientes.getValueAt(linhaSelecionada , 5).toString());
        txtrg.setText(jtblPacientes.getValueAt(linhaSelecionada , 6).toString());
        txtcpf.setText(jtblPacientes.getValueAt(linhaSelecionada , 7).toString());
        txtnascimento.setText(jtblPacientes.getValueAt(linhaSelecionada , 8).toString());
    }//GEN-LAST:event_jtblPacientesMouseClicked

    private void btnConsultar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultar2ActionPerformed
        // TODO add your handling code here:
        p.setNome(txtpesquisar.getText());
        p.consultarCampoEspecifico();
        ObterDados();
    }//GEN-LAST:event_btnConsultar2ActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
        p.setCodigo(Integer.parseInt(txtcodigo.getText()));
        p.setNome(txtnome.getText());
        p.setLogin(txtlogin.getText());
        p.setSenha(txtsenha.getText());
        p.setEndereco(txtendereco.getText());
        p.setComplemento(txtcomplemento.getText());
        p.setRg(txtrg.getText());
        p.setCpf(txtcpf.getText());
        p.setNascimento(txtnascimento.getText());
        p.cadastrarPaciente();
        consultarDados();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
        p.setCodigo(Integer.parseInt(txtcodigo.getText()));
        p.setNome(txtnome.getText());
        p.setLogin(txtlogin.getText());
        p.setSenha(txtsenha.getText());
        p.setEndereco(txtendereco.getText());
        p.setComplemento(txtcomplemento.getText());
        p.setRg(txtrg.getText());
        p.setCpf(txtcpf.getText());
        p.setNascimento(txtnascimento.getText());
        p.alterar();
        consultarDados();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        p.setCodigo(Integer.parseInt(txtcodigo.getText()));
        p.excluir();
        consultarDados();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
        txtcodigo.setText("");
        txtnome.setText("");
        txtlogin.setText("");
        txtsenha.setText("");
        txtendereco.setText("");
        txtcomplemento.setText("");
        txtrg.setText("");
        txtcpf.setText("");
        txtnascimento.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnConsultar2;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtblPacientes;
    private javax.swing.JLabel lblCodigo2;
    private javax.swing.JLabel lblNome2;
    private javax.swing.JLabel lblNome3;
    private javax.swing.JLabel lblNome4;
    private javax.swing.JLabel lblNome5;
    private javax.swing.JLabel lblNome6;
    private javax.swing.JLabel lblNome7;
    private javax.swing.JLabel lblNome8;
    private javax.swing.JLabel lblNome9;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtcomplemento;
    private javax.swing.JFormattedTextField txtcpf;
    private javax.swing.JTextField txtendereco;
    private javax.swing.JTextField txtlogin;
    private javax.swing.JFormattedTextField txtnascimento;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtpesquisar;
    private javax.swing.JFormattedTextField txtrg;
    private javax.swing.JPasswordField txtsenha;
    // End of variables declaration//GEN-END:variables
}
