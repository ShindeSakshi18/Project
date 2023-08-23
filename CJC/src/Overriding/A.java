package Overriding;

public class A {
	public int m1() {
		System.out.println("m1-A");
		return 6;	
	}
	public void m2(char c) {
		
	}
	private int m3() {
		System.out.println("m3-A");
		return 10;
	}
	protected void m4() {
		System.out.println("m4-A");
		
	}
	public A m5() {
		A a = new A();
		return a;
		
		
	}
	

}
