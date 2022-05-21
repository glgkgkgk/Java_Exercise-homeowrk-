package Exercise01_03;
// 두 정수 사이의 정수를 작은 것부터 순서대로 표시
import java.util.Scanner;

public class EnumScope {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 A: "); int A = stdIn.nextInt();
		System.out.print("정수 B: "); int B = stdIn.nextInt();
		
		if(A==B) {
			System.out.println("A와 B는 같습니다.");
		}else if(A>B) {
				for(int i=B; i<=A; i++) {
					System.out.print(i + " ");
				}
		}else	
				for(int i=A; i<=B; i++) {
				System.out.print(i + " ");
		}
	}
	
}