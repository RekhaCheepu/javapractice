package super_keyword;

public class Car extends Vehicle {
	//int maxspeed=100;
	int price=500;
	public Car() {
		System.out.println("car const");
	}
	public void racing() {
		System.out.println("car--racing");
		testdrive();
	}
	public static void refuel() {
		System.out.println("car--refuel");
	}
	private void testdrive() {
		System.out.println("car--testing");
	}
	

}
