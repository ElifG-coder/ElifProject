
public class SuperName {
	String name="Elif";
	String lastName="Gokrem";
	void hello() {
		System.out.println("I am parent class method");
	}
	
}
class Child extends SuperName{
	String name="Bulent";
	public void disPlay() {
		System.out.println(name);
		System.out.println(lastName);
		System.out.println(super.name);
	}
	void sayHello() {
		this.disPlay();//compiler adds this
		hello();//compiler adds super
	}
}
