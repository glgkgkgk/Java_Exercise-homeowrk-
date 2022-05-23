package Exercise01_05;
// 소수 판정
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		int count = 0;
		
		do {
			System.out.println("2이상의 정숫값: ");
			n = stdIn.nextInt();	
		} while(n<2);
		
		for(int i=2; i<n; i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count>0) {
			System.out.println("소수가 아닙니다.");
		}else
			System.out.println("소수입니다.");
	}

}
