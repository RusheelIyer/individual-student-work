package FootballTeam;

public class FootballLeague {

	public static void main(String[] args){

	PremierLeagueTeam PLone = new PremierLeagueTeam ("Chelsea");
	PremierLeagueTeam PLtwo = new PremierLeagueTeam ("Manchester United");
	PremierLeagueTeam PLthree = new PremierLeagueTeam ("Manchester City");
	PremierLeagueTeam PLfour = new PremierLeagueTeam ("Liverpool");
	PremierLeagueTeam PLfive = new PremierLeagueTeam ("West Ham");
	ChampionshipLeagueTeam CLone = new ChampionshipLeagueTeam ("Bournemouth");
	ChampionshipLeagueTeam CLtwo = new ChampionshipLeagueTeam ("Derby");
	ChampionshipLeagueTeam CLthree = new ChampionshipLeagueTeam ("Middlesbrough");
	ChampionshipLeagueTeam CLfour = new ChampionshipLeagueTeam ("Ipswich");
	ChampionshipLeagueTeam CLfive = new ChampionshipLeagueTeam ("Brentford");
	FootballResult PLgameone = new FootballResult (PLone, PLtwo, "1:2");
	FootballResult PLgametwo = new FootballResult (PLthree, PLtwo, "3:1");
	FootballResult PLgamethree = new FootballResult (PLfour, PLfive);
	FootballResult PLgamefour = new FootballResult (PLtwo, PLfour, "1:1");
	FootballResult PLgamefive = new FootballResult (PLthree, PLfive, "2:0");
	
	FootballResult CLgameone = new FootballResult (CLone, CLtwo, "3:2");
	FootballResult CLgametwo = new FootballResult (CLthree, CLtwo, "1:1");
	FootballResult CLgamethree = new FootballResult (CLfour, CLfive);
	FootballResult CLgamefour = new FootballResult (CLtwo, CLfour);
	FootballResult CLgamefive = new FootballResult (CLthree, CLfive, "2:5");
	
	System.out.println("Premier League");
	System.out.println();
	System.out.println (PLone.teamName + " " + PLgameone.getScore() + " " + PLtwo.teamName);
	System.out.println (PLthree.teamName + " " + PLgametwo.getScore() + " " + PLtwo.teamName);
	System.out.println (PLfour.teamName + " " + PLgamethree.getScore() + " " + PLfive.teamName);
	System.out.println (PLtwo.teamName + " " + PLgamefour.getScore() + " " + PLfour.teamName);
	System.out.println (PLthree.teamName + " " + PLgamefive.getScore() + " " + PLfive.teamName);
	System.out.println();
	System.out.println("Championship League");
	System.out.println();
	System.out.println (CLone.teamName + " " + CLgameone.getScore() + " " + CLtwo.teamName);
	System.out.println (CLthree.teamName + " " + CLgametwo.getScore() + " " + CLtwo.teamName);
	System.out.println (CLfour.teamName + " " + CLgamethree.getScore() + " " + CLfive.teamName);
	System.out.println (CLtwo.teamName + " " + CLgamefour.getScore() + " " + CLfour.teamName);
	System.out.println (CLthree.teamName + " " + CLgamefive.getScore() + " " + CLfive.teamName);
	}	
}