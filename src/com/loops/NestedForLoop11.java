package com.loops;

public class NestedForLoop11 {

	public static void main(String[] args) {
		// Car miles until 9999
		for(int i=0;i<=9;i++) {
			for(int y=0;y<=9;y++) {
				for(int x=0;x<=9;x++) {
					for(int z=0;z<=9;z++) {
						System.out.println(i+""+y+""+x+""+z);
					}
				}
			}
		}

	}

}
