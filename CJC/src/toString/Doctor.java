package toString;

public class Doctor {
	int id;
	String name;
	String address;
	long mobno;
	double fees;
	
	public Doctor(int id, String name, String address, long mobno, double fees) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.mobno = mobno;
		this.fees = fees;
	}
	public String toString(){
		return "Id:"+id+"Name:"+name+"Address:"+address+"Mobno:"+mobno+"Fees:"+fees;
	}

}
