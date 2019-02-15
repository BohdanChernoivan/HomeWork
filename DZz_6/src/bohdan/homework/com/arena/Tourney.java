package bohdan.homework.com.arena;

import bohdan.homework.com.fighters.base.ArenaFighter;

public class Tourney extends Arena {


    Arena arena = new Arena();
    ArenaFighter[] fighters = new ArenaFighter[8]; //TODO: class not over


    public void setPvp(ArenaFighter[] tourney) {

        System.out.println("First tourney");

        for (int i = 0; i < fighters.length; i++) {
            fighters[i] = tourney[i];
            System.out.println(fighters[i].getName());
//            for (int j = 0; j < fighters.length / 2; j++) {
//                fighters[i] = tourney[i];
//            }
        }
    }
}

//        try {
//
//        }catch (ArrayIndexOutOfBoundsException e) {
//            return fighters;
//        }
//NullPointerException

//        for(int one = 0; one < fighters.length; one++) {
//            fighters[one] = tourney[one];
