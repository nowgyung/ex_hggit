package study_220716;
/*
 * 154p
 * 6-3_1
 */
public class Ex01 {
	public static void main(String[] args) {
		System.out.println("2의 3승: "+ num(3));
		System.out.println("2의 5승: "+ num(5));
	}
	public static int num(int n) {
		if(n==0)
			return 1;
		else
			return 2* num(n-1);
	}

}
