package q01.quiz02;

import java.util.Scanner;

public class quiz05 {

	public static void main(String[] args) {
		System.out.println("0~100까지 숫자를 추측해 보세요?");
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
	
		int number = (int)(Math.random()*100);
	
		
		do {
			System.out.println("숫자가 " + number + "정확히 맞추었습니다.");
		} while (answer != number);
		

	}

}
