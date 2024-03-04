package oop_encapsulation;

public class User {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setName("Sam");
		e1.setSalary(45.83);
		e1.setAge(38);
		
		System.out.println(e1.getName()+" "+e1.getAge()+" "+e1.getSalary());
		
		Browser br=new Browser();
		br.launchBrowser();
		
		Customer c1=new Customer("Raj",123,"raj@gmail.com");
		c1.getEmailId();
		c1.getName();
		c1.getUserId();
		System.out.println(c1.getEmailId()+c1.getName()+c1.getUserId());
		c1.setEmailId("raj100@gmail.com");
		System.out.println(c1.getEmailId()+c1.getName()+c1.getUserId());
	}
	
	LoginPage lp1=new LoginPage("rekha","rr12345","admin");
	
	

}
