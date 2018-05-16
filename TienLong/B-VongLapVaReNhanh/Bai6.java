package bai6;
import java.util.Scanner;
public class Bai6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.print("n=");
		n = scanner.nextInt();
		scanner.close();
		for(int i=0; i<n; i++)
		{
			System.out.print("\t"+Math.random());
		}
	}
	

}
