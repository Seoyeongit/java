package p02.datatypes_basic;

// boolean type :
//	1. literal 값이 true, false만 사용가능
//	2. 제어문 또는 반복문(while, for	등)에서 사용
//	3. 현실세계에서는 필요없는 데이터 type이지만, 프로그래밍 때는 핵심 타입


public class BooleanEx {

	public static void main(String[] args) {
		boolean stop = true;
		boolean start = false;
		
		System.out.println("stop = " + stop);
		System.out.println("start = " + start);
		
		if (stop) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}
	}

}
