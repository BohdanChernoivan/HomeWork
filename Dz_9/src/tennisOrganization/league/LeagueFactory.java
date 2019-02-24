package tennisOrganization.league;


import tennisOrganization.league.type.Bronze;
import tennisOrganization.league.type.Gold;
import tennisOrganization.league.type.Silver;
import tennisOrganization.managerOrganization.PlayersLeague;

public class LeagueFactory {

    private Gold gold = new Gold();
    private Silver silver = new Silver();
    private Bronze bronze = new Bronze();
    private PlayersLeague playersLeague = new PlayersLeague();

    public Leagues findLeagues(LeagueType leagueType) {
        switch (leagueType) {
            case Bronze:
                return new Leagues(bronze.getName(), bronze.getPoints(), playersLeague.getBronzePlayers());
            case Silver:
                return new Leagues(silver.getName(), silver.getPoints(), playersLeague.getSilverPlayers());
            case Gold:
                return new Leagues(gold.getName(), gold.getPoints(), playersLeague.getGoldPlayers());
        }
        return null;
    }
}
