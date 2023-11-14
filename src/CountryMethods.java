
public class CountryMethods {
	 void language(String country) {
		switch(country.toLowerCase()) { 
		                               //test clasta toLowerCase koyunca 
		                               //buyuk harfle 
		                               // yazsak bile kabul ediyor.yalniz case 
		                               //icindekileri kucuk harfle yazmaliyiz.
		                               //toUpper da koyabiliriz.
		case "russia":
			System.out.println("Privet");
			break;
		case "tajikistan":
			System.out.println("Salom");
			break;
		case"mexico":
			System.out.println("halo");
			break;
			default:
				System.out.println("wrong language");
				
		}
		
	}
	
	boolean isOdd1(int a) {
		boolean isOdd;
		if(a%2==0) {
			isOdd=false;
		}else {
			isOdd=true;
		}return isOdd;
	}

}
