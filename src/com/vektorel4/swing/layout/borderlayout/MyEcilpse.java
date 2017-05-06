package com.vektorel4.swing.layout.borderlayout;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyEcilpse extends JFrame{
	
	public MyEcilpse() {
		setLayout(new BorderLayout());
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JLabel ustLabel = new JLabel("ust veri");
		
		add(ustLabel, BorderLayout.NORTH);
		
		JLabel altLabel = new JLabel("alt veri");

		add(altLabel, BorderLayout.SOUTH);

		
		
		JLabel centerLabel = new JLabel("merkez veri");
		
		add(centerLabel, BorderLayout.CENTER);
		
		JLabel sagLabel = new JLabel("sag veri");

		add(sagLabel, BorderLayout.EAST);
		
		
	}
	
	

}
