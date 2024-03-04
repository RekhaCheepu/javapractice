package javaprogramms;

import java.util.Arrays;

public class Company {
	
	public String[] getEmployeeDevices(String empName) {
		System.out.println("getting employee devices for employee:"+empName);
		String device[]=new String[5];
		if(empName.equals("naveen")) {
			String devices[]= {"macbook pro","i-pd","mouse","keyboard","i phone"};
//			device[0]="macbook pro";
//			device[1]="i-pd";
//			device[2]="mouse";
//			device[3]="keyboard";
//			device[4]="i phone";
		}
		else if(empName.equals("Sanjay")) {
			String devices[]= {"samsung pro","keyboard","samsung s7"};
//				device[0]="samsung pro";
//				device[1]="keyboard";
//				device[2]="samsung s7";	
				
			}
		else if(empName.equals("Meera")){
			String devices[]={"iphone15","iwatch"};
//				device[0]=" iphone15";
//				device[1]="iwatch";
			}
		else {
			System.out.println("emp name is not found"+empName);
		}
		return device;	
		}
	

	public static void main(String[] args) {
		
		Company c=new Company();
		String d1[]=c.getEmployeeDevices("Sanjay");
		
		
		System.out.println("Sanjay's devices are:"+d1.length);
		System.out.println(Arrays.toString(d1));
		

	}

}
