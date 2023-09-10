package ui;

import DataBase.DataBase;
import DataBase.EmploeeServices;
import DataBase.VaccineServises;
import Models.VaccineInformation;
import Models.VccineStoreInformation;
import java.awt.Image;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import DataBase.VaccineRepository;
import DataBase.EmploeeRepository;

/**
 *
 * @author Lenovo
 */
public class VaccinPage extends javax.swing.JFrame {

    private boolean isInserted;
    private String dateNow;
    VaccineInformation vaccineInformation = new VaccineInformation();
    VccineStoreInformation vccineStoreInformation = new VccineStoreInformation();
    
    EmploeeRepository emploeeService =  new EmploeeServices();
    VaccineRepository vaccineService =  new VaccineServises();
    
    

    public VaccinPage() {
        initComponents();
        changeAllShape();

    }

    void update() {
        emploeeService.view();
        vaccineService.view();
        setDate();
    }

    public void changeShape(JButton buttonObjects, String imagePath) {
        Image img = getImage(imagePath).getImage();
        img = img.getScaledInstance(buttonObjects.getWidth(), buttonObjects.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imgIcon = new ImageIcon(img);
        buttonObjects.setIcon(imgIcon);
    }

    private ImageIcon getImage(String path) {
        ImageIcon icon = new ImageIcon(path);
        return icon;
    }

    private void changeAllShape() {
        //addbutton shape change of main page
        changeShape(btnVccAddStoreAdd, "src/Images/add2.png");

        //Cancelbutton shape change of main page
        changeShape(btnVccAddCancel, "src/Images/back.png");

        //addbutton of make new vccine shape change of main page
        changeShape(btnVccAddNew, "src/Images/add2.png");

        //addbutton of make new vccine shape change of page one
        changeShape(btnNewAdd, "src/Images/add4.png");

        //exit button of make new vccine shape change of page one
        changeShape(btnExi, "src/Images/back3.png");

        //add button of add storage vccine shape change of page two
        changeShape(btnStorAdd, "src/Images/add4.png");

        //cancel button of add storage vccine shape changed of page two
        changeShape(btnStorCancel, "src/Images/back3.png");
    }

    private String getFormatedDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        dateNow = dateFormat.format(date);
        return dateNow;
    }

    private void setDate() {

        jLabelVccDate.setText(getFormatedDate());
    }

    private String getDate() {

        Date date = jDateChooserVccDate.getDate();
        String textDate = DateFormat.getDateInstance().format(date);
        return textDate;
    }

    private void setDataVaccine() {
        vaccineInformation.setVaccineName(jTextFieldVccName.getText());
        vaccineInformation.setVaccineInformationCountry(jTextFieldVccCountry.getText());
        vaccineInformation.setVaccineInformationExpirDate(getDate());
    }

    private void setDataVaccineStore() {
        vccineStoreInformation.setVccineStoreDate(dateNow);
        vccineStoreInformation.setVccineStoreAmount(jTextFieldAmount.getText());
        vccineStoreInformation.setVccineStoreRunNum(jTextFieldVccRunNubmber.getText());
        vccineStoreInformation.setEmploeeId(getSelectedEmploeeId());
        vccineStoreInformation.setVccineStoreId(getSelectedVccineId());

    }

    private String getSelectedName(JComboBox box) {
        String name = box.getSelectedItem().toString();
        return name;
    }

    private String getSelectedEmploeeId() {
        String name = emploeeService.getEmploeeId(jComboBoxEmpName.getSelectedItem().toString());
        return name;
    }

    private String getSelectedVccineId() {
        String name = getSelectedName(jComboBoxVccName);
        return vaccineService.getId(name);
    }

