package Day2;

import java.util.Scanner;

public class Variables {
	public static void main(String[] args) {
		//char
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		char ch = input.charAt(0);
		int code = (int)ch;
		
		System.out.printf("%c=%d(%#X)%n", ch, code, code);
		
		char hch = '가';
		System.out.printf("%c=%d(%#X)%n", hch, (int)hch, (int)hch);
		
		System.out.println('\'');
		System.out.println("abc\t"+123+"\b"+456);
		System.out.println('\n');
		System.out.println("\"Hello\"");
		System.out.println("c:\\");
		
		int i = 10;
		byte b = (byte)i;
		System.out.printf("[int -> byte] i=%d -> b=%d%n",i,b);
		i = 300;
		b = (byte)b;
		System.out.printf("[int -> byte] i=%d -> b=%d%n",i,b);
		b = 10;
		i = (int)b;
		System.out.printf("[byte -> int] i=%d -> i=%d%n",b,i);
		b = -2;
		i = (int)b;
		System.out.printf("[byte -> int] i=%d -> i=%d%n",b,i);
		System.out.println("i="+Integer.toBinaryString(i));
	}
}	
