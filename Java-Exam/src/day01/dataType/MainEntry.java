/*
package ex02.basic;

public class ex02 {
	public static void main (String[] args) {
		
		System.out.print("hello");
		System.out.println(100);
		System.out.print("sdf");
		
	} // end main
} // end class
//*/

package day01.dataType;

public class MainEntry {
	public static void main (String[] args) { 
		int su = 9;// main이 항상 시작점(진입점)
		char ch = 'a';
		String str = "korea";
		double d = 12.34;
		float f = 12.34f;
		// float f =12.34는 안됨 f 붙여줘야 함
		// 왜? double 이랑 구분이 안되기 때문
		// 구분을 위해 float f =12.34f 로 표기 필요
		
		
		System.out.println(su);
		System.out.println(ch); // 2byte
		System.out.println(str);
		System.out.println(d);
		System.out.println(f);
		
		System.out.println(su + "," + ch + "," + str);
		System.out.println(100); //int 형으로 출력됨 0~4byte 이기때문. 디폴트 값이 int 
		System.out.println(100L); //Long 형으로 출력하고 싶을 때. 		
		
		System.out.println(3.5); // double 형
		System.out.println(3.5f); // float 형		
		
		System.out.println();
//		int su2;
//		System.out.println(su2); // c나 c++은 가능하나 자바는 안됨. 지역변수는 초기화 하지 않으면 사용 불가
//		
		int su2 = 100;
		System.out.println(su2);
		
		// ---------------------------------------------------------
		
		int x = 2; // 기본자료형
		Integer y = 2; // 참조형 / 주소만 저장. 번지수를 저장해서 불러오는 것임.
		
		
		x = y; // 이게 되는 이유는 자동 형변환이 되기 때문임 = autoboxing / unboxing 이라 부름
				// 4.x 버전 이전까지는 형변환 함수 intValue() 해줘야 했음

		System.out.println(y);

//		String str2 = 'A';  // error 나옴
//		char ch = "encore"; // 안됨
//		
		String str2 = "A"; // 한글자이지만 2바이트 / A\0
		char ch3 = 'A'; // 완벽한 A
		
		
		
	} // end main
} // end class





// 한줄주석

/*

	여러줄 주석

 */

// 실행은 ctrl + F11
// ctrl + ? 주석 붙이기 또는 해제하기, 여러줄도 가능


















