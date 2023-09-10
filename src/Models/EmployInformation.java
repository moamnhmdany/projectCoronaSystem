package Models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class EmployInformation {
    
    private  String employeeId;
    private  String employeeName;
    private static String employeePassword;
    private static String employeeSpecialty;
    private static String employeeCenterId;
    private static String employeeGenderId;
    private List<EmployInformation> emploeeData = new ArrayList<>();

    public List<EmployInformation> getEmploeeData() {
        return emploeeData;
    }
   
    public void setEmploeeData(List<EmployInformation> emploeeData) {
        this.emploeeData = emploeeData;
    }

    public EmployInformation() {

    }

    public EmployInformation(String emploeeName, String emploeeId) {
        this.employeeName = emploeeName;
        this.employeeId = emploeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeePassword() {
        return employeePassword;
    }

    public void setEmployeePassword(String employeePassword) {
        EmployInformation.employeePassword = employeePassword;
    }

    public String getEmployeeSpecialty() {
        return employeeSpecialty;
    }

    public void setEmployeeSpecialty(String employeeSpecialty) {
        EmployInformation.employeeSpecialty = employeeSpecialty;
    }

    public String getEmployeeCenterId() {
        return employeeCenterId;
    }

    public void setEmployeeCenterId(String employeeCenterId) {
        EmployInformation.employeeCenterId = employeeCenterId;
    }

    public String getEmployeeGenderId() {
        return employeeGenderId;
    }

    public void setEmployeeGenderId(String employeeGenderId) {
        EmployInformation.employeeGenderId = employeeGenderId;
    }

}
