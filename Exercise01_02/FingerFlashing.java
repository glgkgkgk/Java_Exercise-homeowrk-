package Exercise01_02;
// 생성된 난수에 따라 가위바위보 중 하나를 표시
import java.util.Random;

public class FingerFlashing {

	public static void main(String[] args) {
		Random rand = new Random();
		
		System.out.print("컴퓨터가 낸 것: ");
		int a = rand.nextInt(3);
		
		switch(a) {
		case 0: System.out.println("가위"); break;
		case 1: System.out.println("바위"); break;
		case 2: System.out.println("보"); break;
		}
	}
}
