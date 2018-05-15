/*
 Giả sử x và y có kiểu double biểu diễn tọa độ decac (x, y) của 1 điểm trên mặt phẳng. 
 Tính khoảng cách từ điểm (x, y) đến gốc tọa độ.
 */
package question1;

import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        double x,y, kc;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập tọa độ x=");
        x = input.nextDouble();
        System.out.println("Nhập tọa độ y=");
        y = input.nextDouble();
        
        // tọa độ từ điểm A(x,y) đến gốc tọa độ là đường chéo của tam giác vuông có 2 cạnh góc vuông là x và y
        kc = Math.sqrt(x*x+y*y);
        System.out.println("Vậy khoảng cách từ điểm A(x,y) đến gốc tọa độ là "+ kc);
    }
}
