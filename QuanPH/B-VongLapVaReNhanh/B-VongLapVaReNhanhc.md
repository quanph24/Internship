**3.Các lệnh sau đây có lỗi gì ?**
 if (a > b) then c = 0;    		(không dc có then)

 if a > b { c = 0; }        	 	(thiếu ngoặc (a>b) )

 if (a > b) c = 0;		(lệnh đúng)

 if (a > b) c = 0 else b = 0;	(thiếu dấu ; )

**5.Giả sử i và j đều có kiểu int. Giá trị của j là gì sau mỗi câu lệnh sau đây được thực hiện?**

 for (i = 0, j = 0; i < 10; i++) j += i;   	 => giá trị j =45

 for (i = 0, j = 1; i < 10; i++) j += j;  	  => giá trị j =1024

 for (j = 0; j < 10; j++) j += j;	    	 => giá trị j =15

 for (i = 0, j = 0; i < 10; i++) j += j++;	=> giá trị j =0

**7.Đoạn mã sau in ra những gì ? (không chạy chương trình)**

public class Test6 {
    public static void main(String[] args) {
        int n = Integer.parseInt(arg[0]);
        String ruler = " ";
        for (int i = 0; i <= n; i++) {
            ruler = ruler + i + ruler;
            System.out.println(ruler);
        }
    }
}

**Trả lời:**
	ruler(n-1) n ruler(n-1)
	=> Hiển thị các vạch thước của thước có độ dài arg[0]

