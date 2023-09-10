/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import Models.VaccineInformation;

/**
 *
 * @author Lenovo
 */
public interface VaccineRepository {
       public  Integer insertVccineStoreData(Object all) ;
        void view();
        String getId(String name);
        int insertNewVccine(VaccineInformation vaccineInformation);

}
