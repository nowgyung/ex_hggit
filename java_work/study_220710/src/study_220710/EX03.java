package study_220710;
/*
 * 145p
 * 문제6-2_1
 */
public class EX03 {
	public static void main(String[] args) {
		Circle(2);
		System.out.println("Circle2(5): "+Circle2(5));;
		
	}
	public static void Circle(int n) {
		System.out.println("원의 넓이: "+ (n*n*3.14));
		return;
	}
	public static double Circle2(int n) {
		
		return 2*3.14*n;
//		작성한 메소드에서 출력을 작성해도되지만 반환값을 설정해서 main에서 출력하게 하는 방법도 있다
//		반환값 -> 입력되는 값의 설정과 출력되는 값의 종류 설정
	}

}
