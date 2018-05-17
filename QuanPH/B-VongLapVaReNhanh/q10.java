/*
 //Nhân hai số nguyên mà không sử dụng phép nhân.
 */
package B_VongLapVaReNhanh;

import java.util.Scanner;

public class q10 {

    public static void main (String[] args) 
    {
        int result = 0;  
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập m:");
        int m =input.nextInt();
        System.out.println("Nhập n:");
        int n = input.nextInt();
       
        while (n > 0)
        {
             if ((n & 1 ) != 0)
                 result = result + m;
            m = m << 1;
            n = n >> 1;
        }
        System.out.println(result);    
    }
}
