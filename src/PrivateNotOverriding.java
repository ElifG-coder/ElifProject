
public class PrivateNotOverriding {
	private void hello() {
		System.out.println("I am private method");
	}
	

}
class Child1 extends PrivateNotOverriding{
	//we are not overriding,we just declaring private method inside the child class
	private void hello() {
		System.out.println("Hello from child class");
	}
	
}
