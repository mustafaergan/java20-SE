package com.etud.cons.swing;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CikisPenceresi {
	
	public CikisPenceresi() {
		JFrame jFrame = new JFrame("cikis");
		JButton button = new JButton("cikis");
		jFrame.add(button);
		jFrame.setSize(400, 400);
		jFrame.setVisible(true);
	}

}
