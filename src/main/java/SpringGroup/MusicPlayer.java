package SpringGroup;

import java.util.List;

import com.sun.corba.se.spi.orbutil.fsm.Action;

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

	public void setListMusic(List<Music> listMusic) {
		System.out.println("set list: "+listMusic);
		this.listMusic = listMusic;
	}

	private Music music;
	private Integer volume;
	
	public Integer getVolume() {
		return volume;
	}

	public void setVolume(Integer volume) {
		this.volume = volume;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;
	
	
	public Music getMusic() {
		return music;
	}

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
