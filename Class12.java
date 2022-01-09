package Class12;

class NotTriangle extends Exception {
	
}

class EquilateralTriangle extends Exception {
	
}

class NotEquilateralTriangle extends Exception {
	
}

public class Class12 {
	public static void main(String[] args) {
		int a = 3;
		int b = 3;
		int c = 3;
		try {
			triangle(a , b , c);
		}
		catch(NotTriangle x) {
			System.out.println("不構成三角形");
		}
		catch(EquilateralTriangle y) {
			System.out.println("這是正三角形");
		}
		catch(NotEquilateralTriangle z) {
			System.out.println("這不是正三角形");
		}
		
	}
	public static void triangle(int a , int b , int c) throws NotTriangle , EquilateralTriangle , NotEquilateralTriangle{
		if((a + b) < c || (a + c)< b || (b + c) < a) {
			throw new NotTriangle();
		}
		else if(a == b && a == c && b == c) {
			throw new EquilateralTriangle();
		}
		else {
			throw new NotEquilateralTriangle();
		}
	}
}