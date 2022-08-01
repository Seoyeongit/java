package p03.while_basic;

// 1. while, do~while, for : 특정 명령어 집합을 반복적으로 수행하고자 할 때 사용하는 command
// 	ex) 수능 50만명 성적처리
// 2. while (boolean) { A } ==> boolean이 true인 동안에 A 명령어를 반복 수행
//		-초기값과 while 조건식을 꼼꼼히 살펴볼 필요 있
public class WhileBasic {

	public static void main(String[] args) {
		
//		System.out.println("Java씨, 존경합니다.");
//		System.out.println("Java씨, 존경합니다.");
//		System.out.println("Java씨, 존경합니다.");
//		System.out.println("Java씨, 존경합니다.");
//		System.out.println("Java씨, 존경합니다.");
//		System.out.println("Java씨, 존경합니다.");
		
		//반복문 초기화
		int count = 0;
		// 조건식 : count < 10
		while(count < 10) {
			System.out.println("Java씨, 존경합니다.");
			count++;	// while문의 조건식 결과를 false로 만들어 줄 수 있음, 조건 증감 명령
		}
		
		System.out.println();
		
		count = 10;
		while (count >= 1) {
			System.out.println("Java씨, 존경합니다.");
			count++;
		}
		
		System.out.println();
		
		count = 1;
		while (count <=10) {
			System.out.println("Java씨, 존경합니다.");
			count++;
		}
		System.out.println();
		
		count = 1;
		int endValue = 10;
		while (count <= endValue) {
			System.out.println("Java씨, 존경합니다.");
			count++;
			
		}
	}

}