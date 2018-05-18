/*
 Viết chương trình chuyển vị mảng vuông tại chỗ mà không cần tạo một mảng thứ hai.
 */
package C_Array;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class q6 {

  

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số phần tử ma trận vuông a:");
        int a = input.nextInt();
       
        // khai báo mảng 
        int[][] array1 = new int[a][a];

        //Nhập mảng
        System.out.println("Nhập mảng:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                array1[i][j] = input.nextInt();
            }
            System.out.println();
        }

        //In mảng
        System.out.println("Mảng ban đầu:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.println(array1[i][j] + "\t");
            }

        }

        //In hoán đổi
        System.out.println("Mảng hoán vị:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.println(array1[j][i] + "\t");
            }
    }
}}
