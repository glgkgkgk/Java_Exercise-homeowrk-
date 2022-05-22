package Exercise01_04;
// 양의 정숫값을 0부터 카운트업
import java.util.Scanner;

public class CountUp {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		
		do {
			System.out.println("카운트업 합니다.");
			System.out.print("양의 정숫값: ");
			
			n = stdIn.nextInt();
		} while(n<0);
		
		for (int i=0; i<=n; i++)
			System.out.println(i);	
	}
}
