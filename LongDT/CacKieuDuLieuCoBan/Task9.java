package task9;
import java.util.Scanner;
public class Task9 {

	public static void main(String[] args) {
		double x,y;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap toa do:");
		System.out.print("x=");
		x = scanner.nextDouble();
		System.out.print("y=");
		y = scanner.nextDouble();
		System.out.print("khoang cach tu diem co toa do(x,y) den goc toa do la:"+Math.sqrt(x*x+y*y));
		
	}

}
