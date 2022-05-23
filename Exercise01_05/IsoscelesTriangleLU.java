package Exercise01_05;
//왼쪽 위가 직각인 이등변 삼각형
import java.util.Scanner;

public class IsoscelesTriangleLU {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		
		do {
			System.out.println("왼쪽 위가가 직각인 이등변 삼각형을 표시합니다.");
			System.out.print("단수는?: ");
			n = stdIn.nextInt();
		} while(n<=0);
		
		for(int i=0; i<n; i++) {
			for(int j=n; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
