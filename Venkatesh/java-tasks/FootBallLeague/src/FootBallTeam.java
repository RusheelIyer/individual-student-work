
public abstract class FootBallTeam {

	public int strength;
	public String name;
	public int wins;
	public int losses;

	public FootBallTeam (String name, int strength){
		this.strength = strength;
		this.name = name;
		this.wins = 0;
		this.losses = 0;
	}
	public FootBallTeam(String name){
		this.strength = (int)(System.currentTimeMillis()%5);
		this.name = name;
		this.wins = 0;
		this.losses = 0;
	}
	
}
