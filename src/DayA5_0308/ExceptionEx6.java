package DayA5_0308;

public class ExceptionEx6 { // + 7,8
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); // 0으로 나누면 오류 발생
			System.out.println(4);
		} catch (ArithmeticException ae) {
			ae.printStackTrace(); 
			System.out.println("예외 메세지 : " + ae.getMessage());
		}
		System.out.println(6);
	}
}


//} catch (ArithmeticException ae) {
//	if(ae instanceof ArithmeticException)
//		System.out.println(true);
//	System.out.println("ArithmeticException");
//	// TODO: handle exception
//} catch (Exception e) {
//	// TODO: handle exception
//	System.out.println("Exception");
//}