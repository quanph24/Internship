package bai10;
import java.util.Scanner;
public class Bai10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long x,y;
		Scanner scanner = new Scanner(System.in);
		System.out.print("x=");
		x = scanner.nextLong();
		System.out.print("y=");
		y = scanner.nextLong();
		scanner.close();
		System.out.println(multiply(x,y));
	}
	
	public static long multiply(long x, long y) {
		if(y==0)
			return 0;
		if(y>0)
			return(x+multiply(x,y-1));
		
		return -multiply(x,-y);
	}
}
