package ui;

import DataBase.EmploeeServices;
import Models.EmploeeWorksDetails;
import Models.EmployInformation;
import java.awt.Image;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import DataBase.EmploeeRepository;
import DataBase.Repository;
import DataBase.Services;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class EmployAddPage extends javax.swing.JFrame {

    EmployInformation emploee = new EmployInformation();
    EmploeeWorksDetails emploeeWork = new EmploeeWorksDetails();
    EmploeeRepository emploeesSrvices = new EmploeeServices();
    Repository generalService = new Services();

    public EmployAddPage() {
        initComponents();
        changeShapAll();
    }

    private void changeShapAll() {
        empAdd();
        empExi();
        setData();

    }

    public void empAdd() {
        ImageIcon icon = new ImageIcon("src/Images/add5.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(this.btnEmpAdd.getWidth(), this.btnEmpAdd.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imgIcon = new ImageIcon(imgScale);
        this.btnEmpAdd.setIcon(imgIcon);

    }

    public void empExi() {
        ImageIcon icon = new ImageIcon("src/Images/back2.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(this.btnEmdExi.getWidth(), this.btnEmdExi.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imgIcon = new ImageIcon(imgScale);
        this.btnEmdExi.setIcon(imgIcon);

    }

    private String getFormatedDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        String dateNow = dateFormat.format(date);
        return dateNow;
    }

    private void setData() {
        jLabelEmpDate.setText(getFormatedDate());
        generalService.viewGender(jComboBoxEmpSexual);
        generalService.viewHealthCenter(jComboBoxStation);
    }

    private String getGenderId() {
        return generalService.getGenderId(jComboBoxEmpSexual.getSelectedItem().toString());
    }

    private String getHealthId() {
        String id = generalService.getHelthId(jComboBoxStation.getSelectedItem().toString());

        return id;
    }
private String getEmploeeId() {
        return emploeesSrvices.getEmploeeId(empName.getName());
    }
    private void clear() {
        empName.setText("");
        jTextFieldEmpPass.setText("");
        jTextFieldEmpSpecializ.setText("");
    }

    private void setEmploeeData() {
        emploee.setEmployeeName(empName.getText());
        emploee.setEmployeePassword(jTextFieldEmpPass.getText());
        emploee.setEmployeeSpecialty(jTextFieldEmpSpecializ.getText());
        emploee.setEmployeeCenterId(getHealthId());
        emploee.setEmployeeGenderId(getGenderId());
       
    }

    private void setEmploeeWorkData() {
        emploeeWork.setEmploeeCenterId(getHealthId());
            emploeeWork.setEmploeeDateWork(getFormatedDate());
                emploeeWork.setEmploeeId(getEmploeeId());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        empName = new javax.swing.JTextField();
        jTextFieldEmpPass = new javax.swing.JTextField();
        jTextFieldEmpSpecializ = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxStation = new javax.swing.JComboBox<>();
        jComboBoxEmpSexual = new javax.swing.JComboBox<>();
        btnEmpAdd = new javax.swing.JButton();
        btnEmdExi = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelEmpDate = new javax.swing.JLabel();
        label_data_text = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("اضافة بيانات الموظف");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("الاسم");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("الرمز");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("التخصص");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("اسم المركز");

        empName.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        empName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empNameActionPerformed(evt);
            }
        });

        jTextFieldEmpPass.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldEmpPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmpPassActionPerformed(evt);
            }
        });

        jTextFieldEmpSpecializ.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldEmpSpecializ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmpSpecializActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("الجنس");

        btnEmpAdd.setBackground(new java.awt.Color(255, 255, 255));
        btnEmpAdd.setBorder(null);
        btnEmpAdd.setBorderPainted(false);
        btnEmpAdd.setFocusable(false);
        btnEmpAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpAddActionPerformed(evt);
            }
        });

        btnEmdExi.setBackground(new java.awt.Color(255, 255, 255));
        btnEmdExi.setBorder(null);
        btnEmdExi.setBorderPainted(false);
        btnEmdExi.setFocusable(false);
        btnEmdExi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmdExiActionPerformed(evt);
            }
        });

        jLabel7.setText("اضافة");

        jLabel8.setText("الغاء");

        jLabelEmpDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        label_data_text.setText("التاريخ :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldEmpSpecializ, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jComboBoxEmpSexual, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnEmdExi, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnEmpAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jComboBoxStation, 0, 96, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(78, 78, 78)
                        .addComponent(empName, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel8)
                        .addGap(153, 153, 153)
                        .addComponent(jLabel7)
                        .addGap(156, 156, 156))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldEmpPass, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEmpDate, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_data_text, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEmpSpecializ, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEmpPass, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxStation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxEmpSexual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEmpAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEmdExi, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabelEmpDate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_data_text))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void empNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empNameActionPerformed

    private void jTextFieldEmpPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmpPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmpPassActionPerformed

    private void jTextFieldEmpSpecializActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmpSpecializActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmpSpecializActionPerformed

    private void btnEmdExiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmdExiActionPerformed

        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEmdExiActionPerformed

    private void btnEmpAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpAddActionPerformed

        setEmploeeData();
        int check = generalService.insertEmpAccountData(emploee);
    setEmploeeWorkData();
     generalService.insertEmploeeWorksDetails(emploeeWork);
     
        if (check != 0) {
            JOptionPane.showMessageDialog(new JFrame(), "لقد تمت اضافة بيانات الموظف  بنجاح");
            clear();

        } else {
            JOptionPane.showMessageDialog(new JFrame(), "هناك خطا في عملي اضافة بيانات الموظفة الاضافة");

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEmpAddActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmdExi;
    private javax.swing.JButton btnEmpAdd;
    private javax.swing.JTextField empName;
    public javax.swing.JComboBox<String> jComboBoxEmpSexual;
    public javax.swing.JComboBox<String> jComboBoxStation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelEmpDate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldEmpPass;
    private javax.swing.JTextField jTextFieldEmpSpecializ;
    private javax.swing.JLabel label_data_text;
    // End of variables declaration//GEN-END:variables
}
