package DayB2_0405;

import java.util.Scanner;

public class test1 {
//	int���� 3��.
//	=> koreanScore, mathScore, englishScore ������ ������ �Է¹���. (Scanner)
//
//	�� �������� ��� ������ ���.
//
//	��� ������ 60�� �̻��̸� "�հ�", �ƴϸ� "���հ�"
	
	public static void main(String[] args) {
		
		System.out.println("�������� �Է�");
		Scanner sc1 = new Scanner(System.in);
		int koreanScore = sc1.nextInt();
		System.out.println("�������� �Է�");
		Scanner sc2 = new Scanner(System.in);
		int mathScore =sc2.nextInt();
		System.out.println("�������� �Է�");
		Scanner sc3 = new Scanner(System.in);
		int englishScore = sc3.nextInt();
		
		
		if(koreanScore<40 || mathScore< 40 || englishScore <40) {
			System.out.println("����");
		}else if((koreanScore+mathScore+englishScore)/3 >= 60){
			
			System.out.println("�հ�");
		}else {
			System.out.println("���հ�");
			
		}
	}


	
}