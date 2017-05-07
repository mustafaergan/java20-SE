package com.vektorel4.swing.windowbuilder;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPanelOrnek extends JFrame {
	
	
	public static void main(String[] args) {
		JPanelOrnek jOrnek = new JPanelOrnek();
	}
	
	
	public JPanelOrnek() {
		
		setLayout(new BorderLayout());
		
		JPanel ustPanel = new JPanel();
		add(ustPanel,BorderLayout.NORTH);
		ustPanel.setLayout(new FlowLayout());
		
		ustPanel.setPreferredSize(new Dimension(100, 100));
		
		JButton btn11 = new JButton("deneme");
		JButton btn22 = new JButton("deneme");

		ustPanel.add(btn11);
		ustPanel.add(btn22);

		JPanel merkezPanel = new JPanel();
		add(merkezPanel,BorderLayout.CENTER);
		
		merkezPanel.setLayout(new GridLayout(2, 2));
		
		JButton btn1 = new JButton("deneme1");
		JButton btn2 = new JButton("deneme2");
		JButton btn3 = new JButton("deneme3");
		JButton btn4 = new JButton("deneme4");

		merkezPanel.add(btn1);
		merkezPanel.add(btn2);
		merkezPanel.add(btn3);
		merkezPanel.add(btn4);
		
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

}
