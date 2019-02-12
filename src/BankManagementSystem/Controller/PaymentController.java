/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankManagementSystem.Controller;

import BankManagementSystem.DBConnection.DBConnection;
import BankManagementSystem.Model.PaymentModel;
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
public class PaymentController {
    public static boolean addPayment(PaymentModel pmt) throws ClassNotFoundException,SQLException{
		String sql1="insert into payment values(?,?,?,?,?)";
		
		Connection con=DBConnection.getDBConnection().getConnection();
		PreparedStatement stm=con.prepareStatement(sql1);
		stm.setObject(1,pmt.getPID());
		stm.setObject(2,pmt.getLID());
		stm.setObject(3,pmt.getDate());
                stm.setObject(4,pmt.getAmount());
		stm.setObject(5,pmt.getCashOrCheque());
		int res=stm.executeUpdate();
		
		return res > 0;
	}    
    
    public static PaymentModel searchPayment(String PID) throws ClassNotFoundException,SQLException{
		String sql="select * from Payment where PID='"+PID+"'";
		
		Connection conn=DBConnection.getDBConnection().getConnection();
		Statement stm=conn.createStatement();
		ResultSet rst=stm.executeQuery(sql);		
		PaymentModel pmt=null;
		if(rst.next()){
			pmt=new PaymentModel(rst.getString("PID"),rst.getString("LID"),rst.getString("date"),rst.getDouble("amount"),rst.getString("chequeCash"));
		}
		return pmt;
		
	}  
    
    public static boolean updatePayment(PaymentModel pmt) throws ClassNotFoundException,SQLException{
		String sql="Update Payment set LID=?,date=?,amount=?,ChequeCash=? where PID=?";
		
		Connection con=DBConnection.getDBConnection().getConnection();
		PreparedStatement stm=con.prepareStatement(sql);
		
		stm.setObject(1,pmt.getLID());
		stm.setObject(2,pmt.getDate());
                stm.setObject(3,pmt.getAmount());
                stm.setObject(4,pmt.getCashOrCheque());
                stm.setObject(5,pmt.getPID());
                
		int res=stm.executeUpdate();
		
		return res > 0;
    }    
    
    public static boolean deletePayment(String PID) throws ClassNotFoundException,SQLException{
		String sql="delete from Payment where PID='"+PID+"'";
		Connection con=DBConnection.getDBConnection().getConnection();
		Statement stm=con.createStatement();
		int res=stm.executeUpdate(sql);
		
		return res > 0;
	}
    
    public static ArrayList<PaymentModel> viewPayment(String LID)throws SQLException, ClassNotFoundException{
		String sql="Select * From Payment where LID='"+LID+"'";
		Connection conn=DBConnection.getDBConnection().getConnection();
		Statement stm=conn.createStatement();
		ResultSet rst=stm.executeQuery(sql);

		rst.beforeFirst();
		ArrayList<PaymentModel> pmtList=new ArrayList<PaymentModel>();
		while(rst.next()){
			PaymentModel pmt=new PaymentModel(rst.getString("PID"),rst.getString("LID"),rst.getString("date"),rst.getDouble("amount"),rst.getString("ChequeCash"));
			pmtList.add(pmt);

		}
		return pmtList;
		
	
	}
}
