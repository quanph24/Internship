**1.Điều gì xảy ra khi biên dịch chương trình sau:**
public class Task1 {
    public static void main(String[] args) {
        int n = 1000;
        int[] array = new int[n * n * n * n];
        System.out.println(array.length);
    }
}

    **Trả lời:** 

	Trong java, kích thước tối đa của mảng int đc giới hạn bởi kích thước tối đa của số nguyên là Interger.Max_Value = 2^31-1
	
	=> kết quả sẽ bắn ra lỗi.

**4.Đoạn mã sau đây in ra những gì?**

int[] a = {1, 2, 3};
int[] b = {1, 2, 3};
System.out.println(a == b);
    
     **Trả lời:** 

	Chương trình trả về false vì a và b là 2 đối tượng khác nhau.