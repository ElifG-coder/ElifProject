package com.loops;

public class WhileLoop {

	public static void main(String[] args) {
		int i=3;
		int j=7;
		while(i<6) {
			
			while(j>4) {
				System.out.print(i+"*"+j+" ");
				j--;
				
			}
			System.out.println("*");
			i++;
			
		}
	}

}

