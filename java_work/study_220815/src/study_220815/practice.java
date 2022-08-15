package study_220815;

class Me{
	String name;

	public Me(String name) {
		this.name = name;
	}
	public void tellYourName() {
		System.out.println("my name is "+name);
	}
}
class IntroduceLike extends Me{
	String color;
	String season;
	public IntroduceLike(String name, String color, String season) {
		super(name);
		this.color = color;
		this.season = season;
	}
	public void tellYourInfo() {
		tellYourName();
		System.out.println("My favorite color is "+ color);
		System.out.println("My favorite season is "+ season);
		
	}
}


public class practice {
	public static void main(String[] args) {
		IntroduceLike me = new IntroduceLike("Kim", "green", "winter");
		me.tellYourInfo();
	}

}
