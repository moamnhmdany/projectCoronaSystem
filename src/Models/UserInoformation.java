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
public class UserInoformation {
    
    private static String userNameAccount ;
    private static String userPasswordAccount ;
    
    public  String getUserNameAccount() {
        return userNameAccount;
    }

    public  void setUserNameAccount(String userNameAccount) {
        UserInoformation.userNameAccount = userNameAccount;
    }

    public  String getUserPasswordAccount() {
        return userPasswordAccount;
    }

    public  void setUserPasswordAccount(String userPasswordAccount) {
        UserInoformation.userPasswordAccount = userPasswordAccount;
    }
   

}
