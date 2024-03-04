package javaprogramms;

public class Department {
	
	public void sendMail() {
		System.out.println("send mail");
	}
		public static void getInfo() {
			System.out.println("getting info");
		}
	

	public static void main(String[] args) {
		Department d=new Department();
		d.sendMail();
		d.getInfo();
		Department.getInfo();
		getInfo();
		
		

	}

}
