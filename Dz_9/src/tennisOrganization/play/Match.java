package tennisOrganization.play;


import myException.Draw;
import tennisOrganization.players.Player;

import java.util.Random;


public class Match {


    public static void OneVsOne(Player one, Player two, int points, String league) {
        System.out.println(one.getName() + " vs " + two.getName());
        try {
            if (one.getSkillPlayTennis() > two.getSkillPlayTennis()) {
                OneWinner(one, two, points, league);
            } else if (one.getSkillPlayTennis() < two.getSkillPlayTennis()) {
                OneWinner(two, one, points, league);
            } else if(one.equals(two)) {
                draw(one,two,points,league);
            } else
                throw new Draw();
        } catch (Draw drawEr) {
            drawEr.drawError(one, two, points, league);
        }

    }

    private static void OneWinner(Player one, Player two, int pointsWin, String league) {
        System.out.println("Game in " + league + " league!");
        one.setPoint(one.getPoint() + pointsWin);
        two.setPoint(two.getPoint() - pointsWin);
        System.out.println("Winner = " + one.getName() + " get = " + one.getPoint() + " point(s).");
    }

    private static void draw(Player one, Player two, int pointsWin, String league) {
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
