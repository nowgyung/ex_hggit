package study_220709;

public class BreakPoint {
	public static void main(String[] args) {
		outer:for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if ((i * j) == 72) {
					System.out.println(i + "*" + j + "=" + i * j);
					break outer ;
//					바깥  for문까지 탈출하기위해 위치 명시
				}
			}
		}
	}

}
