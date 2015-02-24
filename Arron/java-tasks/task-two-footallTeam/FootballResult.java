package FootballTeam;

public class FootballResult {

	String Score;
	
	public FootballResult(FootballTeam one, FootballTeam two, String Score){
		this.Score = Score;
	}
	public FootballResult (FootballTeam footballteam1, FootballTeam footballteam2){
	this.Score = "0:0";
	}
	public String getScore() {
		return Score;
	}
	public void setScore(String score) {
		Score = score;
	}
}