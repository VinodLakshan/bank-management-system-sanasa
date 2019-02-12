/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankManagementSystem.Controller;

import BankManagementSystem.DBConnection.DBConnection;
import BankManagementSystem.Model.GuarantorDetailsModel;
import BankManagementSystem.Model.LoanModel;
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
public class GuarantorDetailsController {
    public static boolean addGuarantorDetails(GuarantorDetailsModel gd) throws ClassNotFoundException,SQLException{
		String sql1="insert into GuarantDetails values(?,?,?,?,?,?,?,?)";
		
		Connection con=DBConnection.getDBConnection().getConnection();
		PreparedStatement stm=con.prepareStatement(sql1);
		stm.setObject(1,gd.getGuarantID());
		stm.setObject(2,gd.getLID());
                stm.setObject(3,gd.getGuarantor());
                stm.setObject(4,gd.getCertificateNo());
		stm.setObject(5,gd.getValueOfHouse());
                stm.setObject(6,gd.getValueOfLand());
		stm.setObject(7,gd.getNameOfOwner());
                stm.setObject(8,gd.getAddressOfProperty());
               
		int res=stm.executeUpdate();
		
		return res > 0;
	}    
    
    public static GuarantorDetailsModel searchGuarantorDetails(String LID) throws ClassNotFoundException,SQLException{
		String sql="select * from GuarantorDetails where LID='"+LID+"'";
		
		Connection conn=DBConnection.getDBConnection().getConnection();
		Statement stm=conn.createStatement();
		ResultSet rst=stm.executeQuery(sql);		
		GuarantorDetailsModel gd=null;
		if(rst.next()){
			gd=new GuarantorDetailsModel(rst.getString("GuarantorID"),rst.getString("LID"),rst.getString("Guarantor"),rst.getString("CertificateNo"),rst.getDouble("ValueOfHouse"),rst.getDouble("ValueOfLand"),rst.getString("NameOfOwner"),rst.getString("AddressOfProperty"));
		}
		return gd;
		
	}  
    
    
    
    
}
