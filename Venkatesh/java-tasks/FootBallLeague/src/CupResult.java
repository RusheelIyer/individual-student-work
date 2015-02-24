
public class CupResult extends FootBallResult {
	public String round;

	public CupResult(FootBallTeam team1, FootBallTeam team2, String round) {
		super(team1, team2);
		this.round = round;
	}
	
	public CupResult(FootBallTeam team1, FootBallTeam team2, String score, String round){
		super(team1,team2,score);
		this.round = round;
	}

}
