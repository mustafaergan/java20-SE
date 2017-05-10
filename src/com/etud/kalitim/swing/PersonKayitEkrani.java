package com.etud.kalitim.swing;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class PersonKayitEkrani extends JFrame  {
	MyJLabel label;
	public PersonKayitEkrani() {
		label = new MyJLabel("Personel Verisi");
		super.add(label);
		super.setSize(400, 400);
		super.setVisible(true);
	}
	
	public void labelIsimDegistirme() {
		label.setText("veri degisti");
	}

}
