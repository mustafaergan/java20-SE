package com.vektorel4.swing.windowbuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class Eventler2 extends JFrame {

	private JPanel contentPane;
	private JTextField birinciDegerJTF;
	private JTextField ikinciDegerJTF;
	private JTextField sonucJTF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Eventler2 frame = new Eventler2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Eventler2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		birinciDegerJTF = new JTextField();
		birinciDegerJTF.setColumns(10);
		
		ikinciDegerJTF = new JTextField();
		ikinciDegerJTF.setColumns(10);
		
		sonucJTF = new JTextField();
		sonucJTF.setColumns(10);
		
		JLabel lblBirinciDeger = new JLabel("Birinci Deger");
		
		JLabel lblIkinciDeger = new JLabel("\u0130kinci Deger");
		
		JLabel lblSonuc = new JLabel("Sonuc");
		
		JButton toplamaBTN = new JButton("+");
		
		JButton cikarmaBTN = new JButton("-");
		
		JButton carpmaBT = new JButton("*");
		
		JButton bolmeBTN = new JButton("/");
		
		toplamaBTN.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				String birinci = birinciDegerJTF.getText();
//				String ikinci = ikinciDegerJTF.getText();
//				double veri = (Double.parseDouble(birinci)+Double.parseDouble(ikinci));
//				String sonuc = String.valueOf(veri);
				MAt mat = new MAt();
				sonucJTF.setText(mat.toplama(birinciDegerJTF.getText(), ikinciDegerJTF.getText())+"");
			}
		});
		
		cikarmaBTN.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String birinci = birinciDegerJTF.getText();
				String ikinci = ikinciDegerJTF.getText();
				double veri = (Double.parseDouble(birinci)-Double.parseDouble(ikinci));
//				String sonuc = String.valueOf(veri);
				sonucJTF.setText((int)veri+"");
			}
		});
		
		ActionListener ac = new Aksiyon();
		carpmaBT.addActionListener(ac);
		
//		carpmaBT.addActionListener(new Aksiyon());
		
		carpmaBT.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String birinci = birinciDegerJTF.getText();
				String ikinci = ikinciDegerJTF.getText();
				double veri = (Double.parseDouble(birinci)*Double.parseDouble(ikinci));
//				String sonuc = String.valueOf(veri);
				sonucJTF.setText((int)veri+"");				
			}
		});
		
		bolmeBTN.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String birinci = birinciDegerJTF.getText();
				String ikinci = ikinciDegerJTF.getText();
				double veri = (Double.parseDouble(birinci)/Double.parseDouble(ikinci));
				sonucJTF.setText((int)veri+"");					
			}
		});
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblBirinciDeger)
									.addGap(61)
									.addComponent(birinciDegerJTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblSonuc)
									.addPreferredGap(ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
									.addComponent(sonucJTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblIkinciDeger)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(ikinciDegerJTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addContainerGap(229, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(toplamaBTN)
							.addGap(18)
							.addComponent(cikarmaBTN)
							.addGap(18)
							.addComponent(carpmaBT)
							.addGap(18)
							.addComponent(bolmeBTN)
							.addContainerGap())))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(19)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(birinciDegerJTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblBirinciDeger))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(ikinciDegerJTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblIkinciDeger))
					.addGap(27)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(sonucJTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSonuc))
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(toplamaBTN)
						.addComponent(cikarmaBTN)
						.addComponent(carpmaBT)
						.addComponent(bolmeBTN))
					.addContainerGap(90, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
