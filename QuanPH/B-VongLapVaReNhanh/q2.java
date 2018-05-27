/*
 Viết chương trình in ra lịch của tháng m và năm y. Với m và y là 2 số được nhập vào từ dòng lệnh.
 */
package B_VongLapVaReNhanh;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        int d = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập tháng:");
        int m = input.nextInt();
        System.out.println("Nhập năm:");
        int y = input.nextInt();
        
        //theo công thức bài 1
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        d0 += 1;
        System.out.println(d0);
        int soNgay = 0;
        switch (m) {
            case 1:
                System.out.print("January");
                soNgay = 31;
                break;
            case 2:
                System.out.print("Febuary");
                //kiểm tra năm nhuận
                if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
                    soNgay= 29;
                } else {
                    soNgay = 28;
                }
                break;
            case 3:
                System.out.print("March");
                soNgay= 31;
                break;
            case 4:
                System.out.print("April");
                soNgay = 30;
                break;
            case 5:
                System.out.print("May");
                soNgay = 31;
                break;
            case 6:
                System.out.print("June");
                soNgay = 30;
                break;
            case 7:
                System.out.print("July");
                soNgay = 31;
                break;
            case 8:
                System.out.print("August");
                soNgay = 31;
                break;
            case 9:
                System.out.print("September");
                soNgay = 30;
                break;
            case 10:
                System.out.print("October");
                soNgay = 31;
                break;
            case 11:
                System.out.print("November");
                soNgay = 30;
                break;
            case 12:
                System.out.print("December");
                soNgay = 31;
                break;
        }
        System.out.println(" " + y);
        System.out.println("S\tM\tTu\tW\tTh\tF\tS");

        for (int i = 1; i <= soNgay; i++) {
            if (i == 1) {
                if (d0 > 1) {
                    for (int j = 2; j < d0; j++) {
                        System.out.print("\t");
                    }
                }

            }
            if (d0 > 7) {
                d0 = 1;
            }
            switch (d0) {
                case 1:
                    System.out.print(i);
                    break;
                case 2:
                    System.out.print("\t" + i);
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    System.out.print("\t" + i);
                    break;
                case 7:
                    System.out.println("\t" + i);
                    break;
            }
            d0++;
        }
    }
}
