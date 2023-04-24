package object;

import java.util.Scanner;

public class TestClass04 {
	//argument(아규먼트) : 메소드에서 받아주는 값
	//				   : 매개변수
	public void sumFunc(int nnn) {
					//파라미터에서 num이라고 보냈지만
					//nnn으로 받아도 별 상관없다.
		int sum = 0;
		for(int i = 1; i<= nnn; i++) {
			sum += i;
		}
		System.out.println("1~"+nnn+"까지의 합: "+sum);
	}
}
