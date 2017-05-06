package com.vektorel4.swing.layout.gridlayout;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Form extends JFrame {
	
	
	public Form() {
		
		
	}
	
	
	public void createForm() {
		setLayout(new GridLayout(3, 2));
		setVisible(true);
		setSize(100, 100);
		
		JLabel tcJL = new JLabel("TC");
		JLabel AdJL = new JLabel("Ad");
		JLabel soyadJL = new JLabel("Soyad");
		
		JTextField tcJTF = new JTextField();
		JTextField AdJTF = new JTextField();
		JTextField soyadJTF = new JTextField();
		
		add(tcJL);
		add(tcJTF);
		
		add(AdJL);
		add(AdJTF);
		
		add(soyadJL);
		add(soyadJTF);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

}
