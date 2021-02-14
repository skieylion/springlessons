package SpringGroup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class MusicPlayer {
	
	private List<String> listMusicStr;
	
	public List<String> getListMusicStr() {
		
		System.out.println("get listStr: "+listMusicStr);
		return listMusicStr;
	}

	public void setListMusicStr(List<String> listMusicStr) {
		this.listMusicStr = listMusicStr;
	}

	private List<Music> listMusic;
	
	public List<Music> getListMusic() {
		System.out.println("------------");
		for (int index=0; index < listMusic.size(); index++) {
			System.out.println(listMusic.get(index).getSong());
        }
		System.out.println("------------");
		System.out.println("get list: "+listMusic);
		return listMusic;
	}
	
	@Autowired
	public void setListMusic(List<Music> listMusic) {
		System.out.println("set list: "+listMusic);
		this.listMusic = listMusic;
	}

	private Music music;
	private Integer volume;
	
	public Integer getVolume() {
		return volume;
	}
	
	@Value("${musicPlayer.volume}")
	public void setVolume(Integer volume) {
		this.volume = volume;
	}

	public String getName() {
		return name;
	}
	
	@Value("${musicPlayer.name}")
	public void setName(String name) {
		this.name = name;
	}

	private String name;
	
	
	public Music getMusic() {
		return music;
	}
	@Autowired
	@Qualifier("musicBean")
	public void setMusic(Music music) {
		this.music = music;
	}

	public MusicPlayer(Music music) {
		this.music=music;
	}
	
	public MusicPlayer() {
	}
	
	public void playMusic() {
		System.out.println(music.getSong());
		System.out.println(getName());
		System.out.println(getVolume());
	}
}
