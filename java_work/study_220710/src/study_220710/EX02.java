package study_220710;
/*
 * 142p
 * 문제6-1_2
 */
public class EX02 {
	public static void main(String[] args) {
		abs(3,7);
	}
	public static void abs(int n1, int n2) {
		if( n1 > n2)
			System.out.println("절대값은 : "+ (n1-n2));
		else
			System.out.println("절대값은 : "+ (n2-n1));

	}
}
