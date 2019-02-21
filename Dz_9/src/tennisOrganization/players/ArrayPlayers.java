package tennisOrganization.players;

public class ArrayPlayers<P extends Player> {

//    public Player[] arrayPlayer = new Player[48];
    private P player;

    public ArrayPlayers(P arg) {
        player = arg;

//        for (int i = 0; i < arrayPlayer.length ; i++) {
//            arrayPlayer[i] = new Player();
//        }
    }
    public P getPlayer() {
        return player;
    }

}
