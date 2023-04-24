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
public class TestQ1 {
	
	public String[] input() { //입력받는 기능
		Scanner scan = new Scanner(System.in);
		
		String[] names = new String[3];	//3개 배열생성

		for(int i=0; i<3; i++) {
			System.out.println("이름을 입력하세요: ");
			names[i] = scan.nextLine();	//입력 3번 받음
		
		}
		return names;	//입력받은것 리턴
	}
	
	public String[] output() {	//출력기능
		
		String[] names = input();
		System.out.println("입력된 이름은: ");
		for(String name : names) {
			System.out.println(name);
		}
		return names;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
