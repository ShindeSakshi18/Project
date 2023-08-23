package toString;

public class Hospital {
	String name;
	String address;
	long mobno;
	public Hospital(String name, String address, long mobno) {
		this.name = name;
		this.address = address;
		this.mobno = mobno;
	}
	public String toString() {
		return "Name:"+name+"Address:"+address+"Mobno:"+mobno;
	}

}
