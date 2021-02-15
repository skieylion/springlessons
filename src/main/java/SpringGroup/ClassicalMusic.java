package SpringGroup;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class ClassicalMusic implements Music {
	
	
	
	@Override
	public String getSong() {
		// TODO Auto-generated method stub
		System.out.println("Song Classical 1");
		System.out.println("Song Classical 2");
		System.out.println("Song Classical 3");
		return "Bethoven";
	}

}
