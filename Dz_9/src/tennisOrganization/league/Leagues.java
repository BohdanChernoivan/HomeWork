package tennisOrganization.league;

import tennisOrganization.managerOrganization.ArrayPlayers;
import tennisOrganization.players.Player;

import java.util.ArrayList;

public class Leagues {
    private String name;
    private int points;
    ArrayList<ArrayPlayers<Player>> arrayPlayers;

    public Leagues(String name, int points, ArrayList<ArrayPlayers<Player>> arrayPlayers) {
        this.name = name;
        this.points = points;
        this.arrayPlayers = arrayPlayers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public ArrayList<ArrayPlayers<Player>> getArrayPlayers() {
        return arrayPlayers;
    }
}
