package study_220716;

public class InfRecul {
	public static void main(String[] args) {
		showHi(3);
	}
	public static void showHi(int cnt) {
		System.out.println("Hi~ ");
		if (cnt == 1)
			return;
		showHi(--cnt);
//		--연산자가 cnt의 오른쪽에 붙으면 재귀호출이 이뤄지는 동안 줄지않고 유지하게 된다.  
//		cnt값이 전달되기 전 값이 감소 되거나 (--cnt) cnt -1로 수정
		
	}

}
