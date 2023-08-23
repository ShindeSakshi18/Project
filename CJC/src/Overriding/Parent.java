package Overriding;

public class Parent {
	public void display() {
		System.out.println("Parent_display_method");
	}
	private void m1() {
		System.out.println("parent_m1");
	}
	protected void m2() {
		System.out.println("parent_m2");
	}
	public static void m3() {
		System.out.println("parent_m3");
	}

}
