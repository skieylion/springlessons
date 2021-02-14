package SpringGroup;

import org.springframework.stereotype.Component;

@Component("musicBean2")
public class ClassicalMusic implements Music {

	@Override
	public String getSong() {
		// TODO Auto-generated method stub
		return "Bethoven";
	}

}
