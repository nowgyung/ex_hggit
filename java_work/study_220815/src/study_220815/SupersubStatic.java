package study_220815;

class SuperCLS1{
	protected static int count = 0;
	
	public SuperCLS1() {
		count++;
	}
}

class SubCLS1 extends SuperCLS1{
	public void showCount() {
		System.out.println(count);
	}
}

public class SupersubStatic {
	public static void main(String[] args) {
		SuperCLS1 obj1 = new SuperCLS1();
		SuperCLS1 obj2 = new SuperCLS1();
		
		SubCLS1 obj3 = new SubCLS1();
		obj3.showCount();
	}

}
