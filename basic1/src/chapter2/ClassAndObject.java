package chapter2;

// 클래스 : 공통된 속성과 기능을 정의해둔 것
// [접근제어자] class 클래스명 { 속성, 기능 }
class ExampleClass1 {
	
	//속성 : 클래스가 가질 수 있는 정보나 상태
	//일반적으로 변수로 표현
	
	// 인스턴스 변수 : 각 인스턴스마다 독립적으로 값을 가지는 변수
	// 반드시 인스턴스가 생성된 후에 사용할 수 있다.
	int attribute1;
	double attribute2;
	
	//클래스 변수 : 해당 클래스로 생성된 모든 인스턴스가 공유하는 변수
	//필드 앞에 static 키워드를 사용하여 지정
	// 인스턴스 없이 클래스로 직접 접근 가능
	static int staticAttribute;
	
	//기능 : 클래스가 가질 수 있는 행동이나 작업(메서드)
	//[접근제어자] 반환타입 메서드명(매개변수타입 매개변수명[, ...]) {메서드 기능 구현}
	
	//인스턴스 메서드 : 인스턴스를 생성한 후 사용할 수 있는 메서드
	// 인스턴스 필드를 사용하는 기능에 대해서 인스턴스 메서드 사용
	int method1(int arg1) {
		//기능 구현
		//반환 타입이 void가 아니면 반드시 return 으로 결과값을 반환해야 한다
		return arg1*arg1;
	}
	
	//클래스 메서드 : 인스턴스 생성 없이 클래스로만 호출 가능한 메서드
	//반환 타입 앞에 static 키워드를 붙여서 사용
	// 인스턴스 필드를 사용하지 않는 메서드에 주로 사용
	//인스턴스 필드를 사용할 수 없음
	static void staticMethod() {
		//System.out.println(attribute1);
		//method1(5);
	}
	
}


/* 스마트폰
 * ----속성----
 * - 제조사 String
 * - 제조일자 String
 * - 모델명 String
 * - 전화번호 String
 * - 어플 리스트 String[]
 * - 전원상태 boolean
 * 
 * ----기능----
 * - 전화 걸기
 * - 어플 설치
 * - 문자 보내기
 * - 스마트폰 정보 보기
 * - 전원 누르기
 * */ 

class SmartPhone {
	String manufacturer;
	String manufactureDate;
	String modelName;
	String telNumber;
	String[] appList = new String[0];
	boolean powerStatus;
	
	void printInformation() {
		System.out.println("===== 정보 =====");
		System.out.println("제조사 : " + manufacturer);
		System.out.println("제조날짜 : " + manufactureDate);
		System.out.println("모델이름 : " + modelName);
		System.out.println("전화번호 : " + telNumber);
	}
	void call(String toTelNumber) {
		System.out.println(telNumber + "가 "+ toTelNumber + "로 전화를 겁니다.");
	}
	void appInstall(String appName) {
		String[] newAppList = new String[appList.length + 1];
		for(int index = 0; index < appList.length; index++) {
			newAppList[index] = appList[index];
		}
		newAppList[newAppList.length - 1] = appName;
		appList = newAppList;
	}
	void sendMessage(String toTelNumber, String message) {
		System.out.println(telNumber + "가 " + toTelNumber + "에게 " + message + "를 전송했습니다.");
	}
	void pressPowerButton() {
		powerStatus = !powerStatus;
		
	}
}


/* 한국인
 * ===== 속성 =====
 * - 이름
 * - 나이
 * - 국적
 * */

class Korean{
	String name;
	int age;
	static String nationality = "대한민국"; //초기값 설정 가능
 }

/* 삼각 함수(속성 없이 메서드만)
 *  - 빗변 구하기
 *  - 둘레 구하기
 *  - sin 구하기
 * */
class TriangleMath {
	
