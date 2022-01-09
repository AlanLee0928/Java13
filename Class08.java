package Class08;

class Ctest{
	public static void test() throws ArithmeticException{
		int num = 12 , den = 0;
		int ans = num / den;
		System.out.println(ans);
	}
}

public class Class08 {
	public static void main(String[] args) {
		try {
			Ctest.test();
		}
		catch(ArithmeticException e) {
			System.out.println("end of main()¡I¡I");
		}
	}
}