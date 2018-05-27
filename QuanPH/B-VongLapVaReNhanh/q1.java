/*
    Viết chương trình tính thứ của ngày nhập vào từ dòng lệnh. (Nhập vào 3 số: d(ngày), m(tháng), y(năm))
   Hint: Sử dụng công thức sau:
   y0 = y - (14 - m) / 12
   x = y0 + y0/4 - y0/100 + y0/400
   m0 = m + 12 * ((14 - m) / 12) - 2
   d0 = (d + x + (31*m0)/ 12) mod 7
 */
package B_VongLapVaReNhanh;

import java.util.Scanner;

public class q1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập d(ngay):");
        int d = input.nextInt();
        System.out.println("Nhập m(thang):");
        int m = input.nextInt();
         System.out.println("Nhập y(thang):");
        int y = input.nextInt();
        
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31*m0)/ 12) % 7 ;
        System.out.println("d0= "+d0);
        switch(d0){
            case 0: 
                System.out.println("ChuNhat");
                break;
            case 1: 
                System.out.println("Thu Hai");
                break;
            case 2: 
                System.out.println("Thu Ba");
                break;
            case 3: 
                System.out.println("Thu Tu");
                break;
            case 4: 
                System.out.println("Thu Nam");
                break;
            case 5: 
                System.out.println("Thu Sau");
                break;
            case 6: 
                System.out.println("Thu Bay");
                break;    
        }
    }
}
