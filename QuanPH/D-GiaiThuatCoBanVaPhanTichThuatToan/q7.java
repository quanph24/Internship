/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D_GiaiThuatCoBanVaPhanTichThuatToan;

import java.util.Scanner;


public class q7 {
     public static void main(String[] args) {
  int n;
  int array[] = new int[100];
  Scanner input = new Scanner (System.in);
  System.out.println("Nhap so phan tu cua mang: ");
  n = input.nextInt();
  for (int i=0;i<n;i++)
  {
   System.out.println("a["+i+"]: ");
   array[i] = input.nextInt();
  }
        int max = array[0];
        int  min = array[0];
        for (int i=0;i<n;i++)
        {
            if(max<array[i])
                max=array[i];
            if(min>array[i])
             min=array[i];
        }
        System.out.println("Giá trị lớn nhất: "+max);
        System.out.println("Giá trị nhỏ nhất: "+min);
 }
}
