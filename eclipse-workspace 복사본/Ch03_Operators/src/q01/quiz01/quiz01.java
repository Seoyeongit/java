package q01.quiz01;

import java.util.Scanner;

public class quiz01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
	
		System.out.println("0과 1000사이의 3자리 정수를 입력하세요.");
		int number = input.nextInt();
		
		int A = number % 10;
		int B = number / 10 % 10;
		int C = number / 10 / 10;
		System.out.println(A + B + C);			
	}

}
