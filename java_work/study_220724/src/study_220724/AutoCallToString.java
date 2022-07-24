package study_220724;


class Box{
	String cha;

	public Box(String cha) {
		super();
		this.cha = cha;
	}

	@Override
	public String toString() {
		return cha;
	}
	
	
}

public class AutoCallToString {
	public static void main(String[] args) {
		StringBuilder stb = new StringBuilder("12");
		stb.append(34);
		System.out.println(stb.toString()); // toString()은 생략 가능
		System.out.println(stb);
		
		Box box = new Box("Camera");
		System.out.println(box.toString());
		System.out.println(box );
	}

}
