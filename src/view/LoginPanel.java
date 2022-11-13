package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

public class LoginPanel extends JPanel {

	private JPanel panelImage, panelLogin; 
	private JTextField user;
	private JPasswordField password;
	private JButton btnLogin;
	private JLabel btnRegister;
	public LoginPanel() {
		setSize(1200, 598);
		setBackground(Color.green);
		initComponents();
	}
	public void initComponents() {
		setLayout(null);
		panelImage = new JPanel();
		panelImage.setBounds(0, 0, 452, 598);
		panelImage.setBackground(WindowMain.colorFirst);
		add(panelImage);
		panelLogin = new JPanel();
		panelLogin.setLayout(null);
		panelLogin.setBounds(452, 0, 748, 598);
		panelLogin.setBackground(WindowMain.colorSecond);
		
		
		JLabel lblTitle = new JLabel("Login");
		lblTitle.setFont(new Font("Segoe UI", Font.BOLD, 30));
		lblTitle.setForeground(WindowMain.colorWhite);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(328,93,200,50);
		panelLogin.add(lblTitle);
		
		user = new JTextField();
		user.setText("User");
		user.setBounds(247,249,365,37);
		user.setForeground(WindowMain.colorWhite);
		user.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		user.setBackground(WindowMain.colorSecond);
		user.setBorder(new MatteBorder(0, 0, 2, 0, WindowMain.colorLight));
		panelLogin.add(user);
		
		password = new JPasswordField();
		password.setText("Usuario");
		password.setBorder(new MatteBorder(0, 0, 2, 0, WindowMain.colorLight));
		password.setBounds(247,321,365,37);
		password.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		password.setForeground(WindowMain.colorWhite);
		password.setBackground(WindowMain.colorSecond);
		panelLogin.add(password);
	
		
		btnLogin = new JButton("Ingresar");
		btnLogin.setBorder(null);
		btnLogin.setBounds(247, 454, 365, 42);
		btnLogin.setBackground(WindowMain.colorFirst);
		btnLogin.setForeground(WindowMain.colorLight);
		btnLogin.setFont(new Font("Segoe UI", Font.BOLD, 23));
		panelLogin.add(btnLogin);
		
		JLabel iconUser = new JLabel("New label");
		ImageIcon icon = new ImageIcon();
		iconUser.setIcon(icon);
		iconUser.setBounds(622, 235, 57, 51);
		panelLogin.add(iconUser);
		
		JLabel iconPassword = new JLabel("New label");
		iconPassword.setBounds(622, 297, 57, 51);
		panelLogin.add(iconPassword);
		
		btnRegister = new JLabel("Registrarse");
		btnRegister.setHorizontalAlignment(SwingConstants.CENTER);
		btnRegister.setBounds(342, 525, 166, 27);
		btnRegister.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		btnRegister.setForeground(WindowMain.colorWhite);
		panelLogin.add(btnRegister);
		
		add(panelLogin);
		
	}
	
}
