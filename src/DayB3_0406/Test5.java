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
//���� ����
//
//���� �ϳ��� �Է� ����. (Ex. 5)
//1+2+3+4+5 �� ����� ���ؼ� => ����� ȭ�鿡 ���.
//����
//
//5 �Է� : 15 ���
//10 �Է� : 55 ���
//Hint
//- �Ǽ��ɾ� ����ó��, ����� ����ֱ� ���� ������ ������ ���� ����°� ����.