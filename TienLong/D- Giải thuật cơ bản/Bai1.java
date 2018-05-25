//Với 0 < k < N cho trước, sinh ra k số nguyên trong đoạn [-N, N] khác nhau đôi một. Tìm số các cặp ai, aj thỏa mãn 3 điều kiện sau: 
//	a) ai và aj nằm trong k số vừa sinh ra; b) ai khác aj; và c) tổng (ai + aj) bằng 0
package bai1;

import java.util.*;

public class Bai1 {

	static Random rd = new Random();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int N, k;
		System.out.print("N=");
		N = sc.nextInt();
		do {
			System.out.print("k=");
			k = sc.nextInt();
		} while (k > 2 * N + 1);

		int a[] = new int[k];
		taoMang(k, N, a);
		for (int element : a)
			System.out.print(element + "\t");
		System.out.println();
		System.out.println("Co "+findingPairs(k, a)+" cap");
		sc.close();
	}

	public static int findingPairs(int k, int a[]) {
		int count = 0;
		for (int i = 0; i <= k/2; i++)
			for (int j = k-1; j > k/2; j--) {
				if (a[i] + a[j] == 0) {
					System.out.println("cap: " + a[i] + " " + a[j]);
					count++;
				}
			}
		return count;
	}

	public static void taoMang(int k, int N, int a[]) {
		int x;
		for (int i = 0; i < k; i++) {
			System.out.print("a[" + i + "]=");
			x = sc.nextInt();
			if (checkA(k, x, a) == false) {
				System.out.println("ban can nhap cac so khac nhau");
				i--;
			} else
				a[i] = x;
		}
	}

	public static boolean checkA(int k, int x, int a[]) {
		for (int i = 0; i < k; i++) {
			if (a[i] == x)
				return false;
		}
		return true;
	}

}
