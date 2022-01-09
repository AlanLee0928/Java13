package Class02;

import java.util.*;

public class Class02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 12 , den;
		den = sc.nextInt();
		if(den == 0) {
			System.out.println("°£¼Æ¬°0");
		}
		else {
			int ans = num / den;
			System.out.println(num + " / " + den + " = " + ans);
		}
	}
}