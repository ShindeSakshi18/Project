package conditional_statement;
import java.util.Scanner;
public class Details {
	public void addPlayer() {
		Scanner sc = new Scanner(System.in);
		Player p = new Player();
		System.out.println("Enter id");
		p.setId(sc.nextInt());
		System.out.println("Enter name");
		p.setName(sc.next()+sc.nextLine());
		System.out.println("Enter address");
		p.setAddress(sc.next()+sc.nextLine());
		System.out.println("Enter mobile number");
		p.setMobno(sc.nextLong());
		System.out.println("Enter score");
		p.setScore(sc.nextDouble());
		
	}
	public void viewPlayer() {
		
	}
	public void updateScore() {
		
	}
	public void finalScore() {
		
	}

}
