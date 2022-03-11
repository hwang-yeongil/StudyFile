package DayA4_0307;

public class InnerRealEx4 {
	public static void main(String[] args) {
		Outer1 oc = new Outer1();
		Outer1.InstanceInner ii = oc.new InstanceInner();
		
		System.out.println(ii.iv);
		System.out.println(Outer1.StaticInner.cv);
		
		Outer1.StaticInner si = new Outer1.StaticInner();
		System.out.println(si.iv);
	}
}
class Outer1{
	class InstanceInner{
		int iv = 100;
	}
	static class StaticInner{
		int iv = 200;
		static int cv = 300;
	}
	void myMethod() {
		class LocalInner{
			int iv = 400;
		}
	}
}
