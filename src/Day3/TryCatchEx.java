package Day3;

public class TryCatchEx {
	public static void main(String[] args) {
//		try {
//			try {	} catch (Exception e) {			}
//		} catch (Exception e) {	참조변수 e중복
//			try {	} catch (Exception e) {			} 
//		}
//		
//		
//		try {
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//			
//		}
		
		int number = 100;
		int result = 0;
		
		for(int i=0; i<20; i++) {
			try {
				
				int rd = (int)(Math.random()*10);
				int rd3 = (int)(Math.random()*100);
				int rd2 = (int)(Math.random()*10);
//				System.out.println("랜덤 숫자"+rd);
//				System.out.println("랜덤 숫자"+rd2);
//				result = number / rd;
				if(rd2%2==1 ) {
					System.out.println(rd);
				}else {
					System.out.println(rd3);
				}
//				System.out.println(result); 
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("0");
			}
		}
	}
}
