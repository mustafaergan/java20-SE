package com.ders21.stack;

import java.util.Stack;

public class Islem {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<>();
		
		stack.push("Mustafa");
		stack.push("Hilal");
		stack.push("Muhammed");
		System.out.println(stack);
		System.out.println("pop:"+stack.pop());
		System.out.println(stack);
		System.out.println("pop:"+stack.pop());
		System.out.println(stack);
		stack.push("Cemal"); 
		System.out.println(stack);
//		System.out.println("pop:"+stack.pop());
//		System.out.println("pop:"+stack.pop());

		
		while(!stack.empty()){
			System.out.println("pop:"+stack.pop());
		}
		
		while(stack.empty()){
			System.out.println("stack boþ");
			stack.push("deneme");
		}


	}
	
}
