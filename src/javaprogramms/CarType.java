package javaprogramms;

public class CarType {
	String name;
	String color;
	int price;
	static final int wheels=4;

	public static void main(String[] args) {
		CarType c1=new CarType();
		c1.name="BMW";
		c1.color="Black";
		c1.price=60;
		
		CarType c2=new CarType();
		c2.name="Honda";
		c2.color="Green";
		c2.price=30;
		
		CarType c3=new CarType();
		c3.name="Audi";
		c3.color="White";
		c3.price=50;
		
		System.out.println(c1.wheels);
		System.out.println(CarType.wheels);
		System.out.println(wheels);
		
		System.out.println(c1.name+" "+c1.color+" "+c1.price+" "+CarType.wheels);
		//CarType.wheels=10;
		System.out.println(c1.name+" "+c1.color+" "+c1.price+" "+CarType.wheels);
		
		

	}

}
