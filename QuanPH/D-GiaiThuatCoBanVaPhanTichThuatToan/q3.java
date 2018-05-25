/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D_GiaiThuatCoBanVaPhanTichThuatToan;

import java.util.Arrays;
import java.util.Scanner;

public class q3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao 1 chuoi: ");
        String str = input.nextLine();
        System.out.print(sortGiftCode(str));

    }

    static String sortGiftCode(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        String str2 = new String(charArray);
        return str2;
    }
}
