package Exercise01_05;
//숫자 피라미드 표시
import java.util.Scanner;

public class DigitPyramid {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		
		do {
			System.out.println("숫자 피라미드를 표시합니다.");
			System.out.print("단수는: ");
			n = stdIn.nextInt();	
		} while(n<=0);
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++) {
				System.out.print(i%10);
			}
			System.out.println();
		}
	}
	
}
