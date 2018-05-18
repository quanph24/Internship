package bai3;
import java.util.Scanner;
public class Bai3 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int m,n;
		System.out.println("Nhap vao so hang va cot cua mang:");
		m = sc.nextInt();
		n = sc.nextInt();
		boolean[][] arr = new boolean[m][n];  
		System.out.println("Nhap gia tri cho mang:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextBoolean(); 
			}  
			System.out.println();
		}
		System.out.println("In mang:");
		for (int k=0;k<n;k++)
			System.out.print("\t"+(k+1));
		System.out.println();
		for (int i = 0; i < m; i++) {
			System.out.print((i+1)+"\t");
			for (int j = 0; j < n; j++) {
				if(arr[i][j]==true)
					System.out.print("*\t");
				else
					System.out.print(" \t");
			}
			System.out.println();
		}
	}

}
