//package ex02.dataType;
//
//public class DataType {
//	public static void main(String[] args) {
//		
//	short sh = -32768; // -32768~32767
//	int su = 32769; // -21억 ~ 21억
//	
////	su = sh; // 묵시적(자동) 형변환
////	sh = su; // 에러. 형변환 안됨 왜? int에 해당하는 형태를 더 작은 쪽에 넣을 수 없기 때문ㅇ 따라서
//	sh = (short)su; // 명시적 형변환 - 데이터 손실 발생
//	System.out.println(sh); // 이렇게 되면 값이 32769가 나오는게 아니라
//	// 빙빙 돌다가 short에 해당되는 아무 숫자가 나온다.
//	
//	}
//}
//
package day01.dataType;

public class DataType{
	public static void main(String[] args) {
		char ch = 'A';

		System.out.println(ch + ", ASCII code = " + (int)ch);
		System.out.println('b');
		System.out.println((int)'b');
		
		int num = 9;
		int xNum = 0x9; // 16진수 : 0x숫자sa
		int oNum = 011; // 0숫자 : 8진수
		int bNum = 0B1110; // 0b숫자 : 2진수 (binary)
		
		System.out.println("22222진수 : "+bNum);  //////수정
		System.out.println("16진수 : "+xNum);
		//System.out.println("8진수 : "+oNum);
		System.out.println("10진수 : "+num);
		
		// 16진수는 0123456789abcdef임 
		
		System.out.println("===================");
		System.out.printf("%d %d \n", 0xa, 0xA); // 대문자 소문자 상관 없음
		
		System.out.printf("%d \n", 012); // 8 --> 10
//		자료구조 8진수 메모리구조 16진수 사람 10진수 기계어 2진수
		
		System.out.printf("%x %X \n", 10, 10);
		System.out.printf("%o  \n", 10);
		
		
		
		
	}
}



