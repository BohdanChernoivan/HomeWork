package tennisOrganization.play;

import tennisOrganization.tourney.Tourney;


public class GameStatistic {

    public void statisticGamesLeagueBronze(Tourney tourney) {
        tourney.gamesBronzeLeague();
    }

    public void statisticGamesLeagueSilver(Tourney tourney) {
        tourney.gamesSilverLeague();
    }

    public void statisticGamesLeagueGold(Tourney tourney) {
        tourney.gamesGoldLeague();
    }
}