    private void clearData() {
        jTextFieldVccName.setText("");
        jDateChooserVccDate.cleanup();
        jTextFieldVccCountry.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelVccChoose = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelPic = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnVccAddNew = new javax.swing.JButton();
        btnVccAddStoreAdd = new javax.swing.JButton();
        btnVccAddCancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanelVccNew = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnNewAdd = new javax.swing.JButton();
        btnExi = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldVccName = new javax.swing.JTextField();
        jTextFieldVccCountry = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jDateChooserVccDate = new com.toedter.calendar.JDateChooser();
        jPanelVccStore = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jComboBoxVccName = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldAmount = new javax.swing.JTextField();
        jTextFieldVccRunNubmber = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnStorCancel = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        btnStorAdd = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jComboBoxEmpName = new javax.swing.JComboBox<>();
        jLabelVccDate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelVccChoose.setBackground(new java.awt.Color(255, 255, 255));
        jPanelVccChoose.setLayout(new java.awt.GridLayout(3, 0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("اضافة بيانات اللقاح");
        jPanelVccChoose.add(jLabel1);

        jPanelPic.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/img2.png"))); // NOI18N
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanelPicLayout = new javax.swing.GroupLayout(jPanelPic);
        jPanelPic.setLayout(jPanelPicLayout);
        jPanelPicLayout.setHorizontalGroup(
            jPanelPicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPicLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 827, Short.MAX_VALUE)
                .addGap(42, 42, 42))
        );
        jPanelPicLayout.setVerticalGroup(
            jPanelPicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanelVccChoose.add(jPanelPic);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnVccAddNew.setBackground(new java.awt.Color(255, 255, 255));
        btnVccAddNew.setBorder(null);
        btnVccAddNew.setBorderPainted(false);
        btnVccAddNew.setFocusable(false);
        btnVccAddNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVccAddNewActionPerformed(evt);
            }
        });

        btnVccAddStoreAdd.setBackground(new java.awt.Color(255, 255, 255));
        btnVccAddStoreAdd.setBorder(null);
        btnVccAddStoreAdd.setBorderPainted(false);
        btnVccAddStoreAdd.setFocusable(false);
        btnVccAddStoreAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVccAddStoreAddActionPerformed(evt);
            }
        });

        btnVccAddCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVccAddCancelActionPerformed(evt);
            }
        });

        jLabel3.setText("اضافة لقاح جديد");

        jLabel4.setText("اضافة كمية لقاح الى المخزن");

        jLabel5.setText("الغاء");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVccAddCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 436, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnVccAddStoreAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(116, 116, 116)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVccAddNew, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3)))
                .addGap(63, 63, 63))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnVccAddCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(btnVccAddStoreAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel4))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(btnVccAddNew, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel3))))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanelVccChoose.add(jPanel3);

        jTabbedPane1.addTab("tab1", jPanelVccChoose);

        jPanelVccNew.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("اضافة لقاح جديد الى النظام");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnNewAdd.setBackground(new java.awt.Color(255, 255, 255));
        btnNewAdd.setBorder(null);
        btnNewAdd.setBorderPainted(false);
        btnNewAdd.setFocusable(false);
        btnNewAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewAddActionPerformed(evt);
            }
        });

        btnExi.setBackground(new java.awt.Color(255, 255, 255));
        btnExi.setBorder(null);
        btnExi.setBorderPainted(false);
        btnExi.setFocusable(false);
        btnExi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExiActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("اسم اللقاح");

        jTextFieldVccName.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldVccName.setToolTipText("");

        jTextFieldVccCountry.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("بلد الصنع");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("اضافة");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("الغاء");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("تاريخ الصلاحية");

        javax.swing.GroupLayout jPanelVccNewLayout = new javax.swing.GroupLayout(jPanelVccNew);
        jPanelVccNew.setLayout(jPanelVccNewLayout);
        jPanelVccNewLayout.setHorizontalGroup(
            jPanelVccNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVccNewLayout.createSequentialGroup()
                .addGroup(jPanelVccNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVccNewLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanelVccNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnExi, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVccNewLayout.createSequentialGroup()
                        .addGap(0, 133, Short.MAX_VALUE)
                        .addComponent(jDateChooserVccDate, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addGroup(jPanelVccNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelVccNewLayout.createSequentialGroup()
                                .addComponent(jTextFieldVccCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)))
                .addGroup(jPanelVccNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVccNewLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(jPanelVccNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelVccNewLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnNewAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(87, 87, 87))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVccNewLayout.createSequentialGroup()
                        .addComponent(jTextFieldVccName, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        jPanelVccNewLayout.setVerticalGroup(
            jPanelVccNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVccNewLayout.createSequentialGroup()
                .addGroup(jPanelVccNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVccNewLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addGroup(jPanelVccNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooserVccDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanelVccNewLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addGroup(jPanelVccNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldVccName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldVccCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(93, 93, 93)
                .addGroup(jPanelVccNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnNewAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(btnExi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelVccNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        jTabbedPane1.addTab("tab2", jPanelVccNew);

        jPanelVccStore.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("اضافة كمية لقاح الى المخزن");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("اسم اللقاح");

        jComboBoxVccName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxVccNameActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("الكمية");

        jTextFieldAmount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldAmount.setText("0");
        jTextFieldAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAmountActionPerformed(evt);
            }
        });
        jTextFieldAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldAmountKeyTyped(evt);
            }
        });

        jTextFieldVccRunNubmber.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldVccRunNubmber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldVccRunNubmberActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("رقم التشغيلي");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("تاريخ الاضافة");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("اسم الموظف");

        btnStorCancel.setBackground(new java.awt.Color(255, 255, 255));
        btnStorCancel.setBorder(null);
        btnStorCancel.setBorderPainted(false);
        btnStorCancel.setFocusable(false);
        btnStorCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStorCancelActionPerformed(evt);
            }
        });

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("الغاء");

        btnStorAdd.setBackground(new java.awt.Color(255, 255, 255));
        btnStorAdd.setBorder(null);
        btnStorAdd.setBorderPainted(false);
        btnStorAdd.setFocusable(false);
        btnStorAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStorAddActionPerformed(evt);
            }
        });

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("اضافة");

        jComboBoxEmpName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEmpNameActionPerformed(evt);
            }
        });

        jLabelVccDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelVccDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanelVccStoreLayout = new javax.swing.GroupLayout(jPanelVccStore);
        jPanelVccStore.setLayout(jPanelVccStoreLayout);
        jPanelVccStoreLayout.setHorizontalGroup(
            jPanelVccStoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVccStoreLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanelVccStoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnStorCancel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelVccStoreLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanelVccStoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnStorAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelVccStoreLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel19)))
                .addGap(74, 74, 74)
                .addGroup(jPanelVccStoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVccStoreLayout.createSequentialGroup()
                        .addComponent(jTextFieldAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelVccStoreLayout.createSequentialGroup()
                        .addComponent(jTextFieldVccRunNubmber, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(115, 115, 115)
                .addGroup(jPanelVccStoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jComboBoxVccName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxEmpName, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelVccDate, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanelVccStoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
            .addGroup(jPanelVccStoreLayout.createSequentialGroup()
                .addGap(286, 286, 286)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelVccStoreLayout.setVerticalGroup(
            jPanelVccStoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVccStoreLayout.createSequentialGroup()
                .addGroup(jPanelVccStoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVccStoreLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addGroup(jPanelVccStoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxVccName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72)
                        .addGroup(jPanelVccStoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldVccRunNubmber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelVccDate, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanelVccStoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelVccStoreLayout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addGroup(jPanelVccStoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelVccStoreLayout.createSequentialGroup()
                                .addComponent(btnStorCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18))
                            .addGroup(jPanelVccStoreLayout.createSequentialGroup()
                                .addComponent(btnStorAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab3", jPanelVccStore);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -34, -1, 410));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVccAddCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVccAddCancelActionPerformed
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnVccAddCancelActionPerformed

    private void btnVccAddNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVccAddNewActionPerformed

        jTabbedPane1.setSelectedIndex(1);
// TODO add your handling code here:
    }//GEN-LAST:event_btnVccAddNewActionPerformed

    private void btnVccAddStoreAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVccAddStoreAddActionPerformed
        this.update();
        jTabbedPane1.setSelectedIndex(2);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnVccAddStoreAddActionPerformed

    private void btnExiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExiActionPerformed

        jTabbedPane1.setSelectedIndex(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExiActionPerformed

    private void btnStorCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStorCancelActionPerformed

        jTabbedPane1.setSelectedIndex(0);
// TODO add your handling code here:
    }//GEN-LAST:event_btnStorCancelActionPerformed

    private void btnStorAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStorAddActionPerformed

        setDataVaccineStore();
        int rowConter = (int) vaccineService.insertVccineStoreData(vccineStoreInformation);
        isInserted = DataBase.checkIsDataInserterd(rowConter);
        if (isInserted) {
            JOptionPane.showMessageDialog(new JFrame(), "لقد تمت الاضافة بنجاح");
            clearData();
        } else {
            JOptionPane.showMessageDialog(new JFrame(), "هناك خطا في عملية الاضافة");

        }

    }//GEN-LAST:event_btnStorAddActionPerformed

    private void btnNewAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewAddActionPerformed

        setDataVaccine();
        int rowConter = vaccineService.insertNewVccine(vaccineInformation);
        isInserted = DataBase.checkIsDataInserterd(rowConter);
        if (isInserted) {
            JOptionPane.showMessageDialog(new JFrame(), "لقد تمت الاضافة بنجاح");
            clearData();
        } else {
            JOptionPane.showMessageDialog(new JFrame(), "هناك خطا في عملية الاضافة");

        }
    }//GEN-LAST:event_btnNewAddActionPerformed

    private void jTextFieldAmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAmountKeyTyped

        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAmountKeyTyped

    private void jComboBoxVccNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxVccNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxVccNameActionPerformed

    private void jTextFieldVccRunNubmberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldVccRunNubmberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldVccRunNubmberActionPerformed

    private void jTextFieldAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAmountActionPerformed

    private void jComboBoxEmpNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEmpNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEmpNameActionPerformed

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
            java.util.logging.Logger.getLogger(VaccinPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VaccinPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VaccinPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VaccinPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VaccinPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExi;
    private javax.swing.JButton btnNewAdd;
    private javax.swing.JButton btnStorAdd;
    private javax.swing.JButton btnStorCancel;
    private javax.swing.JButton btnVccAddCancel;
    private javax.swing.JButton btnVccAddNew;
    private javax.swing.JButton btnVccAddStoreAdd;
    public static javax.swing.JComboBox<String> jComboBoxEmpName;
    public static javax.swing.JComboBox<String> jComboBoxVccName;
    private com.toedter.calendar.JDateChooser jDateChooserVccDate;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelVccDate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelPic;
    private javax.swing.JPanel jPanelVccChoose;
    private javax.swing.JPanel jPanelVccNew;
    private javax.swing.JPanel jPanelVccStore;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextFieldAmount;
    private javax.swing.JTextField jTextFieldVccCountry;
    private javax.swing.JTextField jTextFieldVccName;
    private javax.swing.JTextField jTextFieldVccRunNubmber;
    // End of variables declaration//GEN-END:variables
}
