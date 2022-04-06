package DayB3_0406;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int sum = 0;
		for(int i = 1;i<=number;i++ ) {
			System.out.println(i);
			sum = sum+ i;
		}
		System.out.println(sum);
	}
}
//문제 설명
//
//정수 하나를 입력 받자. (Ex. 5)
//1+2+3+4+5 의 결과를 구해서 => 결과만 화면에 출력.
//예시
//
//5 입력 : 15 출력
//10 입력 : 55 출력
//Hint
//- 실수령액 계산기처럼, 결과를 담아주기 위한 별도의 변수를 따로 만드는게 편리함.