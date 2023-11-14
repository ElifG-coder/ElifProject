import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Is there a sale");
		String sale=scan.nextLine();
		double price=0;
		double finalprice=0;
		double discount=0;
		if(sale.equals("yes")) {
			System.out.println("How much price?");
			price=scan.nextDouble();
			if(price<20) {
				discount=price*0.1;
				finalprice=price-discount;
				
			}else if(price>=20&&price<=100) {
				discount=price*0.200;
				finalprice=price-discount;
			}else if(price>100&&price<=500) {
				discount=price*0.3;
				finalprice=price-discount;
			}else {
				discount=price*0.5;
				finalprice=price-discount;
			}
			
			
		}System.out.println("After "+discount+" The price of the item reduced from "+price+" to "+finalprice);
// eger syso' yu if blogunun icine yazmak istersem if disinda variable'lari initialize etmek zorunda degilim. if icinde initialize etmek yeterli.
//if blogu disina bir else blok koyup (no demek anlamina gelir bu),syso icine "no shopping" yazarim.. o zaman yukarda yazdigim syso kismini if blok icine yazmak daha mantikli.	
		
	}

}
