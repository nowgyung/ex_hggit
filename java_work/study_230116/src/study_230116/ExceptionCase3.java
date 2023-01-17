package study_230116;

import java.util.Scanner;

public class ExceptionCase3 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("a/b...a? "); 
		int n1 = kb.nextInt(); // 입력오류 발생
		System.out.println("a/b... b? ");
		int n2 = kb.nextInt(); // n1에서의 오류가 발생, n2의 입력 의미없다, 하나의 작업
		
		System.out.printf("%d / %d = %d \n", n1, n2, n1/ n2);
		System.out.println("Good Bye~~");
	}
}
