package p01.basic;

// +, -, *, /, % : 산술연산자 (arithmetic operator)
public class ArithmeticOperatorEx {

	public static void main(String[] args) {
		int a1 = 10;
		int a2 = 3;
		int result;
		double dresult;
		
		result = a1 + a2;
		System.out.println("result = " + result);
		
		result = a1 - a2;
		System.out.println("result = " + result);
		
		result = a1 * a2;
		System.out.println("result = " + result);
		
		result = a1 / a2; // / : 몫을 가져옴
		System.out.println("result = " + result);
		
		result = a1 % a2; // % : 나머지를 가져옴
		System.out.println("result = " + result);
		
		// a2를 double로 자동 형변환 시킴
//		dresult = a1 / (double)a2;
		dresult = (double)a1 / a2;
		System.out.println("dresult = " + dresult);
	}

}
