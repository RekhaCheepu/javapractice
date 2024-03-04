package javaprogramms;

public class TestMethod {
	
	public void test() {
		System.out.println("test Method");
		int z=10+20+30;
		System.out.println(z);
		}
	public int PrintValue() {
		System.out.println("print value");
		int a=10;
		int b=20;
		int c=30;
		return c;
		}
	public String getTrainerName() {
		System.out.println("get trainer name");
		String name="Raj";
		return name;
	}
	public double getTotalBill() {
		System.out.println("get toal bill");
		int foodBill=100;
		double drinks=30.50;
		int dessert=40;
		double totalAmount=foodBill+drinks+dessert;
		return totalAmount;
	}
	
	public int add(int x,int y) {
		System.out.println("Adding two numbers");
		int sum=x+y;
		return sum;
	}
	public int generateBill(int totalProducts, int discount) {
		System.out.println("generating bill");
		int finalBill=totalProducts*10;
		return finalBill;
		
	}
	

	public static void main(String[] args) {
		TestMethod t=new TestMethod();
		t.test();
		int p=t.PrintValue();
		System.out.println(p-5);
		t.PrintValue();
		String g=t.getTrainerName();
		System.out.println(g);
		double bill=t.getTotalBill();
		System.out.println("final bill:"+(bill-50));
		
		int s=t.add(10, 20);
		System.out.println(s);
		
		int s1=t.add(50,29);
		System.out.println(s1);
		
	
	}

}
