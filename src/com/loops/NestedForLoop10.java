package com.loops;

public class NestedForLoop10 {

	public static void main(String[] args) {
		// print clock
		for(int i=0;i<=23;i++) {
			for(int y=0;y<=59;y++) {
				if(y<10) {
					
					System.out.println(i+":0"+y);
					
					
				}else {
					System.out.println(i+":"+y);
				}
				
			}
			
		}
		System.out.println("I just wanted to practice of break keyword at under example");
		
		for(int i=0;i<=23;i++) {
			for(int y=0;y<=60;y++) {
				if(y==60)
					break;
				//continue; //continue da ayni gorevi gordu burda.Enteresan
				System.out.println(i+":"+y);
			}
		}
	}

}
