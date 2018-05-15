
// Viết một chương trình sử dụng Math.sin() và Math.cos() để kiểm tra đẳng thức sin^2(x) + cos^2(x) = 1 với x nhập từ dòng lệnh.
// Tại sao kết quả không phải lúc nào cũng chính xác bằng 1?
package question1;

import java.util.Scanner;

public class q1 {
    double a;
    double radian;
    
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Mời bạn nhập tọa độ góc a = ");
        double a = input.nextDouble();
        
        //quy giá trị góc a ra radian
        double radian = Math.PI * a/180;
        System.out.println("Giá trị góc a sau khi quy đổi sang radian là: "+ radian);
        
        // kiểm tra biểu thức sin^2(a) + cos^2(a) = 1;
        
        if(Math.sin(radian)*Math.sin(radian)+ Math.cos(radian)*Math.cos(radian) ==1){
            System.out.println("Biểu thức chính xác");
    }
        else{
            System.out.println("Biểu thức không phải lúc nào cũng bằng 1");
            //lý do vì biểu thức bị làm tròn
        }
    }
    
}
