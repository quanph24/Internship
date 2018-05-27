/*
 Viết một chương trình có tên Power.java để tính toán hàm mũ p(x, n) được định nghĩa như sau: 
    p(x, n) = x . x ... x (n lần) (với n là một số nguyên không âm) 
    sao cho độ phức tạp tính toán là ~log(n)). Nên thử với x xấp xỉ 1 (ví dụ: 1.001) với n đủ lớn.
 */
package D_GiaiThuatCoBanVaPhanTichThuatToan;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap x: ");
        int x = input.nextInt();
        System.out.println("Nhap n: ");
        int n = input.nextInt();
        System.out.println("giá trị x^n: "+pow(x, n));
    }
    public static double pow(double x, int n) {
        switch (n) {
            case 0:
                return 1;
            case 1:
                return x;
            default:
                double temp = pow(x, n / 2);
                if (n % 2 == 0) {
                    return temp * temp;
                } else {
                    return temp * temp * x;
                }
        }
    }
}
