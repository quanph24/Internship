//Viết chương trình lấy đối số dòng lệnh k và in tất cả các số mũ của k trong
//kiểu long
package B_VongLapVaReNhanh;

import java.util.Scanner;


public class q8 {
        public static void main(String[] args) {
       System.out.println(Long.MAX_VALUE);
       Scanner input = new Scanner(System.in);
       System.out.println("Nhap vao so k : ");
       long k = input.nextLong();

       int i = 0;
      while (true) {
           if (Math.pow(k, i) <= Long.MAX_VALUE) {
               System.out.println(i);
           } else {
              break;
          }
           i++;

       }
   }
}
