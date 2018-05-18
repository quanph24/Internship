package bai5;
import java.util.Scanner;
public class Bai5 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int m,n;
		
		System.out.println("Nhap vao so hang va cot cua mang 2 chieu ban dau:");
		m = sc.nextInt();
		n = sc.nextInt();
		int[][] a = new int[m][n];
		nhapMang(a,m,n);
		inMangBanDau(a,m,n);
		inMangHoanDoi(a,m,n);
		sc.close();
	}
	
	public static void nhapMang(int a[][], int m, int n ) {
		System.out.println("nhap vao cac phan tu cua mang 2 chieu:");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("\ta["+i+"]["+j+"]=");
				a[i][j] = sc.nextInt();
			}
		}
	}
	
	public static void inMangBanDau(int a[][], int m, int n) {
		System.out.println("Mang ban dau: ");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}	
	}
	
	public static void inMangHoanDoi(int a[][], int m, int n) {
		System.out.println("Mang sau khi hoan doi hang voi cot:");
		int[][] b = new int[n][m];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				b[j][i] = a[i][j];
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
