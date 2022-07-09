package study_220709;
//129p
//문제2번
public class EX01 {
	public static void main(String[] args) {
		int n = 1;
		int sum = 0;
		
		while(true) {
			sum += n;
			n += 2;  
			// sum과 n의 위치에 따라 결과가 달라진다  n+=2를 먼저 작성하면 먼저 2를  sum에 넣고 시작하게 됨
			System.out.println("n = "+n + " sum = "+sum);
			if(sum>1000)
				break;
			
			
		}
		System.out.println("n = "+n + "sum = "+sum);
	}

}
