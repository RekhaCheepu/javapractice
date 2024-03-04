package oop_interface;


public interface USMedical extends WHO,UNHG {
	int bill_amount=10;
	
public void physioServices();
public void physioServices(int i);
public void physioServices(int i,int p);
	
	public void neuroServices();
	
	public void cardioServices();
	
	public void emargencySevices();
	
	public static void medicalResults() {
		System.out.println("US medical medical results");
	}
		
		default void Bills() {
			System.out.println("us medical bills");
			
		}

}
