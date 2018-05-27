/*
 Với 0 < k < N cho trước, sinh ra k số nguyên trong đoạn [-N, N] khác nhau đôi một. Tìm số các cặp ai, aj thỏa mãn 3 điều kiện sau:
a) ai và aj nằm trong k số vừa sinh ra; b) ai khác aj; và c) tổng (ai + aj) bằng 0
 */
package D_GiaiThuatCoBanVaPhanTichThuatToan;


import java.util.Random;
import java.util.Scanner;

public class q1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap N:");
        int N = input.nextInt();
        System.out.println("k so nguyen ban muon sinh ra la k: ");
        int k = input.nextInt();
        if (k > N) {
            return;
        }
        int[] arr = new int[k];
        Random rd = new Random();
        for (int i = 0; i < k; i++) {
            int a = rd.nextInt(N);
            int op = rd.nextInt(2);
            if (op == 0) {
                a *= -1;
            }
            if (i == 0 || arr[i-1]!=a) {
                arr[i] = a;
            }else{
                i--;
            }
        }
        int result = 0;
        for (int i = 0; i < k; i++) {
            for (int j = i+1; j < k; j++) {
                if (arr[i]!=arr[j] && arr[i]+arr[j]==0) {
                    result++;
                }
            }
        }
        
        System.out.println(result);
    }
}
