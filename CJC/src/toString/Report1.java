package toString;

public class Report1 {
	public static void main(String[] args) {
		Patient1 p = new Patient1();
		p.id = 1;
		p.name = "ABC";
		p.address = "Nashik";
		p.disease = "Maleria";
		p.mobno = 7543270021l;
		p.bloodgroup = "B+ve";
		
		Hospital1 h = new Hospital1();
		h.name = "PQR";
		h.address = "Pune";
		h.mobno = 9234562320l;
		
		Doctor1 d = new Doctor1();
		d.id = 2;
		d.name = "XYZ";
		d.address = "Mumbai";
		d.mobno = 972341200l;
		d.fees = 10000.00;
		
		System.out.println(p);
		System.out.println(h);
		System.out.println(d);
		
	}

}
