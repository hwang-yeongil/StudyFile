package DayA4_0307;

public class InnerEx1 { // 내부 클래스 405
	class InstanceInner{
		int iv = 100;
//		static int cv = 100;  내부 클래스에는  static변수 선언 불가
		final static int CONST = 100; // final static은 상수라 가능
	}
	
	static class StaticInner{
		int iv = 200;
		static int cv = 200;  // static클래스만 static멤버를 정의 가능
	}
	void myMethod() {
		class LocalInner{
			int iv = 300;
			final static int CONST = 300;
		}
	}
	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
	}
}
