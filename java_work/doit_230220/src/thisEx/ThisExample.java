package thisEx;

class Birthday{
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year;
	}
	public void printThis() {
		System.out.println(this);
	}
	
}

public class ThisExample {

	public static void main(String[] args) {

		Birthday b1 = new Birthday();
		Birthday b2 = new Birthday();
		
		System.out.println(b1);
		b1.printThis();
		
		System.out.println(b2);
		b2.printThis();
		// this, 같은 코드지만 매번 가리키는것은 그때의 인스턴스마다 다른 주소값을 말한다.
		
		
	}

}
