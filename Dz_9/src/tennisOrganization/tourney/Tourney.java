package tennisOrganization.tourney;

import tennisOrganization.league.LeagueFactory;
import tennisOrganization.league.LeagueType;
import tennisOrganization.league.type.Bronze;
import tennisOrganization.league.type.Gold;
import tennisOrganization.league.type.Silver;
import tennisOrganization.managerOrganization.ArrayPlayers;
import tennisOrganization.play.Match;
import tennisOrganization.players.Player;

import java.util.ArrayList;

public class Tourney{


    private Match match = new Match();

    LeagueFactory leagueFactory = new LeagueFactory();

    private ArrayList<ArrayPlayers<Player>> playersAll = new ArrayList<>();




    public void gameTourney() throws InterruptedException {
        Thread thread = new Thread(new gameBronze());
        Thread thread1 = new Thread(new gameSilver());
        Thread thread2 = new Thread(new gameGold());

        thread.start();
        thread.join();
        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();

    }

    public void transition() {

        for (int i = 0; i < listBronzePlayers().size(); i++) {
            if (listBronzePlayers().get(i).getPlayer().getPoint() > 30) {
                replaceLeague(listBronzePlayers().get(i), listSilverPlayers(), listBronzePlayers());
            }
        }

        for (int i = 0; i < listSilverPlayers().size(); i++) {
            if (listSilverPlayers().get(i).getPlayer().getPoint() > 70) {
                replaceLeague(listSilverPlayers().get(i), listGoldPlayers(), listSilverPlayers());
            }
        }

        for (int i = 0; i < listSilverPlayers().size(); i++) {
            if(listSilverPlayers().get(i).getPlayer().getPoint() < 30){
                replaceLeague(listSilverPlayers().get(i), listBronzePlayers(), listSilverPlayers());
            }
        }

        for (int i = 0; i < listGoldPlayers().size(); i++) {
            if (listGoldPlayers().get(i).getPlayer().getPoint() < 70) {
                replaceLeague(listGoldPlayers().get(i), listSilverPlayers(), listGoldPlayers());
            }
        }
    }


    public ArrayList<ArrayPlayers<Player>> listGoldPlayers() {
        return leagueFactory.findLeagues(LeagueType.Gold).getArrayPlayers();
    }

    public ArrayList<ArrayPlayers<Player>> listSilverPlayers() {
        return leagueFactory.findLeagues(LeagueType.Silver).getArrayPlayers();
    }

    public ArrayList<ArrayPlayers<Player>> listBronzePlayers() {
        return leagueFactory.findLeagues(LeagueType.Bronze).getArrayPlayers();
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
        playersAll.addAll(listGoldPlayers());
        playersAll.addAll(listSilverPlayers());
        playersAll.addAll(listBronzePlayers());
    }



    public class gameBronze extends Thread {
        @Override
        public final void run() {
            gamesBronzeLeague();
        }
    }

    protected class gameSilver extends Thread {
        @Override
        public final void run() {
            gamesSilverLeague();
        }
    }

    protected class gameGold extends Thread {
        @Override
        public final void run() {
            gamesGoldLeague();
        }
    }

    public void gamesBronzeLeague() {
        for (int i = 0; i < listBronzePlayers().size(); i++) {
            match.OneVsOne(listBronzePlayers().get(i).getPlayer(), listBronzePlayers().listIterator(listBronzePlayers().size() - i).previous().getPlayer(), new Bronze());
        }
    }
    public void gamesSilverLeague() {
        for (int i = 0; i < listSilverPlayers().size(); i++) {
            match.OneVsOne(listSilverPlayers().get(i).getPlayer(), listSilverPlayers().listIterator(listSilverPlayers().size() - i).previous().getPlayer(), new Silver());
        }
    }
    public void gamesGoldLeague() {
        for (int i = 0; i < listGoldPlayers().size(); i++) {
            match.OneVsOne(listGoldPlayers().get(i).getPlayer(), listGoldPlayers().listIterator(listGoldPlayers().size() - i).previous().getPlayer(), new Gold());
        }
    }
}
