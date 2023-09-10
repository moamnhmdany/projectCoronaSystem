/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class VccReciAdd extends javax.swing.JFrame {

    String st;
    int i = 0;
String birthDate;
    List<String> sick = new ArrayList<String>();
    public VccReciAdd() {
        
        initComponents();

        btnNext();
        btnExit();
        btnSign();
        btnCnacel();
        btnVcc2Cnacel();
        btnVcc2Next();
        btnBackPrint();
        text();
//        comboSickItems();
//        comboFilSextualVcc();
//        comboFilSationVcc();
////        comboFilVcc();
//        comboEmpVcc();
        btnDone();
        btnNextVcc2();
        btnBackVcc2();
//        jLabelVccDate1.setText(EmpData.empDate());

    }
  
   public void tablePrint(){
   DefaultTableModel m=  (DefaultTableModel) jTable1.getModel();
           m.addRow(new Object[0]);
           m.setValueAt(jLabelVccDate1.getText(), 0, 0);
            m.setValueAt(jComboBoxPoseNumber.getSelectedItem(), 0, 1);
                  m.setValueAt(jComboBoxStationVcc.getSelectedItem(), 0, 2);

                       m.setValueAt(jComboBoxVccName.getSelectedItem(), 0, 3);
                       m.setValueAt(jTextFieldReciNationalty.getText(), 0, 4);
                       m.setValueAt(jTextFieldNationalIdNumber.getText(), 0, 5);
                       m.setValueAt(jComboBoxSexVcc.getSelectedItem(), 0, 6);
                       m.setValueAt(jDateChooserBirthDate.getDate(), 0, 7);
                       m.setValueAt(jTextFieldReciPhone.getText(), 0, 8);
                       m.setValueAt(jTextFieldReciAddress.getText(), 0, 9);
                       m.setValueAt(jTextFieldReciName.getText(), 0, 10);
                       jTable1.setEnabled(false);
   }  
//    public void comboFilVccRunNum() {
//        List<String> s3 = DataBaseOperations.VccRunNmubersItems(jComboBoxVcc2Name.getSelectedItem().toString());
//        int i = 0;
//        for (i = 0; i < s3.size(); i++) {
//            this.jComboBoxVcc2RunNmber.addItem(s3.get(i));
//
//
//        }
//    }
//    public void comboFilSextualVcc() {
//        List<String> s3 = DataBaseOperations.SextualItems();
//        int i = 0;
//        for (i = 0; i < s3.size(); i++) {
//            this.jComboBoxSexVcc.addItem(s3.get(i));
//
//
//        }
//    }
    public void comboFilSextualVcc2() {
      
        
//jTextFieldVcc2Sextual.setText(DataBaseOperations.getVccSextualByIdNational(jTextFieldNationalId.getText().toString()));
        
    }

//    public void comboFilSationVcc() {
//        List<String> s4 = DataBaseOperations.StationItems();
//        int i = 0;
//        for (i = 0; i < s4.size(); i++) {
//            this.jComboBoxStationVcc.addItem(s4.get(i));
//                        this.jComboBoxVcc2StationName.addItem(s4.get(i));
//
//
//        }
//    }

//    public void comboFilVcc() {
//        List<String> s5 = DataBaseOperations.VccItems();
//        int i = 0;
//        for (i = 0; i < s5.size(); i++) {
//            this.jComboBoxVccName.addItem(s5.get(i));
//                        this.jComboBoxVcc2Name.addItem(s5.get(i));
//
//
//        }
//    }
   
//    public void comboEmpVcc() {
//        List<String> s6 = DataBaseOperations.EmpItems();
//        int i = 0;
//        for (i = 0; i < s6.size(); i++) {
//            this.jComboBoxVccEmp.addItem(s6.get(i));
//                        this.jComboBoxEmpVcc2.addItem(s6.get(i));
//
//
//        }
//    }

//    public void comboSickItems() {
//        List<String> s = DataBaseOperations.SickItem();
//        int i = 0;
//        for (i = 0; i < s.size(); i++) {
//            this.jComboBoxSickItems.addItem(s.get(i));
//
//        }
//    }

    public void text() {
//URL url = getClass().getResource("..\\textInfo\\info.txt");
// String message = "<html><body><div width='200px' align='right'>"+url+"</div></body></html>";
// jLabel3.setText(message);
    }

    public void btnSign() {
        ImageIcon icon = new ImageIcon("src/Images/next.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(this.jButtonSign.getWidth(), this.jButtonSign.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imgIcon = new ImageIcon(imgScale);
        this.jButtonSign.setIcon(imgIcon);
        SwingUtilities.updateComponentTreeUI(this);

    }
    public void btnDone() {
        ImageIcon icon = new ImageIcon("src/Images/sign1.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(this.btnFinish.getWidth(), this.btnFinish.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imgIcon = new ImageIcon(imgScale);
        this.btnFinish.setIcon(imgIcon);
        SwingUtilities.updateComponentTreeUI(this);

    }
     public void btnBackPrint() {
        ImageIcon icon = new ImageIcon("src/Images/back3.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(this.jButton2.getWidth(), this.jButton2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imgIcon = new ImageIcon(imgScale);
        this.jButton2.setIcon(imgIcon);
        SwingUtilities.updateComponentTreeUI(this);

    }

    public void btnVcc2Next() {
        ImageIcon icon = new ImageIcon("src/Images/sign1.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(this.jButtonVcc2Next.getWidth(), this.jButtonVcc2Next.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imgIcon = new ImageIcon(imgScale);
        this.jButtonVcc2Next.setIcon(imgIcon);
        SwingUtilities.updateComponentTreeUI(this);

    }

    public void btnExit() {
        ImageIcon icon = new ImageIcon("src/Images/back2.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(this.btnEx1.getWidth(), this.btnEx1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imgIcon = new ImageIcon(imgScale);
        this.btnEx1.setIcon(imgIcon);
        SwingUtilities.updateComponentTreeUI(this);

    }

    public void btnCnacel() {
        ImageIcon icon = new ImageIcon("src/Images/back3.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(this.jButtonCancel.getWidth(), this.jButtonCancel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imgIcon = new ImageIcon(imgScale);
        this.jButtonCancel.setIcon(imgIcon);
        SwingUtilities.updateComponentTreeUI(this);

    }

    public void btnVcc2Cnacel() {
        ImageIcon icon = new ImageIcon("src/Images/back3.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(this.jButtonVcc2Cancel.getWidth(), this.jButtonVcc2Cancel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imgIcon = new ImageIcon(imgScale);
        this.jButtonVcc2Cancel.setIcon(imgIcon);
        SwingUtilities.updateComponentTreeUI(this);

    }

    public void btnNext() {
        ImageIcon icon = new ImageIcon("src/Images/next.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(this.btnNext.getWidth(), this.btnNext.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imgIcon = new ImageIcon(imgScale);
        this.btnNext.setIcon(imgIcon);
        SwingUtilities.updateComponentTreeUI(this);

    }
    public void btnNextVcc2() {
        ImageIcon icon = new ImageIcon("src/Images/add5.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(this.btnAddVcc2.getWidth(), this.btnAddVcc2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imgIcon = new ImageIcon(imgScale);
        this.btnAddVcc2.setIcon(imgIcon);
        SwingUtilities.updateComponentTreeUI(this);

    }public void btnBackVcc2() {
        ImageIcon icon = new ImageIcon("src/Images/back3.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(this.btnVcc2Back.getWidth(), this.btnVcc2Back.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imgIcon = new ImageIcon(imgScale);
        this.btnVcc2Back.setIcon(imgIcon);
        SwingUtilities.updateComponentTreeUI(this);

    }
    
//    public void insertData() {
//    
//  boolean checkData1 =  DataBaseOperations.insertVccReciInfo(jTextFieldReciName.getText()
//            , jTextFieldReciAddress.getText()
//            , jDateChooserBirthDate.getDate().toString()
//            , jTextFieldNationalIdNumber.getText()
//            , Integer.parseInt(jTextFieldReciPhone.getText().toString())
//            , EmpData.centerId(jComboBoxStationVcc.getSelectedItem().toString())
//            , EmpData.sextualId(jComboBoxSexVcc.getSelectedItem().toString()));
//  //Thread.sleep(1000);
//  DataBaseOperations.insertRecordPepole(jLabelVccDate1.getText()
//          , jComboBoxVccName.getSelectedItem().toString()
//          , VccDataBase.empId(jComboBoxVccEmp.getSelectedItem().toString())
//          , DataBaseOperations.VccReciId(jTextFieldReciName.getText()));
//  
//  DataBaseOperations.insertVccPose(Integer.parseInt(jComboBoxPoseNumber.getSelectedItem().toString())
//          , jLabelVccDate1.getText()
//          , jTextFieldVccRunNumber.getText()
//          , DataBaseOperations.VccReciId(jTextFieldReciName.getText())
//          , VccDataBase.vccId(jComboBoxVccName.getSelectedItem().toString()));
//  
//  DataBaseOperations.insertVccTakenPlace(DataBaseOperations.VccReciId(jTextFieldReciName.getText()),
//          EmpData.centerId(jComboBoxStationVcc.getSelectedItem().toString()));
//  for(int j =0 ; j<sick.size() ;j++){
//  DataBaseOperations.insertVccSick(jTextFieldReciName.getText(),
//          DataBaseOperations.SickId(sick.get(j)),
//          DataBaseOperations.VccReciId(jTextFieldReciName.getText()));
//  }
//  
//  
//  if(checkData1==true){
//    JOptionPane.showMessageDialog(new JFrame(), "لقد تمت الاضافة بنجاح");
//    
//    
//    
//    
//}else{
//    JOptionPane.showMessageDialog(new JFrame(), "هناك خطا في عملية الاضافة");
//
//}
//    }
//     public void insertDataVcc2() {
//    
//  boolean checkData1 = DataBaseOperations.insertVcc2PoseComplications(jTextFieldVccComplication.getText().toString(),
//         jTextFieldVcc2Date.getText().toString(),
//         jComboBoxVcc2RunNmber.getSelectedItem().toString(),
//         DataBaseOperations.VccReciId(jTextFieldVcc2Name.getText().toString()),
//         VccDataBase.vccId(jComboBoxVcc2Name.getSelectedItem().toString())
//         ) ;
//  
//  DataBaseOperations.insertRecordPepole(jTextFieldVcc2Date.getText().toString()
//          , jComboBoxVcc2Name.getSelectedItem().toString()
//          , VccDataBase.empId(jComboBoxEmpVcc2.getSelectedItem().toString())
//          , DataBaseOperations.VccReciId(jTextFieldVcc2Name.getText()));
//  
//  DataBaseOperations.insertVccPose(Integer.parseInt(jTextFieldVcc2NmberPose.getText().toString())
//          , jTextFieldVcc2Date.getText().toString()
//          , jComboBoxVcc2RunNmber.getSelectedItem().toString()
//          , DataBaseOperations.VccReciId(jTextFieldVcc2Name.getText())
//          , VccDataBase.vccId(jComboBoxVcc2Name.getSelectedItem().toString()));
//  
//  DataBaseOperations.insertVccTakenPlace(DataBaseOperations.VccReciId(jTextFieldVcc2Name.getText()),
//          EmpData.centerId(jComboBoxVcc2StationName.getSelectedItem().toString()));
//  
//  
//  
//  if(checkData1==true){
//    JOptionPane.showMessageDialog(new JFrame(), "لقد تمت الاضافة بنجاح");
//    
//    
//    
//    
//}else{
//    JOptionPane.showMessageDialog(new JFrame(), "هناك خطا في عملية الاضافة");
//
//}
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanelVccMain = new javax.swing.JPanel();
        btnNext = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnEx1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jPanelVcc1 = new javax.swing.JPanel();
        jPanelStation = new javax.swing.JPanel();
        jTextFieldStationNum = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldAdress = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabelMark = new javax.swing.JLabel();
        jComboBoxStationVcc = new javax.swing.JComboBox<>();
        jPanelPersonalInfo = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldReciName = new javax.swing.JTextField();
        jTextFieldReciAddress = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldReciPhone = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldReciNationalty = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldNationalIdNumber = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jComboBoxSexVcc = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jDateChooserBirthDate = new com.toedter.calendar.JDateChooser();
        jPanelVcc = new javax.swing.JPanel();
        jComboBoxVccName = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTextFieldVccCountry = new javax.swing.JTextField();
        jTextFieldVccRunNumber = new javax.swing.JTextField();
        jComboBoxPoseNumber = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        jLabelVccDate1 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanelSick = new javax.swing.JPanel();
        jComboBoxSickItems = new javax.swing.JComboBox<>();
        btnAddSick = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jButtonSign = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel28 = new javax.swing.JLabel();
        jComboBoxVccEmp = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        jPanelVcc2 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jTextFieldNationalId = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jButtonVcc2Next = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jButtonVcc2Cancel = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jPanelVcc1Check = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        btnFinish = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanelVcc2Add = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnAddVcc2 = new javax.swing.JButton();
        btnVcc2Back = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jTextFieldVcc2Name = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jComboBoxVcc2Name = new javax.swing.JComboBox<>();
        jComboBoxVcc2StationName = new javax.swing.JComboBox<>();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jTextFieldVcc2NmberPose = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jComboBoxEmpVcc2 = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jTextFieldVccComplication = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabelVcc2Date = new javax.swing.JLabel();
        jTextFieldVcc2Sextual = new javax.swing.JTextField();
        jTextFieldVcc2Date = new javax.swing.JTextField();
        jComboBoxVcc2RunNmber = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelVccMain.setBackground(new java.awt.Color(255, 255, 255));

        btnNext.setBackground(new java.awt.Color(255, 255, 255));
        btnNext.setBorder(null);
        btnNext.setBorderPainted(false);
        btnNext.setFocusable(false);
        btnNext.setHideActionText(true);
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("التالي");

        btnEx1.setBackground(new java.awt.Color(255, 255, 255));
        btnEx1.setBorder(null);
        btnEx1.setBorderPainted(false);
        btnEx1.setFocusable(false);
        btnEx1.setHideActionText(true);
        btnEx1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEx1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("الغاء");

        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 10, 5));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("<html><body><div width='200px' align='right'>\nأهمية اللقاح:\nالتحصين وسيلة بسيطة وآمنة وفعالة للحماية من الأمراض؛ حيث يدفع الجسم لمقاومة عدوى معينة، وتقوية جهاز المناعة، من خلال تدريب جهاز المناعة على تكوين أجسام مضادة. ونظرًا لسرعة وسهولة انتشار فيروس (كورونا)، وإصابة غالبية سكان العالم به، فإن أهمية هذا اللقاح تكمن في الحماية من فيروس (كورونا) بالسماح للجسم بتطوير استجابة مناعية بشكل آمن والتي توفر الحماية للجسم من خلال منع العدوى أو السيطرة عليها. \n\nكيف تعمل اللقاحات؟\nتقلل اللقاحات من مخاطر الإصابة بالمرض من خلال العمل مع دفاع الجسم الطبيعي للحماية، فعند أخذ اللقاح يستجيب الجهاز المناعي بحيث:\n\n    يتعرف على الفيروس فور دخوله للجسم.\n    ينتج الأجسام المضادة (بروتينات ينتجها الجهاز المناعي بشكل طبيعي لمحاربة المرض).\n    يتذكر المرض وكيفية مكافحته.\n\nلذلك، فإن اللقاح وسيلة آمنة وذكية، فبمجرد أخذ الجسم للقاح، ينتج استجابة مناعية دون التسبب في المرض. فبدلاً من علاج المرض بعد حدوثه سيحول اللقاح في المقام الأول دون الإصابة بالمرض.\n</div></body></html>");
        jLabel3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel3);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/img1.jpg"))); // NOI18N
        jPanel1.add(jLabel4);

        jScrollPane1.setViewportView(jPanel1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "الجرعة الاولى", "الجرعة الثانية", "الجرعة الثالثة التعزيزية" }));

        jLabel5.setText("اختيار الجرعة");

        javax.swing.GroupLayout jPanelVccMainLayout = new javax.swing.GroupLayout(jPanelVccMain);
        jPanelVccMain.setLayout(jPanelVccMainLayout);
        jPanelVccMainLayout.setHorizontalGroup(
            jPanelVccMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVccMainLayout.createSequentialGroup()
                .addGroup(jPanelVccMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVccMainLayout.createSequentialGroup()
                        .addContainerGap(679, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(jPanelVccMainLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(btnEx1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelVccMainLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanelVccMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVccMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelVccMainLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
            .addGroup(jPanelVccMainLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelVccMainLayout.setVerticalGroup(
            jPanelVccMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVccMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                .addGap(64, 64, 64)
                .addGroup(jPanelVccMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(107, 107, 107)
                .addGroup(jPanelVccMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVccMainLayout.createSequentialGroup()
                        .addComponent(btnEx1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVccMainLayout.createSequentialGroup()
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addGap(21, 21, 21))
        );

        jTabbedPane4.addTab("tab1", jPanelVccMain);

        jPanelVcc1.setBackground(new java.awt.Color(255, 255, 255));
        jPanelVcc1.setLayout(new java.awt.GridLayout(4, 0));

        jPanelStation.setBackground(new java.awt.Color(255, 255, 255));
        jPanelStation.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextFieldStationNum.setEditable(false);
        jTextFieldStationNum.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("رقم المركز");

        jTextFieldAdress.setEditable(false);
        jTextFieldAdress.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("عنوان المركز");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("اسم المركز");

        jLabelMark.setBackground(new java.awt.Color(255, 255, 255));
        jLabelMark.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelMark.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMark.setText("بيانات متلقي اللقاح");
        jLabelMark.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jComboBoxStationVcc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxStationVccItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanelStationLayout = new javax.swing.GroupLayout(jPanelStation);
        jPanelStation.setLayout(jPanelStationLayout);
        jPanelStationLayout.setHorizontalGroup(
            jPanelStationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldStationNum, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jTextFieldAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(jComboBoxStationVcc, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelStationLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMark, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(341, 341, 341))
        );
        jPanelStationLayout.setVerticalGroup(
            jPanelStationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStationLayout.createSequentialGroup()
                .addComponent(jLabelMark, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelStationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelStationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldStationNum, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelStationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxStationVcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jPanelVcc1.add(jPanelStation);

        jPanelPersonalInfo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPersonalInfo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("الاسم الثلاثي");

        jTextFieldReciName.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jTextFieldReciAddress.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("العنوان");

        jTextFieldReciPhone.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldReciPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldReciPhoneActionPerformed(evt);
            }
        });
        jTextFieldReciPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldReciPhoneKeyTyped(evt);
            }
        });

        jLabel11.setText("رقم الهاتف");

        jTextFieldReciNationalty.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("الجنسية");

        jTextFieldNationalIdNumber.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel13.setText("الرقم الوطني");

        jLabel14.setText("الجنس");

        jLabel15.setText("تاريخ الميلاد");

        javax.swing.GroupLayout jPanelPersonalInfoLayout = new javax.swing.GroupLayout(jPanelPersonalInfo);
        jPanelPersonalInfo.setLayout(jPanelPersonalInfoLayout);
        jPanelPersonalInfoLayout.setHorizontalGroup(
            jPanelPersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPersonalInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldReciPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(jPanelPersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDateChooserBirthDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldReciAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(jTextFieldNationalIdNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(jPanelPersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanelPersonalInfoLayout.createSequentialGroup()
                        .addGroup(jPanelPersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanelPersonalInfoLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(93, 93, 93)
                                .addComponent(jTextFieldReciNationalty, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelPersonalInfoLayout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15))
                    .addGroup(jPanelPersonalInfoLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelPersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxSexVcc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldReciName, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(74, 74, 74))
        );
        jPanelPersonalInfoLayout.setVerticalGroup(
            jPanelPersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPersonalInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldReciName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldReciAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldReciPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxSexVcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelPersonalInfoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jDateChooserBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelPersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldReciNationalty, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNationalIdNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        jPanelVcc1.add(jPanelPersonalInfo);

        jPanelVcc.setBackground(new java.awt.Color(255, 255, 255));
        jPanelVcc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jComboBoxVccName.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxVccNameItemStateChanged(evt);
            }
        });
        jComboBoxVccName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxVccNameActionPerformed(evt);
            }
        });

        jLabel16.setText("اسم القاح");

        jLabel17.setText("بلد الصنع");

        jLabel26.setText("رقم التشغيلة");

        jTextFieldVccCountry.setEditable(false);
        jTextFieldVccCountry.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jTextFieldVccRunNumber.setEditable(false);
        jTextFieldVccRunNumber.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jComboBoxPoseNumber.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1" }));

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("الجرعة");

        jLabelVccDate1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel29.setText("تاريخ الاضافة");

        javax.swing.GroupLayout jPanelVccLayout = new javax.swing.GroupLayout(jPanelVcc);
        jPanelVcc.setLayout(jPanelVccLayout);
        jPanelVccLayout.setHorizontalGroup(
            jPanelVccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVccLayout.createSequentialGroup()
                .addGroup(jPanelVccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelVccLayout.createSequentialGroup()
                        .addComponent(jLabelVccDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel29))
                    .addGroup(jPanelVccLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jComboBoxPoseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldVccRunNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jTextFieldVccCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jComboBoxVccName, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanelVccLayout.setVerticalGroup(
            jPanelVccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVccLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanelVccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelVccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel26)
                        .addComponent(jTextFieldVccCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldVccRunNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxPoseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel27))
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxVccName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanelVccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelVccDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addContainerGap())
        );

        jPanelVcc1.add(jPanelVcc);

        jPanelSick.setBackground(new java.awt.Color(255, 255, 255));
        jPanelSick.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jComboBoxSickItems.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        btnAddSick.setText("اضافة");
        btnAddSick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSickActionPerformed(evt);
            }
        });

        jButtonCancel.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCancel.setBorder(null);
        jButtonCancel.setBorderPainted(false);
        jButtonCancel.setFocusable(false);
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jButtonSign.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSign.setBorder(null);
        jButtonSign.setBorderPainted(false);
        jButtonSign.setFocusable(false);
        jButtonSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSignActionPerformed(evt);
            }
        });

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("التالي");

        jLabel20.setText("رجوع");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane4.setViewportView(jTextArea1);

        jLabel28.setText("امراض متلقي اللقاح");

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("الموظف المسؤول عن الاضافة");

        javax.swing.GroupLayout jPanelSickLayout = new javax.swing.GroupLayout(jPanelSick);
        jPanelSick.setLayout(jPanelSickLayout);
        jPanelSickLayout.setHorizontalGroup(
            jPanelSickLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSickLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSickLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSickLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelSickLayout.createSequentialGroup()
                        .addGroup(jPanelSickLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSign, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelSickLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel19)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 229, Short.MAX_VALUE)
                        .addGroup(jPanelSickLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxVccEmp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelSickLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBoxSickItems, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddSick))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        jPanelSickLayout.setVerticalGroup(
            jPanelSickLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSickLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSickLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelSickLayout.createSequentialGroup()
                        .addComponent(jButtonSign, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelSickLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel30)
                        .addGap(14, 14, 14)
                        .addComponent(jComboBoxVccEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelSickLayout.createSequentialGroup()
                        .addGroup(jPanelSickLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(jComboBoxSickItems, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAddSick))
                    .addComponent(jScrollPane4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelVcc1.add(jPanelSick);

        jTabbedPane4.addTab("tab2", jPanelVcc1);

        jPanelVcc2.setLayout(new java.awt.GridLayout(1, 0));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/img1.jpg"))); // NOI18N
        jLabel21.setOpaque(true);
        jPanelVcc2.add(jLabel21);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText(" ادخال الرقم الوطني");

        jTextFieldNationalId.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("الرقم الوطني");

        jButtonVcc2Next.setBackground(new java.awt.Color(255, 255, 255));
        jButtonVcc2Next.setBorder(null);
        jButtonVcc2Next.setBorderPainted(false);
        jButtonVcc2Next.setFocusable(false);
        jButtonVcc2Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVcc2NextActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("التالي");

        jButtonVcc2Cancel.setBackground(new java.awt.Color(255, 255, 255));
        jButtonVcc2Cancel.setBorder(null);
        jButtonVcc2Cancel.setBorderPainted(false);
        jButtonVcc2Cancel.setFocusable(false);
        jButtonVcc2Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVcc2CancelActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("رجوع");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldNationalId, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jButtonVcc2Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jButtonVcc2Next, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNationalId, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 263, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonVcc2Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonVcc2Next, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
        );

        jPanelVcc2.add(jPanel2);

        jTabbedPane4.addTab("tab3", jPanelVcc2);

        jPanelVcc1Check.setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        btnFinish.setBackground(new java.awt.Color(255, 255, 255));
        btnFinish.setBorder(null);
        btnFinish.setBorderPainted(false);
        btnFinish.setFocusable(false);
        btnFinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinishActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(153, 255, 255));
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "تاريخ اضافة الجرعة", "الجرعة", "اسم المركز", "اسم اللقاح", "الجنسية", "الرقم الوطني", "الجنس", "تاريخ الميلاد", "رقم الهاتف", "العنوان", "الاسم"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(jTable1);

        jLabel18.setText("تسجيل");

        jLabel31.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("هل انت متاكد من ان البيانات صحيحة ؟");
        jLabel31.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel18)
                        .addGap(54, 54, 54))))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 287, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFinish, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addGap(33, 33, 33))
        );

        jPanelVcc1Check.add(jPanel6, java.awt.BorderLayout.CENTER);

        jTabbedPane4.addTab("tab4", jPanelVcc1Check);

        jPanelVcc2Add.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        btnAddVcc2.setBackground(new java.awt.Color(255, 255, 255));
        btnAddVcc2.setBorder(null);
        btnAddVcc2.setBorderPainted(false);
        btnAddVcc2.setFocusable(false);
        btnAddVcc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddVcc2ActionPerformed(evt);
            }
        });

        btnVcc2Back.setBackground(new java.awt.Color(255, 255, 255));
        btnVcc2Back.setBorder(null);
        btnVcc2Back.setBorderPainted(false);
        btnVcc2Back.setFocusable(false);
        btnVcc2Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVcc2BackActionPerformed(evt);
            }
        });

        jLabel32.setText("رجوع");

        jLabel33.setText("اضافة");

        jLabel34.setText("اسم متلقي اللقاح");

        jTextFieldVcc2Name.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel36.setText("اسم اللقاح");

        jLabel37.setText("اسم المركز");

        jComboBoxVcc2Name.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxVcc2NameItemStateChanged(evt);
            }
        });

        jLabel38.setText("رقم التشغيلة");

        jLabel39.setText("رقم الجرعة");

        jTextFieldVcc2NmberPose.setEditable(false);
        jTextFieldVcc2NmberPose.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jComboBoxEmpVcc2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        jLabel35.setText("اسم الموظف");

        jLabel41.setText("مضاعفات الجرعة الاولى");

        jTextFieldVccComplication.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel42.setText("الجنس");

        jLabel43.setText("تاريخ الاضافة");

        jLabelVcc2Date.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jTextFieldVcc2Sextual.setEditable(false);
        jTextFieldVcc2Sextual.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jTextFieldVcc2Date.setEditable(false);
        jTextFieldVcc2Date.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jComboBoxVcc2RunNmber.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel32))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(btnVcc2Back, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btnAddVcc2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addGap(74, 74, 74))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabelVcc2Date, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextFieldVcc2Date, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jTextFieldVccComplication, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel43)
                                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jTextFieldVcc2NmberPose, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(jComboBoxVcc2RunNmber, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel38)))
                        .addGap(46, 46, 46))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldVcc2Sextual, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel42)
                        .addGap(75, 75, 75)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jTextFieldVcc2Name, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel34))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxEmpVcc2, 0, 173, Short.MAX_VALUE)
                            .addComponent(jComboBoxVcc2Name, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxVcc2StationName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35))))
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 934, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jTextFieldVcc2Name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42)
                    .addComponent(jTextFieldVcc2Sextual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(jLabel40)
                .addGap(80, 80, 80)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jComboBoxVcc2Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38)
                    .addComponent(jLabel39)
                    .addComponent(jTextFieldVcc2NmberPose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxVcc2RunNmber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jComboBoxVcc2StationName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41)
                    .addComponent(jTextFieldVccComplication, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxEmpVcc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35)
                            .addComponent(jLabel43)
                            .addComponent(jLabelVcc2Date)
                            .addComponent(jTextFieldVcc2Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addComponent(btnAddVcc2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVcc2Back, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33))
                .addGap(20, 20, 20))
        );

        jPanelVcc2Add.add(jPanel4, java.awt.BorderLayout.CENTER);

        jTabbedPane4.addTab("tab5", jPanelVcc2Add);

        jPanel3.add(jTabbedPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 980, 680));

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed

        if (jComboBox1.getSelectedIndex() == 0) {
            jTabbedPane4.setSelectedIndex(1);
        } else if (jComboBox1.getSelectedIndex() == 1) {
            jTabbedPane4.setSelectedIndex(2);
            jTextFieldVcc2NmberPose.setText("2");

        } else if (jComboBox1.getSelectedIndex() == 2) {
            jTabbedPane4.setSelectedIndex(2);
            jTextFieldVcc2NmberPose.setText("");
            jTextFieldVcc2NmberPose.setText("3");
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnEx1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEx1ActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEx1ActionPerformed

    private void jTextFieldReciPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldReciPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldReciPhoneActionPerformed

    private void jComboBoxVccNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxVccNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxVccNameActionPerformed

    private void jButtonVcc2CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVcc2CancelActionPerformed

        jTabbedPane4.setSelectedIndex(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonVcc2CancelActionPerformed

    private void jComboBoxStationVccItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxStationVccItemStateChanged

//        jTextFieldAdress.setText(DataBaseOperations.StationAddressItems(
//                jComboBoxStationVcc.getSelectedItem().toString()));
//        String number = Integer.toString(DataBaseOperations.StationNumberItems(
//                jComboBoxStationVcc.getSelectedItem().toString())
//        );
//        jTextFieldStationNum.setText(number);

        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxStationVccItemStateChanged

    private void jComboBoxVccNameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxVccNameItemStateChanged

//        jTextFieldVccCountry.setText(DataBaseOperations.VccCountryItems(jComboBoxVccName.getSelectedItem().toString()));
//        jTextFieldVccRunNumber.setText(DataBaseOperations.VccRunNumItems(VccDataBase.vccId(jComboBoxVccName.getSelectedItem().toString()))
//        );
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxVccNameItemStateChanged

    private void jTextFieldReciPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldReciPhoneKeyTyped

//        char c =evt.getKeyChar();
//        if(!Character.isDigit(c))
//            evt.consume();
//        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldReciPhoneKeyTyped

    private void btnFinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinishActionPerformed
//               insertData();
//           mainPage.insetTableVccInfo();
//           mainPage.insetTableSick();
//
//               this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFinishActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            jTabbedPane4.setSelectedIndex(1);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSignActionPerformed
        jTabbedPane4.setSelectedIndex(3);
        tablePrint();
        //   msg.setVisible(true);
    }//GEN-LAST:event_jButtonSignActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        jTabbedPane4.setSelectedIndex(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void btnAddSickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSickActionPerformed
        sick.add(jComboBoxSickItems.getSelectedItem().toString());
        System.out.println(sick);

        st = st + sick.get(i);
        jTextArea1.append( sick.get(i)+"\n");
        jTextArea1.setLineWrap(true);
        i++;

        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddSickActionPerformed

    private void jButtonVcc2NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVcc2NextActionPerformed
          
//    String ch1= DataBaseOperations.VccReciIdNational(jTextFieldNationalId.getText());
//    if(ch1.isEmpty()){
//    JOptionPane.showMessageDialog(new JFrame(), "الرقم الوطني غير مسجل في قاعدة البيانات ");
//    }else{
//    jTabbedPane4.setSelectedIndex(4);
//   jTextFieldVcc2Name.setText(DataBaseOperations.getVccNameByIdNational(jTextFieldNationalId.getText().toString()));
//   jTextFieldVcc2Date.setText(EmpData.empDate());
//   comboFilSextualVcc2();
//    }
    
    
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonVcc2NextActionPerformed

    private void btnVcc2BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVcc2BackActionPerformed

            jTabbedPane4.setSelectedIndex(2);
            jTextFieldNationalId.setText("");
            jTextFieldVccComplication.setText("");
            jTextFieldVcc2NmberPose.setText("");
            

        // TODO add your handling code here:
    }//GEN-LAST:event_btnVcc2BackActionPerformed

    private void jComboBoxVcc2NameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxVcc2NameItemStateChanged
