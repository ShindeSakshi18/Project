package toString;

public class Report {
	public static void main(String[] args) {
		Patient p = new Patient(1, "ABC", "Pune", "Maleria", 7543270021l, "B+ve");
		Hospital h = new Hospital("XYZ", "Pune", 9234562320l);
		Doctor d = new Doctor(2, "PQR", "Nashik",  972341200l, 10000.00);
		System.out.println(p);
		System.out.println(h);
		System.out.println(d);
		
		
	}

}
