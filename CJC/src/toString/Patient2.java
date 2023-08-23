package toString;

public class Patient2 {
	private int id;
	private String name;
	private String address;
	private String disease;
	private long mobno;
	private String bloodgroup;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public void setMobno(long mobno) {
		this.mobno = mobno;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
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
	public String getDisease() {
		return disease;
	}
	public long getMobno() {
		return mobno;
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	
	@Override
	public String toString() {
		return "Id:"+id+"Name:"+name+"Address:"+address+"Disease:"+disease+"Mobno:"+mobno+"Bloodgroup:"+bloodgroup; 
	}
	
	
	

}
