/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Lenovo
 */
public class EmploeeWorksDetails {

    private String emploeeDateWork;
    private String emploeeCenterId;
    private String emploeeId;

     public String getEmploeeDateWork() {
        return this.emploeeDateWork;
    }

    public void setEmploeeDateWork(String emploeeDateWork) {
        this.emploeeDateWork = emploeeDateWork;
    }

    public String getEmploeeCenterId() {
        return emploeeCenterId;
    }

    public void setEmploeeCenterId(String emploeeCenterId) {
        this.emploeeCenterId = emploeeCenterId;
    }

    public String getEmploeeId() {
        return emploeeId;
    }

    public void setEmploeeId(String emploeeId) {
        this.emploeeId = emploeeId;
    }
}
