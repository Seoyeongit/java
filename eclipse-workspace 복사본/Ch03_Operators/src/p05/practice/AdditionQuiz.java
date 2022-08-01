package p05.practice;

import java.util.Scanner;

// 2개의 숫자를 프로그램 내부에서 자동 생성하여 더하기 퀴즈문제를 내는 프로그램
public class AdditionQuiz {

	public static void main(String[] args) {
		// 1970년 1월 1일 0시 0분 0초 기준으로 현재까지 1000분의 1초 단위의 숫자를 return
		long currentTimeMillisecond = System.currentTimeMillis();
		int num1 = (int) (currentTimeMillisecond % 10); // num1 : 0 ~ 9
		int num2 = (int) (currentTimeMillisecond / 10 % 10); 
		
//		System.out.println("currentTimeMillisecond = " + currentTimeMillisecond);
//		System.out.println("num1 = " + num1);
//		System.out.println("num2 = " + num2);

		Scanner input = new Scanner(System.in);
		
		System.out.println("숫자 " + num1 + "과 숫자 " + num2 + "의 합계는 얼마인가 ?");
		int answer = input.nextInt();
		boolean bCorrect = ( (num1 + num2) == answer );
		System.out.println(num1 + " + " + num2 + " = " + answer + "가 맞는가요 ? " + bCorrect);
	}

}
