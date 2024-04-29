/*
연습 자바 파일
2024-04-29
만든이: 이보연
*/
package helloworld_240429;

public class Test01 { // 자주색 글씨는 예약어이다.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10; // 정수변수 a를 선언과 동시에 10으로 초기화했음. a의 초기화
		// 메모리(RAM)에 4byte 공간이 하나 생성됨 -> 이름이 a로 만들어짐.
		a = 10; //위에서 선언된 정수 변수 x에 정수값 10이 저장됨.
		int y;
		int z;
		
		//int a,y,z; //한 번에 3개의 정수변수를 선언(타입이 같을 때만 가능)
		int x = 10;
		x = 100; // 새로 값 대입.
		//int a; //이미 선언된 변수를 다시 선언하는 것은 불가
		
		y = x + a;
		z = a + y;
		
		System.out.println("저의 수학점수는 " + x + "점입니다.");
		
		if(a>=100) {
			y = z;
			System.out.println("x의 값: "+x);
		} else {
			System.out.println("y의 값: "+y+"\nz의 값: " + z);
		}
		
		int b;
		char c = 'A'; //char 타입은 문자 한 개, 작은따옴표만 가능하다.
//		char d = "A"; // -> 오류 발생! 큰따옴표는 문자열로 봄. 문자열은 string 선언
		String e = "Korea"; // 문자열은 String(첫글자 대문자!!!) 로 선언 (그런데 색이 자주색이 아님. 예약어가 아님)
		// String은 클래스이다.
		double f1 = 10.1;
		float f2 = 3.14f; // float형 실수 변수는 마지막에 f를 붙임
		long k = 10L; //long형 정수 변수는 마지막에 L을 붙임
		
		boolean aaa = true; //true와 false는 예약어이다. 소문자로 써야 함!!!
		boolean bbb = false;
		
		System.out.println("큰 따옴표\" \"를 찍어봅시다.");
	}

}
