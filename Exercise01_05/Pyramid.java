package Exercise01_05;
//피라미드 표시
import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		
		do {
			System.out.println("피라미드를 표시합니다.");
			System.out.print("단수는?: ");
			n = stdIn.nextInt();
		} while(n<=0);
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
			System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++) {
			System.out.print("*");	
			}
			System.out.println();
		}		
	}

}
