
public abstract class Vehicle {
	/*Abstract class ve static isleyiisni gosteriyor*/
	static int totalVehicle;
	 String color;
	/*bir tane instance variable oldugu icin onu initialize etmek icin bir parametreli constructor olusturuyoruz*/
	Vehicle(String color){
		this.color=color;
		totalVehicle++;
	}public static void total() {
		System.out.println("We build "+totalVehicle);
	}public void drive() {
		System.out.println("Vehicle drives");
	}public void stop() {
		System.out.println("Vehicle stops");
		
	}public abstract void start();
	public abstract void brake();
	
}
abstract class Car extends Vehicle{
	String carType;
	 
	/*Car(String carType){asagida neden bir yerine iki parametre girdigimi gostermek icin yaptim
		super("white");//hardcoding
		this.carType=carType;
	}*/
	
	/*hem kendi variable'ini hem de parent classin variable'ini initialize etmek icin iki pararmetreli constructor olusturuyoruz.*/
	Car(String color,String carType){
		super(color);
		this.carType=carType;
	}
	public void brake() {
		System.out.println(carType+" have brakes");
		
	}
}class Tesla extends Car{
    String make;
   /* Tesla(String make){
    	super("Sedan");//hardcoding
    	this.make=make;
    }*/
    Tesla(String color,String carType,String make){
    	super(color,carType);
    	this.make=make;
    }
    
    public void drive() {
    	System.out.println(make+" drives on autopilot");
    }
	@Override
	public void start() {
		System.out.println(make+" starts with voice");
		
	}
	public void display() {
		System.out.println("We have "+color+" "+make+" "+carType);
	}
	
}class Toyota extends Car{
String make;
	Toyota(String color, String carType,String make) {
		super(color, carType);
		this.make=make;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void start() {
		System.out.println(make+"starts without key");
		
	}
	
}
	

