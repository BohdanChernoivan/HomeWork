package bohdan.homework.com.arena;

import bohdan.homework.com.fighters.base.ArenaFighter;

public class Tourney extends Arena {

    //display only fighters
    Arena arena = new Arena();
    private ArenaFighter[] fighters = new ArenaFighter[8];


    public void setPvp(ArenaFighter[] tourney) {

        System.out.println("Fighters:");
        try {
            for (int i = 0; i < fighters.length; i++) {
                fighters[i] = tourney[i];
                System.out.println("[" + (i + 1) + "]" + fighters[i].getName());
            }
            throw new IndexOutOfBoundsException();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Full fighters");
        }
    }
}

//            for (int j = 0; j < fighters.length / 2; j++) {
//                fighters[i] = tourney[i];
//            }


//        try {
//
//        }catch (ArrayIndexOutOfBoundsException e) {
//            return fighters;
//        }
//NullPointerException

//        for(int one = 0; one < fighters.length; one++) {
//            fighters[one] = tourney[one];
