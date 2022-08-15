package study_220815;

class Cake1{
	public void yummy() {
		System.out.println("Yummy Cake");
	}
}

class CheeseCake1 extends  Cake1{
	public void yummy() { //오버라이딩
	super.yummy(); // 상위클래스에 정의 된, 오버라이딩 된 메소드의 호출을 목적으로도 사용
	System.out.println("Yummy Cheese Cake");
}
	public void tasty() {
		super.yummy();
		System.out.println("Yummy Tasty Cake");
	}
}
public class YummyCakeSuper {
	public static void main(String[] args) {
		CheeseCake1 cake = new CheeseCake1();
		cake.yummy();
		cake.tasty();
	}
}
