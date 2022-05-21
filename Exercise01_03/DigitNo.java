package Exercise01_03;
// 양의 정숫값을 읽어서 그 자릿수를 출력하는 프로그램을 작성하자.
import java.util.Scanner;

public class DigitNo {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		int a = 0;
		
		do {
		System.out.println("양의 정숫값의 자릿수를 표시합니다.");
		System.out.print("양의 정숫값: ");
		n = stdIn.nextInt();
		} while(n<0);
		
		while(n>0) {
			a++;
			n /= 10;	
		}
		System.out.println("입력한 숫자는 "+ a + "자리입니다.");
	}

}
