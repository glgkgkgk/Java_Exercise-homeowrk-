package Exercise01_01;
// 읽은 정숫값이 양의 정수이면 5로 나누어집니다.
import java.util.Scanner;

public class GoInto5 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정숫값:"); int num = stdIn.nextInt();
		
		if(num<0)
			System.out.println("음의 정숫값은 입력했습니다.");
		else if(num%5==0)
			System.out.println("이 값은 5로 나누어집니다.");
		else
			System.out.println("이 값은 5로 나누어지지 않습니다.");
	}

}
