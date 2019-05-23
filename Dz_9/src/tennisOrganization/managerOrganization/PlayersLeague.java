package tennisOrganization.managerOrganization;

import tennisOrganization.league.type.Bronze;
import tennisOrganization.league.type.Gold;
import tennisOrganization.league.type.Silver;
import tennisOrganization.players.Player;

import java.util.ArrayList;

public class PlayersLeague {


    private ArrayList<ArrayPlayers<Player>> goldPlayers = new ArrayList();
    private ArrayList<ArrayPlayers<Player>> silverPlayers = new ArrayList();
    private ArrayList<ArrayPlayers<Player>> bronzePlayers = new ArrayList();

    public PlayersLeague() {
        for (int i = 0; i < 16; i++) {
            goldPlayers.add(new ArrayPlayers<>(new Player(new Gold().getName())));
        }
        for (int i = 0; i < 16; i++) {
            silverPlayers.add(new ArrayPlayers<>(new Player(new Silver().getName())));
        }
        for (int i = 0; i < 16; i++) {
            bronzePlayers.add(new ArrayPlayers<>(new Player(new Bronze().getName())));
        }
    }


    public ArrayList<ArrayPlayers<Player>> getGoldPlayers() {
        return goldPlayers;
    }


    public ArrayList<ArrayPlayers<Player>> getSilverPlayers() {
        return silverPlayers;
    }


    public ArrayList<ArrayPlayers<Player>> getBronzePlayers() {
        return bronzePlayers;
    }

}
