package javaprogramms;

public class Car {
	String name;
	String color;
	double price;
	String type;

	public static void main(String[] args) {
		Car c1=new Car();
		c1.name="BMW";
		c1.color="Red";
		c1.price=75.55;
		c1.type="Sedan";
		System.out.println(c1.color+" "+c1.name+" "+c1.price+" "+c1.type);
		
		Car c2=new Car();
		c2.name="Hatch back";
		c2.price=39.99;
		c2.type="small";
		
	//	System.out.println(c2.color+" "+c2.name+" "+c2.price+" "+c2.type);
		
		c2.color="blue";
		c2.price=45.90;
		System.out.println(c2.color+" "+c2.name+" "+c2.price+" "+c2.type);

	}

}
