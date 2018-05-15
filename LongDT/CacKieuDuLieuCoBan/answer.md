_**Task 2:**_ 
**Giả sử rằng a và b là các giá trị int. Đơn giản hóa biểu thức sau đây: (!(a < b) && !(a > b)).**

*Answer:*

!(a<b) <=> a >= b

!(a>b) <=> a<=b

Suy ra: (!(a<b)&&!(a>b))   

<=>   ((a>=b)&&(a<=b))
			   

<=>	   a=b.


_**Task 3:**_
**Toán tử XOR có các đặc tính gì. Viết bảng logic của toán tử XOR.**

_Answer:_

Toán tử XOR có tính chất:

•	A XOR A = 0;

•	A XOR 0 = A;

Bảng logic của toán tử XOR:
  
    A    |    B    |    A XOR B

---------|-----------|-----------
 
    1    |    1    |    0

    1    |    0    |    1

    0    |    1    |    1

    0    |    0    |    0

_**Task 4:**_ 
__Tại sao trong phép chia hai số nguyên: 10 / 3 cho kết quả là 3 chứ không phải 3.33333 ?__

*Answer:*

Trong phép chia hai số nguyên, kết quả trả về sẽ được ép kiểu nguyên nên số thập phân sẽ được làm tròn theo quy tắc.
Do 3.(3) có phần thập phân nhỏ hơn 0.5 nên sẽ được làm tròn xuống. 


_**Task 5**_

*Answer:*

Khi giá trị của a=2147483647 là giá trị max của kiểu integer nên nó có bit dấu là 0 ở dạng nhị phân. Khi công thêm 1 vào giá trị lớn nhất thì
dấu bit sẽ thành 1 và số sẽ thành số âm nhỏ nhất của kiểu integer.

__Vậy nên:__ 
	
	a = 2147483647;

	a+1 = -2147483648;

	2-a = 2-2147483647 = -2147483645;

	-2-a = -2 - 2147483647 = -1 +(-2147483648) = 2147483647 (số nhỏ nhất trừ đi 1, tương tự trên);

	a*2 = (a+1)+(a-1) = -2147483648 + 2147483645 = -2;

	a*4 = 2*a*2 = -4;


_**Task 6:**_ 
**Biểu thức (Math.sqrt(2) * Math.sqrt(2) = = 2) có giá trị thế nào ?**

_Answer:_

Biểu thức trên có giá trị false do trong biểu thức, phép toán Math.sqrt(2) được thực hiện trước vào làm tròn nên giá trị biểu thức sẽ không bằng 2.



		


