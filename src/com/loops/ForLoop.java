package com.loops;

public class ForLoop {

	public static void main(String[] args) {
		for(int i=0;i<30;i++) {
			if(i==15) {
				break;
			}
			System.out.print(i+" ");
			
		}
		System.out.println();
		for(int i=0;i<50;i++) {
			if(i%4==0) {
				continue;
			}
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=0;i<50;i++) {
			if(i==1||i==17||i==35) {
				continue;
				
			}System.out.print(i+" ");
		}

	}

}
