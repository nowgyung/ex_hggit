package study_220815;

class Man{
	String name;

	public Man(String name) { 
		this.name = name;
	}
	public void tellYourName() {
		System.out.println("My name is "+ name);
	}
}

class BusinessMan extends Man{
	String company;
	String position;
	
	public BusinessMan(String name, String company, String position) {
		super(name); // 상위 클래스의 name을 호출
		this.company = company;
		this.position = position;
	}
	public void tellYourInfo() {
		System.out.println("My company is "+ company);
		System.out.println("My position is "+ position);
		tellYourName();
	}
}

public class MyBusinessMan2 {
	public static void main(String[] args) {
		BusinessMan man =  new BusinessMan("YOON", "Hybrid ELD", "Staff Eng.");
		man.tellYourInfo();
	}

}
