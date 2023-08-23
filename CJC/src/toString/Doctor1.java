package toString;

public class Doctor1 {
	int id;
	String name;
	String address;
	long mobno;
	double fees;
	
	@Override
	public String toString() {
		return "Id:"+id+"Name:"+name+"Address:"+address+"Mobno:"+mobno+"Fees:"+fees;
	}

}
