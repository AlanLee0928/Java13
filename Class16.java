package Class16;

import java.io.*;

class ArgumentOutOfBound extends Exception{
	
}

public class Class16 {
	public static void main(String[] args) {
		BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
		try {
			String a = bu.readLine();
			int b = Integer.parseInt(a);
			mySqrt(b);
		}
		catch(ArgumentOutOfBound e) {
			System.out.println("n¤p©ó0");
		}
		catch(IOException f) {
			System.out.println("¿ù»~");
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