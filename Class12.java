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
			System.out.println("���c���T����");
		}
		catch(EquilateralTriangle y) {
			System.out.println("�o�O���T����");
		}
		catch(NotEquilateralTriangle z) {
			System.out.println("�o���O���T����");
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