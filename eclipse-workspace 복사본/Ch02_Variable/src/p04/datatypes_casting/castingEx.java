package p04.datatypes_casting;

public class castingEx {

	public static void main(String[] args) {
		char ch = 'A';
		int number = 88;
		double d = 100.04;
		long l = (long) d;	//double에서 long등 int type으로 강제형변환(casting)하면 소숫점이하 숫자를 삭
		int i = (int) l;
		
		
		
		System.out.println("ch = " + ch);
		
		ch = (char) number; //int type만 number를 char type으로 강제 형변환 (casting)
		System.out.println("ch + " + ch);
		
		System.out.println("l = " + l);
		System.out.println("i = " + i);

	}

}
