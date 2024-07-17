package chapter1;

public class DataType {

	public static void main(String[] args) {

		//기본형 데이터 타입
		
		//정수형 데이터 타입 : 실수부가 존재하지 않는 정수를 나타냄(부호를 가지고 있다)
		//byte : 1byte(8bit)의 크기를 가지는 정수형 데이터 타입 -128 ~ +127
		byte byte1 = -128;
		//byte1 = 128;
		
		//short :  2byte(16bit)의 크기를 가지는 정수형 데이터 타입 -32768 ~ +32767
		short short1 = 128;
		short1 = 32767;
		//short1 = 32768;
		
		//int : 4byte(32bit)의 크기를 가지는 정수형 데이터 타입
		int int1 = 32768;
		int1 = 2_147_483_647; //underbar 사용 가능
		
		//정수형 리터럴 상수는 int 타입임
		//int1 = 2_147_483_648L; 
		
		//long : 8byte(64bit)의 크기를 가지는 정수형 데이터 타입
		long long1 = 3_000_000_000L;
		
		//가장 많이 사용되는 정수형 타입 : int
		//메모리 공간 절약할 때 : byte, short
		// 큰 수를 다룰 때 : long 
		
		
		//정수형 int를 연산 결과를 저장하는 데이터 타입으로 사용할 땐, 연산 결과가 범위를 초과할 수도 있는지 확인
		int a = 200000, b=300000;
		int result = a + b;
		System.out.println(result);
		result = a * b;
		System.out.println(result);
		
		//실수형 데이터 타입 : 실수부를 가지는 데이터 타입
		
		//float : 4byte(32bit)의 크기를 가지는 실수형 데이터 타입
		// 소수점 6-7 자리에서 오차가 발생
		//실수형 리터럴 상수는 double 타입
		float float1 = 3.1415965358979323846F;
		System.out.println(float1);
	
		//double  : 8byte(64bit)의 크기를 가지는 실수형 데이터 타입
		//소수점 15 - 17자리 오차 발생
		double double1 = 3.1415965358979323846;
		System.out.println(double1);
		
		//문자형 데이터 타입 : 문자 하나를 저장할 수 있는 데이터 타입
		//char : 2byte(16bit)의 크기를 가지는 문자형 데이터 타입, 범위 0 ~ 65,535
		// 문자를 리터럴로 표현할 때 ''로 묶어서 표현
		char char1 = 'a';
		char char2 = 97;
		System.out.println(char1);
		System.out.println(char2);
		
		//논리형 데이터 타입 : 참과 거짓 값을 가지는 데이터 타입
		//boolean : 1byte(8it)의 크기를 가지는 논리형 데이터 타입
		//true, false
		boolean boolean1 = true;
		boolean boolean2 = false;
		System.out.println(boolean2);
		
		//형변환 : 데이터 타입이 서로 다른 변수를 옮겨 담는 것
		//자동 형변환 : 작은 데이터 타입의 변수를 큰 데이터 타입의 변수에 옮겨 담을 때 발생
		int number = 300;
		long long2 = number;
		
		//강제 형변환 : 큰 데이터 타입의 변수를 작은 데이터 타입의 변수에 옮길 때 발생
		number = (int)long2;
		
		char char3 = 100;
		short short2 = (short)char3;  //char, short 모두 2byte이지만, 부호비트 때문에 묵시적 형변환 불가
		int int2 = char3;
		
		//배열 : 동일한 타입의 변수를 묶어서 저장하는 컨테이너
		//new 연산자를 이용해서 생성해야 함
		//한번 생성된 배열의 크기는 변경할 수 없음
		
		//배열 변수 선언 : 데이터 타입[] 배열변수명;
		//배열 생성 : new 데이터타입[배열의 길이];
		int[] numbers;
		//numbers = 3;
		numbers = new int[5];
		
		int[] numbers2 = {1,2,3,4,5};
		int[] numbers3 = new int[] {1,2,3,4,5};
		
		System.out.println(numbers);
		System.out.println(numbers2);
		System.out.println(numbers3);
		
		//배열의 요소에 접근할 대는 '인덱스' 사용
		//인덱스는 0번부터 시작, 마지막 인덱스는 길이의 -1
		int item = numbers3[2];
		System.out.println(item);
		numbers3[0] = 9;
		item = numbers3[0];
		System.out.println(item);
		
		//인덱스 범위를 초과하는 인덱스에 접근할 시 예외 발생
		//System.out.println(numbers3[99]);
		
		//배열의 길이를 확인 : .length 사용
		System.out.println("배열의 길이 : " + numbers3.length);
		
		int[] example1 = new int[] {1,2,3};
		int[] example2 = example1;
		example1[1] = 99;
		System.out.println(example1[1]);
		System.out.println(example2[1]);
		
		System.out.println(example1);
		System.out.println(example2);
		//example1과 example2는 같은 주소를 가진다
		
		char[] chars1 = {'a', 'p', 'p', 'l', 'e'};
		System.out.println(chars1);
		//문자 배열은 프린트 할 때, 안의 내용이 출력됨
		
		//String : 문자의 배열(문자열)을 표현하는데 사용되는 참조형 데이터 타입
		//선언 : String 변수명;
		//생성 : new String();
		//초기화 : 변수명 = "문자열";
		String string1;
		string1 = new String("apple");
		System.out.println(string1);
		
		//문자열(String)의 주요 기능
		String statement = " My name is loki ";
		
		//1. 문자열 결합 : + 혹은 concat(문자열)으로 두 문자열 연결 가능
		System.out.println(statement + "@@@");
		System.out.println(statement.concat("!!!"));
		
		//2. 문자열 비교 
		//equals(문자열) : 두 문자열이 동등한지 비교
		//compareTo(문자열) : 두 문자열을 사전 순으로 비교(대소문자 구분)
		//compareToIgnoreCase(문자열) : 두 문자열을 사전 순으로 비교(대소문자 구분 X)
		System.out.println(statement.equals(" My name is loki "));
		System.out.println(statement.compareTo(" Zy name is loki "));
		//statement가 괄호 안의 문자열보다 뒤에 있으면 양수, 앞에 있으면 음수, 같으면 0
		
		//3. 문자열 길이 : 변수.length() : 문자열의 길이 반환
		System.out.println(statement.length());
		
		//4. 문자열 변환
		//toUpperCase() : 모든 문자를 대문자로 변경
		//toLowerCase() : 모든 문자를 소문자로 변경
		//trim() : 문자열의 앞뒤 공백 제거
		System.out.println(statement.toUpperCase());
		System.out.println(statement.toLowerCase());
		System.out.println(statement.trim());
		
		//5. 문자열 찾기
		//indexOf(문자열) : 찾고자하는 문자열의 처음 찾은 위치의 인덱스 번호 반환
		//lastIndexOf(문자열) : 찾고자 하는 문자열의 마지막 찾은 위치의 인덱스 번호 반환
		statement = "내가 그린 기린 그림은 잘 그린 기린 그림이고 네가 그린 기린 그림은 잘 못 그린 기린 그림이다.";
		System.out.println(statement.indexOf("기린"));
		System.out.println(statement.indexOf("사자")); //존재하지 않는 값을 찾으면 -1 반환
		System.out.println(statement.lastIndexOf("기린"));
		System.out.println(statement.lastIndexOf("사자"));
		
		//6. 부분 문자열
		//substring(시작 인덱스) : 시작 인덱스부터 끝가지 출력 
		//substring(시작 인덱스, 종료 인덱스)) : 시작 인덱스부터 종료 인덱스까지 출력 
		System.out.println(statement.substring(26));
		System.out.println(statement.substring(26, 31));
		
		//참조형 데이터 타입
		//주소를 가지고 있는 변수의 데이터 타입
		//null(아무것도 지정되지 않은 상태)을 가질 수 있음
		//배열, 클래스, 인터페이스, 열거형이 참조형 데이터 타입에 속함
		String string2 = null;
		//System.out.println(string2.trim());
	
	}

}
