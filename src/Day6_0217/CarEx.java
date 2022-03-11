package Day6_0217;

public class CarEx {
	public static void main(String[] args) {
		Car c1 = new Car();
		
		System.out.println(c1.color+" , "+ c1.gearType+" , "+c1.door);
//		System.out.println(c2.color+" , "+ c2.gearType+" , "+c2.door);
		
		c1.door = 2;
		Car c2 = new Car(c1); // c1의 복사본
		System.out.println(c1.color+" , "+ c1.gearType+" , "+c1.door);
		System.out.println(c2.color+" , "+ c2.gearType+" , "+c2.door);
		
		
	}
}

class Car{
	String color;
	String gearType;
	int door;
	
	Car(){ 
		this("white","auto",4);
	}

	Car(Car c){ // 인스턴스의 복사를 위한 생성자
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}

	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		
		// TODO Auto-generated constructor stub
	}
}


