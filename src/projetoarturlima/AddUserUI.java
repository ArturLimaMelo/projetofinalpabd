/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projetoarturlima;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author 1886519
 */
public class AddUserUI extends javax.swing.JFrame {

    Connection con;
    CustomerDAO dao;
    Customer c = new Customer(1, "Dimitri", "Tolstoi", "d.tolstoi@gmail.com", 10, 1);
    static int address = 605;

    /**
     * Creates new form AddUserUI
     */
    public AddUserUI() throws SQLException {
        this.dao = new CustomerDAO();
        this.con = new ConnectionFactory().getConnection();
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        tituloLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        nomeLabel = new javax.swing.JLabel();
        nomeTextField = new javax.swing.JTextField();
        sexoLabel = new javax.swing.JLabel();
        masculinoRadio = new javax.swing.JRadioButton();
        femininoRadio = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        lojaComboBox = new javax.swing.JComboBox<>();
        cadastrarButton = new javax.swing.JButton();
        emailLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        endereçoLabel = new javax.swing.JLabel();
        endereçoTextField = new javax.swing.JTextField();
        nomeLabel1 = new javax.swing.JLabel();
        sobrenomeTextField = new javax.swing.JTextField();
        ativoLabel = new javax.swing.JLabel();
        ativoSimRadio = new javax.swing.JRadioButton();
        ativoNaoRadio = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tituloLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuario-do-circulo.png"))); // NOI18N
        tituloLabel.setText("Cadastro de Usuário");

        nomeLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nomeLabel.setText("Nome:");

        sexoLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sexoLabel.setText("Sexo:");

        buttonGroup1.add(masculinoRadio);
        masculinoRadio.setText("Masculino");

        buttonGroup1.add(femininoRadio);
        femininoRadio.setText("Feminino");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Loja");

        lojaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));

        cadastrarButton.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        cadastrarButton.setText("Cadastrar");
        cadastrarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrarButtonMouseClicked(evt);
            }
        });

        emailLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        emailLabel.setText("E-mail");

        endereçoLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        endereçoLabel.setText("Endereço");

        nomeLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nomeLabel1.setText("Sobrenome:");

        ativoLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ativoLabel.setText("Ativo?");

        buttonGroup2.add(ativoSimRadio);
        ativoSimRadio.setText("Sim");

        buttonGroup2.add(ativoNaoRadio);
        ativoNaoRadio.setText("Não");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tituloLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(29, 29, 29))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(176, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nomeLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailLabel)
                            .addComponent(endereçoLabel)
                            .addComponent(jLabel5)
                            .addComponent(nomeLabel)
                            .addComponent(ativoLabel)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(sexoLabel)))
                .addGap(18, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lojaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(nomeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                        .addComponent(emailTextField)
                        .addComponent(endereçoTextField))
                    .addComponent(sobrenomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(masculinoRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(femininoRadio))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ativoSimRadio)
                        .addGap(18, 18, 18)
                        .addComponent(ativoNaoRadio)))
                .addGap(86, 86, 86))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(cadastrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeLabel))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sobrenomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(masculinoRadio)
                    .addComponent(femininoRadio)
                    .addComponent(sexoLabel))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lojaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(endereçoTextField)
                    .addComponent(endereçoLabel))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ativoLabel)
                    .addComponent(ativoSimRadio)
                    .addComponent(ativoNaoRadio))
                .addGap(18, 18, 18)
                .addComponent(cadastrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(105, 95, 168));

        homeButton.setBackground(new java.awt.Color(105, 95, 168));
        homeButton.setForeground(new java.awt.Color(105, 95, 168));
        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casa.png"))); // NOI18N
        homeButton.setBorderPainted(false);
        homeButton.setContentAreaFilled(false);
        homeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(homeButton)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(homeButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarButtonMouseClicked
        if ((nomeTextField.getText().equals("") || sobrenomeTextField.getText().equals(""))) {

            System.out.println("nome OK");
            JOptionPane.showMessageDialog(null, "Preencha os campos", "Erro:", 2);
        } else if ((masculinoRadio.isSelected() == false && femininoRadio.isSelected() == false)) {
            System.out.println("genero OK");
            JOptionPane.showMessageDialog(null, "Preencha os campos", "Erro:", 2);
        } else if ((emailTextField.getText().equals("")
                || endereçoTextField.getText().equals(""))) {
            System.out.println("final OK");
            JOptionPane.showMessageDialog(null, "Preencha os campos", "Erro:", 2);
        } else if (ativoSimRadio.isSelected() == false && ativoNaoRadio.isSelected() == false) {
            System.out.println("Ativo OK");
            JOptionPane.showMessageDialog(null, "Preencha os campos", "Erro:", 2);
        } else {
            System.out.println("c OK");
            int active;
            if (ativoSimRadio.isSelected()) active = 1; else active = 0;
            c.setStore_id(Integer.parseInt(lojaComboBox.getSelectedItem() + ""));

            c.setFirst_name(nomeTextField.getText());
            c.setLast_name(sobrenomeTextField.getText());
            c.setEmail(emailTextField.getText());
            c.setAddress_id(address++);
            address++;
            c.setActive(active);

            try {
                System.out.println("TRY OK");
                String sql = "insert into customer"
                        + " (store_id, first_name, last_name, email, address_id, active)"
                        + " values"
                        + " (?, ?, ?, ?, ?, ?)";
                PreparedStatement pst;
                pst = con.prepareStatement(sql);
                pst.setInt(1, c.getStore_id());
                pst.setString(2, c.getFirst_name());
                pst.setString(3, c.getLast_name());
                pst.setString(4, c.getEmail());
                pst.setInt(5, c.getAddress_id());
                pst.setInt(6, c.getActive());
                pst.execute();
                pst.close();
                JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!", "Sucesso", 1);
            } catch (SQLException ex) {
                Logger.getLogger(AddUserUI.class.getName()).log(Level.SEVERE, null, ex);
            }

        }


    }//GEN-LAST:event_cadastrarButtonMouseClicked

    private void homeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseClicked
        setVisible(false);
    }//GEN-LAST:event_homeButtonMouseClicked

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
            java.util.logging.Logger.getLogger(AddUserUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddUserUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddUserUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddUserUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AddUserUI().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(AddUserUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ativoLabel;
    private javax.swing.JRadioButton ativoNaoRadio;
    private javax.swing.JRadioButton ativoSimRadio;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton cadastrarButton;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel endereçoLabel;
    private javax.swing.JTextField endereçoTextField;
    private javax.swing.JRadioButton femininoRadio;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> lojaComboBox;
    private javax.swing.JRadioButton masculinoRadio;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JLabel nomeLabel1;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JLabel sexoLabel;
    private javax.swing.JTextField sobrenomeTextField;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}
