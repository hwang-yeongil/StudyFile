package DayB2_0405;

import java.util.Scanner;

public class Test2 {
//	Å°º¸µå·Î ¼·¾¾ ¿Âµµ¸¦ ½Ç¼ö´ÜÀ§·Î ÀÔ·Â ¹ÞÀÚ. (Ex. 28.7)
//
//	ÀÔ·Â¹ÞÀº ¼·¾¾ ¿Âµµ°¡ È­¾¾·Î´Â ¸îµµÀÎÁö °è»êÇØ¼­ Ãâ·Â.
//	=> °ø½Ä : ¼·¾¾¿Âµµ * 1.8 +32 =>È­¾¾¿Âµµ.
	
	public static void main(String[] args) {
		System.out.println("¼·¾¾¿Âµµ");
		Scanner sc = new Scanner(System.in);
		
		Double A = sc.nextDouble();
		System.out.println("¼·¾¾¿Âµµ => È­¾¾¿Âµµ : " +A*1.8+32);
	}
}
