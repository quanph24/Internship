/*
Viết đoạn mã in nội dung của một mảng boolean hai chiều, sử dụng * đại diện cho true và dấu cách đại diện cho false. 
Nhớ in cả chỉ số hàng và cột.
 */
package C_Array;

import java.util.Scanner;

public class q3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập hàng a:");
        int a = input.nextInt();
        System.out.println("Nhập cột b:");
        int b = input.nextInt();
        // khai báo mảng boolean 2 chiều
        boolean[][] array = new boolean[a][b];
        System.out.println("Nhập mảng:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                array[i][j] = input.nextBoolean();
            }
            System.out.println();
        }
        System.out.println("In nội dung mang voi * là true, dấu cách là false");
        for (int i = 0; i < a; i++) {
            System.out.print("Phần tử "+(i+1));
            for (int j = 0; j < b; j++) {
                if (array[i][j] == true) {
                    System.out.print("*\t");
                } else {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
    }
}
