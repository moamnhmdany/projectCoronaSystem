
package DataBase;

import Models.EmploeeWorksDetails;
import Models.EmployInformation;
import Models.UserInoformation;
import Models.VccineStoreInformation;
import Models.StationInformations;
import Models.VaccineInformation;


/**
 *
 * @author Lenovo
 */
public class SqlQuereyStatments {

    private static String sqlLoginCheck;
    private static String sqlEmployeeInformation ;


    public static String getSqlLoginCheck(UserInoformation userInformation) {
        sqlLoginCheck = "SELECT * FROM emp_table WHERE emp_name='"
                + userInformation.getUserNameAccount() + "'" + " AND emp_password='"
                + userInformation.getUserPasswordAccount() + "'";
        
        return sqlLoginCheck;
    }
public static String getSqlEmployeeInformation(EmployInformation employeeInformation){
  
     sqlEmployeeInformation = "INSERT INTO emp_table (emp_name ,emp_password,Employee_specialty,health_center_id,sexual_table_id )"
                    + "  VALUES('"
                    + employeeInformation.getEmployeeName()
                    + "','"
                    + employeeInformation.getEmployeePassword()
                    + "','"
                    + employeeInformation.getEmployeeSpecialty()
                    + "','"
                    + employeeInformation.getEmployeeCenterId()
                    + "','"
                    + employeeInformation.getEmployeeGenderId()
                    + "');";
     return sqlEmployeeInformation ;
} 

public static  String getSqlEmoloeeWorkDetails(EmploeeWorksDetails details){
String sqlEmpWorkDetils = "INSERT INTO wrok (wrok_date ,health_center_id ,emp_table_id)"
                    + "  VALUES('"
                    + details.getEmploeeDateWork()
                    + "','"
                    + details.getEmploeeCenterId()
                    + "','"
                    + details.getEmploeeId()
                    + "');";
return sqlEmpWorkDetils ;
}

public static String getSqlVaccineData(VaccineInformation information){

     String sqlVaccineData = "INSERT INTO vaccine (vaccine_name ,vaccine_expir_date,vaccine_country)"
                    + "  VALUES('"
                    + information.getVaccineName()
                    + "','"
                    + information.getVaccineInformationExpirDate()
                    + "','"
                    + information.getVaccineInformationCountry()
                    + "');";
    return sqlVaccineData ;
    
}
    public static String getSqlVaccineStoreInformation(VccineStoreInformation information) {
     String sqlvccAdd = "INSERT INTO vaccine_add (vaccine_add_date_add ,vaccine_add_amount,vaccine_table_run_num ,emp_table_id ,vaccine_id )"
                    + "  VALUES('"
                    + information.getVccineStoreDate()
                    + "','"
                    + information.getVccineStoreAmount()
                    + "','"
                    + information.getVccineStoreRunNum()
                    + "','"
                    + information.getEmploeeId()
                    + "','"
                    + information.getVccineStoreId()
                    + "');";
     return sqlvccAdd ;
    }
    
    public static String getSqlStationInformation(StationInformations information) {
     String sqlStation = "INSERT INTO health_center (health_center_name ,health_center_num,health_center_address )"
                    + "  VALUES('"
                    + information.getStationInformationName()
                    + "','"
                    + information.getStationInformationNumber()
                    + "','"
                    + information.getStationInformationAddress()
                    + "');";
     return sqlStation ;
    }
public static String getSqlSickData(String sickName) {
     String sqlSickName = "INSERT INTO diseases_table (diseases_table_name )"
                    + "  VALUES('"
                    + sickName
                    + "');";
     return sqlSickName ;
    }
 

public static String getSqlViewEmployees() {
     String sqlViewEmployees = "SELECT * FROM emp_table" ;
                    
     return sqlViewEmployees ;
    }
public static String getSqlViewVaccine() {
     String sqlViewEmployees = "SELECT * FROM vaccine" ;
                    
     return sqlViewEmployees ;
    }
public static String getSqlEmpoeeId(String name) {
     String sqlViewEmployees = "SELECT emp_table_id FROM"
             + " `emp_table` WHERE emp_name = '"+name+"'  " ;       
     return sqlViewEmployees ;
    }

public static String getSqlGender() {
     String sqlViewGender = "SELECT * FROM `sextual_table` " ;
                   
     return sqlViewGender ;
    }
public static String getSqlHealthCenter() {
     String sqlViewHealth = "SELECT * FROM `health_center` " ;
                   
     return sqlViewHealth ;
    }

public static String getSqlGenderId(String name) {
     String sqlGenderId = "SELECT sextual_table_id FROM"
             + " `sextual_table` WHERE sextual_table_sexual = '"+name+"'  " ;       
     return sqlGenderId ;
    }
public static String getSqlHealthId(String name) {
     String sqlHealthId = "SELECT health_center_id FROM health_center WHERE"
             + " health_center_name ="
             + " '"
             + name
             + "';" ;   
     
     return sqlHealthId ;
    }



}
