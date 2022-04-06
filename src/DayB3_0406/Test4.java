package DayB3_0406;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		System.out.println("년도 입력");
		Scanner sc = new Scanner(System.in);
		
		int Year = sc.nextInt();
		System.out.println(Year);
		if(Year%400 == 0) {
			
			System.out.println("윤년");
		}else if (Year % 100 == 0) {
			
			System.out.println("윤년 아님");	
		}else if (Year % 4 == 0){
			if(Year % 100 != 0) {
			System.out.println("윤년");
			}
			
		}else {
			System.out.println("윤년 아님");
		}
		
	}
}
//문제 설명
//
//윤년 : 2월이 29일까지 있는 해.
//년도를 하나 입력받아서, 그 해가 윤년인지 아닌지 알려주자.
//윤년이 맞다면 왜 맞다고 확정됬는지, 아니라면 왜 아닌지 등의 이유도 같이 출력.
//=> Ex. 2019 : 4로 나눠떨어지지 않아서 윤년이 아님.
//=> Ex. 2000 : 400으로 나눠 떨어지므로 윤년이다.
//판별 기준
//1) 4로 나눠봤을때 안떨어지면 절대 윤년 X.
//=> Ex. 2011, 2019 등. -> 윤년 X.
//2) 4로 떨어지면 => 추가 검사 필요함. => 100으로 나눠떨어지는지 확인.
//=> 4로 떨어지면서 / 100으로 안떨어지면 => 윤년 O. (Ex. 2020, 2012, 2004)
//3) 100으로도 떨어지면 => 추가 검사 필요함. => 400으로 떨어지는지 확인.
//=> 나눠떨어지면 윤년 O => 1600, 2000, 2400
//=> 안떨어지면 윤년 X. => 1900, 2100 등.