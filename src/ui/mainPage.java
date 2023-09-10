/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;


import java.awt.Button;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import DataBase.Services;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class mainPage extends javax.swing.JFrame {

    public Services db = new Services();
    public VccReciAdd vccadd = new VccReciAdd();
    public VaccinPage vccadd1 = new VaccinPage();
    public EmployAddPage emp = new EmployAddPage();
    public StationAdd stadd = new StationAdd();
    public SickAdd sick = new SickAdd();
    public Information info = new Information();
    public ReportSyetem r = new ReportSyetem();
    public ProjectCorona log = new ProjectCorona();
    public Vector Nu = new Vector();
    static int k = 9;
    static int k2 = 5;
    static int k3 = 3;
    static int k4 = 2;

    public static DefaultTableModel m;
    public static DefaultTableModel em;
    public static DefaultTableModel st;
    public static DefaultTableModel sick1;

    /**
     * Creates new form mainPage
     */
    public mainPage() {
        initComponents();
        imageAddvcc();
        imageAdd();
        imageAddEmp();
        imageAddCen();
        imageAddSick();
        imageAddLabel7();
        imageDel();
        imageEdit();
        imageSt();
        imageInfo();
        imageEx();
//        insetTableVccInfo();
//        insetTableEmp();
//       insetTableStation();
//        insetTableSick();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        jTableVccRecipInfo.setDefaultEditor(Object.class, null);
                 jTableEmp.setDefaultEditor(Object.class, null);
             jTableStation.setDefaultEditor(Object.class, null);
                jTableSick.setDefaultEditor(Object.class, null);
                getIdSelectRow();

    }
//    Object[] os = new Object[DataBaseOperations.ViewRecpCount()];
    


   void getIdSelectRow(){
       jTableVccRecipInfo.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
        public void valueChanged(ListSelectionEvent event) {
             int c= jTableVccRecipInfo.getSelectedColumn();
   int r= jTableVccRecipInfo.getSelectedRow();
 String v = jTableVccRecipInfo.getModel().getValueAt(r, 9).toString();
       System.out.println(v);
        }
    });
 
   }
    
//    public static void insetTableVccInfo() {
//
//        ArrayList<ArrayList> all = new ArrayList<ArrayList>();
//        all = DataBaseOperations.ViewRecpInfo();
//        for (int i = 0; i < all.size(); i++) {
//            for (int j = 0; j < all.get(i).size(); j++) {
//                mainPage.m = (DefaultTableModel) jTableVccRecipInfo.getModel();
//                m.setRowCount(DataBaseOperations.ViewRecpCount());
//
//                m.setValueAt(all.get(i).get(j), j, k);
//
//            }
//            k--;
//
//        }
//jTableVccRecipInfo.getColumnModel().getColumn(9).setPreferredWidth(33);
//jTableVccRecipInfo.getColumnModel().getColumn(9).setMaxWidth(33);
//jTableVccRecipInfo.getColumnModel().getColumn(1).setPreferredWidth(33);
//jTableVccRecipInfo.getColumnModel().getColumn(1).setMaxWidth(33);
//
//        DefaultTableCellRenderer stringRenderer = (DefaultTableCellRenderer) jTableVccRecipInfo.getDefaultRenderer(String.class);
//        stringRenderer.setHorizontalAlignment(SwingConstants.CENTER);
//        all.clear();
//        k = 9;
//    }

//    static public void insetTableEmp() {
//
//        ArrayList<ArrayList> all2 = new ArrayList<ArrayList>();
//        all2 = DataBaseOperations.ViewEmp();
//        for (int i = 0; i < all2.size(); i++) {
//            for (int j = 0; j < all2.get(i).size(); j++) {
//
//                mainPage.em = (DefaultTableModel) jTableEmp.getModel();
//                em.setRowCount(DataBaseOperations.getEmpCount());
//
//                em.setValueAt(all2.get(i).get(j), j, k2);
//
//            }
//            k2--;
//
//        }
//        jTableEmp.getColumnModel().getColumn(5).setPreferredWidth(33);
//        jTableEmp.getColumnModel().getColumn(5).setMaxWidth(33);
//        
//        DefaultTableCellRenderer stringRenderer = (DefaultTableCellRenderer) jTableEmp.getDefaultRenderer(String.class);
//        stringRenderer.setHorizontalAlignment(SwingConstants.CENTER);
//        all2.clear();
//        k2 = 5;
//    }

