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
			Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.0.11:3306/nlrc","root","");
//			JOptionPane.showMessageDialog(null, "Connection Successfully Established!");
			return conn;
		}catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, "Database not found!");
			return null;
		}
	}
}
