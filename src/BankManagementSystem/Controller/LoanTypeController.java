/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankManagementSystem.Controller;

import BankManagementSystem.DBConnection.DBConnection;
import BankManagementSystem.Model.AccountTypeModel;
import BankManagementSystem.Model.LoanTypeModel;
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
public class LoanTypeController {
    public static boolean addLoanType(LoanTypeModel lnType) throws ClassNotFoundException,SQLException{
		String sql1="insert into LoanType values(?,?,?,?,?)";
		
		Connection con=DBConnection.getDBConnection().getConnection();
		PreparedStatement stm=con.prepareStatement(sql1);
		stm.setObject(1,lnType.getLONTID());
		stm.setObject(2,lnType.getName());
		stm.setObject(3,lnType.getInterestRate());
                stm.setObject(4,lnType.getMax());
		stm.setObject(5,lnType.getMin());
		int res=stm.executeUpdate();
		
		return res > 0;
	}    
    public static LoanTypeModel searchLoanTypeName(String name) throws ClassNotFoundException,SQLException{
		String sql="select * from loanType where name='"+name+"'";
		
		Connection conn=DBConnection.getDBConnection().getConnection();
		Statement stm=conn.createStatement();
		ResultSet rst=stm.executeQuery(sql);		
		LoanTypeModel lnType=null;
		if(rst.next()){
			lnType=new LoanTypeModel(rst.getString("LONTID"),rst.getString("name"),rst.getString("InterestRate"), rst.getDouble("max"),  rst.getDouble("max"));
		}
		return lnType;
		
	}  
    
    public static LoanTypeModel searchLoanType(String LONTID) throws ClassNotFoundException,SQLException{
		String sql="select * from LoanType where LONTID='"+LONTID+"'";
		
		Connection conn=DBConnection.getDBConnection().getConnection();
		Statement stm=conn.createStatement();
		ResultSet rst=stm.executeQuery(sql);		
		LoanTypeModel lntType=null;
		if(rst.next()){
			lntType=new LoanTypeModel(rst.getString("LONTID"),rst.getString("name"),rst.getString("InterestRate"),rst.getDouble("max"),rst.getDouble("min"));
		}
		return lntType;
		
	}  
    
    public static boolean updateLoanType(LoanTypeModel lnType) throws ClassNotFoundException,SQLException{
		String sql="Update LoanType set name=?,installment=?,max=?,min=? where LONTID=?";
		
		Connection con=DBConnection.getDBConnection().getConnection();
		PreparedStatement stm=con.prepareStatement(sql);
		
		stm.setObject(1,lnType.getName());
		stm.setObject(2,lnType.getInterestRate());
                stm.setObject(3,lnType.getMax());
                stm.setObject(4,lnType.getMin());
                stm.setObject(5,lnType.getLONTID());
                
		int res=stm.executeUpdate();
		
		return res > 0;
    }    
    
    public static boolean deleteLoanType(String LONTID) throws ClassNotFoundException,SQLException{
		String sql="delete from LoanType where LONTID='"+LONTID+"'";
		Connection con=DBConnection.getDBConnection().getConnection();
		Statement stm=con.createStatement();
		int res=stm.executeUpdate(sql);
		
		return res > 0;
	}
    
    public static ArrayList<LoanTypeModel> viewLoanType()throws SQLException, ClassNotFoundException{
		String sql="Select * From LoanType";
		Connection conn=DBConnection.getDBConnection().getConnection();
		Statement stm=conn.createStatement();
		ResultSet rst=stm.executeQuery(sql);

		rst.beforeFirst();
		ArrayList<LoanTypeModel> lnTypeList=new ArrayList<LoanTypeModel>();
		while(rst.next()){
			LoanTypeModel lnType=new LoanTypeModel(rst.getString("LONTID"),rst.getString("name"),rst.getString("InterestRate"),rst.getDouble("max"),rst.getDouble("min"));
			lnTypeList.add(lnType);

		}
		return lnTypeList;
		
	
	}
}
