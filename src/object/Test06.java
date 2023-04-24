package object;
import java.util.Scanner;

public class Test06 {

	// 입력 메소드
	Scanner scan = new Scanner(System.in);
	public int input(Scanner scan) {

		System.out.print("숫자를 입력하세요: ");
		int num = scan.nextInt();
		return num;
	}

	// 연산 메소드
	public boolean process(int num) {
		if (num < 2) {
			return false;
		}

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}

	// 출력 메소드
	public void output(int num, boolean isPrime) {
		if (isPrime) {
			System.out.printf("%d은(는) 소수입니다.%n", num);
		} else {
			System.out.printf("%d은(는) 소수가 아닙니다.%n", num);
		}
		
	}
}
