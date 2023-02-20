package thisEx;

class Person{
	String name;
	int age;
	
	public Person() {

		this("이름없음",1);
		
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person returnSelf() {
		return this;
	}// this가 자기자신의 주소를 출력하는 방법, 현재 인스턴스의 주소값 반환
	
}

public class CallAnotherConst {

	public static void main(String[] args) {

		Person p1 = new Person();
		System.out.println(p1.name);
		System.out.println(p1.returnSelf());
		
	}

}
