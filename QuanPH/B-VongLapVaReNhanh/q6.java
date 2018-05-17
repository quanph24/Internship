/*
 Viết một chương trình nhập số nguyên N từ dòng lệnh và sử dụng Math.random() để in N số
thực ngẫu nhiên thuộc [0; 1], sau đó in giá trị trung bình của chúng.
 */
package B_VongLapVaReNhanh;

import java.util.Random;
import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số nguyên n:");
        int n = input.nextInt();
        Random rd = new Random();
        double tong= 0;
        for(int i=1;i<=n;i++){
             double a = rd.nextDouble();
             System.out.println("số random thứ "+i +": "+ a );
             tong+= a;
        }
        System.out.println("Giá trị trung bình của chúng là: "+(tong/n));
        
    }
}
