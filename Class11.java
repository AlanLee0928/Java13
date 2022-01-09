package Class11;

class CCircleException extends Exception {
	public String toString()
	   {
	      return "CCircleException throw";
	   }
}

class CCircle {
	private double radius;

	public void setRadius(double r) throws CCircleException {
		if (r < 0) {
			throw new CCircleException();
		} 
		else {
			radius = r;
		}
	}

	public void show() {
		System.out.println("area=" + 3.14 * radius * radius);
	}
}

public class Class11 {
	public static void main(String[] args) {
		CCircle cir = new CCircle();
		try {
			cir.setRadius(-2.0);
		} 
		catch (CCircleException e) {
			System.out.println(e);
		}
		cir.show();
	}
}