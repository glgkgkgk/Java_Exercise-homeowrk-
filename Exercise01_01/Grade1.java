package Exercise01_01;
// 점수를 기준으로 성적 판정(방법1:논리곱 연산자 &&를 이용)
import java.util.Scanner;

public class Grade1 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("점수:"); int point = stdIn.nextInt();
		
		if (point >=0 && point < 50)
			System.out.println("가");
		else if (point >=50 && point <60)
			System.out.println("양");
		else if (point >=60 && point <70)
			System.out.println("미");
		else if (point >=70 && point <80)
			System.out.println("우");
		else if (point >=80 && point <=100)
			System.out.println("수");
	}

}