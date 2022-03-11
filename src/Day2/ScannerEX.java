package Day2;

import java.util.Scanner;

public class ScannerEX {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수 하나 입력");
		String input = scanner.nextLine(); // scanner로 문자열로 반환
		int num = Integer.parseInt(input); // input(문자열)을 숫자로 변환 
		
		System.out.println("입력내용 :" +input );
		System.out.printf("num=%d%n", num);
		
	}
}
