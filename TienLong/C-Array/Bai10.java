package bai10;
import java.util.Scanner;
public class Bai10 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n=52;
		int[] arr = new int[n];
		int[] A = new int[13];
		int[] B = new int[13];
		int[] C = new int[13];
		int[] D = new int[13];
		chiaBai(arr,A);
		chiaBai(arr,B);
		chiaBai(arr,C);
		chiaBai(arr,D);
		

	}
	public static void chiaBai(int arr[], int A[]) {
		for(int i=0;i<52;i++) {
			for(int j=0;j<13;j++) {
				for(int k=0;k<j;k++) {
					//kiem tra xem nguoi choi da co quan bai do chua
					if(A[k]==A[j])
						continue;
					else
						{
						//chia bai cho nguoi choi roi xoa quan bai do khoi bo bai
							A[j]=arr[i];
							delete(arr,i);
						}
				}
			}
		}
	}
	// xoa quan bai khoi bo bai sau khi chia
	public static void delete(int a[],int n) {
		for(int x=0;x<n;x++)
			a[x]=a[x+1];
		n--;
	}
}

