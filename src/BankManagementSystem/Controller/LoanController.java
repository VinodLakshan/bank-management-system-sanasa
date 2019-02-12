/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankManagementSystem.Controller;

import BankManagementSystem.DBConnection.DBConnection;
import BankManagementSystem.Model.CustomerModel;
import BankManagementSystem.Model.LoanModel;
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
public class LoanController {
    public static boolean addLoan(LoanModel ln) throws ClassNotFoundException,SQLException{
		String sql1="insert into Loan values(?,?,?,?,?,?,?,?,?)";
		
		Connection con=DBConnection.getDBConnection().getConnection();
		PreparedStatement stm=con.prepareStatement(sql1);
		stm.setObject(1,ln.getLID());
		stm.setObject(2,ln.getAID());
                stm.setObject(3,ln.getReason());
		stm.setObject(4,ln.getLoanType());
                stm.setObject(5,ln.getDuration());
		stm.setObject(6,ln.getDate());
                stm.setObject(7,ln.getAmount());
                stm.setObject(8,ln.getPeriodical());
                stm.setObject(9,ln.getToBePaid());
               
		int res=stm.executeUpdate();
		
		return res > 0;
	}    
     public static ArrayList<LoanModel> searchLoanArray(String AID) throws ClassNotFoundException,SQLException{
		String sql="select * from Loan where AID='"+AID+"'";
		Connection conn=DBConnection.getDBConnection().getConnection();
		Statement stm=conn.createStatement();
		ResultSet rst=stm.executeQuery(sql);		
		ArrayList<LoanModel> lnList=new ArrayList<LoanModel>();
		while(rst.next()){
			LoanModel ln=new LoanModel(rst.getString("LID"),rst.getString("AID"),rst.getString("reason"),rst.getString("loanType"), rst.getString("period"),rst.getString("date"),rst.getDouble("amount"),rst.getDouble("Periodical"),rst.getDouble("toBePaid"));
                        lnList.add(ln);
		}
		return lnList;
		
	}  
    
     public static ArrayList<LoanModel> searchLoanArrayCustomer(String name) throws ClassNotFoundException,SQLException{
		String sql="select * from customer c,account a,loan l where c.CID=a.CID and a.AID=l.AID and c.fname='"+name+"'";
		Connection conn=DBConnection.getDBConnection().getConnection();
		Statement stm=conn.createStatement();
		ResultSet rst=stm.executeQuery(sql);		
		ArrayList<LoanModel> lnList=new ArrayList<LoanModel>();
		while(rst.next()){
			LoanModel ln=new LoanModel(rst.getString("LID"),rst.getString("AID"),rst.getString("reason"),rst.getString("loanType"), rst.getString("period"),rst.getString("date"),rst.getDouble("amount"),rst.getDouble("Periodical"),rst.getDouble("toBePaid"));
                        lnList.add(ln);
		}
		return lnList;
		
	}   
     
    
    public static LoanModel searchLoan(String LID) throws ClassNotFoundException,SQLException{
		String sql="select * from Loan where LID='"+LID+"'";
		
		Connection conn=DBConnection.getDBConnection().getConnection();
		Statement stm=conn.createStatement();
		ResultSet rst=stm.executeQuery(sql);		
		LoanModel ln=null;
		if(rst.next()){
			ln=new LoanModel(rst.getString("LID"),rst.getString("AID"),rst.getString("reason"),rst.getString("loanType"),rst.getString("period"),rst.getString("date"),rst.getDouble("amount"),rst.getDouble("Periodical"),rst.getDouble("toBePaid"));
		}
		return ln;
		
	} 
    public static boolean updateLoan(double x,String y) throws ClassNotFoundException,SQLException{
		String sql="Update loan set toBePaid='"+x+"' where LID='"+y+"'";
		
		Connection con=DBConnection.getDBConnection().getConnection();
		Statement stm=con.createStatement();
	        
		int res=stm.executeUpdate(sql);
		
		return res > 0;
    }    
    
    public static ArrayList<LoanModel> searchLoanCustomer(String CID) throws ClassNotFoundException,SQLException{
		String sql="select * from loan l,account a where l.AID=a.AID AND a.CID='"+CID+"'";
		Connection conn=DBConnection.getDBConnection().getConnection();
		Statement stm=conn.createStatement();
		ResultSet rst=stm.executeQuery(sql);		
		rst.beforeFirst();
                ArrayList<LoanModel> lnList=new ArrayList<LoanModel>();
               
		while(rst.next()){
			LoanModel ln=new LoanModel(rst.getString("LID"),rst.getString("AID"),rst.getString("reason"),rst.getString("loanType"),rst.getString("period"),rst.getString("date"),rst.getDouble("amount"),rst.getDouble("Periodical"),rst.getDouble("toBePaid"));
                        lnList.add(ln);
                }
		return lnList;
		
	}
    
    
    public static boolean deleteLoan(String LID) throws ClassNotFoundException,SQLException{
		String sql="delete from Loan where LID='"+LID+"'";
		Connection con=DBConnection.getDBConnection().getConnection();
		Statement stm=con.createStatement();
		int res=stm.executeUpdate(sql);
		                                                          
		return res > 0;
	}
    
    public static ArrayList<LoanModel> viewLoan()throws SQLException, ClassNotFoundException{
		String sql="select * from loan l,account a where a.AID=l.AID group by a.CID;";
		Connection conn=DBConnection.getDBConnection().getConnection();
		Statement stm=conn.createStatement();
		ResultSet rst=stm.executeQuery(sql);
		rst.beforeFirst();
		ArrayList<LoanModel> lnList=new ArrayList<LoanModel>();
		while(rst.next()){
			LoanModel ln=new LoanModel(rst.getString("LID"),rst.getString("AID"),rst.getString("reason"),rst.getString("loanType"),rst.getString("period"),rst.getString("date"),rst.getDouble("amount"),rst.getDouble("Periodical"),rst.getDouble("toBePaid"));
			lnList.add(ln);

		}
		return lnList;
		
	
	}
}
