package com.vektorel4.swing.layout.gridlayout;


import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class InputButton {

	public static void main(String[] args) {
		JFrame mustafa = new JFrame();

		JButton button1 = new JButton("Button 1");
		JTextField text1 = new JTextField(10);
		JButton button2 = new JButton("Button 2");
		JTextField text2 = new JTextField(10);
		JButton button3 = new JButton("Button 3");


		mustafa.add(button1);
		mustafa.add(text1);
		mustafa.add(button2);
		mustafa.add(text2);
		mustafa.add(button3);

		
		mustafa.setLayout(new GridLayout(3, 2));

		mustafa.setVisible(true);
		mustafa.setSize(400, 400);

	}

}
