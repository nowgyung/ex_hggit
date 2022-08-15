package study_220815;

class MobilePhone1 {
	protected String number;

	public MobilePhone1(String num) {
		number = num;
	}

	public void answer() {
		System.out.println("Hi~ from " + number);
	}
}

class SmartPhone1 extends MobilePhone1 {
	private String androidVer;

	public SmartPhone1(String num, String ver) {
		super(num);
		androidVer = ver;
	}

	public void playApp() {
		System.out.println("App is running in " + androidVer);
	}
}

public class MobileSmartPhoneRef {
	public static void main(String[] args) {

		SmartPhone1 ph1 = new SmartPhone1("010-555-777", "Nougat");
		MobilePhone1 ph2 = new SmartPhone1("010-999-333", "Nougat");

		ph1.answer();
		ph1.playApp();
		System.out.println();
		ph2.answer();
//		ph2.playApp();
	}
}
