package com.arrays;

public class array1sum {

	public static void main(String[] args) {
	/*	int[] ar= {3,4,5,6};
		int sum=0;
		for(int i=0;i<ar.length;i++) {//regular loop
			 sum=sum+ar[i];
		}
		System.out.println(sum);
	}*/
/*int[] ar={3,4,5,6};
int sum=0;
for(int i:ar) //advanced for loop/enhanced for loop
	sum +=i;
	System.out.println(sum);*/
		
		int[] ar1= {7,8,9,10};
		int sum1=0;
		int sum2=0;
		for(int i=0;i<ar1.length;i++) {
			 sum1=sum1+ar1[i];
		}System.out.println(sum1);
		
		for(int num:ar1) {
			sum2=sum2+num;
		}
		System.out.println(sum2);
}

}

