package p06.hybrid_repeat;

// do~while 문 안에 for 문 사용
public class HybridRepeatEx4 {

	public static void main(String[] args) {
		int i = 1;
		
		do {
			int num = 1;
			for (int j=1; j<=i; j++) {
				System.out.print(num + "G");
				num += 2; // num = num + 2;
			}
			System.out.println();
			i++;
		} while (i<=5);
	}

}
