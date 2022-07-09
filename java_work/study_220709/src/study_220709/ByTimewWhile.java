package study_220709;

public class ByTimewWhile {
	public static void main(String[] args) {
		int i = 2;
		int j;
		
		while(i <10) {
			j = 1;
			while(j<10) {
				System.out.println(i + "*" + j + "="+ (i*j));
				j++;
			}
			i++;
//			for와 while 반복문 구현시  for문은 간단하다 우선으로 고려하는것이 좋다.
		}
	}

}
