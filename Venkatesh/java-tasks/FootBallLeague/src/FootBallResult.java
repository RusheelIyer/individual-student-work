
public abstract class FootBallResult {
	public String score;
	public FootBallTeam team1;
	public FootBallTeam team2;
	
	public FootBallResult(FootBallTeam team1, FootBallTeam team2, String score){
		this.score = score;
	}
	public FootBallResult(FootBallTeam team1, FootBallTeam team2){
		int random = (int)(System.currentTimeMillis()%3);
		if (team1.strength > team2.strength){
			this.score = Integer.toString((team1.strength-team2.strength)+random) + ":" + Integer.toString(random);
		}
		else{
			this.score = Integer.toString(random) + ":" + Integer.toString((team2.strength-team1.strength)+random);
		}
	}
}
