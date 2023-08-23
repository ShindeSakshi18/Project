package Overriding;

public class Child extends Parent {
	@Override
	public void display() {
		System.out.println("Child_display_method");
	}
	private void m1() {
		System.out.println("child_m1");
	}
	@Override
	public void m2() {
		System.out.println("child_m2");
	}
	public static void m3() {
		System.out.println("child_m3");
	}

}
