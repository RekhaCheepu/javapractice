package oop_inheritance;

public class Bmw extends Car {
	int speed=200;
	public Bmw() {
		System.out.println("Bmw --constructor");
	}
	@Override
	public void start() {
		System.out.println("Bmw---start");
	}
	public void autoParking() {
		System.out.println("Bmw----autoparking");
	}
	
	public static void billing() {
		System.out.println("Bmw ---billing");
	}
	public void getEngineInfo() {
		Engine eg=new Engine();
		eg.engine();
		
	}

}
