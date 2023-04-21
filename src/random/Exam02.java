package random;

import java.util.HashSet;

public class Exam02 {
	public static void main(String[] args) {
		//로또 프로그램을 만들어라 (1~45까지 6개의 중복되지 않는 숫자)
		//(ArrayList, HashSet, HashMap 만들어서 진행)

		//HashSet

		HashSet<Integer> set = new HashSet<>();

		for(int i=0; i<6; i++) {
			double n = Math.random();
			int num = (int)(n*45)+1;
			set.add(num);
		}

		if(!set.contains(num)) {
			System.out.println("랜덤하게 뽑힌 숫자:");
			for (int num : set) {
				System.out.print(num + " ");
			}
		}
	}
}
