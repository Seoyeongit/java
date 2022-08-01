package P01.escape_sequence;

// escape sequence : \n(enter key 역할), \t(tap key), \\, \", \'
//  => 특수 문자(special character)로 문자열 안에서 사용됨

// 키보드에서 enter key를 누르면 2개의 escape sequence 문자가 발생 (\n\r)
// - \n : new line
// - \r : carrage return
// 문자열(string) : "n줄 바n연습"
// 문자 (character) : 'n', '한', '글', 'x'
public class EscapeSequenceEx {

	public static void main(String[] args) {
		
		System.out.println("n줄 바꿈n연습");
		System.out.println("\n줄 바꿈\n연");
		System.out.println("t탭키t연습");
		System.out.println("\t탭키\t연습");
		System.out.println("\\ backslash 1개 출력");
		System.out.println("\\\\\\ backslash 3개 출력");
		System.out.println("큰 따옴표 \" 출력");
		System.out.println("작은 따옴표 \' 출력");
	}

}
