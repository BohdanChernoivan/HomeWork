package tennisOrganization.tourney;

import tennisOrganization.league.LeagueFactory;
import tennisOrganization.league.LeagueType;
import tennisOrganization.managerOrganization.ArrayPlayers;
import tennisOrganization.play.Match;
import tennisOrganization.players.Player;

import java.util.ArrayList;

public class Tourney {

    private Match match = new Match();

    LeagueFactory leagueFactory = new LeagueFactory();

    private ArrayList<ArrayPlayers<Player>> playersAll = new ArrayList<>();


    public void gameTourney() {

        for (int i = 0; i < leagueFactory.findLeagues(LeagueType.Bronze).getArrayPlayers().size(); i++) {
                match.OneVsOne(leagueFactory.findLeagues(LeagueType.Bronze).getArrayPlayers().get(i).getPlayer(), leagueFactory.findLeagues(LeagueType.Bronze).getArrayPlayers().listIterator(leagueFactory.findLeagues(LeagueType.Bronze).getArrayPlayers().size() - i).previous().getPlayer(), leagueFactory.findLeagues(LeagueType.Bronze).getPoints(), leagueFactory.findLeagues(LeagueType.Bronze).getName());
        }

        for (int i = 0; i < leagueFactory.findLeagues(LeagueType.Silver).getArrayPlayers().size(); i++) {
                match.OneVsOne(leagueFactory.findLeagues(LeagueType.Silver).getArrayPlayers().get(i).getPlayer(), leagueFactory.findLeagues(LeagueType.Silver).getArrayPlayers().listIterator(leagueFactory.findLeagues(LeagueType.Silver).getArrayPlayers().size() - i).previous().getPlayer(), leagueFactory.findLeagues(LeagueType.Silver).getPoints(), leagueFactory.findLeagues(LeagueType.Silver).getName());
        }

        for (int i = 0; i < leagueFactory.findLeagues(LeagueType.Gold).getArrayPlayers().size(); i++) {
                match.OneVsOne(leagueFactory.findLeagues(LeagueType.Gold).getArrayPlayers().get(i).getPlayer(), leagueFactory.findLeagues(LeagueType.Gold).getArrayPlayers().listIterator(leagueFactory.findLeagues(LeagueType.Gold).getArrayPlayers().size() - i).previous().getPlayer(), leagueFactory.findLeagues(LeagueType.Gold).getPoints(), leagueFactory.findLeagues(LeagueType.Gold).getName());
        }
    }

    public void transition() {

        for (int i = 0; i < leagueFactory.findLeagues(LeagueType.Gold).getArrayPlayers().size(); i++) {
            if (leagueFactory.findLeagues(LeagueType.Gold).getArrayPlayers().get(i).getPlayer().getPoint() < 50) {
                replaceLeague(leagueFactory.findLeagues(LeagueType.Gold).getArrayPlayers().get(i), leagueFactory.findLeagues(LeagueType.Silver).getArrayPlayers(), leagueFactory.findLeagues(LeagueType.Gold).getArrayPlayers());
            }
        }
            for (int i = 0; i < leagueFactory.findLeagues(LeagueType.Silver).getArrayPlayers().size(); i++) {
            if (leagueFactory.findLeagues(LeagueType.Silver).getArrayPlayers().get(i).getPlayer().getPoint() > 50) {
                replaceLeague(leagueFactory.findLeagues(LeagueType.Silver).getArrayPlayers().get(i), leagueFactory.findLeagues(LeagueType.Gold).getArrayPlayers(), leagueFactory.findLeagues(LeagueType.Silver).getArrayPlayers());
            }
            if(leagueFactory.findLeagues(LeagueType.Silver).getArrayPlayers().get(i).getPlayer().getPoint() < 20){
                replaceLeague(leagueFactory.findLeagues(LeagueType.Silver).getArrayPlayers().get(i), leagueFactory.findLeagues(LeagueType.Bronze).getArrayPlayers(), leagueFactory.findLeagues(LeagueType.Silver).getArrayPlayers());
            }
        }
        for (int i = 0; i < leagueFactory.findLeagues(LeagueType.Bronze).getArrayPlayers().size(); i++) {
            if (leagueFactory.findLeagues(LeagueType.Bronze).getArrayPlayers().get(i).getPlayer().getPoint() > 20) {
                replaceLeague(leagueFactory.findLeagues(LeagueType.Bronze).getArrayPlayers().get(i), leagueFactory.findLeagues(LeagueType.Silver).getArrayPlayers(), leagueFactory.findLeagues(LeagueType.Bronze).getArrayPlayers());
            }
        }
    }

    /**
     *
     * @param one this player go to another league, but he remove from this league
     * @param arrayListOne new league
     * @param arrayListTwo this league
     */
    private void replaceLeague(ArrayPlayers<Player> one, ArrayList<ArrayPlayers<Player>> arrayListOne, ArrayList<ArrayPlayers<Player>> arrayListTwo) {
        arrayListOne.add(one);
        one.getPlayer().setLeague(arrayListOne.get(0).getPlayer().getLeague());
        arrayListTwo.remove(one);
    }

    protected LeagueFactory getLeagueFactory() {
        return leagueFactory;
    }

    protected ArrayList<ArrayPlayers<Player>> getPlayersAll() {
        return playersAll;
    }

    protected void setPlayersAll() {
        playersAll.addAll(leagueFactory.findLeagues(LeagueType.Gold).getArrayPlayers());
        playersAll.addAll(leagueFactory.findLeagues(LeagueType.Silver).getArrayPlayers());
        playersAll.addAll(leagueFactory.findLeagues(LeagueType.Bronze).getArrayPlayers());
    }
}
