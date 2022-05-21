package Exercise01_03;
// 3자리의 양의 정숫값 읽기
import java.util.Scanner;

public class ThreeDigits {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		do {
			System.out.print("세 자리의 정숫값: ");
			n = stdIn.nextInt();	
		}while(n <100 || n > 999);
		
		System.out.println("입력한 값은 " + n + "입니다.");
	}
	
}
