package tennisOrganization.league;


import tennisOrganization.league.type.Bronze;
import tennisOrganization.league.type.Gold;
import tennisOrganization.league.type.Silver;

public class LeagueFactory {

    private Gold gold = new Gold();
    private Silver silver = new Silver();
    private Bronze bronze = new Bronze();

    public Leagues findLeagues(LeagueType leagueType) {
        switch (leagueType) {
            case Bronze:
                return new Leagues(bronze.getName(), bronze.getPoints());
            case Silver:
                return new Leagues(silver.getName(), silver.getPoints());
            case Gold:
                return new Leagues(gold.getName(), gold.getPoints());
        }
        return null;
    }
}
