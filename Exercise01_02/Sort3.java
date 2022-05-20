package Exercise01_02;

import java.util.Scanner;

public class Sort3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 a:"); int a = stdIn.nextInt();
		System.out.print("정수 b:"); int b = stdIn.nextInt();
		System.out.print("정수 c:"); int c = stdIn.nextInt();
		
		int tem = 0;
		if(a>b) {
			tem = b;
			b = a;
			a = tem;
		}if (b>c) {
			tem = c;
			c = b;
			b = tem;
		}if (a>b) {
			tem = b;
			b = a;
			a = tem;
		}
		System.out.println("a<=b<=c가 되도록 정렬했습니다.");
		System.out.println("변수 a는 " + a + "가 되도록 정렬했습니다.");
		System.out.println("변수 b는 " + b + "가 되도록 정렬했습니다.");
		System.out.println("변수 c는 " + c + "가 되도록 정렬했습니다.");
	}

}
