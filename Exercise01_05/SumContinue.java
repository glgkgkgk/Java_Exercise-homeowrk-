package Exercise01_05;
// 읽은 정수를 합산(음수는 제외)
import java.util.Scanner;

public class SumContinue {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수를 더합니다.");
		System.out.print("몇 개를 더할까요?: ");
		int n = stdIn.nextInt();
		int i;
		int sum = 0;
		int count = 0;
		for(i=0; i<n; i++) {
			System.out.print("정수: ");
			int t = stdIn.nextInt();
			
			if(t>=0) {
				sum += t;
				count++;
			}
			else System.out.println("음수는 더하지 않습니다.");
		}
		System.out.println("합계는 " + sum + "입니다.");
		System.out.print("평균은 " + sum/count + "입니다.");
	}

}
