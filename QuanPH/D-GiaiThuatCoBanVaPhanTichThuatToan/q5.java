/*
 Viết hàm số tìm kiếm nhị phân (binary search - Thời gian chạy ~log(N)).
Input (đầu vào): là 1 mảng các số nguyên đã được sắp xếp theo trật tự tăng dần và một số nguyên cần tìm.
Output (đầu ra): là index (chỉ số) phần tử cần tìm nếu thấy và nếu không thấy là -1.
Viết cả chương trình (main) để kiểm tra (test), trong đó sinh ra N số ngẫu nhiên, rồi sắp xếp bằng hàm có sẵn trang Java.
 */
package D_GiaiThuatCoBanVaPhanTichThuatToan;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class q5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so phan tu cua mang ban dau N: ");
        int N = input.nextInt();
        int[] arr = new int[N];
        Random rd = new Random();

        for (int i = 0; i < N; i++) {
            arr[i] = rd.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("Nhap so nguyen Can tim x= ");
        int x = input.nextInt();

        int lower = 0;
        int upper = N - 1;
        while (0 == 0) {
            int mid = lower + (upper - lower) / 2;

            if (upper < lower) {
                System.out.println("X ko ton tai trong mang");
                break;
            }

            if (arr[mid] < x) {
                lower = mid + 1;
            }

            if (arr[mid] > x) {
                upper = mid - 1;
            }

            if (arr[mid] == x) {
                System.out.println("index (chỉ số) phần tử cần tìm la: " + mid);
                break;
            }
        }
    }
}
