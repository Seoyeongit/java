package P01.basic2;

//변수 이름, class 이름 작명(naming) 규칙(rule)
//1. 변수이름 (variable naming)
//- 영문, _, $ 가 포함된 것은 가능
//==> $, _로 변수 이름을 짓는 경우는 주로 software 제품 안의 프로그램에서 사용
//- 변수이름 처음에 숫자가 나오면 에러 but 변수 이름 중간이나 마지막에 넣는 것은 가능
//- 변수 이름은 소문자로 시작하는 것이 관행
//- 변수 이름은 여러개의 단어로 구성 가능한데 두번 쨰 단어부터는 단어의 첫을 자는 대문자로 표현하는 것이 관행
//	ex) interestRate : 이자율 => camel notation(낙타 표기법)
//결론 : 변수이름 지을 때 영어로만 작명하고 여러개의 단어를 camel notation 사용할 것

//2. class 이름
//- 변수 이름과 동일한데, 한 가지 차이점은 첫글자가 대문자로 시작함

//3. 변수 사용 방법
//	- 변수 선언 ==> 변수 타입(메모리 방크기, 데이터 성격) + 변수이름 (변수 선언할 떄 초기값을 줄 수도 있음)
//		-> 실제 회사에서 업무를 수행할 떄 가급적 변수 선언하면서 초기값을 주는 것이 가능하면 초기값을 주는 것을 추천
//- 변수 사용 ==> 선언 변수에 할당된 메모리에 새로운 값으로 변경하거나 읽어 오는 경우

public class VariableEx2 {

	public static void main(String[] args) {
		//변수 선언
		int count;
//		double interestRate;
//		double $radius;
//		double _radius;
//		double 1radius;
		int junior = 15;
		// 기계어 명령어로는 
		// 1. junior 변수의 메모리에 있는 값 1를 읽어오라
		// 2. 15 + 5 덧셈 연산 수행하라
		// 3. 덧셈 연산 결과를 adult변수의 메모리 방에 넣어라
		int adult = junior + 5;
		
		System.out.println("junior : " + junior );
		System.out.println("adult : " + adult);
		
		// 변수 사용
		count = 10;
		System.out.println("count : " + count);
	}

}