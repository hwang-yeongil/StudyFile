package DayB3_0406;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int sum = 1;
		if(number ==0) {
			sum =0;
		}
		for(int i = 1; i <= number ; i++) {
			System.out.println(i);
			sum *= number; 
		}
		System.out.println(sum);
	}
}

// 그냥 제곱시켜 버렸네

/*문제 설명
- 정수 하나를 입력받자.
- 3의 그 숫자만큼의 제곱수를 계산해서 출력.

예시.
- 3 => 3의 3승 => "333" => 27
- 5 => 3의 5승 => "33..5번" => 243

테스트시 유의사항
- 입력값이 너무 크면, 코드를 제대로 작성했다 하더라도 이상한값이 나옴.
=> 20 이하로 테스트.*/