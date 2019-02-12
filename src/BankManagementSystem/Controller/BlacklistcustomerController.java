/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankManagementSystem.Controller;

import BankManagementSystem.DBConnection.DBConnection;
import BankManagementSystem.Model.BlacklistCustomerModel;
import BankManagementSystem.Model.CustomerModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author NEOx
 */
public class BlacklistcustomerController {
    public static boolean addCustomer(BlacklistCustomerModel cst) throws ClassNotFoundException,SQLException{
		String sql1="insert into BlacklistCustomer values(?,?,?,?)";
		
		Connection con=DBConnection.getDBConnection().getConnection();
		PreparedStatement stm=con.prepareStatement(sql1);
		stm.setObject(1,cst.getBID());
		stm.setObject(2,cst.getCID());
		stm.setObject(3,cst.getLID());
                stm.setObject(4,cst.getAmountToBePaid());
                
		int res=stm.executeUpdate();
		
		return res > 0;
	}    

    public static ArrayList<BlacklistCustomerModel> searchCustomerArray(String CID) throws ClassNotFoundException,SQLException{
		String sql="select * from BlacklistCustomer where CID='"+CID+"'";
		Connection conn=DBConnection.getDBConnection().getConnection();
		Statement stm=conn.createStatement();
		ResultSet rst=stm.executeQuery(sql);		
		ArrayList<BlacklistCustomerModel> cstList=new ArrayList<BlacklistCustomerModel>();
		while(rst.next()){
			BlacklistCustomerModel cst=new BlacklistCustomerModel(rst.getString("BID"),rst.getString("CID"),rst.getString("LID"),rst.getDouble("amountToBePaid"));
                        cstList.add(cst);
		}
		return cstList;
		
	}  
    
    public static BlacklistCustomerModel searchCustomer(String CID) throws ClassNotFoundException,SQLException{
		String sql="select * from blacklistCustomer where CID='"+CID+"'";
		
		Connection conn=DBConnection.getDBConnection().getConnection();
		Statement stm=conn.createStatement();
		ResultSet rst=stm.executeQuery(sql);		
		BlacklistCustomerModel cst=null; 
                if(rst.next()){
			cst=new BlacklistCustomerModel(rst.getString("BID"),rst.getString("CID"),rst.getString("LID"),rst.getDouble("amountToBePaid"));
                }
		return cst;
		
	}  
    
    
    public static boolean deleteCustomer(String CID) throws ClassNotFoundException,SQLException{
		String sql="delete from blacklistCustomer where CID='"+CID+"'";
		Connection con=DBConnection.getDBConnection().getConnection();
		Statement stm=con.createStatement();
		int res=stm.executeUpdate(sql);
		
		return res > 0;
	}
    
    public static ArrayList<BlacklistCustomerModel> viewCustomer()throws SQLException, ClassNotFoundException{
		String sql="Select * From blacklistCustomer";
		Connection conn=DBConnection.getDBConnection().getConnection();
		Statement stm=conn.createStatement();
		ResultSet rst=stm.executeQuery(sql);
		
		rst.beforeFirst();
		ArrayList<BlacklistCustomerModel> cstList=new ArrayList<BlacklistCustomerModel>();
		while(rst.next()){
			BlacklistCustomerModel cst=new BlacklistCustomerModel(rst.getString("BID"),rst.getString("CID"),rst.getString("LID"),rst.getDouble("amountToBePaid"));
			cstList.add(cst);

		}
		return cstList;
		
	
	}
}
