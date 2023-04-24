package object;

import java.util.ArrayList;

public class TestClass05 {
		//argument(아규먼트) : 메소드에서 받아주는 값
		//				   : 매개변수
		public int sumFunc(int nnn) {
						//파라미터에서 num이라고 보냈지만
						//nnn으로 받아도 별 상관없다.
			int sum = 0;
			for(int i = 1; i<= nnn; i++) {
				sum += i;
			}
			//return
			// - 값을 돌려주면서 해당 메소드를 종료
			// - 값이 없으면 해당 메소드만 종료
			// - return으로 값을 돌려줄 경우 하나만 가능하다.
			return sum;		//반환되는 타입과 메소드타입을 일치시켜야 된다.
	}
}