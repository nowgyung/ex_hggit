package chap02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//�ڹ� �������� �� ��ü�� �����ϰ� �����ϴ� ��ü ��

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
//		AppContext Ŭ������ ������ �Ķ���ͷ� ����, �� Ŭ�������� ������ Bean ������ �о�� Greeter��ü�� �����ϰ� �ʱ�ȭ �Ѵ�.
		
		Greeter g = ctx.getBean("greeter",Greeter.class);
		String msg = g.greet("������");
		System.out.println(msg);
		ctx.close();
	}

}
