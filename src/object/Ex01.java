package object;

import members.Member;

public class Ex01 {
	/*
		 절차지향
		 - C언어는 절차지향 언어라고 표현한다.
		 - 기능들로만 이루어져 있다.
		 - 함수들의 집합으로 만들어진 프로그램
		 - 객체지향보다 처리 속도가 빠르다.

		 객체지향
		 - C++, python, java 등의 언어
		 - 클래스라는 자료형으로 만들어진 것
		 - 재활용이 용이하다.
		 - 절차지향보다 처리속도는 느리다.
		 - 객체는 변수다. 클래스라는 자료형으로 만들면 객체라고 표현한다.
	 */


	public static void main(String[] args) {
		Member m = new Member();
		m.name = "홍길동";
		m.addr = "산골짜기";
		System.out.println("이름 : "+m.name);
		System.out.println("addr : "+m.addr);
		

	}
}

















