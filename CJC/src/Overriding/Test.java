package Overriding;

public class Test {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.display();
		p.m2();
		p.m3();
		
		Parent p1 = new Child();
		p1.display();
		p1.m2();
		p1.m3();
		
	}

}
