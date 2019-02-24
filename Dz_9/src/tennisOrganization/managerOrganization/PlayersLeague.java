package tennisOrganization.managerOrganization;

import tennisOrganization.players.Player;

import java.util.ArrayList;

public class PlayersLeague {


    ArrayList<ArrayPlayers<Player>> goldPlayers = new ArrayList(16);
    ArrayList<ArrayPlayers<Player>> silverPlayers = new ArrayList(16);
    ArrayList<ArrayPlayers<Player>> bronzePlayers = new ArrayList(16);

    public PlayersLeague() {
        for (int i = 0; i < 16; i++) {
            goldPlayers.add(new ArrayPlayers<>(new Player()));
        }
        for (int i = 0; i < 16; i++) {
            silverPlayers.add(new ArrayPlayers<>(new Player()));
        }
        for (int i = 0; i < 16; i++) {
            bronzePlayers.add(new ArrayPlayers<>(new Player()));
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
