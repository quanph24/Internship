package task10;
import java.util.Random;
public class Task10 {

	public static void main(String[] args) {
		Random rd = new Random();
		int a = rd.nextInt(5)+1;
		int b = rd.nextInt(5)+1;
		System.out.println("Tong gia tri cua 2 con xuc xac la:"+(a+b));
	}

}
