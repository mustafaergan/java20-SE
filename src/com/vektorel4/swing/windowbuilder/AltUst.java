package com.vektorel4.swing.windowbuilder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AltUst extends JFrame {
	
	public static void main(String[] args) {
		AltUst alt = new AltUst();
	}
	
	public AltUst() {
		setLayout(new BorderLayout());
		JPanel merkezPanel = new JPanel();
		JPanel altPanel = new JPanel();
		add(merkezPanel,BorderLayout.CENTER);
		merkezPanel.setBackground(new Color(101, 100, 100));
		add(altPanel,BorderLayout.SOUTH);

		setVisible(true);
		setSize(400, 400);
		
		merkezPanel.setLayout(new GridLayout(3, 1));
		altPanel.setLayout(new FlowLayout());
		
		JButton button1 = new JButton("BUTTON 1");
		JButton button2 = new JButton("BUTTON 2");
		JButton button3 = new JButton("BUTTON 3");
		
		button1.setBackground(new Color(50, 50, 50));

		merkezPanel.add(button1);
		merkezPanel.add(button2);
		merkezPanel.add(button3);
		
		JLabel label1 = new JLabel("Label1");
		JLabel label2 = new JLabel("Label2");

		altPanel.add(label1);
		altPanel.add(label2);

	}

}
