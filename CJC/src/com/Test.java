package com;

public class Test {
	public static void main(String[] args) {
		Info i = new Info();
		Employee p = i.setEmp();
		i.getEmp(p);
		
		//i.getEmp(i.setEmp());
	}

}
