package Class13;

import java.util.*;

class Exception520 extends Exception{

}

public class Class13 {
	public static void main(String[] args) {
		try {
			Scanner();
		}
		catch(Exception520 e) {
			System.out.println("�o�O�Ѧr��520�Ҥް_���ҥ~");
		}
	}
	public static void Scanner() throws Exception520{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a == 520) {
			throw new Exception520();
		}
		else {
			System.out.println(a);
		}
	}
}