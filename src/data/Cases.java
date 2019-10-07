package data;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

import net.proteanit.sql.DbUtils;
import samp.dbConnection;

public class Cases {
	Connection connection = null;

	private JFrame frmNationalLaborRelations;
	private JTable table;
	private JTextField textField;
	private JLabel lblCaseNo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cases window = new Cases();
					window.frmNationalLaborRelations.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cases() {
		initialize();
		connection=dbConnection.dbConnector();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNationalLaborRelations = new JFrame();
		frmNationalLaborRelations.getContentPane().setBackground(Color.DARK_GRAY);
		frmNationalLaborRelations.setResizable(false);
		frmNationalLaborRelations.setIconImage(Toolkit.getDefaultToolkit().getImage(Cases.class.getResource("/images/logo.png")));
		frmNationalLaborRelations.setTitle("National Labor Relations Commission 8th Division");
		frmNationalLaborRelations.setBounds(100, 100, 1052, 481);
		frmNationalLaborRelations.getContentPane().setLayout(null);
		
		table = new JTable();
		table.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setBackground(Color.LIGHT_GRAY);
		table.setFont(new Font("Arial", Font.BOLD, 14));
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setBounds(10, 63, 1014, 233);
		frmNationalLaborRelations.getContentPane().add(table);
		
		textField = new JTextField();
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(120, 23, 143, 26);
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				try
				{
					String query="select * from employee_info where EID=?";
					PreparedStatement pst=connection.prepareStatement(query);
					pst.setString(1, textField.getText());
					ResultSet rs=pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
				}catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, e1);
				}
			}
		});
		frmNationalLaborRelations.getContentPane().add(textField);
		textField.setColumns(10);
		
		lblCaseNo = new JLabel("Case Number :");
		lblCaseNo.setBounds(10, 27, 100, 17);
		lblCaseNo.setForeground(Color.LIGHT_GRAY);
		lblCaseNo.setFont(new Font("Arial", Font.BOLD, 14));
		frmNationalLaborRelations.getContentPane().add(lblCaseNo);
		
		JButton btnLoad = new JButton("Load");
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					String query="select * from employee_info";
					PreparedStatement pst=connection.prepareStatement(query);
					ResultSet rs=pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
				}catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, e1);
				}
			}
		});
		btnLoad.setBounds(924, 307, 100, 32);
		btnLoad.setFont(new Font("Arial", Font.BOLD, 14));
		frmNationalLaborRelations.getContentPane().add(btnLoad);
		
	}
}
