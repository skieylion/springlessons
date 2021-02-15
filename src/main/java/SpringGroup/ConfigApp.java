package SpringGroup;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("SpringGroup")
@PropertySource("classpath:musicPlayer.properties")
public class ConfigApp {
	@Bean
	@Scope("prototype")
	public RockMusic musicBean() {
		return new RockMusic();
	}
	@Bean
	public ClassicalMusic musicBean2() {
		return new ClassicalMusic();
	}
}