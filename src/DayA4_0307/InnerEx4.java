package DayA4_0307;

public class InnerEx4 {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.method1();
	}
}
class Outer {
	int value = 10;
	
	class Inner {
		int value = 20;
		
		void method1() {
			int value = 30;
			System.out.println("              value :" + value);
			System.out.println("         this.value :" + this.value);
			System.out.println("   Outer.this.value :" + Outer.this.value);
		}
	}
}