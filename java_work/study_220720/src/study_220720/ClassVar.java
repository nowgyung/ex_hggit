package study_220720;

class InstCnt{
	static int instNum = 0;
	
	InstCnt(){
		instNum++;
		System.out.println("인스턴트 생성: "+ instNum);
	}
}

public class ClassVar {
	public static void main(String[] args) {
		InstCnt cnt1 = new InstCnt();
		InstCnt cnt2 = new InstCnt();
		InstCnt cnt3 = new InstCnt();
	}

}
