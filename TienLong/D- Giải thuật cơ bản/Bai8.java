//Nhập k số nguyên khác nhau trong đoạn [-N,N]. tìm bộ 3 số có tổng bằng 0 và với thời gian ~N^2
package bai8;

import java.util.*;

public class Bai8 {

	static Random rd = new Random();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int N, k;
		System.out.print("N=");
		N = sc.nextInt();
		System.out.print("k=");
		k = sc.nextInt();
		int a[] = new int[k];

		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "]=");
			a[i] = sc.nextInt();
		}
		System.out.println();
		finding3Sum(k, N, a);
		sc.close();

	}

	public static int finding3Sum(int k, int N, int a[]) {
		int x, count = 0;
		if (checkA(k, N, a)) {
			for (int i = 0; i < k; i++)
				System.out.print(a[i] + "\t");
			System.out.println();
			for (int i = 0; i < k - 1; i++)
				for (int j = i + 1; j < k; j++) {
					x = a[i] + a[j];
					int y = Arrays.binarySearch(a, -x);
					if ((y >= 0) && (y != a[i]) && (y != a[j])) {
						System.out.format("Bo 3 so co tong bang 0: %d %d %d", a[i], a[j], -x);
						System.out.println();
					}

					count++;
				}
			return count;
		} else {
			System.out.println("Ban can nhap cac so khac nhau");
			return -1;
		}
	}

	public static boolean checkA(int k, int N, int a[]) {
		for (int i = 0; i < k; i++)
			for (int j = i + 1; j < k; j++) {
				if (a[i] == a[j])
					return false;
			}
		return true;
	}

}
