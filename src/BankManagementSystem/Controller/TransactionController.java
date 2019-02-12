/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankManagementSystem.Controller;

import BankManagementSystem.DBConnection.DBConnection;
import BankManagementSystem.Model.CustomerModel;
import BankManagementSystem.Model.TransactionModel;
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
public class TransactionController {
    public static boolean addTransaction(TransactionModel tr) throws ClassNotFoundException,SQLException{
		String sql="insert into Transaction values(?,?,?,?,?,?)";
		
		Connection con=DBConnection.getDBConnection().getConnection();
		PreparedStatement stm=con.prepareStatement(sql);
		stm.setObject(1,tr.getTID());
		stm.setObject(2,tr.getAID());
                stm.setObject(3,tr.getTransactorName());
		stm.setObject(4,tr.getDate());
                stm.setObject(5,tr.getTransactionType());
		stm.setObject(6,tr.getTransactionAmount());
		int res=stm.executeUpdate();
		
		return res > 0;
	}    
    
    public static TransactionModel searchTransaction(String TID) throws ClassNotFoundException,SQLException{
		String sql="select * from Transaction where TID='"+TID+"'";
		
		Connection conn=DBConnection.getDBConnection().getConnection();
		Statement stm=conn.createStatement();
		ResultSet rst=stm.executeQuery(sql);		
		TransactionModel tr=null;
		if(rst.next()){
			tr=new TransactionModel(rst.getString("TID"),rst.getString("AID"),rst.getString("transactorName"),rst.getString("date"),rst.getString("transactionType"),rst.getDouble("transactionAmount"));
		}
		return tr;
		
	}  
    
    public static ArrayList<TransactionModel> searchTransactionArray(String AID) throws ClassNotFoundException,SQLException{
		String sql="select * from transaction where AID='"+AID+"'";
		Connection conn=DBConnection.getDBConnection().getConnection();
		Statement stm=conn.createStatement();
		ResultSet rst=stm.executeQuery(sql);		
		ArrayList<TransactionModel> trList=new ArrayList<TransactionModel>();
		while(rst.next()){
			TransactionModel tr=new TransactionModel(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getDouble(6));
                        trList.add(tr);
		}
		return trList;
		
	}  
    
    public static boolean updateTransaction(TransactionModel tr) throws ClassNotFoundException,SQLException{
		String sql="Update Transaction set AID=?,transactorName=?,date=?,transactionType=?,transactionAmount=? where TID=?";
		
		Connection con=DBConnection.getDBConnection().getConnection();
		PreparedStatement stm=con.prepareStatement(sql);
		
		stm.setObject(1,tr.getAID());
                stm.setObject(2,tr.getTransactorName());
		stm.setObject(3,tr.getDate());
                stm.setObject(4,tr.getTransactionType());
                stm.setObject(5,tr.getTransactionAmount());
                stm.setObject(6,tr.getTID());
                
		int res=stm.executeUpdate();
		
		return res > 0;
    }    
    
    public static boolean deleteTransaction(String TID) throws ClassNotFoundException,SQLException{
		String sql="delete from transaction where TID='"+TID+"'";
                Connection con=DBConnection.getDBConnection().getConnection();
                Statement stm=con.createStatement();
                int res=stm.executeUpdate(sql);
                
                return res>0;
	}
    
    public static ArrayList<TransactionModel> viewTransaction()throws SQLException, ClassNotFoundException{
		String sql="Select * From Transaction";
		Connection conn=DBConnection.getDBConnection().getConnection();
		Statement stm=conn.createStatement();
		ResultSet rst=stm.executeQuery(sql);

		rst.beforeFirst();
		ArrayList<TransactionModel> trList=new ArrayList<TransactionModel>();
		while(rst.next()){
			TransactionModel tr=new TransactionModel(rst.getString("TID"),rst.getString("AID"),rst.getString("transactorName"),rst.getString("date"),rst.getString("transactionType"),rst.getDouble("transactionAmount"));
			trList.add(tr);

		}
		return trList;
	}
}
