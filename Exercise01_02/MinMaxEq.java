package Exercise01_02;
// 두 정숫값 중 작은 값과 큰 값을 구해서 표시
import java.util.Scanner;

public class MinMaxEq {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 a:"); int a = stdIn.nextInt();
		System.out.print("정수 b:"); int b = stdIn.nextInt();
		
		int big, small;
		
		if (a==b)
			System.out.println("두 값이 같습니다.");
		else{
			if (a>b) {
				big = a;
				small = b;
			}else {
				big = b;
				small = a;
			}
			System.out.println("작은 값은 " + small + "입니다.");
			System.out.println("큰 값은 " + big + "입니다.");
		}	
	}
}

