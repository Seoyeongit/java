package q01.quiz02;

import java.util.Scanner;

public class quiz04 {

	public static void main(String[] args) {
		
		System.out.println("가위(0), 바위(1), 보(2) 중 숫자 0, 1, 2 중 하나의 숫자를 입력하세요.");
		Scanner input = new Scanner(System.in);
		int i = (int)(Math.random()*3);
		int a = input.nextInt();
		
		if (a > i) {
			System.out.println("당신이 이겼습니다.");
		}
		
		
		
		
	}

}