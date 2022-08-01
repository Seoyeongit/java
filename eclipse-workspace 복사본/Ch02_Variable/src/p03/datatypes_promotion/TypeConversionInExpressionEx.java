package p03.datatypes_promotion;

// 1. 정수형 산술연산(+, -, *, / 등)에서의 데이터 타입 자동컨버젼 (promotion)
// 	- int보다 작은 byte, char, short를 사용하여 산술연산을 수행하면 무조건 int 타입으로 자동형변환 시킴
// 2. long type이나 ,float, double 등의 타입과 다른 타입이 산술 연산을 수행하면 큰 데이터 타입으 자동형변화 시킴

public class TypeConversionInExpressionEx {

	public static void main(String[] args) {
		byte b1 = 42;
		byte b2 = 10;
		byte sum;
		char c1 = 20;
		char c2 = 30;
		char csum;
		int isum1;
		long l1 = 15;
		long result;
		double dresult;
		
		
		// b1 + b2를 수행할  기계어로 표현
		// 1. byte type인 b1을 int type으로 promotion 시킴 (즉, 1byte => 4byte 크기로 확장)
		// 2. byte type인 b2를 int type으로 promotion 시킴
		// 3. b1 + b2를 수행
		// 4. int type인 결과값을 byte type인 sum에 넣으려고 한기 에러가 발생함
		sum = (byte)(b1 + b2); // (byte) : casting (강제형변환)
		//csum = c1 + c2;
		// isum = b1 + b2;
//		ssum1= (b1 + b2)
		
		//기계어로 변환
		// 1. b1 + c1 연산하여 int type으로 변환하여 메모리에 4byte로 저장
		// 2. b1 + c1의 결과값과 11을 덧셈 연산하기 위해서는
		// 		2-1 . b1+c1의 결과값을 8byte인 long type으로변환 (promotion 발생)
		//		2-2  l1과 덧셈 연산수행
		// 3. 최종값을 long type인 result에 넣음 
		result = b1 + c1 + l1; 
		
		// long type인 11과 double type인 0.5를 더할 경우 기계어로는
		// 1. l1을 double type으로 변환
		// 2.0.5를 더하여 연산결과가 double type으로 만듦
		//result = l1 + 0.5;
		
		dresult = l1 + 0.5;
	}
}
