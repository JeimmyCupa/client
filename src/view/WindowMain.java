package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class WindowMain extends JFrame {
	public final static Color colorFirst = new Color(22,44,64);
	public final static Color colorSecond = new Color(217,95,95);
	public final static Color colorDark = new Color(64,64,64);
	public final static Color colorGray = new Color(128,128,128);
	public final static Color colorLight = new Color(230,230,230);
	public final static Color colorWhite = new Color(255,255,255);
	private JPanel contentPane;
	private LoginPanel loginPanel;
	private JPanel header;
	private JButton btnExit;
	

	public WindowMain(ActionListener listener) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10,10,1223,680);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		initComponents();
	}
	public void initComponents() {
		contentPane.setLayout(null);
		header = new JPanel();
		header.setBounds(0, 0, 1200, 43);
		header.setLayout(null);
		btnExit = new JButton();
		btnExit.setText("X");
		btnExit.setBounds(1157,0,43,43);
		header.add(btnExit);
		getContentPane().add(header);
		
		
		
	
		loginPanel = new LoginPanel();
		loginPanel.setSize(1200, 598);
		loginPanel.setLocation(0, 43);
		
		getContentPane().add(loginPanel);
	}
}
