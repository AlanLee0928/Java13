package Class05;

public class Class05 {
	public static void main(String[] args) {
		int num = 12;
		int den[] = {12 , 0 , 3 , 0 , 0 , 4};
		
		for(int i = 0 ; i < 10 ; i++) {
			try {
				System.out.println("ans = " + num / den[i]);
			}
			catch(ArithmeticException b) {
				System.out.println("¿ù»~1");
			}
			catch(ArrayIndexOutOfBoundsException a) {
				System.out.println("¿ù»~2");
			}
		}
	}
}