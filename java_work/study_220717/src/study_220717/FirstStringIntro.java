package study_220717;

public class FirstStringIntro {
	public static void main(String[] args) {
		String str1 = "Happy";
		String str2 = "Birthday";
//		문자열 선언과 동시에 참조변수로 참조
		System.out.println(str1 + " " + str2);
		
		printString(str1);
		printString(" ");
		printString(str2);
		printString("\n");
		printString("End of program! \n");
	}
	public static void printString(String str) {
		System.out.println(str);
//		String 참조변수를 매개변수로 선언하여 문자열을 전달 받을 수 있다.
	}

}
