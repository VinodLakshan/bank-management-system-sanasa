/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankManagementSystem.Controller;

import BankManagementSystem.DBConnection.DBConnection;
import BankManagementSystem.Model.AccountModel;
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
public class AccountController {
    public static boolean addAccount(AccountModel act) throws ClassNotFoundException,SQLException{
		String sql1="insert into account values(?,?,?,?,?)";
		
		Connection con=DBConnection.getDBConnection().getConnection();
		PreparedStatement stm=con.prepareStatement(sql1);
		stm.setObject(1,act.getAID());
		stm.setObject(2,act.getCID());
		stm.setObject(3,act.getAccountType());
                stm.setObject(4,act.getGuardianName());
                stm.setObject(5,act.getBalance());
		int res=stm.executeUpdate();
		
		return res > 0;
	}    
    
    public static AccountModel searchAccount(String AID) throws ClassNotFoundException,SQLException{
		String sql="select * from account where AID='"+AID+"'";
		
		Connection conn=DBConnection.getDBConnection().getConnection();
		Statement stm=conn.createStatement();
		ResultSet rst=stm.executeQuery(sql);		
		AccountModel act=null;
		if(rst.next()){
			act=new AccountModel(rst.getString("AID"),rst.getString("CID"),rst.getString("accountType"),rst.getString("guardianName"),rst.getDouble("balance"));
		}
		return act;
		
	}  
    
    public static AccountModel searchAccountSearch(String CID) throws ClassNotFoundException,SQLException{
		String sql="select * from account where CID='"+CID+"'";
		
		Connection conn=DBConnection.getDBConnection().getConnection();
		Statement stm=conn.createStatement();
		ResultSet rst=stm.executeQuery(sql);		
		AccountModel act=null;
		if(rst.next()){
			act=new AccountModel(rst.getString("AID"),rst.getString("CID"),rst.getString("accountType"),rst.getString("guardianName"),rst.getDouble("balance"));
		}
		return act;
		
	}  
    
    public static ArrayList<AccountModel> searchAccountCID(String CID) throws ClassNotFoundException,SQLException{
		String sql="select * from account where CID='"+CID+"'";
		Connection conn=DBConnection.getDBConnection().getConnection();
		Statement stm=conn.createStatement();
		ResultSet rst=stm.executeQuery(sql);		
		rst.beforeFirst();
		ArrayList<AccountModel> actList=new ArrayList<AccountModel>();
		while(rst.next()){
			AccountModel act=new AccountModel(rst.getString("AID"),rst.getString("CID"),rst.getString("accountType"),rst.getString("guardianName"),rst.getDouble("balance"));
			actList.add(act);
                }
                return actList;
		
	}  
    
    public static boolean updateAccount(AccountModel act) throws ClassNotFoundException,SQLException{
		String sql="Update account set CID=?,accountType=?,GuardianName=?, balance=? where AID=?";
		
		Connection con=DBConnection.getDBConnection().getConnection();
		PreparedStatement stm=con.prepareStatement(sql);
		
		stm.setObject(1,act.getCID());
		stm.setObject(2,act.getAccountType());
                stm.setObject(3,act.getGuardianName());
                stm.setObject(4,act.getBalance());
                stm.setObject(5,act.getAID());
                
		int res=stm.executeUpdate();
		
		return res > 0;
    }    
    
    public static boolean deleteAccount(String AID) throws ClassNotFoundException,SQLException{
		String sql="delete from account where AID='"+AID+"'";
		Connection con=DBConnection.getDBConnection().getConnection();
		Statement stm=con.createStatement();
		int res=stm.executeUpdate(sql);
		
		return res > 0;
	}
    
    public static ArrayList<AccountModel> searchAccountList(String CID)throws SQLException, ClassNotFoundException{
		String sql="Select * From account where CID='"+CID+"'";
		Connection conn=DBConnection.getDBConnection().getConnection();
		Statement stm=conn.createStatement();
		ResultSet rst=stm.executeQuery(sql);
		rst.beforeFirst();
		ArrayList<AccountModel> actList=new ArrayList<AccountModel>();
		while(rst.next()){
			AccountModel act=new AccountModel(rst.getString("AID"),rst.getString("CID"),rst.getString("accountType"),rst.getString("guardianName"),rst.getDouble("balance"));
			actList.add(act);

		}
		return actList;
		
	
	}
    
    public static ArrayList<AccountModel> viewAccount()throws SQLException, ClassNotFoundException{
		String sql="Select * From account";
		Connection conn=DBConnection.getDBConnection().getConnection();
		Statement stm=conn.createStatement();
		ResultSet rst=stm.executeQuery(sql);
		rst.beforeFirst();
		ArrayList<AccountModel> actList=new ArrayList<AccountModel>();
		while(rst.next()){
			AccountModel act=new AccountModel(rst.getString("AID"),rst.getString("CID"),rst.getString("accountType"),rst.getString("guardianName"),rst.getDouble("balance"));
			actList.add(act);

		}
		return actList;
		
	
	}
}
