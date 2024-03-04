package javaprogramms;

public class Users {
	
	String name;
	int id;
	String dob;
	String city;
	boolean isActive;
	
	public Users(String name,int id) {
		System.out.println("2pram");
		this.name=name;
		this.id=id;
	}
	

	public Users(String name, int id, String dob, String city, boolean isActive) {
		System.out.println("5 param cons");
		this.name = name;
		this.id = id;
		this.dob = dob;
		this.city = city;
		this.isActive = isActive;
	}
	


	public static void main(String[] args) {
		
Users u1=new Users("Sam",5);

Users u2=new Users("Ram", 3, "10/22/23", "Hyd", true);
System.out.println(u1.name+" "+u1.id);
System.out.println(u1.name);
System.out.println(u2.name+" "+u2.id+" "+u2.dob+" "+u2.city+" "+u2.isActive);

	}

}
