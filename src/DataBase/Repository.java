/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import Models.EmploeeWorksDetails;
import Models.EmployInformation;
import javax.swing.JComboBox;

/**
 *
 * @author Lenovo
 */
public interface Repository {
    JComboBox viewGender(JComboBox jComboGender);
    JComboBox viewHealthCenter(JComboBox jComboHealth);
    String getGenderId(String name);
    String getHelthId(String name);
     int insertEmpAccountData(EmployInformation employInformation) ;
     int insertEmploeeWorksDetails(EmploeeWorksDetails emploeeWorkDetails);
}
