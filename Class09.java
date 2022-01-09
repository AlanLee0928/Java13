package Class09;

class Ctest{
	public static void test() throws ArithmeticException{
		int num = 12 , den = 0;
		int ans = num / den;
		System.out.println(ans);
	}
}

public class Class09 {
	public static void main(String[] args) {
		Ctest tt = new Ctest();
		try {
			tt.test();
		}
		catch(ArithmeticException e) {
			System.out.println("end of main()¡I¡I");
		}

	}
}