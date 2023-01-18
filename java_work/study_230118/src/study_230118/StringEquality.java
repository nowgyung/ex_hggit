package study_230118;

public class StringEquality {
	public static void main(String[] args) {
		String str1 = new String("So Simple");
		String str2 = new String("So Simple");
		
		if(str1 == str2)
			System.out.println("str1, str2 참조대상 동일");
		else
			System.out.println("str1, str2 참조대상 다름");
		// 두 인스턴스의 참조대상을 비교할때는 == 연산
		
		if(str1.equals(str2))
			System.out.println("str1, str2 내용 동일");
		else
			System.out.println("str1, str2 내용 다름");
		//두 인스턴스의 내용비교는 equals 메소드를 오버라이딩, 결정사항에 대한 조건은 오버라이딩을 통한 반영
	}

}
