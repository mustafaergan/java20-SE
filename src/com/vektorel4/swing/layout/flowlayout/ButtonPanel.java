package com.vektorel4.swing.layout.flowlayout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonPanel {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("buttonlar");
		frame.setLayout(new FlowLayout(FlowLayout.TRAILING,15,15));
		JButton jButton1 = new JButton("Button 1");
		JButton jButton2 = new JButton("Button 2");
		JButton jButton3 = new JButton("Button 3");
		JButton jButton4 = new JButton("Button 4");
		JButton jButton5 = new JButton("Button 5");
		JButton jButton6 = new JButton("Button 6");
		frame.setSize(400, 400);
		frame.add(jButton1);
		frame.add(jButton2);
		frame.add(jButton3);
		frame.add(jButton4);
		frame.add(jButton5);
		frame.add(jButton6);
		frame.setVisible(true);
	}

}
