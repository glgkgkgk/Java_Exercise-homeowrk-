package Exercise01_04;
// 1부터 n까지의 합 구하기
import java.util.Scanner;

public class SumUpFor {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
			
		int n;
		do {
			System.out.print("1부터 n까지의 합을 구합니다.n의 값: ");
			n = stdIn.nextInt();
		} while(n<=0);
		
		int sum = 0;
		for (int i=1; i<=n; i++) {
			sum += i;
		}
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
	}

}
