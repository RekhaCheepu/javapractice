package oop_inheritance;

public class Test {

	public static void main(String[] args) {
	
		Bmw b=new Bmw();
		b.start();
		b.stop();
		Bmw.billing();
		b.billing();
		b.getEngineInfo();
		System.out.println(b.speed);
		Car c=new Car();
		c.start();
		c.stop();
		Car.billing();
		c.billing();
		c.refuel();
		System.out.println(c.speed);
		//topcasting
		Car c1=new Bmw();
		c1.start();
		c1.stop();
		c1.refuel();
		System.out.println(c1.speed);
		
		

	}

}
