
public class MethodTask {
	protected int total(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}return sum;
	}
	
	
	 static String reverse(String str) {
		String reverse="";
		String[] word=str.split(" ");
		for(int i=word.length-1;i>=0;i--) {
			reverse=reverse+word[i]+" ";
			
		}return reverse;
		
		
	}
	
	public static void main(String[] args) {
		MethodTask obj=new MethodTask();
		int[] ar= {1,-2,3};
		int sum=obj.total(ar);
		System.out.println(sum);
		
		String str="Elif Gokrem";
		String reverse=MethodTask.reverse(str);
		System.out.println(reverse);
		
	}

}
