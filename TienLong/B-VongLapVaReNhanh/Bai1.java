package bai1;
import java.util.Scanner;
public class Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d,m,y;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Nhap ngay thang nam:");
			System.out.print("ngay = ");
			d = scanner.nextInt();
			System.out.print("thang=");
			m = scanner.nextInt();
			System.out.print("nam=");
			y = scanner.nextInt();
		}while(nhapHopLe(d,m,y)==false);
		scanner.close();
		int x,y0,m0,d0;
		y0 = y - (14-m)/12;
		x  = y0 + y0/4 - y0/100 + y0/400;
		m0 = m + 12*((14-m)/12)-2;
		d0 = (d + x + (31*m0)/12)%7;
		
		switch(d0) {
		case 0: System.out.println("Chu Nhat");break;
		case 1: System.out.println("Thu hai"); break;
		case 2: System.out.println("Thu ba");  break;
		case 3: System.out.println("Thu tu");  break;
		case 4: System.out.println("Thu nam"); break;
		case 5: System.out.println("Thu sau"); break;
		case 6: System.out.println("Thu bay"); break;
		}
		
	}
	
	
	public static boolean nhapHopLe(int d, int m, int y) {
		if(d<1 || d>ngayTrongThang(m,y))
		{
			return false;
		}
		if(m<1 || m>12)
		{
			return false;
		}
		if(y<0)
		{
			return false;
		}
		return true;
		
	}
	
	
	public static boolean namNhuan(int y) {
		if ((y%4 == 0 && y%100 != 0) || y%400 == 0)
		{
			return true;
		}
			return false;
	}
	
	
	public static int ngayTrongThang(int m, int y) {
		int days=0;
		switch(m) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
				days = 31;
				break;
		case 4:
		case 6:
		case 9:
		case 11:
				days = 30;
				break;
		case 2:
				if(namNhuan(y))
					days = 29;
				else
					days = 28;
		}
		return days;
	}

}
