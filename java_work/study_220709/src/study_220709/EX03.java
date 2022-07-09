package study_220709;
//135p
//문제5-7_2
public class EX03 {
	public static void main(String[] args) {
		for(int a=0; a<10; a++) {
			for(int b =0; b<10; b++) {
				if((a*10+b) + (b*10+a)==99 ) {
					System.out.println(a+","+ b);
				}
				
			}
			
		}
	}

}
