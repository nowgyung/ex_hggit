package study_220716;
/*
 * 154p
 * 6-3_2
 */
public class Ex02 {
	public static void main(String[] args) {
		toBinary(10);
	}
	public static int toBinary(int decimal) {
		if(decimal > 0) {
			int bin = decimal %2;
			decimal /= 2;
			
			toBinary(decimal);
			System.out.println(bin);
		}
		return 0;
	}

}
