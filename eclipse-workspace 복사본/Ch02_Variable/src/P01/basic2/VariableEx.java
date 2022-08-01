package P01.basic2;

//identifier, variable 용어에 대한 실습
//1. identifier(식별자) : program cod 안에서 미리 정의된 element(원소)들을 구분하기 위한 이름(name)
//		- program code가 실행되어 메모리에 올라갈 때 element 이름들을 별도 테이블에 관리
//		- 예) VariableEx(class name), main(method name), age(variable name), radius(variable name)
//2. variable : age, radius
//3. keyword(reserved words:예약어) : public, class, static, void, int, double

public class VariableEx {

	public static void main(String[] args) {
		int age;
		double radius;
		
		age = 20;
		System.out.println("나이는 " + age + "입니다. ");
		
		radius = 5.0;
		System.out.println("원의 반지름은 " + radius + "입니다. ");
		
		age = 30;
		System.out.println("나이는 " + age + "입니다. ");
		
		radius = 10.0;
		System.out.println("원의 반지름은 " + radius + "입니다. ");
	}

}