package Exercise01_01;
//읽은 정숫값이 음의 값인가?
import java.util.Scanner;

public class Negative {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정숫값:");
		int num = stdIn.nextInt();
		
		if(num<0)
			System.out.println("이 값은 음의 값입니다.");
	}

}
