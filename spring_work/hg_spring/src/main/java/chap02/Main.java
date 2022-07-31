package chap02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//자바 설정에서 빈 객체를 생성하고 관리하는 객체 통

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
//		AppContext 클래스를 생성자 파라미터로 전달, 그 클래스에서 정의한 Bean 정보를 읽어와 Greeter객체를 생성하고 초기화 한다.
		
		Greeter g = ctx.getBean("greeter",Greeter.class);
		String msg = g.greet("스프링");
		System.out.println(msg);
		ctx.close();
	}

}
