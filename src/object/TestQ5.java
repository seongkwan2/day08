package object;

import java.util.Scanner;

/*
	- 모든 문제는 main, 연산, 입력, 출력하는 기능으로 만드세요
	만약 연산하는 기능이 없으면 연산기능은 빼셔도 됩니다.
	1. 3개의 이름을 입력받아 출력(배열, ArrayList, HashMap)
	2. 입력 값이 짝/홀 구분
	3. 입력 값이 3의배수 / 아닌지 구분
	4. 입력 값이 소수인지 아닌지 판별
	5. 절대값을 구하는 메소드
* 
*/
public class TestQ5 {
	
	public int input() { //입력받는 기능
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		
		System.out.println("정수 입력: ");
		num = scan.nextInt();
		
		return num;	//입력받은것 리턴
		}
	
	public String output(int num) {	//연산기능
		
		if(num%3==0) {
			return "3의 배수 입니다.";
		}else {
			return "3의 배수가 아닙니다.";
		}
	}
	
	public void print(String num) { //출력
		System.out.println(num);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
