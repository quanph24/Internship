//Viết một chương trình có tên MaxMin.java để tìm giá trị lớn nhất và nhỏ nhất của n số nguyên
//sử dụng ít hơn 3n/2 phép so sánh.
package bai7;

import java.util.*;

public class Bai7 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int n;
		System.out.print("Nhap so phan tu n= ");
		n = sc.nextInt();
		int[] a = new int[n];
		taoMang(n, a);
		timMaxMin(n, a);
	}

	static void taoMang(int n, int a[]) {
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "]=");
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + "\t");
		System.out.println();
	}

	static void timMaxMin(int n, int a[]) {
		int max, min, min1, max1;
		// 1 phép so sánh
		if (a[0] > a[1]) {
			max = a[0];
			min = a[1];
		} else {
			max = a[1];
			min = a[0];
		}

		for (int i = 1; i < n / 2; i++) {
			// mỗi vòng for chạy n/2 - 1 lần
			// 1 + (n/2 - 1) = n/2 phép so sánh
			if (a[2 * i - 2] >= a[2 * i - 1]) {
				max1 = a[2 * i - 2];
				min1 = a[2 * i - 1];
			} else {
				max1 = a[2 * i - 1];
				min1 = a[2 * i - 2];
			}
			// 3n/2 - 2 phép so sánh
			max = (max > max1) ? max : max1;
			min = (min < min1) ? min : min1;
		}
		if (n % 2 == 1) {
			// 3n/2 - 2 + 2 = 3n/2 phép so sánh
			max = (max > a[n - 1]) ? max : a[n - 1];
			min = (min < a[n - 1]) ? min : a[n - 1];
		}
		System.out.println("max=" + max);
		System.out.println("min=" + min);

	}

}
