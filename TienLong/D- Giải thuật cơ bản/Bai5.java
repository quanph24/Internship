//Viết hàm số tìm kiếm nhị phân (binary search - Thời gian chạy ~log(N)).
//Input (đầu vào): là 1 mảng các số nguyên đã được sắp xếp theo trật tự tăng dần và một số nguyên cần tìm.
//Output (đầu ra): là index (chỉ số) phần tử cần tìm nếu thấy và nếu không thấy là -1.
package bai5;

import java.util.*;

public class Bai5 {

	public static int binarySearch(int a[], int k) {
		int l = 0, r = a.length - 1;
		while (l <= r) {
			int mid = l + (r - l) / 2;
			if (a[mid] == k)
				return mid;

			if (a[mid] < k)
				l = mid + 1;
			else
				r = mid - 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so phan tu cua mang n= ");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Nhap mang:");
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "]=");
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println("Mang sau khi sap xep tang dan:");
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + "\t");
		System.out.println();
		System.out.print("Nhap vao so nguyen can tim k= ");
		int k = sc.nextInt();
		sc.close();

		int result = binarySearch(a, k);
		if (result == -1)
			System.out.println("khong xuat hien");
		else
			System.out.println("xuat hien tai vi tri" + result);
	}

}
