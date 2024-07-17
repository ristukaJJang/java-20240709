package chapter2;

/* 인터페이스 : 클래스가 구현해야하는 메서드들을 선언한 참조 타입
 * 인터페이스의 모든 변수 public static final 형태가 와야한다
 * 인터페이스의 모든 메서드는 public abstract 형태가 와야한다
 * 인터페이스는 다중 구현 가능
 * 
 * 접근제어자 interface 인터페이스명 {...} 
 */
interface AreaCalculation {
	
	public static final double PI = 3.14;
	
	public abstract double getTriangleArea(double bottom, double height);
	/*public abstract*/ double getRectangleArea(double bottom, double height);
	/*public abstract*/ double getCircleArea(double radius);
	
}

interface CircumferenceCalculation {
	double getCircleCircumference(double radius);
}

// 인터페이스는 다중 상속 가능
interface Calculation extends AreaCalculation, CircumferenceCalculation{}

// interface는 implements 키워드를 이용하여 클래스에서 구현하여 사용 가능
//인터페이스는 다중 구현 가능
class MyCaculation implements /*AreaCalculation, CircumferenceCalculation, */ Calculation
{

	@Override
	public double getTriangleArea(double bottom, double height) {
		return bottom*height/2;
	}

	@Override
	public double getRectangleArea(double bottom, double height) {
		return bottom*height;
	}

	@Override
	public double getCircleArea(double radius) {
		return radius*radius*PI;
	}

	@Override
	public double getCircleCircumference(double radius) {
		return radius*2*PI;
	}
	
}

//인터페이스는 개발자간의 상호 약속을 위한 수단으로도 사용됨
interface Statement {
	//final이 생략되어 있음, 값 변경 불가
	String greet = "안녕하세요.";
}

public class Interface {

	public static void main(String[] args) {
		
		double pi = AreaCalculation.PI;
		// AreaCalculation.PI = 10; 변경 불가
		
		MyCaculation instance = new MyCaculation();
		instance.getCircleArea(10);
		
		System.out.println(Statement.greet);
	}

}
