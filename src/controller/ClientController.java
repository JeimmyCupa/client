package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.WindowMain;

public class ClientController implements ActionListener{
	private WindowMain window;
	public ClientController() {
		window = new WindowMain(this);
		window.setVisible(true);
	}
	
	public static void main(String[] args) {
		new ClientController();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String event = e.getActionCommand();
		switch(event) {
		case "LOGIN":
			window.initComponentsUser();//Prueba
			break;
		case "SHOWPROFILE":
			break;
		case "SEARCHBOOKS":
			window.initSearchBooks();
			break;
		case "REGISTER":
			window.initRegisterPanel();
			break;
		case "MYBOOKS":
			break;
		case "SINGOUT":
			break;
		case "BACK":
			window.initLoginPanel();
			break;
		case "EXIT":
			window.dispose();
			break;
		}
		
	}
}
