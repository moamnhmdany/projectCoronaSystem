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
public class VccineStoreInformation {
    
   private String vccineStoreDate; 
   private String vccineStoreAmount;
   private String vccineStoreRunNum;
   private String emploeeId;
   private String vccineStoreId;

    public String getVccineStoreDate() {
        return vccineStoreDate;
    }

    public void setVccineStoreDate(String vccineStoreDate) {
        this.vccineStoreDate = vccineStoreDate;
    }

    public String getVccineStoreAmount() {
        return vccineStoreAmount;
    }

    public void setVccineStoreAmount(String vccineStoreAmount) {
        this.vccineStoreAmount = vccineStoreAmount;
    }

    public String getVccineStoreRunNum() {
        return vccineStoreRunNum;
    }

    public void setVccineStoreRunNum(String vccineStoreRunNum) {
        this.vccineStoreRunNum = vccineStoreRunNum;
    }

    public String getEmploeeId() {
        return emploeeId;
    }

    public void setEmploeeId(String emploeeId) {
        this.emploeeId = emploeeId;
    }

    public String getVccineStoreId() {
        return vccineStoreId;
    }

    public void setVccineStoreId(String vccineStoreId) {
        this.vccineStoreId = vccineStoreId;
    }
}
