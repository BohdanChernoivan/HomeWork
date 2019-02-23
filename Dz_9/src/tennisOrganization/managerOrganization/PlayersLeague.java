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

    public void setGoldPlayers(ArrayList<ArrayPlayers<Player>> goldPlayers) {
        this.goldPlayers = goldPlayers;
    }

    public ArrayList<ArrayPlayers<Player>> getSilverPlayers() {
        return silverPlayers;
    }

    public void setSilverPlayers(ArrayList<ArrayPlayers<Player>> silverPlayers) {
        this.silverPlayers = silverPlayers;
    }

    public ArrayList<ArrayPlayers<Player>> getBronzePlayers() {
        return bronzePlayers;
    }

    public void setBronzePlayers(ArrayList<ArrayPlayers<Player>> bronzePlayers) {
        this.bronzePlayers = bronzePlayers;
    }
}
