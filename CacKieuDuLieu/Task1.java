package task1;
import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
			double x, rad;
			Scanner scanner = new Scanner(System.in);
			System.out.println("Nhap x:");
			x = scanner.nextDouble();
			rad = Math.PI*(x/180);
			double dangThuc = Math.sin(rad)*Math.sin(rad)+Math.cos(rad)*Math.cos(rad);
			if(dangThuc==1)
				System.out.println("dang thuc dung");
			else 
				System.out.println("dang thuc sai");
			//kết quả không phải lúc nào cũng chính xác bằng 1 khi nhập x có giá trị lớn bất kì
			//do bị làm tròn 2 lần: sau khi tính bình phương và sau khi tính tổng

	}

}
