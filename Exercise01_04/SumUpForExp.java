package Exercise01_04;
// 1부터 n까지의 합 구하기(계산식을 표시)
import java.util.Scanner;

public class SumUpForExp {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		
		do {
			System.out.println("1부터 n까지의 합을 구합니다.");
			System.out.print("n의 값: ");
			n = stdIn.nextInt();
		} while(n<=0);
		
		int sum = 0;
		
		for(int i=1; i<n; i++) {
			sum += i;
			System.out.print(i + " + ");
		}
		System.out.print(n + " = " + sum);
	}

}
