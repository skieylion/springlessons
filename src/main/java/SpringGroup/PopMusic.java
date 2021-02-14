package SpringGroup;

import org.springframework.stereotype.Component;

@Component("popMusic")
public class PopMusic implements Music {

	@Override
	public String getSong() {
		// TODO Auto-generated method stub
		return "Lenka";
	}

}
