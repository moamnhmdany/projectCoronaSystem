/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import static DataBase.DataBase.getSqlResults;
import Models.EmployInformation;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import ui.VaccinPage;

/**
 *
 * @author Lenovo
 */
public class EmploeeServices implements EmploeeRepository {

    JComboBox<String> listUi;
    static List<EmployInformation> emploeesData = new ArrayList<>();
    String SqlViewEmployees = SqlQuereyStatments.getSqlViewEmployees();
    String SqlViewEmploye = SqlQuereyStatments.getSqlViewEmployees();
    private String emploeeId;

    public void addEmlpeeesData() {
        ResultSet emploeeDataResult = getEmploeeDataResult(SqlViewEmployees);

        try {
            while (emploeeDataResult.next()) {
                this.createEmploee(emploeeDataResult);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void createEmploee(ResultSet emploeeDataResult) throws SQLException {
        emploeesData.add(makeNewEmploee(emploeeDataResult));

    }

    private static EmployInformation makeNewEmploee(ResultSet emploeeDataResult) throws SQLException {
        return new EmployInformation(getEmploeeName(emploeeDataResult),
                getEmploeeId(emploeeDataResult)
        );
    }

    private static String getEmploeeId(ResultSet emploeeDataResult) throws SQLException {
        return emploeeDataResult.getString("emp_table_id");
    }

    private static String getEmploeeName(ResultSet emploeeDataResult) throws SQLException {
        return emploeeDataResult.getString("emp_name");
    }

    private static ResultSet getEmploeeDataResult(String sql) {
        String sqlViewEmploee = sql;
        ResultSet emploeeDataResult = getSqlResults(sqlViewEmploee);
        return emploeeDataResult;
    }

    void get_Ui_List() {
        listUi = VaccinPage.jComboBoxEmpName;

    }
    
    @Override
    public void view() {
        this.addEmlpeeesData();
        get_Ui_List();
        emploeesData.forEach((ei) -> {
            listUi.addItem(ei.getEmployeeName());
        });
    }

    
    
    @Override
    public String getEmploeeId(String name){
 String sqlEmploee = SqlQuereyStatments.getSqlEmpoeeId(name);
        ResultSet s = DataBase.getSqlResults(sqlEmploee);
        try {
            JOptionPane.showMessageDialog(new JFrame(), s.getRow());
            s.next();
             s.next();
                        JOptionPane.showMessageDialog(new JFrame(), s.getRow());

            emploeeId = s.getString("emp_table_id");
          return  emploeeId ;
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(new JFrame(), "هناك خطا في عملية الاضافةemp_table_id");
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }
        return emploeeId;
}
}
