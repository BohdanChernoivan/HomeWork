import tennisOrganization.league.LeagueFactory;
import tennisOrganization.league.LeagueType;
import tennisOrganization.league.type.Gold;
import tennisOrganization.play.Match;
import tennisOrganization.tourney.Tourney;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start tennis tourney");

        LeagueFactory leagueFactory = new LeagueFactory();
        Match match = new Match();
        Tourney tourney = new Tourney();

        tourney.startTourney();
//        match.OneVsOne(leagueFactory.findLeagues(LeagueType.Bronze).getArrayPlayers().get(1).getPlayer(), leagueFactory.findLeagues(LeagueType.Bronze).getArrayPlayers().get(2).getPlayer(), leagueFactory.findLeagues(LeagueType.Bronze).getPoints());
    }
}
