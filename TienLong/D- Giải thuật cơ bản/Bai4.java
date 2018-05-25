//Sinh ra ngẫu nhiên N số nguyên, lưu vào mảng.
//Tìm 3 số lớn nhất ? Đánh giá độ phức tạp thuật toán.
package bai4;

import java.util.*;

public class Bai4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		System.out.print("n=");
		int n = sc.nextInt();
		sc.close();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = rd.nextInt(Integer.MAX_VALUE);
		}

		System.out.println("Day so:");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + "\t");
		System.out.println();

		Arrays.sort(arr);
		System.out.println("Day so sau khi sap xep tang dan:");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + "\t");
		System.out.println();

		System.out.println("3 so lon nhat la:");
		for (int j = arr.length - 1; j > arr.length - 4; j--)
			System.out.print(arr[j] + "\t");
	}

	// Độ phức tạp của thuật toán: O(n)

	// static int partition(int arr[], int low, int high)
	// {
	// int key = arr[high];
	// int i = (low-1);
	// for (int j=low; j<high; j++)
	// {
	// if (arr[j] <= key)
	// {
	// i++;
	// int temp = arr[i];
	// arr[i] = arr[j];
	// arr[j] = temp;
	// }
	// }
	// int temp = arr[i+1];
	// arr[i+1] = arr[high];
	// arr[high] = temp;
	//
	// return i+1;
	// }
	//
	// static void sort(int arr[], int low, int high)
	// {
	// if (low < high)
	// {
	// int n = partition(arr, low, high);
	// sort(arr, low, n-1);
	// sort(arr, n+1, high);
	// }
	// }
	//
	// public static void main(String args[])
	// {
	// Scanner sc = new Scanner(System.in);
	// Random rd = new Random();
	// System.out.print("n=");
	// int n = sc.nextInt();
	// sc.close();
	// int[] arr = new int[n];
	// for(int i=0;i<n;i++) {
	// arr[i] = rd.nextInt(Integer.MAX_VALUE);
	// }
	//
	// System.out.println("Day so:");
	// for(int i=0;i<n;i++)
	// System.out.print(arr[i]+"\t");
	//
	// System.out.println();
	//
	// System.out.println("3 so lon nhat la:");
	// for(int j=arr.length-1;j>arr.length-4;j--)
	// System.out.print(arr[j]+"\t");
	// }
}

// Độ phức tạp của thuật toán: