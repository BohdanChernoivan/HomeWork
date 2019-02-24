package myException;

import tennisOrganization.players.Player;

import java.util.Random;

public class Draw extends Exception {

    public void drawError(Player one, Player two, int pointsWin, String league) {
        boolean randomWinner = new Random().nextBoolean();
        if (randomWinner) {
            System.out.println("Game in " + league + " league!");
            one.setPoint(one.getPoint() + pointsWin);
            two.setPoint(two.getPoint() - pointsWin);
            System.out.println("Winner = " + one.getName() + " get = " + one.getPoint() + " point(s).");
        } else {
            System.out.println("Game in " + league + " league!");
            one.setPoint(one.getPoint() - pointsWin);
            two.setPoint(two.getPoint() + pointsWin);
            System.out.println("Winner = " + two.getName() + " get = " + two.getPoint() + " point(s).");
        }
    }
}
