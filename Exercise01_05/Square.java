package Exercise01_05;
//정방형을 표시
import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		do {
		System.out.println("정방형을 표시합니다.");
		System.out.print("단수는: ");
		n = stdIn.nextInt();
		} while(n<=0);
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
