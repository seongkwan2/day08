package object;

import java.sql.SQLTransactionRollbackException;
import java.util.Scanner;

public class MainClass06 {
	public static void main(String[] args) {
		TestClass06 t = new TestClass06();
		//System.out.println(t);
		
		int[] num = t.myInput();
		//num = [10,20]
		int sum = t.test(num[0],num[1]);
		
		t.print(num, sum);
	}
}