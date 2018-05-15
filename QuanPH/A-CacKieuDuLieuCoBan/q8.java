/*
 Viết chương trình nhập vào 3 số nguyên dương và trả về true nếu một trong ba số lớn hơn tổng của hai số kia.
 */
package question1;

import java.util.Scanner;

public class q8 {
     public static void main(String[] args) {
        int a, b,c;
        Scanner input = new Scanner(System.in);
      
            System.out.println("Nhập số nguyen duong a = ");
            a = input.nextInt();
            System.out.println("Nhập số nguyen duong b = ");
            b = input.nextInt();
            System.out.println("Nhập số nguyen duong c = ");
            c = input.nextInt();
            if (a >(b+c))
                System.out.println(a +" lớn hơn tổng của "+ b +" và"+c);
            if (b >(a+c))
                System.out.println(b +" lớn hơn tổng của "+ a +" và"+c);
            if (c >(a+b))
                System.out.println(c +" lớn hơn tổng của "+ a +" và"+b);
            else{
                System.out.println("Không có số nào lớn hơn tồng 2 số còn lại");
            }
            }
            
                 
    }

