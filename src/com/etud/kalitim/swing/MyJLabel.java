package com.etud.kalitim.swing;

import javax.swing.JLabel;

public class MyJLabel extends JLabel {
	
	public MyJLabel(String veri) {
		super("**** " + veri + " ****");
	}
	
	@Override
	public void setText(String text) {
		super.setText("### "+text);
	}

}
