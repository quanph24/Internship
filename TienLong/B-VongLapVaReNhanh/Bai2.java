package bai2;
import java.util.Scanner;
public class Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,y;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Nhap ngay thang nam:");
			System.out.print("thang=");
			m = scanner.nextInt();
			System.out.print("nam=");
			y = scanner.nextInt();
		}while(nhapHopLe(m,y)==false);
		scanner.close();
		inLich(m,y);
	}
	
	
	public static boolean nhapHopLe(int m, int y) {
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
	
	
	public static void inLich(int m, int y) {
		int x,y0,m0,d0,i=1;
		y0 = y - (14-m)/12;
		x  = y0 + y0/4 - y0/100 + y0/400;
		m0 = m + 12*((14-m)/12)-2;
		d0 = ((1 + x + (31*m0)/12)%7)+1;
		System.out.println("S\tM\tTu\tW\tTh\tF\tS");
		switch(d0) {
		case 1:
			System.out.print(i);
			break;
		case 2: 
			System.out.print("\t"+i); 
			break;
		case 3: 
			System.out.print("\t\t"+i);  
			break;
		case 4: 
			System.out.print("\t\t\t"+i);
			break;
		case 5: 
			System.out.print("\t\t\t\t"+i);
			break;
		case 6: 
			System.out.print("\t\t\t\t\t"+i);
			break;
		case 7: 
			System.out.print("\t\t\t\t\t\t"+i);
			break;
		}
		for(i=2;i<=ngayTrongThang(m,y);i++) {
			if(d0%7==0)
			{
				System.out.print("\n");
				System.out.print(i);
			}
			else
				{
				System.out.print("\t"+i);
				}
			d0++;
		}
		
	}

}
