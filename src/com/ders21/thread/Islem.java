package com.ders21.thread;

public class Islem {
	
	public static void main(String[] args) {
		
		System.out.println("Merhaba");
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		SayiDon sayiDon = new SayiDon();
		Sayi2Don sayi2Don = new Sayi2Don();
		Thread tread = new Thread(sayiDon);
		Thread treadYeni = new Thread(sayi2Don);

		tread.start();
		
//		for (int i = 0; i < 1000000; i++) {
//			System.out.println("**"+i);
//		}
		
		treadYeni.start();
		
//		for (int i = 0; i < 1000000; i++) {
//			System.out.println("**"+i);
//		}
		
//		Thread runTread = new Thread(new Runnable() {
//			@Override
//			public void run() {
//			}
//		});
		
		synchronized(tread){
			try {
				tread.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		for (int i = 0; i < 1000; i++) {
		System.out.println("**###");
	}
		
	}

}
