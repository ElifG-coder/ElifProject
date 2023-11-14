package com.arrays;

public class twoDimArray2 {

	public static void main(String[] args) {
		int[][] arr= {
				{2,6,-7},
				{4,8,13,7,6},
				{3,2}
		};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		}

	}


