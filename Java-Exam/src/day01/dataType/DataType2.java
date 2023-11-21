package day01.dataType;

public class DataType2 {
	public static void main(String[] args) {
		String str = "A";
		char ch = 'a';
		char ch2 = 67;
		char ch3 = 'b';
		
		int su = 20; String name ="dsaf";
		double dd = 12.34;
		
		
		System.out.println(ch);
		System.out.println((int)ch);
		System.out.println(ch2 + "," + (char)ch2);
		System.out.println("name = " + name);
		System.out.printf("%f %f\n", dd, 33.5678 );
		System.out.printf("%10.1f %1.2f\n", dd, 33.154646574); // n.m 에서 n<m이면 무시된다
		
		
		for(int i=65; i <= 90; i++) {
			System.out.println((char)i + " ");
		}
		
		System.out.println("\n\n==================================");
		for(int i='a'; i <= 'z'; i++) {
			System.out.println((char)i + " ");
		}
		
		
		System.out.println("\n\n boolean type");
		boolean flag = true;
//		int b = flag; // 자바는 boolean값 int 형으로 형변환 안된다.
		System.out.println(flag);
		
		
		
		
	}
}







