package com.loops;

public class StopLoop {

	public static void main(String[] args) {
		for(int i=1;i<10;i++) {
			while(i==4) {
				System.out.println("I am stooping the loop");
				break;
			
			}
			System.out.println(i);
		}
		System.out.println("I am outside of the loop");
	}
//dort rakamina kadar i variable tek tek bastiriyor. dort rakamina gelince loop'u KIRIYOR ve loop disina cikip 12.line deki yaziyi bastiriyor
}
