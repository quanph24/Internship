package bai8;
import java.util.Scanner;
public class Bai8 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n;
		do {
			System.out.print("Nhap so luong bai hat: n = ");
			n= sc.nextInt();
		}while(n<1);
		if(n==1||n==2)
			System.out.println("ti le la 100%");
		
		
//		khi phát ngẫu nhiên 1 bài hát A trong danh sách gồm n bài hát sẽ chỉ có 1 bài hát theo sau A để tạo thành 
//		cặp bài hát theo thứ tự nên sẽ có (n-2) bài hát khác A và A+1 và không tạo thành cặp với A
		
		System.out.println("ti le la: "+(float)(n-2)/n);

	}

}
