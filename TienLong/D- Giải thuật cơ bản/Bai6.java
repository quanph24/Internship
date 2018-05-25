package bai6;

import java.util.Scanner;

public class Bai6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap co so x = ");
		double x = sc.nextDouble();
		System.out.print("nhap so mu n = ");
		int n = sc.nextInt();
		sc.close();
		System.out.format("%f^%d = %f", x, n, pow(x, n));

	}

	public static double pow(double x, int n) {
		if (n == 0)
			return 1;
		else if (n == 1)
			return x;
		else {
			double temp = pow(x, n / 2);
			if (n % 2 == 0)
				return temp * temp;
			else
				return temp * temp * x;
		}

	}
}
