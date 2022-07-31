package chap02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 해당 클래스를 설정 클래스로 지정한다는 의미를 가짐
public class AppContext {
	
	@Bean // 빈 객체를 구분할 때 사용, 해당 매서드가 생성한 객체를 스프링이 관리하는 빈 객체로 등록 / 객체를 생성하고 알맞게 초기화 해야/ 12행에서 Greeter 객체를 초기화 한다
	public Greeter greeter() { // 객체 구분시 greeter라는 이름을 사용
		Greeter g = new Greeter();
		g.setFormat("%s, 안녕하세요!");
		return g;
	}

}
