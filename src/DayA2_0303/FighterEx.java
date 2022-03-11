package DayA2_0303;

public class FighterEx {
	public static void main(String[] args) {
		Fighter1 f = new Fighter1();
		
		if(f instanceof Unit1)
			System.out.println("f는 Unit클래스의 자손입니다.");
		if(f instanceof Fightable)
			System.out.println("f는 Fightable인터페이스를 구현했습니다.");
		if(f instanceof Movable)
			System.out.println("f는 Movable인터페이스를 구현했습니다.");
		if(f instanceof Attackable)
			System.out.println("f는 Attackable인터페이스를 구현했습니다.");
		if(f instanceof Object)
			System.out.println("f는 Object클래스의 자손입니다.");
	}
}
class Fighter1 extends Unit1 implements Fightable{

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack(Unit1 u) {
		// TODO Auto-generated method stub
		
	}
	
}
class Unit1{
	int currentHP;
	int x;
	int y;
}
interface Fightable extends Movable, Attackable{}
interface Movable{ void move(int x, int y);}
interface Attackable{ void attack(Unit1 u);}
