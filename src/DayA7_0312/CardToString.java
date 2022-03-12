package DayA7_0312;

public class CardToString {
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card("HEART", 10);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}
class Card {
	String kind;
	int number;
	
	Card() {
		// TODO Auto-generated constructor stub
		this("SPADE",1);
	}
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	public String toString() {
		return "kind : " + kind +", number : "+ number;
	}
}
