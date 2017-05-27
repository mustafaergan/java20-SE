package com.ders21.thread;

public class Sayi2Don implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			System.out.println(i+"###");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
	}

}
