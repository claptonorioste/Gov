package samp;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.SwingConstants;

import data.Input_data;

import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Toolkit;
import javax.swing.JSeparator;

public class Login {

	private JFrame frmNationalLaborRelations;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmNationalLaborRelations.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	Connection connection = null;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
		connection=dbConnection.dbConnector();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNationalLaborRelations = new JFrame();
		frmNationalLaborRelations.setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/images/logo.png")));
		frmNationalLaborRelations.setTitle("National Labor Relations Commission(LOGIN)");
		frmNationalLaborRelations.getContentPane().setBackground(Color.DARK_GRAY);
		frmNationalLaborRelations.setBounds(100, 100, 514, 414);
		frmNationalLaborRelations.setResizable(false);
		frmNationalLaborRelations.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNationalLaborRelations.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(73, 251, 87, 23);
		frmNationalLaborRelations.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(73, 284, 87, 23);
		frmNationalLaborRelations.getContentPane().add(lblNewLabel_1);
		
		JTextField textFieldUN = new JTextField();
		textFieldUN.setForeground(Color.DARK_GRAY);
		textFieldUN.setToolTipText("");
		textFieldUN.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldUN.setBounds(170, 251, 257, 26);
		frmNationalLaborRelations.getContentPane().add(textFieldUN);
		textFieldUN.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					String query="select * from employee_info where username=? and password=? ";
					PreparedStatement pst=connection.prepareStatement(query);
					pst.setString(1, textFieldUN.getText());
					pst.setString(2, passwordField.getText());
					
					ResultSet rs=pst.executeQuery();
					int count=0;
					while(rs.next()) {
						count=count+1;
					}
					if(count ==1)
					{
						frmNationalLaborRelations.setVisible(false);
//						JOptionPane.showMessageDialog(null, "Username and Password is Correct!");
						Input_data m = new Input_data();
						m.main(null);
						
						
					}
					else if(count>1)
					{
						JOptionPane.showMessageDialog(null, "Duplicate Username and Password!");
					}
					else if(count!=1)
					{
						JOptionPane.showMessageDialog(null, "Username and Password is Incorrect!");
					}
					else {
						JOptionPane.showMessageDialog(null, "Username and Password Does not Exist!");
					}
					rs.close();
					pst.close();
				}catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, e1);
				}
			}
		});
		btnNewButton.setBounds(338, 323, 89, 23);
		frmNationalLaborRelations.getContentPane().add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(Color.DARK_GRAY);
		passwordField.setHorizontalAlignment(SwingConstants.LEFT);
		passwordField.setToolTipText("");
		passwordField.setBounds(170, 284, 257, 28);
		frmNationalLaborRelations.getContentPane().add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("NATIONAL LABOR RELATIONS COMMISSION");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(63, 203, 375, 37);
		frmNationalLaborRelations.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setIcon(new ImageIcon(Login.class.getResource("/images/logo.png")));
		lblNewLabel_3.setBounds(140, 12, 218, 180);
		frmNationalLaborRelations.getContentPane().add(lblNewLabel_3);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(63, 237, 375, 2);
		frmNationalLaborRelations.getContentPane().add(separator);
		
		
	}
}
