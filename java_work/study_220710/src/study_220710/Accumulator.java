package study_220710;

public class Accumulator {
	
	static int sum = 0;
	static void add(int n) {
		sum += n;
	}
	static void showResult() {
		System.out.println("sum: "+sum);
	}
	
	public static void main(String[] args) {
		for(int i=0; i <10; i++)
			Accumulator.add(i);
		Accumulator.showResult();
		
//		시작되는 main이 어디에 있는지, main에서 필요로 하는 메소드는 어떤것이 있는지, 메소드는 어디에 위치해야 하는지
//		그 메소드가 해야 할 일은 무엇인지
		
	}

}
