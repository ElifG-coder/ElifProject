package com.arrays;

public class Array14CapitalOfCountries {

	public static void main(String[] args) {
		String[] countries= {"USA","Turkey","Spain"};
		System.out.println("------FIRST WAY WITH USING  FOR EACH LOOP-----");
		for(String country:countries) {
			if(country.equalsIgnoreCase("usa")) {
				System.out.println("The Capital of "+country+" is Washington");
			}else if(country.equalsIgnoreCase("turkey")) {
				System.out.println("The Capital of "+country+" is Ankara");
			}else if(country.equalsIgnoreCase("spain")) {
				System.out.println("Tha Capital of "+country+" is Madrid");
			}
		}
		System.out.println("--------SECOND WAY WITH USING FOR LOOP--------");
		for(int i=0;i<countries.length;i++) {
			if(countries[i].equalsIgnoreCase("usa")) {
				System.out.println("The Capital of "+countries[i]+" is Washington");
			}else if(countries[i].equalsIgnoreCase("turkey")) {
				System.out.println("The Capital of "+countries[i]+" is Ankara");
			}else if(countries[i].equalsIgnoreCase("spain")) {
				System.out.println("Tha Capital of "+countries[i]+" is Madrid");
			}
			
			
		}
         System.out.println("-------THIRD WAY SWITCH CASE WITH USING ENHANCED FOR LOOP------");
         for(String country:countries) {
        	 switch(country) {
        	 case"USA":
        		 System.out.println("The Capital of "+country+" is Washington");
        		 break;
        	 case"Turkey":
        		 System.out.println("The Capital of "+country+" is Ankara");
        		 break;
        	 case"Spain":
        		 System.out.println("The Capital of "+country+" is Madrid");
        		 
        	 }
         }
         System.out.println("---------FORTH WAY SWITCH CASE WITH USING FOR LOOP-------");
         for(int i=0;i<countries.length;i++) {
        	 switch(countries[i]) {
        	 case"USA":
        		 System.out.println("The Capital of "+countries[i]+" is Washington");
        		 break;
        	 case"Turkey":
        		 System.out.println("The Capital of "+countries[i]+" is Ankara");
        		 break;
        	 case"Spain":
        		 System.out.println("The Capital of "+countries[i]+" is Madrid");
        	 }
         }
	}

}
