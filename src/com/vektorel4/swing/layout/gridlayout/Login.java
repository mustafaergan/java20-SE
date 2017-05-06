package com.vektorel4.swing.layout.gridlayout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Login extends JFrame {

	public Login(String title) {
		setTitle(title);
		setLayout(new GridLayout(3, 2));
		setVisible(true);
		setSize(400, 400);
		addComp();
	}

	private void addComp() {
		JLabel kAdiJL = new JLabel("K.Adi");
		JTextField kAdiJTF = new JTextField();
		JLabel sifreJL = new JLabel("Þifre");
		JTextField sifreJTF = new JTextField();
		JButton loginJB = new JButton("Giriþ");
		add(kAdiJL);
		add(kAdiJTF);
		add(sifreJL);
		add(sifreJTF);
		add(loginJB);
	}
	
	public void benimAyarlarim(){
		
		int sayac = 100;
		
		while (true) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			setSize(sayac,sayac);
			
			sayac +=10;
			
		}
		
	}
	
}
