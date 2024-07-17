package chapter1;

import java.util.Scanner;

public class ControlSwitch {

	public static void main(String[] args) {
		
		//switch문 : 특정 변수 또는 표현식에 따라 실행할 코드 블럭의 범위를 결정하는 것
		/*switch(변수 - 일반표현식) {
			case 값1:
				변수-일반표현식이 값1과 같을 때 시작할 코드 블럭 위치
			case 값2:
				변수-일반표현식이 값2과 같을 때 시작할 코드 블럭 위치
				switch 내부에서 break문을 만나면 switch 코드 블럭 종료
				break;
			case 값3:
				변수-일반표현식이 값3과 같을 때 시작 할 코드 블럭 위치
			default:
				변수-일반표현식이 case의 값과 일치하는 것이 없거나
				바로 위에서 break문을 만나지 않으면 실행되는 코드
		}
		 */
		
		//number가 0이면 A, B, C 출력
		//1이면 B, C 출력
		//2이면 C를 출력
		//3이면 D, E, F 출력
		//4이면 E, F 출력
		// 0 ~ 4가 아니면 F 출력 
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 : ");
		int number = scanner.nextInt();
		switch(number) {
		case 0:
			System.out.println("A");
		case 1:
			System.out.println("B");
		case 2:
			System.out.println("C");
			break;
		case 3:
			System.out.println("D");
		case 4:
			System.out.println("E");
		default:
			System.out.println("F");
		}
	}

}
