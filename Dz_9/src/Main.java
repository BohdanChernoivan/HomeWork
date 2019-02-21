import tennisOrganization.players.ArrayPlayers;
import tennisOrganization.players.Player;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start tennis tourney");


        ArrayPlayers arrayPlayerOne = new ArrayPlayers(new Player());
        ArrayPlayers arrayPlayerTwo = new ArrayPlayers(new Player());

        System.out.print(arrayPlayerOne.getPlayer().getName() + " age = ");
        System.out.println(arrayPlayerOne.getPlayer().getAge());
        System.out.print(arrayPlayerTwo.getPlayer().getName() + " age = ");
        System.out.println(arrayPlayerTwo.getPlayer().getAge());


    }
}
