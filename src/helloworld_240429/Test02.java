package helloworld_240429;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		int b = 200;
		
		System.out.println(a + b);
		System.out.println(a / b); // 0이 출력 -> 정수 대 정수 연산은 무조건 정수 답이 나옴.
		
		double x = 3.5;
		double y = 7.0;
		
		System.out.println(x+y);  // 실수 대 실수 연산은 실수 답이 나옴.
		System.out.println(y/x);  // 소수점 없는 연산값도 .0이 붙음.
		
		int c = 10;
		double z = 2.5;
		
		System.out.println(c+z);  // 정수 대 실수 연산은 실수 답이 나옴.
		System.out.println(c/z);  // 정수 대 실수 연산은 소수점이 없는 값도 .0이 붙음.
		
		int r1;
//		r1 = c / z; // 정수로 선언한 변수에 정수 대 실수 연산식을 대입하면 오류 뜬다.
		r1 = c / (int) z; 
		System.out.println(r1);
		r1 = (int) (c/z);
		System.out.println(r1);
		// 이러면 값이 달라진당!
		
		String str1 = "3"+"10";
		System.out.println(str1);
		String str2 = 3+"10";
		System.out.println(str2);
//		String str3 = (String)(3+10); -> 이건 오류 뜬다
//		System.out.println(str3);
		
		// Wrapper class에 있는 Integer, Double, Boolean을 이용하여 강제 형식변환하기
		String numStr1 = "10";
//		int numInt1 = (int) numStr1; // 파이썬에서는 가능하나, 자바에서는 불가능
		int numInt1 = Integer.parseInt(numStr1); // 문자열 String -> 정수 int로 변환하는 방법
		System.out.println(numInt1);
		
		String numstr2 = "3.14";
		double numDoub1 = Double.parseDouble(numstr2);  // 문자열 String -> 실수 float double로 변환
		System.out.println(numDoub1);
		
		String numstr3 = "true";
		boolean numLogic1 = Boolean.parseBoolean(numstr3); // 문자열 String -> 논리 Logic으로 변환
		
		// 자바에서는 숫자(정수, 실수)를 바로 문자열로 변환 불가!
		
		String c2 = String.valueOf(c); //정수 10을 문자열 10으로 변환하여 저장함
		System.out.println(c2);
		
	}

}
