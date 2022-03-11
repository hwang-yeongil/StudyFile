package Day9_0222;

public class CastingTest_359 {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = null;
//		FireEngine fe1 = new FireEngine();
		FireEngine fe2 = null;
		
//		fe1.water();
		car1.drive();
//		car1 = fe1;
		fe2 = (FireEngine)car1;
//		fe2.water();
		fe2.drive();
		car2 = fe2;
		car2.drive();
	}
}
class Car{
	String color;
	int door;
	
	void drive() {
		System.out.println("drive start");
	}
	void stop() {
		System.out.println("stop!");
	}	
}
class FireEngine extends Car{
	void water() {
		System.out.println("water~~");
	}
}