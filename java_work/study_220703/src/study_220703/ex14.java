package study_220703;

public class ex14 {

	public static void main(String[] args) {
		int count = 0;
		for(int num=1;num<=100;num++) {
			if((num%5) != 0 || ((num%7) !=0))
				continue;
			count++;
			System.out.println(num);
		}
		System.out.println("count: "+count);
	}
}
