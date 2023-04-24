package object;

import java.util.HashMap;
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
public class TestQ2 {

	//HashMap의 특징 <키, 값>

	public HashMap<Integer, String> input() { //입력받는 기능
		HashMap<Integer, String> names = new HashMap<>();
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 3; i++) { //3번 입력받기
			System.out.print("이름을 입력하세요: ");
			String name = scan.nextLine();	//여러개를 배열로 저장
			names.put(i,name);	//names안에 한개씩 이름이 저장됨
		}
		return names;	//names안에 있는 이름들 반환
	}


	public HashMap<Integer, String> output() {
		
		HashMap<Integer, String> names = input();
		//input에서 받은 값들을 HashMap<키,값> 형태로 저장
		System.out.println("입력된 이름은:");
		for (int i = 0; i < names.size(); i++) {//for문으로 names크기만큼 뽑음
			System.out.println(names.get(i));
		}

		return names;
	}
}






