  // In các số nguyên tố nhỏ hơn n. Với n < 10^7
package B_VongLapVaReNhanh;

import java.util.Scanner;

public class q9 {

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        do{
        System.out.println("Nhập số n:");
        n = input.nextInt();
        }while(n<2||n>=Math.pow(10, 7));
        System.out.printf("Tất cả các số nguyên tố nhỏ hơn %d là: \n", n);
        if (n >= 2) {
            System.out.println(2);
        }
        for (int i = 3; i < n; i += 2) {
            if (lasoNT(i)) {
                System.out.println(i);
            }
        }
    }

    // hàm kiểm tra số NT
    public static boolean lasoNT(int b) {
        if (b < 2) {
            return false;
        }
        for (int i = 2; i <= (b / 2); i++) {
            if (b % i == 0) {
                return false;
            }
        }
        return true;
    }

}
