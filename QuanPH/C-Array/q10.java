/*
 Chia bài. Giả sử 1 bộ bài 52 quân đc biểu diễn bằng mảng 1 chiều với 52 phần tử.
Viết chương trình để chia bài ngẫu nhiên cho 4 người chơi, mỗi người 13 quân bài không trùng nhau.
 */
package C_Array;

import java.util.Random;
/*
cho mỗi ng chơi là 1 mảng 13 phần tử
Bộ bài là mảng 52 phần tưt
Cho lặp 13 lần
Mỗi lần chia cho 4 ng
Dùng lệnh random có trong Math
Rồi bỏ phần từ đã đc chọn ra khỏi mảng 52 phần tử
*/
public class q10 {
    public static void main(String[] args) {
         
       int[] allCard = new int[52];
        int[] player1 = new int[13];
        int[] player2 = new int[13];
        int[] player3 = new int[13];
        int[] player4 = new int[13];
        for (int i = 0; i < 52; i++) {
           allCard[i] = i;
        }
        int length = 52;
        int random;
        for (int i = 0; i < 13; i++) {
            random = (int) (Math.random() * length);
            length--;
            player1[i] = allCard[random];
            for (int j = random; j < length; j++) {
                allCard[j] = allCard[j + 1];
            }

            random = (int) (Math.random() * length);
            length--;
            player2[i] = allCard[random];
            for (int j = random; j < length; j++) {
                allCard[j] = allCard[j + 1];
            }

            random = (int) (Math.random() * length);
            length--;
            player3[i] = allCard[random];
            for (int j = random; j < length; j++) {
                allCard[j] =allCard[j + 1];
            }

            random = (int) (Math.random() * length);
            length--;
            player4[i] = allCard[random];
            for (int j = random; j < length; j++) {
                allCard[j] = allCard[j + 1];
            }
        }
        for (int i = 0; i < 13; i++) {
            System.out.println("Lần chia "+(i+1)+" : ");
            System.out.println(player1[i]);
            System.out.println(player2[i]);
            System.out.println(player3[i]);
            System.out.println(player4[i]);
        }
    }
}
    

