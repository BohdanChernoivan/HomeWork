package myException;

import tennisOrganization.players.Player;

import java.util.Random;

public class Draw extends Exception {

    public void draw(Player one, Player two, int pointsWin) {
        boolean randomWinner = new Random().nextBoolean();
        if (randomWinner) {
            one.setPoint(one.getPoint() + pointsWin);
            two.setPoint(two.getPoint() - pointsWin);
            System.out.println("Winner = " + one.getName() + " get = " + one.getPoint() + " point(s).");
        } else {
            one.setPoint(one.getPoint() - pointsWin);
            two.setPoint(two.getPoint() + pointsWin);
            System.out.println("Winner = " + two.getName() + " get = " + two.getPoint() + " point(s).");
        }
    }
}
