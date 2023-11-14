
public class VehicleTest {

	public static void main(String[] args) {
		// new Vehicle("yellow");//abstract class oldugu icin hata verir
		//new Car("yellow","Sedan")//abstract class oldugu icin hata verir
        Vehicle tesla=new Tesla("white","Sedan","Tesla");
        tesla.drive();
        tesla.stop();
        tesla.brake();
        tesla.start();
       new Toyota("yellow","Sedan","Toyota");
       new Toyota("blue","Sedan","Toyota");
       Vehicle.total();//3
       Toyota.total();//3-->static method object'e ait degil class'a ait o yuzden sonuc degismez
       //2.yol total hesaplama icin ama once yukardaki objectleri kaldirman lazim outputta dogru sonuc vermesi icin
      /* Vehicle[] cars= {new Tesla("white","Sedan","Tesla"), new Toyota("yellow","Sedan","Toyota"),new Toyota("blue","Sedan","Toyota")};
      for(int i=0;i<cars.length;i++) {
    	  
       }Vehicle.total();*/
	}

}
