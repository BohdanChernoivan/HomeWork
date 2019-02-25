
import tennisOrganization.league.LeagueType;
import tennisOrganization.tourney.Totals;
import tennisOrganization.tourney.Tourney;



public class Main {
    public static void main(String[] args) {
        System.out.println("Start tennis tourney");

        Tourney tourney = new Tourney();
        Totals totals = new Totals();

        tourney.gameTourney();
        tourney.gameTourney();
        tourney.gameTourney();
        tourney.transition();
        tourney.gameTourney();
        tourney.gameTourney();
        tourney.gameTourney();
        tourney.transition();
        tourney.gameTourney();
        tourney.gameTourney();
        tourney.gameTourney();

        totals.results(tourney);
    }
}
