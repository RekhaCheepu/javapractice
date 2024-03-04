package javaprogramms;

public class Employee {
	
	
	String name;
	int age;
	double salary;
	boolean isPerm;
	public static void main(String[] args) {
		Employee e=new Employee();
		e.name="vani";
		e.age=25;
		e.salary=22.34;
		e.isPerm=true;
		System.out.println(e.name);
		
		Employee e1=new Employee();
		System.out.println(e1.name);
		System.out.println(e1.age);
		System.out.println(e1.salary);
		System.out.println(e1.isPerm);
		
		new Employee().name="Tom";
		new Employee().age=28;
		
		Employee e3=new Employee();
		e3=null;
		//e3.name="Sunil";
	//	System.out.println(e3.name);
		
		Employee e4;
		//System.out.println(e4.name);

	}

}
