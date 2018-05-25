package bai3;

import java.util.*;

public class Bai3 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Nhap vao: ");
		String str = sc.nextLine();
		sc.close();

		System.out.print(sortGiftCode(str));

	}

	static String sortGiftCode(String str) {
		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		String str2 = new String(arr);
		return str2;
	}

}
