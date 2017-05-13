package com.etud.cons.swing;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GirisPenceresi {

	public GirisPenceresi() {
		JFrame jFrame = new JFrame("giris");
		JButton button = new JButton("giris");
		jFrame.add(button);
		jFrame.setSize(400, 400);
		jFrame.setVisible(true);
	}

}
