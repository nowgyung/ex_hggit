package study_230117;

import java.util.Scanner;

class ReadAgeException extends Exception{
	public ReadAgeException() {
		super("유효하지 않은 나이가 입력되었습니다.");
	}
}

public class MyExceptionClass {
	public static void main(String[] args) {
		System.out.println("나이 입력: "); //입력안내
		
		try {
			int age = readAge();
			System.out.printf("입력된 나이: %d \n", age); // 구간
		}
		catch(ReadAgeException e){
			System.out.println(e.getMessage()); // 어떻게 처리
		}
	}
	
	public static int readAge() throws ReadAgeException {
		Scanner kb = new Scanner(System.in);
		int age = kb.nextInt(); //입력받는곳
		
		if(age < 0)
			throw new ReadAgeException(); //예외발생, ReadAgeException()로 처리할것
		
		return age;
	}

}
