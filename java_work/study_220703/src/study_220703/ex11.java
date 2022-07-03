package study_220703;

public class ex11 {

	public static void main(String[] args) {
		int n = 1;
		int sum = 0;
		
		while(n <=1000) {
			if((n%2)==0 && (n%7)==0)
				System.out.println(n);
				sum += n;
			n++;
		}
		System.out.println("sum: "+sum);
	}
}
