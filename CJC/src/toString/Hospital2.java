package toString;

public class Hospital2 {
	private String name;
	private String address;
	private long mobno;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setMobno(long mobno) {
		this.mobno = mobno;
	}
	
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public long getMobno() {
		return mobno;
	}
	
	@Override
	public String toString() {
		return "Name:"+name+"Address:"+address+"Mobno:"+mobno;
	}



}
