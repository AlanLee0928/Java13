package Class04;

public class Class04 {
	public static void main(String[] args) {
		int num = 12;
		int den[] = {12 , 0 , 3 , 0 , 0 , 4};
		
		for(int i = 0 ; i < 10 ; i++) {
			if(i == den.length) {
				System.out.println("�{�����榳�~");
				break;
			}
			if(den[i] != 0) {
				System.out.println("ans = " + num / den[i]);
			}
			else {
				System.out.println("�{�����榳�~");
				break;
			}
		}
	}
}