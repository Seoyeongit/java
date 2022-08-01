package p05.for_basic;

// 3개의 중첩 for문
// 	- 전체 실행 횟수 : 3개 이상의 중첩 for문을 사용하려면 프로그램 실행 속도를 크게 저하시킬 수 있어 가급적 사용하지 말 것
// 	- 예 : 10*10*10 => 1000번
//	- 예 : 10000*10000*10000 => 1,000,000,000,000
//	- 어쩔 수 없이 사용해야만 한다면 반드시 전체 반복 횟수를 확인하고 사용할 것
public class ForBasic3 {

	public static void main(String[] args) {
		
		for (int i=1; i<=10; i++) {
			for (int j=1; j<=10; j++) {
				for (int k=1; k<=10; k++) {
					System.out.println("3개 숫자의 곱 = " + (i*j*k));
				}
			}
		}

	}

}
