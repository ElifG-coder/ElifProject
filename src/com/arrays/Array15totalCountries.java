package com.arrays;

public class Array15totalCountries {

	public static void main(String[] args) {
		String[][] countries= {{"Spain","Hungary","Ukraine","Italy"},
				               {"Japan","China","Korea"},
		                       {"Iran","Iraq","Egypt"}};
		int count=0;
		for(int i=0;i<countries.length;i++) {
			for(int y=0;y<countries[i].length;y++) {
				System.out.print(countries[i][y]+" ");
				count++;
			}System.out.println();
		}System.out.println(count);
		System.out.println("--------USING ADVANCED FOR LOOP------");
		int total=0;
		for(String[]continent:countries) {
			for(String country:continent) {
				System.out.print(country+" ");
				total++;
			}System.out.println();
		}System.out.println("Total countries is "+total);
		
		

	}

}
