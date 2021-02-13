package SpringGroup;

public class RockMusic implements Music {
	
	private RockMusic() {}
	
	public static RockMusic getRockMusic() {
		System.out.println("Get Rock");
		return new RockMusic();
	}
	
	public void doMyInit() {
		System.out.println("Start Rock");
	}
	public void doMyDestroy() {
		System.out.println("End Rock");
	}
	
	@Override
	public String getSong() {
		// TODO Auto-generated method stub
		return "Nirvana";
	}

}
