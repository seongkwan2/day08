package object;

import java.util.Scanner;

public class TestClass06 {
	
	public int[] myInput() {
		Scanner scan = new Scanner(System.in);
		int n1, n2, sum;
		System.out.println("수 입력: ");
		n1 = scan.nextInt();
		System.out.println("수 입력: ");
		n2 = scan.nextInt();
		int[] arr = {n1, n2};
		return arr; //반환타입이랑 메소드 타입이랑 맞출것
	}
	
	
	public int test(int n1, int n2) {

		int sum = n1+n2;
		return sum;
		
	}
	public void print(int[] n, int sum) {
		System.out.println(n[0]+"+"+n[1]+" = "+sum);
	}
}
