package Exercise01_04;
// 입력한 정숫값의 모든 약수 표시
import java.util.Scanner;

public class Measure {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정숫값: ");
		int n = stdIn.nextInt();
		int i = 1;
		int count = 0;
		do {
			if(n%i==0){
			System.out.print(i + " ");
			count++;
		}
			i++;
		} while(i<=n);
		System.out.println();
		System.out.println("의 약수는 " + count + "개입니다.");
	}

}
