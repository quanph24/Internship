/*
 Viết chương trình tính tổng giá trị của 2 con xúc sắc (với giá trị của 2 con xúc sắc là ngẫu nhiên)
hint: dùng Random để sinh số ngẫu nhiên từ 1 - 6
 */
package question1;

import java.util.Random;


public class q10 {
    public static void main(String[] args) {
         Random rd = new Random();
         // con xúc sắc có 6 mặt ứng vs giá trị 1 đến 6
        int a[] = new int[]{1,2,3,4,5,6};
        int x1 = a[rd.nextInt(a.length)];
        int x2 = a[rd.nextInt(a.length)];
        int tong =  x1+x2;
        
        System.out.println("Giá trị khi gieo con xúc sắc thứ nhất là: "+ x1);
        System.out.println("Giá trị khi gieo con xúc sắc thứ hai là: "+ x2);
        
        System.out.println("Vậy tổng giá trị 2 con súc xắc là: " + tong);
    }
    
}
