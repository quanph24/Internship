package bai10;
import java.util.Scanner;
public class Bai10 {
	public static void main(String[] args) {
		long x,y;
		Scanner sc = new Scanner(System.in);
		System.out.print("x=");
		x = sc.nextInt();
		System.out.print("y=");
		y = sc.nextInt();
		sc.close();
		
		System.out.println(multiply(x,y));
		}
	
	public static long multiply(long x, long y) {
		long s=0;
		while(y>1) {
			if((y&1)!=0)
				s += x;
			x = x<<1;
			y = y>>1;
		}
		return (x+s);
	}
		
		
	}

