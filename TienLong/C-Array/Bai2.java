package bai2;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao so phan tu cua mang: ");
		n = sc.nextInt();
		double arr[] = new double[n];
		System.out.println("Nhap mang:");
		for(int i=0; i<n; i++) {
			System.out.print("arr["+(i+1)+"]=");
			arr[i] = sc.nextDouble();
		}
		sc.close();
		int i,j;
		for(i=0, j=arr.length-1 ; i<arr.length/2 ; i++ , j--) {
			arr[i] = arr[i] + arr[j];
			arr[j] = arr[i] - arr[j];
			arr[i] = arr[i] - arr[j];
		}
		
		for( i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}

	}
	
}


