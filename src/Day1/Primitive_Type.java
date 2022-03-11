package Day1;

public class Primitive_Type {
	public static void main(String[] args) {
		// 		1byte 	2byte	4byte	8byte
		// 논리형 boolean
		// 문자형 		char
		// 정수형 byte 	short 	int 	long
		// 실수형					float 	double
		
		byte b =1;
		short s =2;
		char c ='A';
		
		int finger = 10;
		long big = 100_000_000_000L; // =100000000000L;
		long hex = 0xFFFF_FFFF_FFFFL;
		
		int octNum = 010;
		int hexNum = 0x10;
		int binNum = 0b10;
		
		System.out.printf("b=%d%n", b);
		System.out.printf("s=%d%n", s);
		System.out.printf("c=%c, %d %n", c, (int)c);
		System.out.printf("finger={%5d}%n", finger);
		System.out.printf("finger={%-5d}%n", finger);
		System.out.printf("finger={%05d}%n", finger);
		System.out.printf("big=%d%n", big);
		System.out.printf("hex=%#x%n", hex);
		System.out.printf("octNum=%o,%d%n",octNum, octNum);
		System.out.printf("hexNum=%h,%d%n",hexNum, hexNum);
		System.out.printf("binNum=%s,%d%n",Integer.toBinaryString(binNum), binNum);
	}
}
