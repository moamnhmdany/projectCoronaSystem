///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package DataBase;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.swing.JFrame;
//import javax.swing.JOptionPane;
//
///**
// *
// * @author Lenovo
// */
//public class ReportDataBase {
//    public static int getAllVccNumber() {
//        try {
//            DataBaseOperations.openConn();
//            String sqlView = "SELECT COUNT(*) FROM vaccine_recipient ";
//
//            DataBaseOperations.stmt = conn.createStatement();
//            ResultSet check = stmt.executeQuery(sqlView);
//            check.beforeFirst();
//            
//            while (check.next()) {
//
//                int allCount = check.getInt("COUNT(*)");
//                
// 
//                    return allCount;
//
//                
//            }
//
//        } catch (SQLException ex) {
//            Logger.getLogger(DataBaseOperations.class.getName()).log(Level.SEVERE, null, ex);
//            JOptionPane.showMessageDialog(new JFrame(), " هناك خطأ في العرض");
//        }
//
//        return 0;
//    }
//    
//}
