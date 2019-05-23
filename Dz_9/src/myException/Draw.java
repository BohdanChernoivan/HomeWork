package myException;

import tennisOrganization.league.type.AbstractLeague;
import tennisOrganization.players.Player;

import java.util.Random;

public class Draw extends Exception {

    public void drawError(Player one, Player two, AbstractLeague league) {
        boolean randomWinner = new Random().nextBoolean();
        if (randomWinner) {
            System.out.println("Game in " + league.getName() + " league!");
            one.setPoint(one.getPoint() + league.getPoints());
            two.setPoint(two.getPoint() - league.getPoints());
            System.out.println("Winner = " + one.getName() + " get = " + one.getPoint() + " point(s).");
        } else {
            System.out.println("Game in " + league.getName() + " league!");
            one.setPoint(one.getPoint() - league.getPoints());
            two.setPoint(two.getPoint() + league.getPoints());
            System.out.println("Winner = " + two.getName() + " get = " + two.getPoint() + " point(s).");
        }
    }
}
