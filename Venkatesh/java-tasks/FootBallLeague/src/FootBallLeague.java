import java.util.ArrayList;

public class FootBallLeague {
	public static void main(String[] args){
		ArrayList <FootBallTeam> teams = new ArrayList<FootBallTeam>();
		teams.add(new ChampionshipLeagueTeam("...", 1));
		teams.add(new ChampionshipLeagueTeam("Mundane name", 2));
		teams.add(new PremierLeagueTeam(randomName()));
		
		System.out.println((new LeagueResult(teams.get(0), teams.get(2), 1).score));
	}
	
	public static String randomName(){
		String result = "";
		for (int i = 0; i < 5; i++){
			char letter = (char)(97 + (((i+1)*(System.currentTimeMillis())%26)));
			result += letter;
		}
		return result;
	}
	
	public void addToPoints(FootBallResult f){
		String[] scores = f.score.split(":"); //Necessary instead of simple string index due to possibility of double digit score
		if (Integer.parseInt(scores[0]) > Integer.parseInt(scores[1])){
			f.team1.wins += 1;
			f.team2.losses += 1;
		}
		else{
			f.team1.losses += 1;
			f.team2.wins += 1;
		}
	}
	
}
