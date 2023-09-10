/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import DataBase.DataBase;
import DataBase.Services;
import Models.UserInoformation;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.border.MatteBorder;

public class LoginPage extends javax.swing.JFrame {

    public EmployAddPage emp = new EmployAddPage();
    public mainPage mainPageObject = new mainPage();
    static public boolean chek5;

    public LoginPage() {
        initComponents();
        imageEdit();
        btnLog();
    }

    public void imageEdit() {
        ImageIcon icon = new ImageIcon("src/Images/login2.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(this.jButton1.getWidth(), this.jButton1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imgIcon = new ImageIcon(imgScale);
        this.jButton1.setIcon(imgIcon);
        SwingUtilities.updateComponentTreeUI(this);
        this.jTextFieldNameLOg.setBorder(new MatteBorder(0, 0, 2, 0, Color.black));

        jButton1.setOpaque(false);
        jButton1.setBorder(BorderFactory.createEmptyBorder());
        jButton1.setBackground(new Color(0, 0, 0, 0));
        this.jPasswordField2.setBorder(new MatteBorder(0, 0, 2, 0, Color.black));

    }

    private void cleanData() {
        jTextFieldNameLOg.setText("");
        jPasswordField2.setText("");
    }

    public void btnLog() {
        ImageIcon icon = new ImageIcon("src/Images/login1.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(this.btnLogin.getWidth(), this.btnLogin.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imgIcon = new ImageIcon(imgScale);
        this.btnLogin.setIcon(imgIcon);
        SwingUtilities.updateComponentTreeUI(this);

    }

    private void openMainPage() {
        this.dispose();
        mainPageObject.setVisible(true);
    }

    private void printErrorMsg() throws HeadlessException {
        JOptionPane.showMessageDialog(new JFrame(), "الرمز خطا يرجى اعادة كتابة الرمز بشكل صحيح");
        cleanData();
    }
 private UserInoformation getUserData() {
        UserInoformation userInformation = new UserInoformation();
        userInformation.setUserNameAccount(jTextFieldNameLOg.getText());
        userInformation.setUserPasswordAccount(jPasswordField2.getText());
        return userInformation;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        jTextFieldNameLOg = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(" تسجيل الدخول");
        setBackground(new java.awt.Color(75, 235, 207));
        setLocationByPlatform(true);
        setResizable(false);
        setSize(new java.awt.Dimension(500, 600));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnLogin.setBorder(null);
        btnLogin.setBorderPainted(false);
        btnLogin.setFocusable(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jTextFieldNameLOg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldNameLOg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNameLOgActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("الاسم");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("الرمز");

        jPasswordField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.setOpaque(false);
        jButton1.setRequestFocusEnabled(false);
        jButton1.setRolloverEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(21, 21, 21))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(146, 146, 146)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldNameLOg)
                                .addComponent(jPasswordField2, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)))))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNameLOg, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNameLOgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNameLOgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNameLOgActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

        DataBase.openConnection();
        UserInoformation userInformation = getUserData();

        if (Services.isUserVaild(userInformation)) {
            openMainPage();
        } else {
            printErrorMsg();

        }


    }//GEN-LAST:event_btnLoginActionPerformed

   

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextFieldNameLOg;
    // End of variables declaration//GEN-END:variables
}
