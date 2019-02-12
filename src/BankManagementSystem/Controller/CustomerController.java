/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankManagementSystem.Controller;

import BankManagementSystem.DBConnection.DBConnection;
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
public class CustomerController {
    public static boolean addCustomer(CustomerModel cst) throws ClassNotFoundException,SQLException{
		String sql1="insert into customer values(?,?,?,?,?,?,?,?,?,?)";
		
		Connection con=DBConnection.getDBConnection().getConnection();
		PreparedStatement stm=con.prepareStatement(sql1);
		stm.setObject(1,cst.getCID());
		stm.setObject(2,cst.getfName());
		stm.setObject(3,cst.getlName());
                stm.setObject(4,cst.getDateOfBirth());
                stm.setObject(5,cst.getAge());
                stm.setObject(6,cst.getGender());
                stm.setObject(7,cst.getOccupation());
                stm.setObject(8,cst.getAddress());
                stm.setObject(9,cst.getNIC());
                stm.setObject(10,cst.getMobileNo());
		int res=stm.executeUpdate();
		
		return res > 0;
	}    

    public static ArrayList<CustomerModel> searchCustomerArray(String what,String which) throws ClassNotFoundException,SQLException{
		String sql="select * from customer where "+what+" like '%"+which+"%'";
		Connection conn=DBConnection.getDBConnection().getConnection();
		Statement stm=conn.createStatement();
		ResultSet rst=stm.executeQuery(sql);		
		ArrayList<CustomerModel> cstList=new ArrayList<CustomerModel>();
		while(rst.next()){
			CustomerModel cst=new CustomerModel(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6),rst.getString(7),rst.getString(8),rst.getString(9),rst.getString(10));
                        cstList.add(cst);
		}
		return cstList;
		
	}  
    
    public static  CustomerModel searchCustomer(String CID) throws ClassNotFoundException,SQLException{
		String sql="select * from customer where CID='"+CID+"'";
		
		Connection conn=DBConnection.getDBConnection().getConnection();
		Statement stm=conn.createStatement();
		ResultSet rst=stm.executeQuery(sql);		
		CustomerModel cst=null; 
                if(rst.next()){
			cst=new CustomerModel(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6),rst.getString(8),rst.getString(7),rst.getString(9),rst.getString(10));
                }
		return cst;
		
	}  
    
    
   
    
    public static boolean updateCustomer(CustomerModel cst) throws ClassNotFoundException,SQLException{
		String sql="Update Customer set fName=?,lName=?,dateOfBirth=?,age=?,gender=?, address=?,occupation=?, NIC=?, mobileNo=? where CID=?";
		
		Connection con=DBConnection.getDBConnection().getConnection();
		PreparedStatement stm=con.prepareStatement(sql);
		
		stm.setObject(1,cst.getfName());
		stm.setObject(2,cst.getlName());
                stm.setObject(3,cst.getDateOfBirth());
                stm.setObject(4,cst.getAge());
                stm.setObject(5,cst.getGender());
                stm.setObject(6,cst.getAddress());
                stm.setObject(7,cst.getOccupation());
                stm.setObject(8,cst.getNIC());
                stm.setObject(9,cst.getMobileNo());
                stm.setObject(10,cst.getCID());
		int res=stm.executeUpdate();
		
		return res > 0;
    }    
    
    public static boolean deleteCustomer(String CID) throws ClassNotFoundException,SQLException{
		String sql="delete from Customer where CID='"+CID+"'";
		Connection con=DBConnection.getDBConnection().getConnection();
		Statement stm=con.createStatement();
		int res=stm.executeUpdate(sql);
		
		return res > 0;
	}
    
    public static ArrayList<CustomerModel> viewCustomer()throws SQLException, ClassNotFoundException{
		String sql="Select * From Customer";
		Connection conn=DBConnection.getDBConnection().getConnection();
		Statement stm=conn.createStatement();
		ResultSet rst=stm.executeQuery(sql);
		
		rst.beforeFirst();
		ArrayList<CustomerModel> cstList=new ArrayList<CustomerModel>();
		while(rst.next()){
			CustomerModel cst=new CustomerModel(rst.getString("CID"),rst.getString("fName"),rst.getString("lName"),rst.getString("dateOfBirth"),rst.getString("age"),rst.getString("gender"),rst.getString("address"),rst.getString("occupation"),rst.getString("NIC"),rst.getString("mobileNo"));
			cstList.add(cst);

		}
		return cstList;
		
	
	}
}
