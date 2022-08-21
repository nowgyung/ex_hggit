package study_220815;

class Cake1{
	
}
class CheeseCake1 extends Cake1{
	
}
class StrawberryCheeseCake1 extends CheeseCake1{
	
}

public class YummyCakeOf {
	public static void main(String[] args) {
		Cake1 cake = new StrawberryCheeseCake1();
		
		if(cake instanceof Cake1) {
			System.out.println("케익 인스턴스 or");
			System.out.println("케익 상속하는 인스턴스 \n");
		}
		if (cake instanceof CheeseCake1) {
			System.out.println("치즈케익 인스턴스 or");
			System.out.println("체즈케익 상속하는 인스턴스 \n");
		}
		if(cake instanceof StrawberryCheeseCake1) {
			System.out.println("딸기치즈케익 인스턴스 or");
			System.out.println("딸기치즈케익 상속하는 인스턴스");
		}
	}

}
