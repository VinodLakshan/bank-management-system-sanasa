/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankManagementSystem.Controller;

import BankManagementSystem.DBConnection.DBConnection;
import BankManagementSystem.Model.AccountTypeModel;
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
public class AccountTypeController {
    public static boolean addAccountType(AccountTypeModel actType) throws ClassNotFoundException,SQLException{
		String sql1="insert into accountType values(?,?,?)";
		
		Connection con=DBConnection.getDBConnection().getConnection();
		PreparedStatement stm=con.prepareStatement(sql1);
		stm.setObject(1,actType.getACTID());
		stm.setObject(2,actType.getName());
		stm.setObject(3,actType.getInstallment());
		int res=stm.executeUpdate();
		
		return res > 0;
	}    
    
    public static AccountTypeModel searchAccountTypeID(String ACTID) throws ClassNotFoundException,SQLException{
		String sql="select * from accountType where ACTID='"+ACTID+"'";
		
		Connection conn=DBConnection.getDBConnection().getConnection();
		Statement stm=conn.createStatement();
		ResultSet rst=stm.executeQuery(sql);		
		AccountTypeModel actType=null;
		if(rst.next()){
			actType=new AccountTypeModel(rst.getString("ACTID"),rst.getString("name"),rst.getDouble("installment"));
		}
		return actType;
		
	}  
    
    public static AccountTypeModel searchAccountTypeName(String name) throws ClassNotFoundException,SQLException{
		String sql="select * from accountType where name='"+name+"'";
		
		Connection conn=DBConnection.getDBConnection().getConnection();
		Statement stm=conn.createStatement();
		ResultSet rst=stm.executeQuery(sql);		
		AccountTypeModel actType=null;
		if(rst.next()){
			actType=new AccountTypeModel(rst.getString("ACTID"),rst.getString("name"),rst.getDouble("installment"));
		}
		return actType;
		
	}  
    
    public static boolean updateAccountType(AccountTypeModel actType) throws ClassNotFoundException,SQLException{
		String sql="Update accountType set name=?,installment=? where ACTID=?";
		
		Connection con=DBConnection.getDBConnection().getConnection();
		PreparedStatement stm=con.prepareStatement(sql);
		
		stm.setObject(1,actType.getName());
		stm.setObject(2,actType.getInstallment());
                stm.setObject(3,actType.getACTID());
                
                
		int res=stm.executeUpdate();
		
		return res > 0;
    }    
    
    public static boolean deleteAccountType(String ACTID) throws ClassNotFoundException,SQLException{
		String sql="delete from accountType where ACTID='"+ACTID+"'";
		Connection con=DBConnection.getDBConnection().getConnection();
		Statement stm=con.createStatement();
		int res=stm.executeUpdate(sql);
		
		return res > 0;
	}
    
    public static ArrayList<AccountTypeModel> viewAccountType()throws SQLException, ClassNotFoundException{
		String sql="Select * From accountType";
		Connection conn=DBConnection.getDBConnection().getConnection();
		Statement stm=conn.createStatement();
		ResultSet rst=stm.executeQuery(sql);

		rst.beforeFirst();
		ArrayList<AccountTypeModel> actTypeList=new ArrayList<AccountTypeModel>();
		while(rst.next()){
			AccountTypeModel actType=new AccountTypeModel(rst.getString("ACTID"),rst.getString("name"),rst.getDouble("installment"));
			actTypeList.add(actType);

		}
		return actTypeList;
		
	
	}
}
