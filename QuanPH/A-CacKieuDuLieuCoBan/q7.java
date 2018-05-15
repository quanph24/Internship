/*
 Viết chương trình nhập vào hai số nguyên dương và trả về true nếu một trong hai số là bội số
của số kia.
 */
package question1;

import java.util.Scanner;

public class q7 {

    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
      
            System.out.println("Nhập số nguyen duong a = ");
            a = input.nextInt();
            System.out.println("Nhập số nguyen duong b = ");
            b = input.nextInt();
            if (a % b == 0 || b % a == 0) {
                System.out.println("Một trong 2 số là bội của nhau");
            }else{
                System.out.println("2 số không là bội của nhau ");
            }
            
                 
    }
}
