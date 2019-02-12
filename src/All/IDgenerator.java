/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package All;

import BankManagementSystem.Controller.IDController;
import java.sql.SQLException;
import java.text.NumberFormat;

/**
 *
 * @author NEOx
 */
public class IDgenerator {
    public static String autoID(String tableName,String colName,String prefix) throws SQLException,ClassNotFoundException{
        String lastID=IDController.getLastID(tableName,colName);
        if(lastID != null){
            int id=Integer.parseInt(lastID.split(prefix)[1]);
            id++;
            NumberFormat numberFormat=NumberFormat.getIntegerInstance();
            numberFormat.setMinimumIntegerDigits(3);
            numberFormat.setGroupingUsed(false);
            String newID = numberFormat.format(id);
            
            return prefix + newID;
        }else{
            return prefix+"001";
        }
    }  
}
