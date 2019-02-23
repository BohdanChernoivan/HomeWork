package tennisOrganization.play;


import myException.Draw;
import tennisOrganization.players.Player;


public class Match {


    public void OneVsOne(Player one, Player two, int points) {
        System.out.println(one.getName() + " vs " + two.getName());
        try {
            if (one.getSkillPlayTennis() > two.getSkillPlayTennis()) {
                OneWinner(one, two, points);
            } else if (one.getSkillPlayTennis() < two.getSkillPlayTennis()) {
                OneWinner(two, one, points);
            } else {
                throw new Draw();
            }
        } catch (Draw draw) {
            draw.draw(one, two, points);
        }

    }

    private void OneWinner(Player one, Player two, int pointsWin) {
        one.setPoint(one.getPoint() + pointsWin);
        two.setPoint(two.getPoint() - pointsWin);
        System.out.println("Winner = " + one.getName() + " get = " + one.getPoint() + " point(s).");
    }
}
