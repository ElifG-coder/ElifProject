package com.arrays;

public class array11MissingNumber {

	public static void main(String[] args) {
		// Write a Java program to find a missing number in an array.
		int total_num;
		   int[] numbers = new int[]{3,4,6};
		   total_num=4;
		 //ardisik sayi formulu ((son terim+ilk terim)*(son terim -ilk terim+x))/2x x:artis miktari
		  int expected_num_sum=(((numbers[2]+numbers[0])*(numbers[2]-numbers[0]+1))/2);
		   int num_sum=0;
		  for(int i:numbers) {
			  num_sum+=i;
		  }
		  System.out.println(expected_num_sum-num_sum);
		 
			   System.out.print("\n");
			   
			  
			    numbers = new int[]{1,2,3,4,5,7};
			   total_num=7;
			 //ardisik sayi formulu n.(n+1)/2
			  expected_num_sum= total_num * ((total_num + 1) / 2);
			    num_sum=0;
			  for(int i:numbers) {
				  num_sum+=i;
			  }
			  System.out.println(expected_num_sum-num_sum);
	}
}
