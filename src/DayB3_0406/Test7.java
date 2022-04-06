package DayB3_0406;

import java.util.List;

public class Test7 {
	public static void main(String[] args) {
		for(int i = 0; i<5;i++) {
			for(int j = 0; j<5;j++) {
//				if(i+j==4) {
//					
//					System.out.print("["+i+","+j+"]");
//				}else if (i==j) {
//					System.out.print("["+i+","+j+"]");
//					
//				}else{
//					
//					System.out.print("      ");
//				}
				if(i==0||j==0||i==4||j==4) {
					
					System.out.print("["+i+","+j+"]");

				}else{
					
					System.out.print("     ");
				}
			}
			System.out.println();
			
		}
	}
}
