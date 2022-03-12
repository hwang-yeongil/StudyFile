package DayA7_0312;

public class EqualsEx1 {
	public static void main(String[] args) {
//		Value v1 = new Value(10);
//		Value v2 = new Value(10);
//		
//		if(v1.equals(v2))
//			System.out.println("v1 = v2");
//		else
//			System.out.println("v1 =! v2");
//		v2 = v1;
//		
//		if(v1.equals(v2))
//			System.out.println("v1 = v2");
//		else
//			System.out.println("v1 =! v2");
		
		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);
		
		if(p1==p2)
			System.out.println("p1==p2");
		else
			System.out.println("p1!=p2");
		if(p1.equals(p2))
			System.out.println("p1==p2");
		else
			System.out.println("p1!=p2");
	}
}
class Value	{
	int value;
	
	Value(int value){
		this.value = value;
	}
}

class Person {
	long id;
	
	public boolean equals(Object obj) {
		if(obj!=null && obj instanceof Person)
			return id == ((Person)obj).id;
		else
			return false;
	}
	public Person(long id) {
		// TODO Auto-generated constructor stub
		this.id = id;
	}
}