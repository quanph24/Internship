/*
 Cho một mảng N phần tử với mỗi phần tử có giá trị từ 1 đến N, viết chương trình xác định xem có sự trùng lặp trong mảng không.
 */
package C_Array;

import java.util.Scanner;

public class q9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập n");
        int n = input.nextInt();

        int[] a = new int[n];
        System.out.println("Nhập mảng:");
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }

        // xác định sự trùng lặp trong mảngs
        if(isRepeat(a,n)){
            System.out.println("Không có phần tử trùng");
        }else{
            System.out.println("Có phần tử trùng nhau");
        }
        
        
    }
    
    public static boolean isRepeat(int a[],int n){
        for (int i = 0; i < n; i++) {
            for (int j = i-1; j >= 0; j--) {
                if (a[j] == a[i]) {
                    return false;
                }
            }
        }
        return true ;
    }

}
