package study_220703;

public class ex05 {

	public static void main(String[] args) {
		
		int n1 = ((25+5)+(36/4)-72)*5;
		int n2 = ((25*5)+(36-4)+71)/5;
		int n3 = (128/4)*2;
		boolean result;

		result = n1>n2 && n2>n3;
		System.out.println("n1>n2>n3 이다: "+ result);
		
		
	}
}
