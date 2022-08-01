package p02.switch_basic;

// 	break : 해당 case만 실행하고 switch문을 빠져나오게 하는 효과 제공
public class SwitchBasic2 {

	public static void main(String[] args) {
		// diceNumber : 1, 2, 3, 4, 5, 6 중에 1개
		int diceNumber = (int) (Math.random()*6) + 1;
		
		System.out.println("diceNumber = " + diceNumber);
		
		switch (diceNumber) {
		case 1: // if (diveNumber == 1)
			System.out.println("주사위 1이 나왔습니다.");
		case 2: // else if (diceNumber == 2)
			System.out.println("주사위 2이 나왔습니다.");
		case 3: // else if (diceNumber == 3)
			System.out.println("주사위 3이 나왔습니다.");			
			break;
		case 4: // else if (diceNumber == 4)
			System.out.println("주사위 4이 나왔습니다.");
		case 5: // else if (diceNumber == 5)
			System.out.println("주사위 5이 나왔습니다.");
		default : // else
			System.out.println("주사위 6이 나왔습니다.");
		break;
		}

	}

}
