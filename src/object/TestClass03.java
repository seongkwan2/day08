package object;

import java.util.Scanner;

public class TestClass03 {
	public void sumFunc() {
		Scanner scan = new Scanner(System.in);
		int num = 0, sum = 0;
		System.out.println("수 입력: ");
		num = scan.nextInt();
		for(int i = 1; i<= num; i++) {
			sum += i;
		}
		System.out.println("1~"+num+"까지의 합: "+sum);
	}
}
