package Exercise01_04;
// 읽은 개수만큼 *를 표시(5개 단위로 줄바꿈)
import java.util.Scanner;

public class PutAsterisk5A {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		
		do {
			System.out.print("몇 개의 *를 표시할까요?: ");
			n = stdIn.nextInt();	
		} while(n<=0);
		
		for(int i=0; i<n; i++) {
			System.out.print("*");
			if(i%5==4) 
				System.out.println();
		}
	}

}
