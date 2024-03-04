package oop_encapsulation;

public class Testing {
	int a;
	int b;
	int c;
	public Testing() {
		this(3,5);
		System.out.println("hello");
		
	}
	public Testing(int a, int b) {
		
		this.a = a;
		this.b = b;
		
	}
	public Testing(int a, int b, int c) {
		
		this.a = a;
		this.b = b;
		this.c = c;
	}


	public static void main(String[] args) {
		Testing t=new Testing();
		System.out.println(t.a+" "+t.b+" "+t.c);

	}

}
