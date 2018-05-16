package task7;
import java.util.Scanner;
public class Task7 {

	public static void main(String[] args) {
		int a,b;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("a=");
			a = scanner.nextInt();
			System.out.print("b=");
			b = scanner.nextInt();
		} while(a<=0||b<=0);
		
		if((a%b==0)||(b%a==0))
			System.out.println("true");
		else
			System.out.println("false");
		
	}
	

}
