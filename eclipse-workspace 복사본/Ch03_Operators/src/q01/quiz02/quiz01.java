package q01.quiz02;

public class quiz01 {

	public static void main(String[] args) {
		int month = (int)(Math.random() * 12)+1;
		
		System.out.println("month = " + month);
		
		while ( month <= 12) {
			System.out.println(month + "월 입니다.");
			month++;
				break;
		}
		
	}

}
