package p02.switch_basic;

// Switch문은 if~else문으로 바꿀 수 있음
// - 가능하면 switch문을 많이 사용하는 것을 추천
// - 유용한 적용사례 : 주사위, 달력, 회사직급 처럼 등급이 정해져 있는 경우
public class SwitchBasic {

	public static void main(String[] args) {
		// diceNumber : 1, 2, 3, 4, 5, 6 중에 1개
		int diceNumber = (int) (Math.random()*6) + 1;
		
		System.out.println("diceNumber = " + diceNumber);
		
		switch (diceNumber) {
		case 1: // if (diveNumber == 1)
			System.out.println("주사위 1이 나왔습니다.");
			break;
		case 2: // else if (diceNumber == 2)
			System.out.println("주사위 2이 나왔습니다.");
			break;
		case 3: // else if (diceNumber == 3)
			System.out.println("주사위 3이 나왔습니다.");
			break;	
		case 4: // else if (diceNumber == 4)
			System.out.println("주사위 4이 나왔습니다.");
			break;
		case 5: // else if (diceNumber == 5)
			System.out.println("주사위 5이 나왔습니다.");
			break;
//		case 6: // else if (diceNumber == 6)
		default : // else
			System.out.println("주사위 6이 나왔습니다.");
			break;
		}

	}

}
