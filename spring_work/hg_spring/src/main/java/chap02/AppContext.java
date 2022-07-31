package chap02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // �ش� Ŭ������ ���� Ŭ������ �����Ѵٴ� �ǹ̸� ����
public class AppContext {
	
	@Bean // �� ��ü�� ������ �� ���, �ش� �ż��尡 ������ ��ü�� �������� �����ϴ� �� ��ü�� ��� / ��ü�� �����ϰ� �˸°� �ʱ�ȭ �ؾ�/ 12�࿡�� Greeter ��ü�� �ʱ�ȭ �Ѵ�
	public Greeter greeter() { // ��ü ���н� greeter��� �̸��� ���
		Greeter g = new Greeter();
		g.setFormat("%s, �ȳ��ϼ���!");
		return g;
	}

}
