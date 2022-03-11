package Day8_0221;

public class OverridingEx {
	public static void main(String[] args) {
//		int a = 1;
//		int b = 2;
//		int c = 3;
//		
		Point p1 = new Point();
		Point3D p2 = new Point3D();
//		
//		p1.x = a;
//		p1.y = b;
		System.out.println(p1.getLocation());
//		p2.x = a;
//		p2.y = b;
//		p2.z = c;
		System.out.println(p2.getLocation());
		
		Point3D p3 = new Point3D(1,2,3);
		System.out.println(p3.getLocation());
	}
}	
class Point{
	int x;
	int y;
	
	Point() {
		this(100, 200);
	}
	
	Point(int x, int y){
		super();
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x : " + x +" y : " + y;
	}
}
class Point3D extends Point{
	int z;
	
	public Point3D() {
		this(100, 101, 102);
	}
	
	Point3D(int x, int y, int z){
		super(x,y);
		this.z = z;
	}
	
	String getLocation() {
		return "x : " + x +" y : " + y + " z : " +z; // 오버라이딩 
	}
}