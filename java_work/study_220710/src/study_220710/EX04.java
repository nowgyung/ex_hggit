package study_220710;
/*
 * 146p
 * 문제6-2_2
 */
public class EX04 {
	public static void main(String[] args) {
		Prime(3);
		
	}
	public static void Prime(int n) {
		if (n%1==0 && n%n==0) {
			System.out.println("n은 소수: "+ true);
			if (true) {
				System.out.println();
			}
		}
		else
			System.out.println("n은 소수:  "+ false);
		
	}
}
