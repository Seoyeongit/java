package q01.quiz01;

import java.util.Scanner;

public class quiz05 {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("2개의 정수를 입력하세요. ");
		int a= input.nextInt();
		
		System.out.println(a);
		
		int b= input.nextInt();
		System.out.println (b);
		
		int result1 = a + b;
		System.out.println("a + b = " + result1);
		
		int result2 = a - b;
		System.out.println("a - b = " + result2);
		
		int result3 = a * b;
		System.out.println("a * b = " + result3);
		
		double result4 = (double) (a + b) / 2;
		System.out.println("a와 b의 평균은 " + result4);
		
		int max = (a > b) ? a:b;
		System.out.println("최대값은 " + max);
		
		int min = (a < b) ? a:b;
		System.out.println("최소값은 " + min);
		
	}

}
