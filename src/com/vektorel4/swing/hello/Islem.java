package com.vektorel4.swing.hello;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Islem {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Hello");
		frame.setSize(200, 200);
		frame.setVisible(true);
		JButton jButton = new JButton("merhaba Dünya");
		
		frame.add(jButton);
		
//		jButton.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("merhaba dünya basildi");
//			}
//		});
		
//		JLabel jLabel = new JLabel("Text Veri");
//
//
//		JTextArea jTextArea = new JTextArea(20, 20);
//		frame.add(jTextArea);

	}

}
