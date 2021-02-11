package SpringGroup;

public class MusicPlayer {
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
