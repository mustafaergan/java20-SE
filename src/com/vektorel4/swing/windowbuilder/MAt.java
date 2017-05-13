package com.vektorel4.swing.windowbuilder;

public class MAt {
	
	
	public int toplama(String veri1,String veri2){
		return this.toplama(Integer.parseInt(veri1), Integer.parseInt(veri2));
	}
	
	public int toplama(int veri1,int veri2){
		return veri1+veri2;
	}
	
	public int cikarma(String veri1,String veri2){
		return this.toplama(Integer.parseInt(veri1), Integer.parseInt(veri2));
	}
	
	public int cikarma(int veri1,int veri2){
		return veri1-veri2;

	}

}
