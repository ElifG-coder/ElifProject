package com.arrays;

public class twoDimArray4 {

	public static void main(String[] args) {
		// two dim array. store even and odd number 2 row and 3 column
         //  print just even number
		int[][] arr= {{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}};
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			if(arr[i][j]%2==0) {
				System.out.print(arr[i][j]+" ");
			}
		}
		System.out.println();
	}
				
				
		
		
	}

}
