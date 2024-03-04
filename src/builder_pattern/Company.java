package builder_pattern;

public class Company {
	
	public Company() {
		System.out.println("company constructor");
	}
	public Company(String name,double salary) {
		System.out.println("emp info:"+name+" "+salary);
	}

}
