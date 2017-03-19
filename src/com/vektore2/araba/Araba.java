package com.vektore2.araba;

public class Araba {
	
	private int model;
	private String marka;
	private double motorGucu;
	private String renk;
	
	
	public Araba(){
		System.out.println("araba gordum");
	}
	
	public Araba(String renk){
		this.renk = renk;
	}
	
	public Araba(String marka, String renk){
		this.marka = marka;
		this.renk = renk;
	}
	
	public Araba(String marka, String renk, int model){
		this.marka = marka;
		this.renk = renk;
		this.model = model;
	}
	
	public Araba(String marka, String renk, int model, double motorGucu){
		this.marka = marka;
		this.renk = renk;
		this.model = model;
		this.motorGucu = motorGucu;
	}
	
	public double musteriTemsilcisineSor(double veri){
		this.motorGucu = veri;
		return motorGucu;
	}
	
	public String getMarka() {
		return marka;
	}
	
	public int getModel() {
		return model;
	}
	
	public String getRenk() {
		return renk;
	}

	public double getMotorGucu() {
		return this.motorGucu;
	}

}
