package ex0920;

class Cake0{
    // Object 클래스의 toString 메소드를 오버라이딩
    public String toString(){
        // Object 클래스의 toString 메소드 호출하여 변환 결과 출력
        System.out.println(super.toString());
        return "My birthday cake";
    }
}
class CheeseCake0 extends Cake0{
    //Cake 클래스의  toString 메소드를 오버라이딩
    public String toString(){
        return "My birthday cheese cake";
    }
}
public class OverridingToString {
    public static void main(String[] args) {
        Cake0 c1 = new Cake0();
        Cake0 c2 = new CheeseCake0();

        // c1이 참조하는 인스턴스의 toString 메소드 호출로 이어짐
        System.out.println(c1);
        System.out.println();

        // c2이 참조하는 인스턴스의 toString 메소드 호출로 이어짐
        System.out.println(c2);
    }
}
