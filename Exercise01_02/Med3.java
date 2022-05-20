package Exercise01_02;
//3개의 정수 중 중앙값 구하기
import java.util.Scanner;

public class Med3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 a:");int a = stdIn.nextInt();
		System.out.print("정수 b:");int b = stdIn.nextInt();
		System.out.print("정수 c:");int c = stdIn.nextInt();
		
		int mid;
		
		if(a>b)
			if(b>c)
				mid = b;
			else if (c>a)
				mid = a;
			else 
				mid = c;
		else if (a>c)
			mid = a;
		else if (c>b)
			mid = b;
		else
			mid = c;
		System.out.println("중앙값은 " + mid + "입니다.");	
	}

}
