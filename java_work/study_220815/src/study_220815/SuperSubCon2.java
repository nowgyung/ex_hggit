package study_220815;

class SuperCLS{
	public SuperCLS() {
		System.out.println("con: SuperCLS()");
	}
	public SuperCLS(int i) {
		System.out.println("con: SuperCLS(int i)");
	} 
	public SuperCLS(int i , int j) {
		System.out.println("con: SupuerCLS(int i , int j)");
	}
}

class SubCLS extends SuperCLS{
	public SubCLS() {
		System.out.println("con: SubCLS()");
	}
	public SubCLS(int i) {
		super(i); // super는 상위 클래스의 생성자 호출을 의미
		System.out.println("con: SubCLS(int i)");
	}
	public SubCLS(int i, int j) {
		super(i,j);
		System.out.println("con: SubCLS(int i, int j)");
	}
	
}


public class SuperSubCon2 {
	public static void main(String[] args) {
		System.out.println("1. ");
		new SubCLS();
		System.out.println();
		
		System.out.println("2. ");
		new SubCLS(1);
		System.out.println();
		
		System.out.println("3. ");
		new SubCLS(1, 2);
		System.out.println();
		
	}
	

}
