package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.WindowMain;

public class ClientController implements ActionListener{
	private WindowMain window;
	public ClientController() {
		window = new WindowMain(this);
		//window.initLoginPanel();
		window.setVisible(true);
	}
	
	public static void main(String[] args) {
		new ClientController();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String event = e.getActionCommand();
		switch(event) {
		case "EXIT":
			window.dispose();
			break;
		}
		
	}
}
