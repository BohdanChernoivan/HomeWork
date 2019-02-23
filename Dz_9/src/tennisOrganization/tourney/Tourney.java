package tennisOrganization.tourney;

import tennisOrganization.league.type.Bronze;
import tennisOrganization.league.type.Gold;
import tennisOrganization.league.type.Silver;
import tennisOrganization.play.Match;
import tennisOrganization.players.Player;


public class Tourney {

    Match match = new Match();

    Gold gold = new Gold();
    Silver silver = new Silver();
    Bronze bronze = new Bronze();



    public void startTourney() {

        try {

        } catch (Exception exp) {}

    }

    private void pvpTourney(Player one, Player two,String nameLeague, int league) {
        System.out.println("Game = " + nameLeague + " league!");
        System.out.println(one.getName() + " vs " + two.getName());
        match.OneVsOne(one, two, league);
    }
}




//    public void startTourney() {
//
//        try {
//            for (int i = 0 ; i < arrayPlayer.length ; i++) {
//
//                if (arrayPlayer[i].getPoint() > 60) {
//                    gold.setPlayers(arrayPlayer[i]);
//                } else if (arrayPlayer[i].getPoint() > 40) {
//                    silver.setPlayers(arrayPlayer[i]);
//                } else if (arrayPlayer[i].getSkillPlayTennis() > 20)
//                    bronze.setPlayers(arrayPlayer[i]);
//
//
////                if (arrayPlayer[i].getSkillPlayTennis() > 50) {
//                for (int j = 0; j < 5 ; j++) {
//                    pvpTourney(arrayPlayer[i], arrayPlayer[i+1], gold.getName(), gold.getPoints());
//                }
//
////                } else if (arrayPlayer[i].getSkillPlayTennis() > 30) {
////                    pvpTourney(arrayPlayer[i], arrayPlayer[i + 1], new Silver().getName(), new Silver().getPoints());
////                } else if (arrayPlayer[i].getSkillPlayTennis() >= 0) {
////                    pvpTourney(arrayPlayer[i], arrayPlayer[i + 1], new Bronze().getName(), new Bronze().getPoints());
////                }
//            }
//            System.out.println("HE");
//            System.out.println(gold.getPlayers().length);
//            System.out.println(silver.getPlayers().length);
//            System.out.println(bronze.getPlayers().length);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("HE");
////            System.out.println(gold.getPlayers().length);
////            System.out.println(silver.getPlayers().length);
//            System.out.println(bronze.getPlayers().length);
//            for (Player x:
//                 bronze.getPlayers()) {
//                System.out.println(x.getName());
//                System.out.println(x.getAge());
//
//            }
//        }
//
//    }

