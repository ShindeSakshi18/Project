package abstractclass;

public class Test3 implements Mul {
	public int mul1(int i1, int i2) {
		return i1*i2;
	}
	public int mul2(int i1, int i2, int i3) {
		return i1*i2*i3;
	}
	
	public static void main(String[] args) {
		Test3 obj = new Test3();
		System.out.println(obj.mul1(3, 7));
		System.out.println(obj.mul2(1, 9, 1));
	}

}
