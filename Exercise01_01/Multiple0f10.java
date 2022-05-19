package Exercise01_01;
// 읽은 정숫값이 양수이면 10의 배수이닞 판정해서 표시
import java.util.Scanner;

public class Multiple0f10 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정숫값:"); int num = stdIn.nextInt();
		
		if(num<0)
			System.out.println("음의 정숫값은 입력했습니다.");
		else if(num%10==0)
			System.out.println("이 값은 10의 배수입니다.");
		else
			System.out.println("이 값은 10의 배수가 아닙니다.");
	}

}


