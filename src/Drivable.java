
public interface Drivable {
//compiler adds public static final by default
	boolean MOVE_FAST=true;
	//Compiler by defaults adds public abstract
	void drive();
}

abstract class Vehicles{
	abstract void stop();
}
//achieving multiple inharitance
class Cars extends Vehicles implements Drivable{

	@Override
	public void drive() {
		System.out.println("Car drives");
		
	}

	@Override
	void stop() {
		System.out.println("Car stops");
		
	}
	
}
