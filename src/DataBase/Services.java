/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import Models.EmploeeWorksDetails;
import Models.EmployInformation;
import Models.UserInoformation;
import Models.StationInformations;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Services implements Repository {

    private static int rowCounter;
    private EmployInformation ei;
    private String id;

    public static boolean isUserVaild(UserInoformation userInformation) {

        try {
            DataBase.openConnection();
            String sql = SqlQuereyStatments.getSqlLoginCheck(userInformation);
            ResultSet sqlUserInformationResults = DataBase.getSqlResults(sql);

            if (sqlUserInformationResults.next()) {
                DataBase.closeConnection();
                return true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(new JFrame(), "هذا الحساب غير موجود في قاعدة البيانات ");

        }
        return false;
    }

    @Override
    public int insertEmpAccountData(EmployInformation employInformation) {
        String sqlEmp = SqlQuereyStatments.getSqlEmployeeInformation(employInformation);
        rowCounter = DataBase.executeSqlQuerey(sqlEmp);
        return rowCounter;
    }

    @Override
    public int insertEmploeeWorksDetails(EmploeeWorksDetails emploeeWorkDetails) {

        String sqlEmpWorkDetails = SqlQuereyStatments.getSqlEmoloeeWorkDetails(emploeeWorkDetails);
        rowCounter = DataBase.executeSqlQuerey(sqlEmpWorkDetails);
        return rowCounter;
    }

    public static int insertStationInformations(StationInformations stationInformations) {

        String sqlStation = SqlQuereyStatments.getSqlStationInformation(stationInformations);
        rowCounter = DataBase.executeSqlQuerey(sqlStation);
        return rowCounter;
    }

    public static int insertSick(String SickName) {

        String sqlSicks = SqlQuereyStatments.getSqlSickData(SickName);
        rowCounter = DataBase.executeSqlQuerey(sqlSicks);
        return rowCounter;
    }

    @Override
    public JComboBox viewGender(JComboBox jComboGender) {

        String sqlGender = SqlQuereyStatments.getSqlGender();
        ResultSet s = DataBase.getSqlResults(sqlGender);
        try {
            while (s.next()) {
                jComboGender.addItem(s.getString("sextual_table_sexual"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }

        return jComboGender;
    }

    @Override
    public JComboBox viewHealthCenter(JComboBox jComboHealth) {

        String sqlHealth = SqlQuereyStatments.getSqlHealthCenter();
        ResultSet s = DataBase.getSqlResults(sqlHealth);
        try {
            while (s.next()) {
                jComboHealth.addItem(s.getString("health_center_name"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }

        return jComboHealth;
    }

    @Override
    public String getGenderId(String name) {
        String sqlGender = SqlQuereyStatments.getSqlGenderId(name);
        ResultSet s = DataBase.getSqlResults(sqlGender);
        try {
            s.next();
            id = s.getString("sextual_table_id");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(new JFrame(), "هناك خطا في عمليةsextual_table_id الاضافة");

            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);

        }
        return id;
    }

    @Override
    public String getHelthId(String name) {
        String sqlHealth = SqlQuereyStatments.getSqlHealthId(name);
        ResultSet s = DataBase.getSqlResults(sqlHealth);
        try {
            s.next();
            id = s.getString("health_center_id");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(new JFrame(), "هناك خطا في عمليةhealth_center_id الاضافة");
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

}
