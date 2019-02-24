import tennisOrganization.league.LeagueFactory;
import tennisOrganization.league.LeagueType;
import tennisOrganization.play.Match;
import tennisOrganization.tourney.Tourney;


public class Main {
    public static void main(String[] args) {
        System.out.println("Start tennis tourney");

        LeagueFactory leagueFactory = new LeagueFactory();
        Match match = new Match();
        Tourney tourney = new Tourney();

        tourney.startTourney();
        tourney.startTourney();
        tourney.transition();
        tourney.startTourney();
        tourney.startTourney();
        tourney.transition();
        tourney.startTourney();
        tourney.startTourney();

        System.out.println(tourney.getLeagueFactory().findLeagues(LeagueType.Bronze).getArrayPlayers().size());
        System.out.println(tourney.getLeagueFactory().findLeagues(LeagueType.Silver).getArrayPlayers().size());
        System.out.println(tourney.getLeagueFactory().findLeagues(LeagueType.Gold).getArrayPlayers().size());

    }
}
