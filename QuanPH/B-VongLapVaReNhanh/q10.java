/*
 //Nhân hai số nguyên mà không sử dụng phép nhân.
 */
package B_VongLapVaReNhanh;

import java.util.Scanner;

public class q10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số nguyên m:");
        int m = input.nextInt();
        System.out.println("Nhập số nguyên n:");
        int n = input.nextInt();
        
        mutiply(m,n);

        long sum = 0;
        for (int i = 0; i < m; i++) {
            sum += n;
        }
        System.out.println(sum);
    }

    private static void mutiply(int m, int n) {
        
    }
}
