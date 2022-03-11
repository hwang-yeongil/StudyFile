package Day5_0215;

public class ConstructorEX {
	public static void main(String[] args) {
		Data1 d1 = new Data1();
		Data2 d2 = new Data2(1);
		System.out.println(d1.Value);
		System.out.println(d2.Value);
	}
}

class Data1{
	int Value = 10;
}

class Data2{
	int Value;
	Data2(int x){
		Value = x;
	}
}