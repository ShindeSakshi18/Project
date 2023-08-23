package toString;

public class Doctor2 {
	private int id;
	private String name;
	private String address;
	private long mobno;
	private double fees;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setMobno(long mobno) {
		this.mobno = mobno;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	
	public int getId() {
		return id;
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
	public double getFees() {
		return fees;
	}
	
	@Override
	public String toString() {
		return "Id:"+id+"Name:"+name+"Address:"+address+"Mobno:"+mobno+"Fees:"+fees;
	}


}
