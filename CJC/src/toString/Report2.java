package toString;

public class Report2 {
	public static void main(String[] args) {
		Patient2 p = new Patient2();
		p.setId(1);
		p.setName("ABC");
		p.setAddress("Nashik");
		p.setDisease("Maleria");
		p.setMobno(7543270021l);
		p.setBloodgroup("B+ve");
		
		Hospital2 h = new Hospital2();
		h.setName("PQR");
		h.setAddress("Pune");
		h.setMobno(9234562320l);
		
		Doctor2 d = new Doctor2();
		d.setId(2);
		d.setName("XYZ");
		d.setAddress("Mumbai");
		d.setMobno(972341200l);
		d.setFees(10000.00);
		
		System.out.println(p);
		System.out.println(h);
		System.out.println(d);
		
	}

}
