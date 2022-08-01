package q01.quiz01;

import java.util.Scanner;

public class quiz02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("분 단위 숫자를 입력하세요. ");
		int minutes = input.nextInt();
		
		int day = minutes / (24 * 60);
		int year = minutes / (24 * 60 * 365);
		
		System.out.println(day + "일");
		System.out.println(year + "년");
	}

}