//        jComboBoxVcc2RunNmber.removeAllItems();
//
//        comboFilVccRunNum();
//            
// TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxVcc2NameItemStateChanged

    private void btnAddVcc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddVcc2ActionPerformed
//     insertDataVcc2();
     this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddVcc2ActionPerformed

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
            java.util.logging.Logger.getLogger(VccReciAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VccReciAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VccReciAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VccReciAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VccReciAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddSick;
    private javax.swing.JButton btnAddVcc2;
    private javax.swing.JButton btnEx1;
    private javax.swing.JButton btnFinish;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnVcc2Back;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonSign;
    private javax.swing.JButton jButtonVcc2Cancel;
    private javax.swing.JButton jButtonVcc2Next;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBoxEmpVcc2;
    private javax.swing.JComboBox<String> jComboBoxPoseNumber;
    private javax.swing.JComboBox<String> jComboBoxSexVcc;
    private javax.swing.JComboBox<String> jComboBoxSickItems;
    private javax.swing.JComboBox<String> jComboBoxStationVcc;
    private javax.swing.JComboBox<String> jComboBoxVcc2Name;
    private javax.swing.JComboBox<String> jComboBoxVcc2RunNmber;
    private javax.swing.JComboBox<String> jComboBoxVcc2StationName;
    private javax.swing.JComboBox<String> jComboBoxVccEmp;
    private javax.swing.JComboBox<String> jComboBoxVccName;
    private com.toedter.calendar.JDateChooser jDateChooserBirthDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelMark;
    private javax.swing.JLabel jLabelVcc2Date;
    private javax.swing.JLabel jLabelVccDate1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelPersonalInfo;
    private javax.swing.JPanel jPanelSick;
    private javax.swing.JPanel jPanelStation;
    private javax.swing.JPanel jPanelVcc;
    private javax.swing.JPanel jPanelVcc1;
    private javax.swing.JPanel jPanelVcc1Check;
    private javax.swing.JPanel jPanelVcc2;
    private javax.swing.JPanel jPanelVcc2Add;
    public javax.swing.JPanel jPanelVccMain;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldAdress;
    private javax.swing.JTextField jTextFieldNationalId;
    private javax.swing.JTextField jTextFieldNationalIdNumber;
    private javax.swing.JTextField jTextFieldReciAddress;
    private javax.swing.JTextField jTextFieldReciName;
    private javax.swing.JTextField jTextFieldReciNationalty;
    private javax.swing.JTextField jTextFieldReciPhone;
    private javax.swing.JTextField jTextFieldStationNum;
    private javax.swing.JTextField jTextFieldVcc2Date;
    private javax.swing.JTextField jTextFieldVcc2Name;
    private javax.swing.JTextField jTextFieldVcc2NmberPose;
    private javax.swing.JTextField jTextFieldVcc2Sextual;
    private javax.swing.JTextField jTextFieldVccComplication;
    private javax.swing.JTextField jTextFieldVccCountry;
    private javax.swing.JTextField jTextFieldVccRunNumber;
    // End of variables declaration//GEN-END:variables
}
