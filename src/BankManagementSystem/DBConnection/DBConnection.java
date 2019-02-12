/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankManagementSystem.DBConnection;

/**
 *
 * @author NEOx
 */

import java.sql.*;
public class DBConnection {
    private static DBConnection connection;
	private Connection con;
	
	private DBConnection() throws ClassNotFoundException,SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost/bank","root","2526");
	}
	
	public static DBConnection getDBConnection() throws ClassNotFoundException,SQLException{
		if(connection==null){
			connection=new DBConnection();			
		}
		return connection;
	}
	public Connection getConnection(){
		return con;
	}
}
