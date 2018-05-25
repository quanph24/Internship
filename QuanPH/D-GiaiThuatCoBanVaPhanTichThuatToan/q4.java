/*
 Sinh ra ngẫu nhiên N số nguyên, lưu vào mảng.
Tìm 3 số lớn nhất ? Đánh giá độ phức tạp thuật toán.
 */
package D_GiaiThuatCoBanVaPhanTichThuatToan;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class q4 {
   public static void main(String args[]) {
  
         Scanner sc = new Scanner(System.in);
         Random rd = new Random();
         System.out.print("n=");
         int n = sc.nextInt();
         sc.close();
         int[] arr = new int[n];
         for(int i=0;i<n;i++) {
          arr[i] = rd.nextInt(Integer.MAX_VALUE);
         }
         
         System.out.println("Day so:");
         for(int i=0;i<n;i++)
          System.out.print(arr[i]+"\t");
         System.out.println();
         
         Arrays.sort(arr);
         System.out.println("Day so sau khi sap xep tang dan:");
         for(int i=0;i<n;i++)
          System.out.print(arr[i]+"\t");
         System.out.println();
         
         System.out.println("3 so lon nhat la:");
         for(int j=arr.length-1;j>arr.length-4;j--)
          System.out.print(arr[j]+"\t");
     } 
}
