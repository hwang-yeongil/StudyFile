package Day8_0221;

public class SuperEx {
	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}
}

class Parent{
	int x=10;
}

class Child extends Parent{
	int x=20;
	
	void method() {
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x=" + super.x); 
	}
}
// x = this.x 자손 클래스 멤버변수
// super.x	조상 클래스 멤버변수