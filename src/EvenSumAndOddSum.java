import java.util.Iterator;

public class EvenSumAndOddSum {

	public static void main(String[] args) {
		
		
		int evenSum=0;
		int oddSum=0;
		
		for (int i = 1; i < 90; i++) {
			if(i%2==0) {
				evenSum=evenSum+i;
				
			}else {
				oddSum=oddSum+i;
			}
			
		}
System.out.println(evenSum);
System.out.println(oddSum);
	}

}
