package bai7;
import java.util.Scanner;
public class Bai7 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n;
		
		System.out.println("Nhap vao so hang va cot cua ma tran vuong:");
		System.out.print("n=");
		n = sc.nextInt();
		
		boolean[][] arr1 = new boolean[n][n];  
		boolean[][] arr2 = new boolean[n][n];
		
		
		System.out.println("Nhap gia tri cho ma tran 1:");
		for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					arr1[i][j] = sc.nextBoolean(); 
			}  
		}
		
		
		System.out.println("Nhap gia tri cho ma tran 2:");
		for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					arr2[i][j] = sc.nextBoolean(); 
			}  
		}
		
		
		boolean[][] arr3 = new boolean[n][n];
		for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
            	arr3[i][j] = true;
                for (int k = 0; k < n; k++) {
                    arr3[i][j] = arr3[i][j] | (arr1[i][k] & arr2[k][j]);
                }
            }
        }
		
		for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
            	System.out.print(arr3[i][j]+"\t");
            }
            System.out.println();
		}
	}

}
