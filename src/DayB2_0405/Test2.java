package DayB2_0405;

import java.util.Scanner;

public class Test2 {
//	Ű����� ���� �µ��� �Ǽ������� �Է� ����. (Ex. 28.7)
//
//	�Է¹��� ���� �µ��� ȭ���δ� ����� ����ؼ� ���.
//	=> ���� : �����µ� * 1.8 +32 =>ȭ���µ�.
	
	public static void main(String[] args) {
		System.out.println("�����µ�");
		Scanner sc = new Scanner(System.in);
		
		Double A = sc.nextDouble();
		System.out.println("�����µ� => ȭ���µ� : " +A*1.8+32);
	}
}
