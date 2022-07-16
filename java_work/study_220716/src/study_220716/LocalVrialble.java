package study_220716;

public class LocalVrialble {
	public static void main(String[] args) {
		boolean ste = true;
		int num1 = 11;
		
		if(ste) {
//			int num1 = 22; 앞에서 선언한 num1 선언불가
			num1++;
			System.out.println(num1);
		}
		{
			int num2 = 33;
			num2++;
			System.out.println(num2);
		}
//		System.out.println(num2); num2는 위 {}내에서만 접근 가능, 지역변수는 선언된 지역을 벗어나면 메모리공간에서 소멸된다.
	}
}
