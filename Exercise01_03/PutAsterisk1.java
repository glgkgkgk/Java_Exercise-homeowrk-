package Exercise01_03;
// 지정한 개수만큼 * 표시
import java.util.Scanner;

public class PutAsterisk1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("몇 개의 *를 표시할까요?:");
		
		int n = stdIn.nextInt();
		if(n>0) {
		for(int i=0; i<n; i++) {
			System.out.print("*");
		}
			System.out.println();
		}
	}	
}
