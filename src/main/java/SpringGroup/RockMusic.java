package SpringGroup;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;



@Component("musicBean")
public class RockMusic implements Music {
	
	//private RockMusic() {}
	
	
	//factory-method="getRockMusic"
	public static RockMusic getRockMusic() {
		System.out.println("Get Rock");
		return new RockMusic();
	}
	
	@PostConstruct
	public void doMyInit() {
		System.out.println("Start Rock");
	}
	@PreDestroy
	public void doMyDestroy() {
		System.out.println("End Rock");
	}
	
	@Override
	public String getSong() {
		// TODO Auto-generated method stub
		return "Nirvana";
	}

}
