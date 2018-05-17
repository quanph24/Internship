package bai8;
import java.util.Scanner;
public class Bai8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("k=");
		long k = sc.nextLong();
		sc.close();
		for(long i=0; i<Long.MAX_VALUE;i++) {
			if(Math.pow(k,i)>Long.MAX_VALUE)
				break;
			else {
				System.out.print(Math.pow(k,i)+"\t");
			}
		}
	}

}
