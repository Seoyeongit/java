package q01.quiz01;

import java.util.Scanner;

public class quiz04 {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("4자리의 정수를 입력하세요.");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		System.out.println("" + a + b + c + d);
		
		
		if (a == b && b==c && c == d ) {
			System.out.println("4개 정수값이 동일합니다.");
		} else System.out.println("4개 정수값이 동일하지 않습니다.");

	}
	
}