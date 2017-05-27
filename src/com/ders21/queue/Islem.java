package com.ders21.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Islem {
	
	public static void main(String[] args) {
		Queue<String> kuyruk = new LinkedList<>();
		
		kuyruk.offer("Mustafa");
		kuyruk.offer("Hilal");
		kuyruk.offer("Muhammed");
		kuyruk.offer("Mehmet");
		
//		System.out.println(kuyruk);
//		
//		System.out.println("poll:" + kuyruk.poll());
//		System.out.println("poll:" + kuyruk.poll());
//
//		System.out.println(kuyruk);
//		
		while(!kuyruk.isEmpty()){
			System.out.println("poll:" + kuyruk.poll());
			if(kuyruk.peek().equals("Muhammed"))
				break;
		}
//
//		
//		for (String veri : kuyruk) {
//			
//			System.out.println(veri);
//			
//		}
		
	}

}
