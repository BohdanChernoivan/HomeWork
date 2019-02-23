package tennisOrganization.managerOrganization;

import tennisOrganization.players.Player;

public class ArrayPlayers<T extends Player>  {

    private T player;

    public ArrayPlayers(T object) {
        player = object;

    }
    public T getPlayer() {
        return player;
    }
}
