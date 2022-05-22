package Exercise01_04;
/*
 신장별 표준 체중 대응표 (표시할 신장의 범위인 시작값, 종료값, 증가값을 정숫값으로 입력)
 표준 체중 = (신장 - 100) * 0.9
 */
import java.util.Scanner;

public class HeightWeight {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int hMin;
		int hMax;
		int step;
		do {
		System.out.print("몇 cm부터: "); hMin = stdIn.nextInt();
		System.out.print("몇 cm까지: "); hMax = stdIn.nextInt();
		System.out.print("몇 cm 단위: "); step = stdIn.nextInt();
		} while(hMin<0 && hMax<0 && step<0);
		
		System.out.println("신장 표준 체중");
		System.out.println("-----------");
		
	
		while(hMin<=hMax) {
			System.out.println(hMin + " " + (hMin - 100)*0.9);
			hMin += step;
		}
	}

}
