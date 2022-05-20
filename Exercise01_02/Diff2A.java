package Exercise01_02;
// 읽은 두 정숫값의 차를 표시(if문)
import java.util.Scanner;

public class Diff2A {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 a:"); int a = stdIn.nextInt();
		System.out.print("정수 b:"); int b = stdIn.nextInt();
		
		if(a>=b)
			System.out.println("두 값의 차는 " + (a-b) + "입니다.");
		else
			System.out.println("두 값의 차는 " + (b-a) + "입니다.");
	}

}
