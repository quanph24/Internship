package bai6;
import java.util.Scanner;

public class Bai6 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n;
		
		System.out.println("Nhap vao so hang, cot cua ma tran vuong:");
		n = sc.nextInt();
		int[][] a = new int[n][n];
		nhapMaTran(a,n);
		inMaTranBanDau(a,n);
		inMaTranHoanVi(a,n);
		sc.close();
	}
	
	public static void nhapMaTran(int a[][], int n) {
		System.out.println("nhap vao cac phan tu cua mang 2 chieu:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("\ta["+i+"]["+j+"]=");
				a[i][j] = sc.nextInt();
			}
		}
	}
	
	public static void inMaTranBanDau(int a[][], int n) {
		System.out.println("Ma tran ban dau: ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}	
	}
	
	public static void inMaTranHoanVi(int a[][], int n) {
		System.out.println("Ma tran hoan vi: ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[j][i]+"\t");
			}
			System.out.println();
		}
	}

}
