package Exercise01_02;
// 두 정숫값을 읽어서 내림차순(큰 순)으로 정렬
import java.util.Scanner;

public class Sort2Descending {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 a:"); int a = stdIn.nextInt();
		System.out.print("정수 b:"); int b = stdIn.nextInt();
		int tem;
		
		if(a<b) {
			tem = b;
			b = a;
			a = tem;
		}
		System.out.println("a>=b가 되도록 정렬했습니다.");
		System.out.println("변수 a는 " + a + "입니다.");
		System.out.println("변수 b는 " + b + "입니다.");
	}

}
