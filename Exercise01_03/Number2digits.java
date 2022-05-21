package Exercise01_03;
// 두 자릿수 숫자 맞추기 게임
import java.util.Random;
import java.util.Scanner;

public class Number2digits {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("숫자 맞추기 게임 시작!");
		System.out.println("10부터 99사이의 숫자를 맞추세요.");
		
		int n;
		int no = 10 + rand.nextInt(90);
		
		do {
			System.out.print("어떤 숫자일까?: ");
			n = stdIn.nextInt();
			
			if(no>n) 
				System.out.println("더 큰 숫자입니다.");
			else if (no<n) 
				System.out.println("더 작은 숫자입니다.");
					
		} while(no != n);
		System.out.println("정답입니다.");
	}

}