//    static public void insetTableStation() {
//
//        ArrayList<ArrayList> all = new ArrayList<ArrayList>();
//        all = DataBaseOperations.ViewStation();
//        for (int i = 0; i < all.size(); i++) {
//            for (int j = 0; j < all.get(i).size(); j++) {
//
//                mainPage.st = (DefaultTableModel) jTableStation.getModel();
//                st.setRowCount(DataBaseOperations.getStationRowCount());
//
//                st.setValueAt(all.get(i).get(j), j, k3);
//
//            }
//            k3--;
//        }
//        
//        jTableStation.getColumnModel().getColumn(3).setPreferredWidth(33);
//        jTableStation.getColumnModel().getColumn(3).setMaxWidth(33);
//        
//        DefaultTableCellRenderer stringRenderer = (DefaultTableCellRenderer) jTableStation.getDefaultRenderer(String.class);
//        stringRenderer.setHorizontalAlignment(SwingConstants.CENTER);
//        all.clear();
//        k3 = 3;
//    }

//    static public void insetTableSick() {
//
//        ArrayList<ArrayList> all = new ArrayList<ArrayList>();
//        all = DataBaseOperations.ViewSick();
//        for (int i = 0; i < all.size(); i++) {
//            for (int j = 0; j < all.get(i).size(); j++) {
//
//                mainPage.sick1 = (DefaultTableModel) jTableSick.getModel();
//                sick1.setRowCount(DataBaseOperations.getSickRowCount());
//
//                sick1.setValueAt(all.get(i).get(j), j, k4);
//
//            }
//            k4--;
//        }
//        jTableSick.getColumnModel().getColumn(2).setPreferredWidth(33);
//        jTableSick.getColumnModel().getColumn(2).setMaxWidth(33);
//        DefaultTableCellRenderer stringRenderer = (DefaultTableCellRenderer) jTableSick.getDefaultRenderer(String.class);
//        stringRenderer.setHorizontalAlignment(SwingConstants.CENTER);
//        all.clear();
//        k4 = 2;
//    }

    public void imageAdd() {
        ImageIcon icon = new ImageIcon("src/Images/add1.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(this.btnAddRce.getWidth(), this.btnAddRce.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imgIcon = new ImageIcon(imgScale);
        this.btnAddRce.setIcon(imgIcon);

    }

    public void imageAddvcc() {
        ImageIcon icon = new ImageIcon("src/Images/addvcc.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(this.btnVccAdd.getWidth(), this.btnVccAdd.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imgIcon = new ImageIcon(imgScale);
        this.btnVccAdd.setIcon(imgIcon);

    }

    public void imageAddEmp() {
        ImageIcon icon = new ImageIcon("src/Images/addemp.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(this.empAdd.getWidth(), this.empAdd.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imgIcon = new ImageIcon(imgScale);
        this.empAdd.setIcon(imgIcon);

    }

    public void imageAddCen() {
        ImageIcon icon = new ImageIcon("src/Images/addce.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(this.jButton4.getWidth(), this.jButton4.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imgIcon = new ImageIcon(imgScale);
        this.jButton4.setIcon(imgIcon);

    }

    public void imageAddSick() {
        ImageIcon icon = new ImageIcon("src/Images/addsick.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(this.btnSick.getWidth(), this.btnSick.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imgIcon = new ImageIcon(imgScale);
        this.btnSick.setIcon(imgIcon);

    }

    public void imageAddLabel7() {
        ImageIcon icon = new ImageIcon("src/Images/image2.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(this.jLabel7.getWidth(), this.jLabel7.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imgIcon = new ImageIcon(imgScale);
        this.jLabel7.setIcon(imgIcon);
        SwingUtilities.updateComponentTreeUI(this);

    }

    public void imageEdit() {
        ImageIcon icon = new ImageIcon("src/Images/edit3.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(this.jButton7.getWidth(), this.jButton7.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imgIcon = new ImageIcon(imgScale);
        this.jButton7.setIcon(imgIcon);
        SwingUtilities.updateComponentTreeUI(this);

    }

    public void imageDel() {
        ImageIcon icon = new ImageIcon("src/Images/del1.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(this.jButton8.getWidth(), this.jButton8.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imgIcon = new ImageIcon(imgScale);
        this.jButton8.setIcon(imgIcon);
        SwingUtilities.updateComponentTreeUI(this);

    }

    public void imageSt() {
        ImageIcon icon = new ImageIcon("src/Images/st1.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(this.btnReport.getWidth(), this.btnReport.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imgIcon = new ImageIcon(imgScale);
        this.btnReport.setIcon(imgIcon);
        SwingUtilities.updateComponentTreeUI(this);

    }

    public void imageInfo() {
        ImageIcon icon = new ImageIcon("src/Images/info.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(this.btnInfo.getWidth(), this.btnInfo.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imgIcon = new ImageIcon(imgScale);
        this.btnInfo.setIcon(imgIcon);
        SwingUtilities.updateComponentTreeUI(this);

    }

    public void imageEx() {
        ImageIcon icon = new ImageIcon("src/Images/ex.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(this.btnExit.getWidth(), this.btnExit.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imgIcon = new ImageIcon(imgScale);
        this.btnExit.setIcon(imgIcon);
        SwingUtilities.updateComponentTreeUI(this);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMain = new javax.swing.JPanel();
        jPanelBtn = new javax.swing.JPanel();
        btnAddRce = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnVccAdd = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        empAdd = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnSick = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnReport = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnInfo = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelViewVcc = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVccRecipInfo = new javax.swing.JTable();
        jPanelViewEmp = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableEmp = new javax.swing.JTable();
        jPanelViewStation = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableStation = new javax.swing.JTable();
        jPanelViewSick = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableSick = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelMain.setBackground(new java.awt.Color(255, 255, 255));

        jPanelBtn.setBackground(new java.awt.Color(199, 249, 204));
        jPanelBtn.setMaximumSize(new java.awt.Dimension(454, 32767));

        btnAddRce.setBackground(new java.awt.Color(199, 249, 204));
        btnAddRce.setBorderPainted(false);
        btnAddRce.setFocusable(false);
        btnAddRce.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Male-user-add-icon.png"))); // NOI18N
        btnAddRce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRceActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("اضافة متلقي اللقاح");

        btnVccAdd.setBackground(new java.awt.Color(199, 249, 204));
        btnVccAdd.setBorderPainted(false);
        btnVccAdd.setFocusable(false);
        btnVccAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVccAddActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("اضافة لقاح");

        empAdd.setBackground(new java.awt.Color(199, 249, 204));
        empAdd.setBorderPainted(false);
        empAdd.setFocusable(false);
        empAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empAddActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("اضافة موظف ");

        jButton4.setBackground(new java.awt.Color(199, 249, 204));
        jButton4.setBorderPainted(false);
        jButton4.setFocusable(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("اضافة مركز");

        btnSick.setBackground(new java.awt.Color(199, 249, 204));
        btnSick.setBorderPainted(false);
        btnSick.setFocusable(false);
        btnSick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSickActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("اضافة مرض متلقي اللقاح");

        jPanel1.setBackground(new java.awt.Color(199, 249, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 65, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 204));
        jLabel6.setText("منظومة لقاحات كورونا");

        javax.swing.GroupLayout jPanelBtnLayout = new javax.swing.GroupLayout(jPanelBtn);
        jPanelBtn.setLayout(jPanelBtnLayout);
        jPanelBtnLayout.setHorizontalGroup(
            jPanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelBtnLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelBtnLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(71, 71, 71)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBtnLayout.createSequentialGroup()
                        .addComponent(btnSick, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55)
                .addGroup(jPanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(empAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addGroup(jPanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(btnVccAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(87, 87, 87)
                .addGroup(jPanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddRce, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(42, 42, 42))
        );
        jPanelBtnLayout.setVerticalGroup(
            jPanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBtnLayout.createSequentialGroup()
                .addGroup(jPanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBtnLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnAddRce, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBtnLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVccAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(205, 205, 205))
            .addGroup(jPanelBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBtnLayout.createSequentialGroup()
                        .addComponent(empAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBtnLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelBtnLayout.createSequentialGroup()
                            .addComponent(btnSick, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelBtnLayout.createSequentialGroup()
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(199, 249, 204));

        jPanel2.setBackground(new java.awt.Color(128, 237, 153));

        jButton6.setText("بحث");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(128, 237, 153));
        jButton7.setBorderPainted(false);
        jButton7.setFocusable(false);
        jButton7.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Male-user-add-icon.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("تعديل");

        jButton8.setBackground(new java.awt.Color(128, 237, 153));
        jButton8.setBorderPainted(false);
        jButton8.setFocusable(false);
        jButton8.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Male-user-add-icon.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("حذف");

        btnReport.setBackground(new java.awt.Color(128, 237, 153));
        btnReport.setBorderPainted(false);
        btnReport.setFocusable(false);
        btnReport.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Male-user-add-icon.png"))); // NOI18N
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("احصائيات");

        btnInfo.setBackground(new java.awt.Color(128, 237, 153));
        btnInfo.setBorderPainted(false);
        btnInfo.setFocusable(false);
        btnInfo.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Male-user-add-icon.png"))); // NOI18N
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("معلومات عامة");

        btnExit.setBackground(new java.awt.Color(128, 237, 153));
        btnExit.setBorderPainted(false);
        btnExit.setFocusable(false);
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("خروج");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton6)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addGap(18, 18, 18)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.RIGHT);
        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        jTableVccRecipInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "اسم المركز", "الجرعة", "اسم اللقاح", "الجنس", "رقم الهاتف", "الرقم الوطني", "تاريخ الميلاد", "العنوان", "الاسم", "ت"
            }
        ));
        jTableVccRecipInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableVccRecipInfoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableVccRecipInfo);

        javax.swing.GroupLayout jPanelViewVccLayout = new javax.swing.GroupLayout(jPanelViewVcc);
        jPanelViewVcc.setLayout(jPanelViewVccLayout);
        jPanelViewVccLayout.setHorizontalGroup(
            jPanelViewVccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1248, Short.MAX_VALUE)
        );
        jPanelViewVccLayout.setVerticalGroup(
            jPanelViewVccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("متلقي اللقاح", jPanelViewVcc);

        jPanelViewEmp.setLayout(new java.awt.BorderLayout());

        jTableEmp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "اسم المركز", "الجنس", "التخصص", "الرمز", "الاسم", "ت"
            }
        ));
        jTableEmp.setGridColor(new java.awt.Color(102, 102, 102));
        jScrollPane2.setViewportView(jTableEmp);
        if (jTableEmp.getColumnModel().getColumnCount() > 0) {
            jTableEmp.getColumnModel().getColumn(1).setHeaderValue("الجنس");
        }

        jPanelViewEmp.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("الموظفين", jPanelViewEmp);

        jPanelViewStation.setLayout(new java.awt.BorderLayout());

        jTableStation.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTableStation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "العنوان", "رقم المركز", "اسم المركز", "ت"
            }
        ));
        jScrollPane3.setViewportView(jTableStation);

        jPanelViewStation.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("المراكز", jPanelViewStation);

        jPanelViewSick.setLayout(new java.awt.BorderLayout());

        jTableSick.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "الامراض الخاصة ب متلقي اللقاح", "اسم المريض", "ت"
            }
        ));
        jScrollPane4.setViewportView(jTableSick);

        jPanelViewSick.add(jScrollPane4, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("الامراض", jPanelViewSick);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane1)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addComponent(jPanelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelMain, java.awt.BorderLayout.CENTER);

        jMenuBar1.setBackground(new java.awt.Color(73, 223, 223));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(101, 30));

        jMenu2.setText("القائمة الرئيسية                                                                                                                                                                                                                                                ");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSickActionPerformed
        sick.setVisible(true);

// TODO add your handling code here:
    }//GEN-LAST:event_btnSickActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        stadd.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void empAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empAddActionPerformed
//        boolean ch3 = LoginPage.isPress();
//
//        emp.comboFilSextual2();
//        emp.comboFilStation2();
//
           emp.setVisible(true);
//        // TODO add your handling code here:
    }//GEN-LAST:event_empAddActionPerformed

    private void btnVccAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVccAddActionPerformed

        vccadd1.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVccAddActionPerformed

    private void btnAddRceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRceActionPerformed

        vccadd.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddRceActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
        r.setVisible(true);

//        r.countAll.setText(Integer.toString(ReportDataBase.getAllVccNumber()));

    }//GEN-LAST:event_btnReportActionPerformed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed

        info.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnInfoActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitMouseClicked

    private void jTableVccRecipInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVccRecipInfoMouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_jTableVccRecipInfoMouseClicked

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged

        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1StateChanged

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
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainPage().setVisible(true);
                Button b1 = new Button();
                new mainPage().add(b1);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddRce;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnSick;
    private javax.swing.JButton btnVccAdd;
    public javax.swing.JButton empAdd;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelBtn;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelViewEmp;
    private javax.swing.JPanel jPanelViewSick;
    private javax.swing.JPanel jPanelViewStation;
    private javax.swing.JPanel jPanelViewVcc;
    public javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private static javax.swing.JTable jTableEmp;
    private static javax.swing.JTable jTableSick;
    private static javax.swing.JTable jTableStation;
    public static javax.swing.JTable jTableVccRecipInfo;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
