package chapter1.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		
		/*사용자로부터 0 이상의 숫자를 입력받고
		* 입력받은 숫자를 numbers 라고 하는 배열에 저장함
		* 만약 사용자가 0 미만의 정수를 입력하면 
		* 사용자가 입력한 정수를 모두 출력하고 프로그램 종료
		*/
		
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[0];
		while(true) {
			System.out.print("정수 입력 : ");
			int inputNumber = scanner.nextInt();
			
			if(inputNumber < 0) break;
			
			int[] newNumbers = new int[numbers.length + 1];
			
			for(int index = 0; index < numbers.length; index++) {
				newNumbers[index] = numbers[index];
			}
			newNumbers[newNumbers.length - 1] = inputNumber;
			numbers = newNumbers;
		}
		//for(int number : numbers) System.out.println(number);
		System.out.println(Arrays.toString(numbers));
		System.out.println("종료");
		scanner.close();
	}

}
