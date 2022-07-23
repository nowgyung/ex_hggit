package study_220723;

public class Ex02 {
	public static void main(String[] args) {
		StringBuilder st1 = new StringBuilder("990925-1012999");
		
		System.out.println(st1.toString());
		
		st1.replace(6, 7, " ");
		System.out.println(st1.toString());
	}

}
