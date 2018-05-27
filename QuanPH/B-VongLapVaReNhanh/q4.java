/*
Viết một đoạn mã trả về true nếu cả hai biến thực x và y nằm trong khoảng (0; 1), false nếu
ngược lại.
 */
package B_VongLapVaReNhanh;

import java.util.Scanner;


public class q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số thực x:");
        float x = input.nextFloat();
        System.out.println("Nhập số thực y:");
        float y = input.nextFloat();
        kiemtra(x,y);
        
}
     public static boolean kiemtra(float x,float y){
        if(x>0 && x<1 && y>0 && y<1){
            return true;
        }else{
            return false;
    }
    }
}
