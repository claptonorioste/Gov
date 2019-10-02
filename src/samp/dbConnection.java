package samp;
import java.sql.*;

import javax.swing.JOptionPane;


public class dbConnection {
	Connection conn = null;
	public static Connection dbConnector()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.1.8:3306/nlrc","root","");
			JOptionPane.showMessageDialog(null, "Connection Successful!");
			return conn;
		}catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
	}
}
