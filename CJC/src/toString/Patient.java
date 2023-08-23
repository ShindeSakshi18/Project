package toString;

public class Patient {
	int id;
	String name;
	String address;
	String disease;
	long mobno;
	String bloodgroup;
	public Patient(int id, String name, String address, String disease, long mobno, String bloodgroup) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.disease = disease;
		this.mobno = mobno;
		this.bloodgroup = bloodgroup;
		}
	public String toString() {
		return "Id:"+id+"Name:"+name+"Address:"+address+"Disease:"+disease+"Mobno:"+mobno+"Bloodgroup:"+bloodgroup;
		
	}

}
