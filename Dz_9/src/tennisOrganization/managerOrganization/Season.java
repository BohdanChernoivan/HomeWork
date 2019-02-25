package tennisOrganization.managerOrganization;

import tennisOrganization.tourney.Totals;
import tennisOrganization.tourney.Tourney;

public class Season {


    public void season() {
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
