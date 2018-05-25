/*
 Sinh ra ngẫu nhiên N họ tên người Việt không dấu; lưu vào mảng String.
Sắp xếp tên theo trật tự bảng chữ cái và in ra màn hình.
 */
package D_GiaiThuatCoBanVaPhanTichThuatToan;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        String[] ho = {"Ta","Pham","Nguyen","Le","Tran"};
        String[] dem = {"Thi","Van","Thuy","Hong","Trung",""};
        String[] ten = {"Quan","Long","Chien","Duy","Son"};
        
        Scanner input = new Scanner(System.in);
        System.out.println("So ho ten ban muon sinh ra la N: ");
        int N = input.nextInt();
        String[] hoten = new String[N];
        Random rd = new Random();
        for (int i = 0; i < N; i++) {
            hoten[i] = ho[rd.nextInt(ho.length)] + dem[rd.nextInt(dem.length)] + ten[rd.nextInt(ten.length)]  ;
        }
        Arrays.sort(hoten);
        for (int i = 0; i < N; i++) {
            System.out.println(hoten[i]);
        }
    }
}
