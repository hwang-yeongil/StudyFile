package DayB2_0405;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		System.out.println("Ű ������ ������� �Է�");
		
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		Double ki = sc1.nextDouble();
		Double muge = sc2.nextDouble();
		
		System.out.println("bmi ��� : ");
		Double bmi = muge /(ki*ki/10000);
		
		System.out.println(bmi);
		
		
		if(bmi<18.5) {
			System.out.println("��ü��");
		}else if (bmi<23) {
			System.out.println("����");
			
		}else if (bmi<25) {
			System.out.println("��ü��");
			
		}else if (bmi<30) {
			System.out.println("��");
			
		}else {
			System.out.println("����");
			
		}
	}
}
//Ű (183.5 cm) / ������ (75.5 kg) => �Ѵ� �Ǽ��� �Է¹���.
//
//BMI �� ���
//=> ���� : ������ (kg����) / Ű(m����)�� ���� => BMI��.
//=> Ex. 75.5 / (1.835)���� => 22.422.....
//
//����
//1) ~ 18.5 �̸� : ��ü��
//2) 18.5 ~ 23 �̸� : ����
//3) 23 ~ 25�̸� : ��ü��
//4) 25 ~ 30�̸� : ��
//5) 30�̻� : ����
//
//Hint : �������� ������?
//=> Ex. 100 / (1.5)���� => 100 / (1.5 * 1.5) => 100 / 1.5 / 1.5