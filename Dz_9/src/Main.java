import tennisOrganization.league.LeagueFactory;
import tennisOrganization.league.LeagueType;
import tennisOrganization.league.type.Bronze;
import tennisOrganization.play.Match;
import tennisOrganization.players.Player;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start tennis tourney");

        LeagueFactory leagueFactory = new LeagueFactory();
        Match match = new Match();
//TODO: Test
        System.out.println(leagueFactory.findLeagues(LeagueType.Bronze).getName());
        match.OneVsOne(new Player(),new Player(),leagueFactory.findLeagues(LeagueType.Bronze).getPoints());
        System.out.println(leagueFactory.findLeagues(LeagueType.Silver).getName());
        match.OneVsOne(new Player(),new Player(),leagueFactory.findLeagues(LeagueType.Silver).getPoints());
        System.out.println(leagueFactory.findLeagues(LeagueType.Gold).getName());
        match.OneVsOne(new Player(),new Player(),leagueFactory.findLeagues(LeagueType.Gold).getPoints());

    }
}
