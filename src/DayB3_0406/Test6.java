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

// �׳� �������� ���ȳ�

/*���� ����
- ���� �ϳ��� �Է¹���.
- 3�� �� ���ڸ�ŭ�� �������� ����ؼ� ���.

����.
- 3 => 3�� 3�� => "333" => 27
- 5 => 3�� 5�� => "33..5��" => 243

�׽�Ʈ�� ���ǻ���
- �Է°��� �ʹ� ũ��, �ڵ带 ����� �ۼ��ߴ� �ϴ��� �̻��Ѱ��� ����.
=> 20 ���Ϸ� �׽�Ʈ.*/