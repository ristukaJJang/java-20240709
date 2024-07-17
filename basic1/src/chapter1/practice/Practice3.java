package chapter1.practice;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		// 문자열 자르기
		//사용자로부터 시작 인덱스와 종료 인덱스를 입력받고
		//입력받은 시작 인덱스와 종료 인덱스까지 문자열을 잘라서 자른거 출력
		
		//String 기능 substring 사용하지 않고 char[] 이용해서 작성
		
		Scanner scanner = new Scanner(System.in);
		
		String statement = "내가 그린 기린 그림은 잘 그린 기린 그림이고 네가 그린 기린 그림은 잘 못그린 기린 그림이다.";
		char[] statementChars = new char[statement.length()];
		
		System.out.print("시작 인덱스 입력 : ");
		int startIndex = scanner.nextInt();
		
		System.out.print("종료 인덱스 입력 : ");
		int endIndex = scanner.nextInt();
		
		scanner.close();
		
		for(int index = 0; index < statementChars.length; index++) {
			statementChars[index] = statement.charAt(index);
		}
		//char[] statementChars = statement.toCharArray();
 		
		char[] resultStatement = new char[endIndex - startIndex];
		for(int index = 0; index < resultStatement.length; index++){ 
			resultStatement[index] = statementChars[startIndex + index];
		}
		System.out.println(resultStatement);
	}

}
