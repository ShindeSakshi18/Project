package toString;

public class Patient1 {
	int id;
	String name;
	String address;
	String disease;
	long mobno;
	String bloodgroup;
	
	@Override
	public String toString() {
		return "Id:"+id+"Name:"+name+"Address:"+address+"Disease:"+disease+"Mobno:"+mobno+"Bloodgroup:"+bloodgroup;
	}
	

}
