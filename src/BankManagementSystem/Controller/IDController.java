/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankManagementSystem.Controller;

import BankManagementSystem.DBConnection.DBConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author NEOx
 */
public class IDController {
    public static String getLastID(String tableName,String colName)throws SQLException,ClassNotFoundException{
        String sql="select "+colName+" from "+tableName+" order by 1 desc limit 1";
        Connection con=DBConnection.getDBConnection().getConnection();
        Statement stm=con.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        
        if(rst.next()){
            return rst.getString(1);
        }
       return null;
    }
}
