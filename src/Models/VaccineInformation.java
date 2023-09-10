/*
 * To change this license header; choose License Headers in Project Properties.
 * To change this template file; choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Lenovo
 */
public class VaccineInformation {

    private String vaccineId;

    private String vaccineName;
    private String vaccineExpirDate;
    private String vaccineCountry;
    
public VaccineInformation(){} ;

    
    public VaccineInformation(String vaccineId, String vaccineName) {
        this.vaccineId = vaccineId;
        this.vaccineName = vaccineName;
    }

    
   
    public String getVaccineId() {
        return vaccineId;
    }

    public void setVaccineId(String vaccineId) {
        this.vaccineId = vaccineId;
    }

    public String getVaccineCountry() {
        return vaccineCountry;
    }

    public void setVaccineCountry(String vaccineCountry) {
        this.vaccineCountry = vaccineCountry;
    }

    

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineInformationName) {
        this.vaccineName = vaccineInformationName;
    }

    public String getVaccineInformationExpirDate() {
        return vaccineExpirDate;
    }

    public void setVaccineInformationExpirDate(String vaccineInformationExpirDate) {
        this.vaccineExpirDate = vaccineInformationExpirDate;
    }

    public String getVaccineInformationCountry() {
        return vaccineInformationCountry;
    }

    public void setVaccineInformationCountry(String vaccineInformationCountry) {
        this.vaccineInformationCountry = vaccineInformationCountry;
    }
    private String vaccineInformationCountry;
}
