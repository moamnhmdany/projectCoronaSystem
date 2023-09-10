/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import static DataBase.DataBase.getSqlResults;
import Models.VaccineInformation;
import Models.VccineStoreInformation;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import ui.VaccinPage;

/**
 *
 * @author Lenovo
 */
public class VaccineServises implements VaccineRepository{
     private String  vaccinId;
    private  int rowCounter;
    static List<VaccineInformation> VaccineData = new ArrayList<>();
    
     public  int insertNewVccine(VaccineInformation vaccineInformation) {

        String sqlVaccine = SqlQuereyStatments.getSqlVaccineData(vaccineInformation);
        rowCounter = DataBase.executeSqlQuerey(sqlVaccine);
        return rowCounter;
    }

    
     @Override
     public  Integer insertVccineStoreData(Object all) {
      VccineStoreInformation  information = (VccineStoreInformation)all ;
        String sqlVaccineStore = SqlQuereyStatments.getSqlVaccineStoreInformation(information);
        rowCounter = DataBase.executeSqlQuerey(sqlVaccineStore);
        return rowCounter;
    }

    JComboBox<String> listUi;

    public void addVaccineStoresData() {
        ResultSet VaccineStoreDataResult = getVaccineDataBase();

        try {
            while (VaccineStoreDataResult.next()) {
                this.createVaccine(VaccineStoreDataResult);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void createVaccine(ResultSet VaccineDataResult) throws SQLException {
        VaccineData.add(makeNewVaccine(VaccineDataResult));

    }

    private static VaccineInformation makeNewVaccine(ResultSet VaccineDataResult) throws SQLException {
        return new VaccineInformation(getVaccineId(VaccineDataResult),
                getVaccineName(VaccineDataResult)
        );
    }

    private static String getVaccineId(ResultSet VaccineDataResult) throws SQLException {
        return VaccineDataResult.getString("vaccine_id");
    }

    private static String getVaccineName(ResultSet VaccineDataResult) throws SQLException {
        return VaccineDataResult.getString("vaccine_name");
    }

    private static ResultSet getVaccineDataBase() {
        String sqlViewVaccine = SqlQuereyStatments.getSqlViewVaccine();
        ResultSet VaccineDataResult = getSqlResults(sqlViewVaccine);
        return VaccineDataResult;
    }

    void get_Ui_List() {
        listUi = VaccinPage.jComboBoxVccName;

    }
    
    public void view() {
        VaccineData = new ArrayList<>();
        this.addVaccineStoresData();
        get_Ui_List();
        VaccineData.forEach((ei) -> {
            listUi.addItem(ei.getVaccineName());
        });
    }

    
     public String getId(String name) {

        for (VaccineInformation vaccin : VaccineData) {
            String vaccinName = vaccin.getVaccineName();
            vaccinId = vaccin.getVaccineId();
            if (vaccinName == name) {
                return vaccinId;
            }
        }
        return vaccinId;
    }

}
