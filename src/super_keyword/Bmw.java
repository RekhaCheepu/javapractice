package super_keyword;

public class Bmw extends Car {
	int maxspeed=200;
	public Bmw() {
		//super();
		System.out.println("bmw const");
	}
	public void racing() {
		System.out.println("Bmw--racing");
	}
	public static void refuel() {
		System.out.println("Bmw--racing");
	}
	private void testdrive() {
		System.out.println("Bmw--testing");
	}
	public void info() {
		int carSpeed=super.maxspeed;
		System.out.println(carSpeed);
		System.out.println(maxspeed);
		super.racing();
		racing();
		System.out.println(price);
		System.out.println(super.price);
	//	System.out.println(super.maxspeed);
		
		refuel();
		super.refuel();
		Car.refuel();
		testdrive();
		
	}
	

	public static void main(String[] args) {
		Bmw b=new Bmw();
		b.info();

	}

}
