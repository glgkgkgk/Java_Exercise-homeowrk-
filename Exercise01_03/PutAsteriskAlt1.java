package Exercise01_03;

import java.util.Scanner;

public class PutAsteriskAlt1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("몇 개를 표시할까요?");
		int n = stdIn.nextInt();
		int i = 1;
		
		if(n>0) {
			while(i<=n) {
				if(i%2==0) 
					System.out.print("+");
				else 
					System.out.print("*");	
				i++;
			}
			System.out.println();
		}
	}

}
