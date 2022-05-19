package Exercise01_01;
// 읽은 정숫값인이 약수인지 판변(등가 연산자)
import java.util.Scanner;

public class Measure1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("변수 A:");int A = stdIn.nextInt();
		System.out.print("변수 B:");int B = stdIn.nextInt();
		
		
		
		
		if(A%B==0)
			System.out.println("B는 A의 약수이다.");
		else
			System.out.println("B는 A의 약수가 아니다.");
	}

}
