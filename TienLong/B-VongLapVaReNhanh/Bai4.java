package bai4;
import java.util.Scanner;
public class Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float x,y;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao hai so thuc x,y :");
		System.out.print("x=");
		x = scanner.nextFloat();
		System.out.print("y=");
		y = scanner.nextFloat();
		scanner.close();
		test(x,y);
	}
	
	public static boolean test(float x, float y) {
		if(x>0 && x<1 && y>0 && y<1)
			return true;
		else
			return false;
	}

}
