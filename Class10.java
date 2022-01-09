package Class10;

class RadiusIsNegative extends Exception {
}

class RadiusTooLarge extends Exception {	
}

class CCircle {
	private double radius;

	public void setRadius(double r) throws RadiusIsNegative , RadiusTooLarge{
		if (r < 0) {
			throw new RadiusIsNegative();
		} 
		else if(r > 100) {
			throw new RadiusTooLarge();
		}
		else {
			radius = r;
		}
	}
	
	public void show() {
		System.out.println("area=" + 3.14 * radius * radius);
	}
}

public class Class10 {
	public static void main(String args[]) {
		CCircle cir = new CCircle();
		try {
			cir.setRadius(-2.0);
		} 
		catch (RadiusIsNegative a) {
			System.out.println(a + " throwed");
		}
		catch (RadiusTooLarge b) {
			System.out.println(b + " throwed");
		}
		cir.show();
	}
}