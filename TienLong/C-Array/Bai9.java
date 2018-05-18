package bai9;
import java.util.Scanner;
public class Bai9 {
		static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n;
		System.out.println("Nhap so phan tu cua mang :");
		System.out.print("n= ");
		n = sc.nextInt();
		int[] arr = new int[n];
		
		nhapMang(arr,n);
		if(kiemTraLap(arr,n)==true)
			System.out.println("Khong co su trung lap");
		else
			System.out.println("co su trung lap");
	}
	
	public static void nhapMang(int arr[], int n) {
		for(int i=0;i<n;i++) {
			do {
				System.out.print("arr["+i+"]=");
				arr[i] = sc.nextInt();
			}while(arr[i]<1||arr[i]>n);
		}
	}
	
	public static boolean kiemTraLap(int arr[], int n) {
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				if(arr[j]==arr[i])
					return false;
			}
		}
		return true;
	}

}
