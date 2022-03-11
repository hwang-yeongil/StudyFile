package DayA3_0306;

class InterfaceTest3{
	public static void main(String[] args) {
		D d = new D();
		d.methodA();
	}
}
class D{
	void methodA() {
		I i = InstanceManager.getInstance();
		i.methodB();
		System.out.println(i.toString());
	}
}
interface I {
	public abstract void methodB();
}
class F implements I {
	public void methodB(){
		System.out.println("methodB in F class");
	}
	public String toString() { return "class F";}
}

class InstanceManager{
	public static I getInstance() {
		return new F();
	}
}


