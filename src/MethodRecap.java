
public class MethodRecap {
	//create a method that will accept array of integers and return max element from that array
	int getLargestNumber(int[] array) {
		int largest=array[0];
		for(int i=1;i<array.length;i++) {
			if(array[i]>largest) {
				largest=array[i];
				
			}
		}return largest;
	}
	//create a method that will accept a String and return each word from a given String
	
	String[] getWordsFromString(String str) {
		String[] array=str.split(" ");
		
		return array;
		}
	
	public static void main(String[] args) {
		MethodRecap obj=new MethodRecap();
		int[] ar= {2,3,5,8};
		int max=obj.getLargestNumber(ar);
		System.out.println(max);
		String str="Hello Java Today";
		String[] words=obj.getWordsFromString(str);
		for(String word:words)
		System.out.println(word);
		
		}
	}
	


