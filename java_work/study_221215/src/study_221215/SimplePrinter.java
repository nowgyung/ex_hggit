package study_221215;

interface Printerable2{
	static void printLine(String str) {
		System.out.println(str);
	}
	default void print(String doc) {
		printLine(doc);
	}
}
//인터페이스 Printerable2에는 구현해야 할 메소드가 존재하지 않는다.
class Printer2 implements Printerable2{}

public class SimplePrinter {
	public static void main(String[] args) {
		String myDoc = "This is a report about...";
		Printerable2 prn = new Printer2();
		prn.print(myDoc);
		
		//인터페이스의 static 메소드 직접 호출
		Printerable2.printLine("end of line");
	}

}
