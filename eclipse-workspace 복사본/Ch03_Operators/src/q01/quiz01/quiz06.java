package q01.quiz01;

import java.util.Scanner;

public class quiz06 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
			
		System.out.println("2개의 실수를 입력하세요.");
		double a = input.nextDouble();
		double b = input.nextDouble();
		
		
		if ((a > 0 && a < 1) && ( b > 0 && b < 1)) {
			System.out.println("두 수 모두 0과 1 사이에 있습니다.");
		} else System.out.println("두 수 모두 0과 1사이에 있지 않습니다.");
				
	}

}
