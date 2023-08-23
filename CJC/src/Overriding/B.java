package Overriding;

public class B extends A {
	public int m1() {
		System.out.println("method m1");
		return 10;
	}
	public void m2(char c) {
		
	}
	private int m3() {
		System.out.println("method m3");
		return 8;
	}
	protected void m4() {
		System.out.println("method m4");
		
	}
	public B m5() {
		B b = new B();
		System.out.println("method m5");
		return b;
		
		
		
	}
	public static void main(String[] args) {
		A a = new B();
		a.m1();
		a.m2('A');
		a.m4();
		a.m5();
		
		A a2 = new A();
		a2.m1();
		a2.m2('B');
		a2.m4();
		a2.m5();
		
		B b = new B();
		b.m1();
		b.m2('C');
		b.m4();
		b.m5();
		
	}
	
	

}
