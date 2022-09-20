package ex0920;

import javax.swing.text.StyleContext;

class Friend{
    protected String name;
    protected String phone;

    public Friend(String na, String ph){
        name = na;
        phone = ph;
    }
    public void showInfo(){
        System.out.println("이름: "+name);
        System.out.println("전화: "+phone);
    }
}
class UnivFriend2 extends Friend{
    private String major;

    public UnivFriend2(String na, String ma, String ph){
        super(na, ph);
        major = ma;
    }
    public void showInfo(){
        super.showInfo();
        System.out.println("전공: "+ major);
    }
}
class CompFriend2 extends Friend{
    private String depardment;

    public CompFriend2(String na, String de, String ph){
        super(na, ph);
        depardment = de;
    }
    public void showInfo(){
        super.showInfo();
        System.out.println("부서: "+ depardment);
    }
}
public class MyFriends2 {
    public static void main(String[] args) {
        Friend[] frns = new Friend[10];
        int cnt = 0;

        frns[cnt++] = new UnivFriend2("LEE", "Computer", "010-333-555");
        frns[cnt++] = new UnivFriend2("SEO", "Electronics", "010-222-444");
        frns[cnt++] = new UnivFriend2("YOON", "R&D 1", "02-123-999");
        frns[cnt++] = new UnivFriend2("PARK", "R&D 2", "02-321-777");

        //모든 동창 및 동료의 정보 전체 출력
        for(int i=0; i < cnt; i++){
            frns[i].showInfo(); // 오버라이딩 한 메소드가 호출된다.
            System.out.println();
        }
    }

}
