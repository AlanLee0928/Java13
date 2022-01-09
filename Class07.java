package Class07;

public class Class07 {
	public static void main(String[] args) {
		try {
			test();
		}
		catch(ArithmeticException e) {
			System.out.println("end of main()¡I¡I");
		}
	}
	public static void test() throws ArithmeticException{
		int num = 12 , den = 0;
		int ans = num / den;
		System.out.println(ans);
	}
}