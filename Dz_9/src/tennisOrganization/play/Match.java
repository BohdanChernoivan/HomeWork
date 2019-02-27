package tennisOrganization.play;


import myException.Draw;
import tennisOrganization.league.type.AbstractLeague;
import tennisOrganization.players.Player;

import java.util.Random;


public class Match {


    public static void OneVsOne(Player one, Player two, AbstractLeague leagues) {
        System.out.println(one.getName() + " vs " + two.getName());
        try {
            if (one.getSkillPlayTennis() > two.getSkillPlayTennis()) {
                OneWinner(one, two,leagues);
            } else if (one.getSkillPlayTennis() < two.getSkillPlayTennis()) {
                OneWinner(two, one,leagues);
            } else if(one.equals(two)) {
                draw(one,two,leagues);
            } else
                throw new Draw();
        } catch (Draw drawEr) {
            drawEr.drawError(one, two, leagues);
        }

    }

    private static void OneWinner(Player one, Player two, AbstractLeague abstractLeague) {
        System.out.println("Game in " + abstractLeague.getName() + " league!");
        one.setPoint(one.getPoint() + abstractLeague.getPoints());
        two.setPoint(two.getPoint() - abstractLeague.getPoints());
        System.out.println("Winner = " + one.getName() + " get = " + one.getPoint() + " point(s).");
    }

    private static void draw(Player one, Player two, AbstractLeague abstractLeague) {
        boolean randomWinner = new Random().nextBoolean();
        if (randomWinner) {
            System.out.println("Game in " + abstractLeague.getName() + " league!");
            one.setPoint(one.getPoint() + abstractLeague.getPoints());
            two.setPoint(two.getPoint() - abstractLeague.getPoints());
            System.out.println("Winner = " + one.getName() + " get = " + one.getPoint() + " point(s).");
        } else {
            System.out.println("Game in " + abstractLeague.getName() + " league!");
            one.setPoint(one.getPoint() - abstractLeague.getPoints());
            two.setPoint(two.getPoint() + abstractLeague.getPoints());
            System.out.println("Winner = " + two.getName() + " get = " + two.getPoint() + " point(s).");
        }
    }
}
