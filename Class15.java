package Class15;

import java.io.*;

class ArgumentOutOfBound extends Exception{
	
}

public class Class15 {
	public static void main(String[] args) throws IOException {
		BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
		String a = bu.readLine();
		int b = Integer.parseInt(a);
		try {
			mySqrt(b);
		}
		catch(ArgumentOutOfBound e) {
			System.out.println("n¤p©ó0");
		}
	}
	public static void mySqrt(int n) throws ArgumentOutOfBound{
		if(n < 0) {
			throw new ArgumentOutOfBound();
		}
		else {
			System.out.println(Math.pow(n , 0.5));
		}
	}
}