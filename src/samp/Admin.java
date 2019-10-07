package samp;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;

import data.Cases;
import data.Input_data;

public class Admin {

	private JFrame frmNationalLaborRelations;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin window = new Admin();
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
	public Admin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNationalLaborRelations = new JFrame();
		frmNationalLaborRelations.setIconImage(Toolkit.getDefaultToolkit().getImage(Admin.class.getResource("/images/logo.png")));
		frmNationalLaborRelations.setTitle("National Labor Relations Commission 8th Division");
		frmNationalLaborRelations.setBounds(100, 100, 798, 462);
		frmNationalLaborRelations.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNationalLaborRelations.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(0, 0, 782, 126);
		frmNationalLaborRelations.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNationalLabor = new JLabel("National Labor Relations Commission 8th Division");
		lblNationalLabor.setBackground(Color.WHITE);
		lblNationalLabor.setBounds(153, 57, 550, 27);
		lblNationalLabor.setForeground(Color.WHITE);
		lblNationalLabor.setFont(new Font("Arial", Font.BOLD, 23));
		lblNationalLabor.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNationalLabor);
		
		JLabel lblNewLabel = new JLabel("Republic of the Philippines");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel.setBounds(133, 11, 249, 24);
		panel.add(lblNewLabel);
		
		JLabel lblDepartmentOfLabor = new JLabel("Department of Labor and Employment");
		lblDepartmentOfLabor.setHorizontalAlignment(SwingConstants.CENTER);
		lblDepartmentOfLabor.setForeground(Color.WHITE);
		lblDepartmentOfLabor.setFont(new Font("Arial", Font.BOLD, 16));
		lblDepartmentOfLabor.setBounds(133, 33, 332, 24);
		panel.add(lblDepartmentOfLabor);
		
		JLabel lblpambansangKomisyonSa = new JLabel("(Pambansang Komisyon sa Ugnayang Paggawa)");
		lblpambansangKomisyonSa.setHorizontalAlignment(SwingConstants.CENTER);
		lblpambansangKomisyonSa.setForeground(Color.WHITE);
		lblpambansangKomisyonSa.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		lblpambansangKomisyonSa.setBounds(140, 85, 366, 24);
		panel.add(lblpambansangKomisyonSa);
		
		JLabel label = new JLabel("");
		label.setFont(new Font("Tahoma", Font.PLAIN, 8));
		label.setIcon(new ImageIcon(Input_data.class.getResource("/images/logo.png")));
		label.setBounds(29, 11, 100, 100);
		panel.add(label);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setToolTipText("Logout");
		btnNewButton.setIcon(new ImageIcon(Admin.class.getResource("/images/logout.png")));
		btnNewButton.setBounds(496, 185, 133, 107);
		frmNationalLaborRelations.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setToolTipText("Admin");
		btnNewButton_1.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {
				Input_data a = new Input_data();
				a.main(null);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(Admin.class.getResource("/images/admin.png")));
		btnNewButton_1.setBounds(124, 185, 133, 109);
		frmNationalLaborRelations.getContentPane().add(btnNewButton_1);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {
				Cases c = new Cases();
				c.main(null);
			}
		});
		button.setToolTipText("Database");
		button.setIcon(new ImageIcon(Admin.class.getResource("/images/db.png")));
		button.setBounds(307, 185, 133, 109);
		frmNationalLaborRelations.getContentPane().add(button);
		
		
	}
}
