package data;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

import samp.dbConnection;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Window.Type;
import javax.swing.JTable;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Input_data {
	Connection connection = null;
	

	private JFrame frmNationalLaborRelations;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Input_data window = new Input_data();
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
	public Input_data() {
		initialize();
		connection=dbConnection.dbConnector();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNationalLaborRelations = new JFrame();
		frmNationalLaborRelations.setTitle("National Labor Relations Commission(DATA)");
		frmNationalLaborRelations.setIconImage(Toolkit.getDefaultToolkit().getImage(Input_data.class.getResource("/images/logo.png")));
		frmNationalLaborRelations.getContentPane().setBackground(Color.DARK_GRAY);
		frmNationalLaborRelations.setBounds(100, 100, 939, 647);
		frmNationalLaborRelations.setResizable(false);
		frmNationalLaborRelations.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNationalLaborRelations.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.blue);
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(0, 0, 933, 126);
		frmNationalLaborRelations.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNationalLabor = new JLabel("National Labor Relations Commission");
		lblNationalLabor.setBackground(Color.WHITE);
		lblNationalLabor.setBounds(133, 56, 453, 33);
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
		lblpambansangKomisyonSa.setBounds(133, 85, 373, 24);
		panel.add(lblpambansangKomisyonSa);
		
		JLabel label = new JLabel("");
		label.setFont(new Font("Tahoma", Font.PLAIN, 8));
		label.setIcon(new ImageIcon(Input_data.class.getResource("/images/logo.png")));
		label.setBounds(29, 11, 100, 100);
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 124, 933, 495);
		frmNationalLaborRelations.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("NLRC CASE NO.");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 19));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 11, 874, 33);
		panel_1.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.LIGHT_GRAY);
		separator.setForeground(Color.DARK_GRAY);
		separator.setBounds(20, 44, 864, 2);
		panel_1.add(separator);
		
		JLabel lblCaseNo = new JLabel("Case No.                              :");
		lblCaseNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblCaseNo.setFont(new Font("Arial", Font.BOLD, 14));
		lblCaseNo.setBounds(10, 55, 193, 26);
		panel_1.add(lblCaseNo);
		
		textField = new JTextField();
		textField.setBounds(213, 55, 206, 26);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblTitle = new JLabel("Title                                     :");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Arial", Font.BOLD, 14));
		lblTitle.setBounds(475, 54, 193, 26);
		panel_1.add(lblTitle);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(678, 55, 206, 26);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(213, 93, 206, 26);
		panel_1.add(textField_2);
		
		JLabel lblDateAppealedTo = new JLabel("Date appealed to NLRC     :");
		lblDateAppealedTo.setHorizontalAlignment(SwingConstants.CENTER);
		lblDateAppealedTo.setFont(new Font("Arial", Font.BOLD, 14));
		lblDateAppealedTo.setBounds(10, 92, 193, 26);
		panel_1.add(lblDateAppealedTo);
		
		JLabel lblDateAppealedTo_1 = new JLabel("Date received to OECC      :");
		lblDateAppealedTo_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDateAppealedTo_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblDateAppealedTo_1.setBounds(475, 91, 193, 26);
		panel_1.add(lblDateAppealedTo_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(678, 92, 206, 26);
		panel_1.add(textField_3);
		
		JLabel lblDateAppealedTo_2 = new JLabel("Date received to Com.       :");
		lblDateAppealedTo_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblDateAppealedTo_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblDateAppealedTo_2.setBounds(10, 130, 193, 26);
		panel_1.add(lblDateAppealedTo_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(213, 131, 206, 26);
		panel_1.add(textField_4);
		
		JLabel lblDateAppealPromulgated = new JLabel("Date Appeal promulgated :");
		lblDateAppealPromulgated.setHorizontalAlignment(SwingConstants.CENTER);
		lblDateAppealPromulgated.setFont(new Font("Arial", Font.BOLD, 14));
		lblDateAppealPromulgated.setBounds(475, 128, 194, 26);
		panel_1.add(lblDateAppealPromulgated);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(678, 129, 206, 26);
		panel_1.add(textField_5);
		
		JLabel lblDateMrFiled = new JLabel("Date MR filed                      :");
		lblDateMrFiled.setHorizontalAlignment(SwingConstants.CENTER);
		lblDateMrFiled.setFont(new Font("Arial", Font.BOLD, 14));
		lblDateMrFiled.setBounds(10, 167, 194, 26);
		panel_1.add(lblDateMrFiled);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(214, 168, 206, 26);
		panel_1.add(textField_6);
		
		JLabel lblDateMrPromulgated = new JLabel("Date MR Promulgated        :");
		lblDateMrPromulgated.setHorizontalAlignment(SwingConstants.CENTER);
		lblDateMrPromulgated.setFont(new Font("Arial", Font.BOLD, 14));
		lblDateMrPromulgated.setBounds(475, 165, 194, 26);
		panel_1.add(lblDateMrPromulgated);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(678, 166, 206, 26);
		panel_1.add(textField_7);
		
		JLabel lblIndustryCode = new JLabel("Industry Code                     :");
		lblIndustryCode.setHorizontalAlignment(SwingConstants.CENTER);
		lblIndustryCode.setFont(new Font("Arial", Font.BOLD, 14));
		lblIndustryCode.setBounds(10, 204, 194, 26);
		panel_1.add(lblIndustryCode);
		
		JLabel lblNatureOfCase = new JLabel("Nature of Case                    :");
		lblNatureOfCase.setHorizontalAlignment(SwingConstants.CENTER);
		lblNatureOfCase.setFont(new Font("Arial", Font.BOLD, 14));
		lblNatureOfCase.setBounds(475, 202, 194, 26);
		panel_1.add(lblNatureOfCase);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(214, 205, 206, 26);
		panel_1.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(679, 202, 206, 26);
		panel_1.add(textField_9);
		
		JLabel lblNatureOfAward = new JLabel("Nature of Award                  :");
		lblNatureOfAward.setHorizontalAlignment(SwingConstants.CENTER);
		lblNatureOfAward.setFont(new Font("Arial", Font.BOLD, 14));
		lblNatureOfAward.setBounds(10, 241, 194, 26);
		panel_1.add(lblNatureOfAward);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(213, 241, 206, 26);
		panel_1.add(textField_10);
		
		JLabel lblAmountOfAward = new JLabel("Amount of Award (LA)       :");
		lblAmountOfAward.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmountOfAward.setFont(new Font("Arial", Font.BOLD, 14));
		lblAmountOfAward.setBounds(10, 278, 194, 26);
		panel_1.add(lblAmountOfAward);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(213, 278, 206, 26);
		panel_1.add(textField_11);
		
		JLabel lblcom = new JLabel("(COM)           :");
		lblcom.setHorizontalAlignment(SwingConstants.CENTER);
		lblcom.setFont(new Font("Arial", Font.BOLD, 14));
		lblcom.setBounds(475, 278, 110, 26);
		panel_1.add(lblcom);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(595, 278, 206, 26);
		panel_1.add(textField_12);
		
		JLabel lblLa = new JLabel("LA                 :");
		lblLa.setHorizontalAlignment(SwingConstants.CENTER);
		lblLa.setFont(new Font("Arial", Font.BOLD, 14));
		lblLa.setBounds(475, 315, 108, 26);
		panel_1.add(lblLa);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(595, 315, 206, 26);
		panel_1.add(textField_13);
		
		JLabel lblDateMailedBy = new JLabel("Date mailed by RAB/SRAB :");
		lblDateMailedBy.setHorizontalAlignment(SwingConstants.CENTER);
		lblDateMailedBy.setFont(new Font("Arial", Font.BOLD, 14));
		lblDateMailedBy.setBounds(10, 352, 194, 26);
		panel_1.add(lblDateMailedBy);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(213, 353, 206, 26);
		panel_1.add(textField_14);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.LIGHT_GRAY);
		separator_1.setForeground(Color.DARK_GRAY);
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(449, 57, 2, 393);
		panel_1.add(separator_1);
		
		JLabel lblFemale = new JLabel("Female    :");
		lblFemale.setHorizontalAlignment(SwingConstants.CENTER);
		lblFemale.setFont(new Font("Arial", Font.BOLD, 14));
		lblFemale.setBounds(10, 315, 80, 26);
		panel_1.add(lblFemale);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(100, 315, 110, 26);
		panel_1.add(textField_15);
		
		JLabel lblMale = new JLabel("Male      :");
		lblMale.setHorizontalAlignment(SwingConstants.CENTER);
		lblMale.setFont(new Font("Arial", Font.BOLD, 14));
		lblMale.setBounds(213, 315, 80, 26);
		panel_1.add(lblMale);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(303, 315, 116, 26);
		panel_1.add(textField_16);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(Color.LIGHT_GRAY);
		separator_2.setForeground(Color.DARK_GRAY);
		separator_2.setBounds(475, 252, 416, 2);
		panel_1.add(separator_2);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					
					String query="insert into nlrc_data (CNum, Title, Date_app_nlrc, Date_rec_oecc, Date_rec_com, Date_app_prom, Date_mr_filed, "
							+ "date_mr_prom, ind_code, nature_case, nature_award, amm_award, com, gender, la, "
							+ "date_mailed, appeal_fee, bond, entry_judgment, date_entry_judg_issued, date_forwarded, courier_airbill_no, "
							+ "remarks, app_date_or, bond_date_or) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
					PreparedStatement pst=connection.prepareStatement(query);
					pst.setString(1, textField.getText());
					pst.setString(2, textField_1.getText());
					pst.setString(3, textField_2.getText());
					pst.setString(4, textField_3.getText());
					pst.setString(5, textField_4.getText());
					pst.setString(6, textField_5.getText());
					pst.setString(7, textField_6.getText());
					pst.setString(8, textField_7.getText());
					pst.setString(9, textField_8.getText());
					pst.setString(10, textField_9.getText());
					pst.setString(11, textField_10.getText());
					pst.setString(12, textField_11.getText());
					pst.setString(13, textField_12.getText());
					pst.setString(14, textField_13.getText());
					pst.setString(15, textField_14.getText());
					pst.setString(16, textField_15.getText());
					pst.setString(17, textField_16.getText());
//					pst.setString(18, textField_17.getText());
//					pst.setString(19, textField_18.getText());
//					pst.setString(20, textField_19.getText());
//					pst.setString(21, textField_20.getText());
//					pst.setString(22, textField_21.getText());
//					pst.setString(23, textField_22.getText());
//					pst.setString(24, textField_23.getText());
//					pst.setString(25, textField_24.getText());
					
					pst.executeQuery();
					
				}catch(Exception e1)
				{
					e1.printStackTrace();
				}
			}
		});
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSave.setBounds(475, 377, 108, 33);
		panel_1.add(btnSave);
	}
}
