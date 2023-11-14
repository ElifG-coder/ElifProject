
public class DrivableTest {

	public static void main(String[] args) {
		Drivable obj=new Cars();
		obj.drive();
		//Drivable.MOVE_FAST=false;//hata verir
		
		Cars car=new Cars();
		car.drive();
		car.stop();
	}

}
