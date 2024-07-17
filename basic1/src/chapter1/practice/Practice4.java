package chapter1.practice;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		/* 모두 대문자로 만들기
		 * 사용자로부터 문자열 statement 입력 받고
		 * 입력 받은 문자열을 영어라면 모두 대문자로 변경하여
		 * 문자배열에 저장한 후 출력
		 * ex) 안녕하세요 John 입니다. -> 안녕하세요 JOHN 입니다.
		 * */

		Scanner scanner = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String statement = scanner.nextLine();
		char[] statementChars = statement.toCharArray();
		scanner.close();
		
		for(int index = 0; index < statementChars.length; index++) {
			char charater = statementChars[index];
			boolean lowerEnglish = charater >= 97 && charater <= 122; //ASCII 활용
			if(!lowerEnglish) continue;
			else {
				statementChars[index] -= 32; //소문자 - 대문자 = 32
			}
		}
		
		System.out.println(statementChars);
		
	}

}
