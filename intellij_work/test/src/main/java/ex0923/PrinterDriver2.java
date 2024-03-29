package ex0923;

interface Printable{ //MS 사가 제공한 인터페이스
    void print(String doc); // 흑백 출력을 위한 추상 메소드
}
class Prn204Drv implements Printable { // S사의 흑백 프린터 드라이버
    @Override
    public void print(String doc){
        System.out.println("From MD-204 printer");
        System.out.println(doc);
    }
}
class Prn731Drv implements Printable { // L사의 흑백 프린터 드라이버
    @Override
    public void print(String doc){
        System.out.println("From MD-731 printer");
        System.out.println(doc);
    }
}
public class PrinterDriver2 {
    public static void main(String[] args) {
        String myDoc = "This is a report about...";

        Printable prn = new Prn204Drv();
        prn.print(myDoc);
        System.out.println();

        prn = new Prn731Drv();
        prn.print(myDoc);
    }

}
