package task8;
import java.util.Scanner;
public class Task8 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.print("a=");
			 a = scanner.nextInt();
			System.out.print("b=");
			 b = scanner.nextInt();
			System.out.print("c=");
			 c = scanner.nextInt();
		} while((a<=0)||(b<=0)||(c<=0));
		if((a>b+c)||(b>a+c)||(c>a+b))
			System.out.println("true");
		else
			System.out.println("false");

	}

}
