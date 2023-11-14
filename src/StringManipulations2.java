
public class StringManipulations2 {

	public static void main(String[] args) {
		String name="Sunday Morninggg";
		String name1=" is breakfast day ";
		for(int i=0;i<name.length();i++) {
			System.out.print(name.charAt(i)+",");
		}
		System.out.println();
		System.out.println("---Reverse order---");
		
		char reverse;
		for(int i=name.length()-1;i>-1;i--) {
			reverse=name.charAt(i);
			System.out.print(reverse);
		}System.out.println();
		
		char index=name.charAt(5);
		System.out.println(index);
		
		char index1=name.charAt(6);
		System.out.println("6.index is "+index1+" of name");
		
		int index2=name.indexOf('n');
		System.out.println(index2);
		
		int index3=name.indexOf("Morning");
		System.out.println(index3);
		
		String index4=name.substring(3);
		System.out.println(index4);
		
		String index5=name.substring(3, 8);
		System.out.println(index5);
		
		int index6=name.indexOf('g');
		System.out.println(index6);
		
		int index7=name.lastIndexOf('g');
		System.out.println(index7);
		
		String index8=name.concat(name1);
		System.out.println(index8);
		
		String index9=name.trim().concat(name1);
		System.out.println(index9);
		
		String index10=name1.trim().concat(name);
		System.out.println(index10);
		
		boolean index11=name.startsWith("S");
		System.out.println(index11);
		
		boolean index12=name.endsWith("k");
		System.out.println(index12);
		

	}

}
