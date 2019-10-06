package samp;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Color;

import javax.swing.SwingConstants;

import data.Input_data2;
import samp.Admin;

import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

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
	@SuppressWarnings("unused")
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
	@SuppressWarnings({ "unchecked", "rawtypes" })
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
		lblNewLabel.setBounds(73, 220, 87, 23);
		frmNationalLaborRelations.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(73, 253, 87, 23);
		frmNationalLaborRelations.getContentPane().add(lblNewLabel_1);
		
		JTextField textFieldUN = new JTextField();
		textFieldUN.setFont(new Font("Arial", Font.PLAIN, 14));
		textFieldUN.setForeground(Color.DARK_GRAY);
		textFieldUN.setToolTipText("");
		textFieldUN.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldUN.setBounds(170, 220, 257, 26);
		frmNationalLaborRelations.getContentPane().add(textFieldUN);
		textFieldUN.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"admin", "user"}));
		comboBox.setBounds(170, 292, 89, 22);
		frmNationalLaborRelations.getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings({ "static-access", "deprecation" })
			public void actionPerformed(ActionEvent e) {
				try
				{
					String query="select * from employee_info where username=? and password=? and userType=?";
					PreparedStatement pst=connection.prepareStatement(query);
					pst.setString(1, textFieldUN.getText());
					pst.setString(2, passwordField.getText());
					pst.setString(3, String.valueOf(comboBox.getSelectedItem()));
					
					ResultSet rs=pst.executeQuery();
					
					if(rs.next()) {
						JOptionPane.showMessageDialog(null, "Logged as "+rs.getString("userType"));
						if(comboBox.getSelectedIndex()==0) {
							frmNationalLaborRelations.setVisible(false);
							Admin a = new Admin();
							a.main(null);
						}else if(comboBox.getSelectedIndex()==1) {
							frmNationalLaborRelations.setVisible(false);
							Input_data2 a = new Input_data2();
							a.main(null);
						}
					}else {
						JOptionPane.showMessageDialog(null, "Username and Password doest not match!");
					}
				}catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, e1);
				}
			}
		});
		btnNewButton.setBounds(338, 292, 89, 23);
		frmNationalLaborRelations.getContentPane().add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Arial", Font.PLAIN, 14));
		passwordField.setForeground(Color.DARK_GRAY);
		passwordField.setHorizontalAlignment(SwingConstants.LEFT);
		passwordField.setToolTipText("");
		passwordField.setBounds(170, 253, 257, 28);
		frmNationalLaborRelations.getContentPane().add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("NATIONAL LABOR RELATIONS COMMISSION");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(63, 162, 375, 37);
		frmNationalLaborRelations.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setIcon(new ImageIcon(Login.class.getResource("/images/logo.png")));
		lblNewLabel_3.setBounds(140, 12, 218, 139);
		frmNationalLaborRelations.getContentPane().add(lblNewLabel_3);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(63, 196, 375, 2);
		frmNationalLaborRelations.getContentPane().add(separator);
		
		
		
		
	}
}
