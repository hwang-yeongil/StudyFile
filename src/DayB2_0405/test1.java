package DayB2_0405;

import java.util.Scanner;

public class test1 {
//	int변수 3개.
//	=> koreanScore, mathScore, englishScore 세개의 점수를 입력받자. (Scanner)
//
//	이 세과목의 평균 점수를 계산.
//
//	평균 점수가 60점 이상이면 "합격", 아니면 "불합격"
	
	public static void main(String[] args) {
		
		System.out.println("국어점수 입력");
		Scanner sc1 = new Scanner(System.in);
		int koreanScore = sc1.nextInt();
		System.out.println("수학점수 입력");
		Scanner sc2 = new Scanner(System.in);
		int mathScore =sc2.nextInt();
		System.out.println("영어점수 입력");
		Scanner sc3 = new Scanner(System.in);
		int englishScore = sc3.nextInt();
		
		
		if(koreanScore<40 || mathScore< 40 || englishScore <40) {
			System.out.println("과락");
		}else if((koreanScore+mathScore+englishScore)/3 >= 60){
			
			System.out.println("합격");
		}else {
			System.out.println("불합격");
			
		}
	}


	
}