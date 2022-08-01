package p01.if_basic;

public class IfBasic2 {

	public static void main(String[] args) {
		int i = 10;
		
		if (i>0) { //추천
			System.out.println("i는 양수입니다.");
		}
		// if문 다음에 오는 명령어가 1개만 있으면 { }를 사용 안해도 됨 ==> 비추천
		if (i>0)
			System.out.println("i가 역시 양수입니다.");
		
		if (i % 2 == 0) {
			System.out.println("i는 2의 배수 (짝수)입니다.");
		} 
		if (i % 2 == 1) {
			System.out.println("i는 홀수 입니다.");
		}
		if (i % 5 == 0) {
			System.out.println("i는 5의 배수입니다.");
		}
		if ( (i%2) == 0 || (i%5 == 0) ) {
			System.out.println("i는 2의 배수이거나 5의 배수입니다.");
		}
		if ( (i%2 == 0) && (i%5 == 0) ) {
			System.out.println("i는 2의 배수이고 5의 배수입니다.");
		}

	}

}
