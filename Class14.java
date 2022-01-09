package Class14;

import java.util.*;

class IntegerTooSmall extends Exception{
	
}

class IntegerTooLarge extends Exception{
	
}

class InputMismatchException extends Exception{
	
}



public class Class14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		try {
			if(x % (int)x != 0) {
				throw new InputMismatchException();
			}
			else if(x < 10) {
				throw new IntegerTooSmall();
			}
			else if(x > 70) {
				throw new IntegerTooLarge();
			}
			
			else {
				System.out.println((int)x);
			}
		}
		catch(IntegerTooSmall a) {
			System.out.println("您輸入的整數的值太小");
		}
		catch(IntegerTooLarge b) {
			System.out.println("您輸入的整數的值太大");
		}
		catch(InputMismatchException c) {
			System.out.println("您輸入的不是整數");
		}
	}
}