package DayB2_0405;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		System.out.println("키 몸무게 순서대로 입력");
		
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		Double ki = sc1.nextDouble();
		Double muge = sc2.nextDouble();
		
		System.out.println("bmi 계산 : ");
		Double bmi = muge /(ki*ki/10000);
		
		System.out.println(bmi);
		
		
		if(bmi<18.5) {
			System.out.println("저체중");
		}else if (bmi<23) {
			System.out.println("정상");
			
		}else if (bmi<25) {
			System.out.println("과체중");
			
		}else if (bmi<30) {
			System.out.println("비만");
			
		}else {
			System.out.println("고도비만");
			
		}
	}
}
//키 (183.5 cm) / 몸무게 (75.5 kg) => 둘다 실수로 입력받자.
//
//BMI 값 계산
//=> 공식 : 몸무게 (kg단위) / 키(m단위)의 제곱 => BMI값.
//=> Ex. 75.5 / (1.835)제곱 => 22.422.....
//
//판정
//1) ~ 18.5 미만 : 저체중
//2) 18.5 ~ 23 미만 : 정상
//3) 23 ~ 25미만 : 과체중
//4) 25 ~ 30미만 : 비만
//5) 30이상 : 고도비만
//
//Hint : 제곱으로 나눈다?
//=> Ex. 100 / (1.5)제곱 => 100 / (1.5 * 1.5) => 100 / 1.5 / 1.5