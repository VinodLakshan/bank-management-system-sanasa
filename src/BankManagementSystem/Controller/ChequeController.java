/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankManagementSystem.Controller;

import BankManagementSystem.DBConnection.DBConnection;
import BankManagementSystem.Model.ChequeModel;
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
public class ChequeController {
    public static boolean addCheque(ChequeModel chq) throws ClassNotFoundException,SQLException{
		String sql="insert into cheque values(?,?,?,?,?)";
		
		Connection con=DBConnection.getDBConnection().getConnection();
		PreparedStatement stm=con.prepareStatement(sql);
		stm.setObject(1,chq.getChequeNo());
		stm.setObject(2,chq.getPID());
		stm.setObject(3,chq.getBankName());
                stm.setObject(4,chq.getExpireDate());
                stm.setObject(5,chq.getAmount());
		int res=stm.executeUpdate();
		
		return res > 0;
	}    
    
    public static ChequeModel searchCheque(String CHID) throws ClassNotFoundException,SQLException{
		String sql="select * from Cheque where chequeNo='"+CHID+"'";
		
		Connection conn=DBConnection.getDBConnection().getConnection();
		Statement stm=conn.createStatement();
		ResultSet rst=stm.executeQuery(sql);		
		ChequeModel chq=null;
		if(rst.next()){
			chq=new ChequeModel(rst.getString("chequeNo"),rst.getString("PID"),rst.getString("BankName"),rst.getString("expireDate"),rst.getDouble("amount"));
		}
		return chq;
		
	}  
    
 
    
    public static ArrayList<ChequeModel> viewCheque()throws SQLException, ClassNotFoundException{
		String sql="Select * From cheque";
		Connection conn=DBConnection.getDBConnection().getConnection();
		Statement stm=conn.createStatement();
		ResultSet rst=stm.executeQuery(sql);
	
		rst.beforeFirst();
		ArrayList<ChequeModel> chqList=new ArrayList<ChequeModel>();
		while(rst.next()){
			ChequeModel chq=new ChequeModel(rst.getString("chequeNo"),rst.getString("PID"),rst.getString("BankName"),rst.getString("expireDate"),rst.getDouble("amount"));
			chqList.add(chq);

		}
		return chqList;
		
	
	}
}
