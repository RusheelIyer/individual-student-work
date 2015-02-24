
public class LeagueResult extends FootBallResult {
	public int week;

	public LeagueResult(FootBallTeam team1, FootBallTeam team2, int week) {
		super(team1, team2);
		this.week = week;
	}
	
	public LeagueResult(FootBallTeam team1, FootBallTeam team2, String score, int week){
		super(team1,team2,score);
		this.week = week;
	}

}
