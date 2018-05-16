package bai9;

import java.util.Scanner;

public class Bai9 {

	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.print("n=");
			n = scanner.nextInt();
		}while(n<2||n>=10000000);
		scanner.close();
		for(int i=5;i<n;i++) {
			if(soNguyenTo(i)==true)
				System.out.print(i+",");
		}
		
	}
	
	public static boolean soNguyenTo(int m) {
		for(int i=3;i<m;i++) {
			if(m%i==0)
				return false;
		}
		return true;
	}
	

}
