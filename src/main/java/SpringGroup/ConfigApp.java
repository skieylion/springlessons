package SpringGroup;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
//@ComponentScan("SpringGroup")
@PropertySource("classpath:musicPlayer.properties")
public class ConfigApp {
	@Bean
	//@Scope("prototype")
	public RockMusic musicRock() {
		return new RockMusic();
	}
	@Bean
	public ClassicalMusic musicClassical() {
		return new ClassicalMusic();
	}
	@Bean
	public PopMusic musicPop() {
		return new PopMusic();
	}
	@Bean
	public List<Music> musicList(){
		List<Music> list=new ArrayList<Music>();
		list.add(musicRock());
		list.add(musicClassical());
		list.add(musicPop());
		return list;
	}
	@Bean
	public MusicPlayer musicPlayer() {
		return new MusicPlayer(musicList());
	}
}