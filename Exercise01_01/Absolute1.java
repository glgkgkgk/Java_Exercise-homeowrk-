package Exercise01_01;
// 정숫값은 읽어서 절댓값은 표시
import java.util.Scanner;

public class Absolute1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정숫값:");
		int num = sc.nextInt();
		
		if(num<0)
			System.out.println("절댓값은 "+ -num + "입니다.");	
		else
			System.out.println("절댓값은 "+ num + "입니다.");
	}

}
