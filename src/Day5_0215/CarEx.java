package Day5_0215;

public class CarEx {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		System.out.println(c1.color+","+c1.gearType+","+c1.door);
		
		Car c2 = new Car("Yellow", "auto",2);
		System.out.println(c2.color+","+c2.gearType+","+c2.door);
		
		Car c3 = new Car("blue");
		System.out.println(c3.color+","+c3.gearType+","+c3.door);
			
		
	}
	
}	
class Car{
	String color;
	String gearType;
	int door;
	
	Car() {
		this("white", "auto", 4);
		
	}	// 생성자
	
	Car(String color){
		this(color, "auto",4);
	}
	
/*	Car(String c, String g, int d){
		color = c;
		gearType = g;
		door = d;
	}	*/
	
	Car(String color,String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}