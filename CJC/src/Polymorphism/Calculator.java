package Polymorphism;

public class Calculator{
	public void calculate(int num1, int num2) {
		System.out.println("With two no of parameters:"+num1+num2);
	}
	public void calculate(int num1, int num2, int num3) {
		System.out.println("With two no of parameters:"+num1+num2+num3);
	}
	public void calculate(float num1, float num2) {
		System.out.println("With two float and float parameters:"+num1+num2);
	}
	public void calculate(double num1, double num2) {
		System.out.println("With two double and double parameters:"+num1+num2);
	}
	public void calculate(double num1, int num2) {
		System.out.println("With two different parameters:"+num1+num2);
	}
	public void calculate(int num1, double num2) {
		System.out.println("With two different sequence parameters:"+num1+num2);
	}
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.calculate(10, 20);
		c.calculate(10, 20, 30);
		c.calculate(10.1f, 20.1f);
		c.calculate(10, 20);
		c.calculate(20.2d, 30.2d);
		c.calculate(10.1d, 40);
		c.calculate(10, 20.1d);
		
	}
	
	
		
	}