		//SRP(단일 책임 원칙) 하나의 클래스는 관련된 내용만 포함한다.
		//PI, getCircleArea(double)은 SRP 원칙에 위배
		static final double PI = 3.1415;
		static double getCircleArea(double radius) {
			if(radius <= 0) return 0;
			double area = radius * radius * PI;
			return area;
		}
		
		static double getHypotenuse(double bottom, double height) {
		
		if(bottom <= 0 || height <= 0) return 0;
		
		double hypotenuse2 = Math.pow(bottom, 2) + Math.pow(height, 2);
		double hypotenuse = Math.sqrt(hypotenuse2);
		return hypotenuse;
	}
	
	static double getCircumference(double bottom, double height, double hypotenuse) {

		if(bottom <= 0 || height <= 0 || hypotenuse <= 0) return 0;
		double circumference = bottom + height + hypotenuse;
		return circumference;
	}
	
	static double getSin(double hypotenuse, double height) {
		if(height <= 0 || hypotenuse <= 0) return 0;
		double sin = height / hypotenuse;
		return sin;
	}
}


public class ClassAndObject {

	public static void main(String[] args) {
		// 인스턴스 : 특정 클래스로 정의된 것을 실체화한 객체
		// 클래스명 참조변수명 = new 클래스명[이게 실제 인스턴스임](); 참조변수 안에 인스턴스가 있음
		ExampleClass1 instance1 = new ExampleClass1();
		ExampleClass1 instance2 = new ExampleClass1();
		
		//인스턴스가 가지고 있는 속성 접근 방법
		instance1.attribute1 = 10;
		instance2.attribute1 = 20;
		
		//System.out.println(instance1.attribute1);
		//System.out.println(instance2.attribute1);
		// new ExampleClass1().attribute1 = 30; 작성은 가능하나 아무런 기능 수행할 수 없음
		
		//인스턴스가 가지고 있는 메서드 호출 방법
		//인스턴스.메서드명(매개변수...);
		int methodResult = instance1.method1(5);
		//System.out.println(methodResult);
		
		instance1.staticAttribute = 10;
		System.out.println(instance1.staticAttribute);
		System.out.println(instance2.staticAttribute);
		
		instance2.staticAttribute = 33;
		System.out.println(instance1.staticAttribute);
		System.out.println(instance2.staticAttribute);
		//staticAttribute는 공통된 값을 공유한다.
		
		//정적인 방법으로 접근 -> 클래스로 직접 접근
		System.out.println(ExampleClass1.staticAttribute);
		System.out.println("=======================");
		
		SmartPhone iphone1 = new SmartPhone();
		SmartPhone galaxy1 = new SmartPhone();
		
		iphone1.manufacturer = "Apple";
		iphone1.manufactureDate = "2024-07-12";
		iphone1.modelName = "아이폰 15 프로";
		iphone1.telNumber = "010-1234-5678";
		iphone1.powerStatus = false;
		
		System.out.println(iphone1.manufacturer);
		System.out.println(galaxy1.manufacturer);
		System.out.println(galaxy1.powerStatus);
		
		iphone1.printInformation();
		galaxy1.printInformation();
		
		iphone1.sendMessage("010-1111-2222", "안녕하세요");
		
		Korean Korean1 = new Korean();
		Korean Korean2 = new Korean();
		
		Korean1.name = "홍길동";
		Korean1.age = 20;
		
		Korean2.name = "이영희";
		Korean2.age = 30;
		
		//초기값 : 대한민국
		System.out.println(Korean1.nationality);
		System.out.println(Korean2.nationality);
		
		//static 속성이기 때문에 둘 다 바뀜
		Korean1.nationality = "한국"; 
		System.out.println(Korean1.nationality);
		System.out.println(Korean2.nationality);
		
		
		//TriangleMath triangleMath = new TriangleMath();
		
		double bottom = 3;
		double height = 4;
		double hypotenuse = TriangleMath.getHypotenuse(bottom, height);
		System.out.println(hypotenuse);
	}

}
