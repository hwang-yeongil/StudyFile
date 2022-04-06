package DayB3_0406;

import java.util.Scanner;

public class Test8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		Double myMoney = sc.nextDouble();
		Double plusPercent = sc2.nextDouble();
		
		Double tmp = myMoney;
		
		for(int i = 1; i<9999999;i++	) {
			myMoney = myMoney + (myMoney*(plusPercent/100));
			System.out.println(i);
			if(tmp*2 <= myMoney) {
				System.out.println(i+"년 정도 걸림");
				break;
			}
		}
	}
}
