/*
 Viết chương trình để hoán đổi hàng thành cột của 1 mảng hai chiều
 */
package C_Array;

import java.util.Scanner;

public class q5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập hàng a:");
        int a = input.nextInt();
        System.out.println("Nhập cột b:");
        int b = input.nextInt();
        // khai báo mảng 
        int[][] array1 = new int[a][b];

        //Nhập mảng
        System.out.println("Nhập mảng:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                array1[i][j] = input.nextInt();
            }
            System.out.println();
        }

        //In mảng
        System.out.println("Mảng ban đầu:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.println(array1[i][j] + "\t");
            }

        }

        //In hoán đổi
        System.out.println("Mảng hoán đổi hàng thàng cột:");
        int[][] array2 = new int[b][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                array2[j][i] = array1[i][j];
            }
        }
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(array2[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
