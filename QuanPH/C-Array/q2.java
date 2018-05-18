/*
 Viết đoạn mã đảo ngược thứ tự của mảng một chiều a[] gồm các giá trị double. 
 */
package C_Array;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập kích thước mảng:");
        int n =input.nextInt();
        double a[] = new double[n];
        System.out.println("Nhập giá trị"+n+ " phần tử:");
        for( int i = 0; i < n ; i ++){
            a[i] = input.nextDouble();
        }
        System.out.println("Mảng sau khi đảo ngược thứ tự là");
        for(int i = n-1 ; i >= 0 ; i --){
            System.out.println(a[i] + " ");
        }
    }
    
}
