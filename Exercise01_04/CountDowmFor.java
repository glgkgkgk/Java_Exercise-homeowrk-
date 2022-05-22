package Exercise01_04;
// 양의 정숫값을 0까지 카운트다운 (for문)
import java.util.Scanner;

public class CountDowmFor {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		do {
			System.out.println("카운트다운 합니다.");
			System.out.print("양의 정숫값: ");
			n = stdIn.nextInt();
		}while(n<=0);
		
		for(; n>=0; ) {
			System.out.println(n--);
		}
	}

}
