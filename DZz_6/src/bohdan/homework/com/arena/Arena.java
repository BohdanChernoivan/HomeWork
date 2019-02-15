package bohdan.homework.com.arena;

import bohdan.homework.com.anException.MyException;
import bohdan.homework.com.fighters.base.actions.ActionPostFight;
import bohdan.homework.com.fighters.base.actions.ActionPreFight;
import bohdan.homework.com.fighters.base.actions.FightBreakAction;
import bohdan.homework.com.fighters.base.ArenaFighter;

public class Arena {


    public ArenaFighter fight(ArenaFighter arenaFighterOne, ArenaFighter arenaFighterTwo) {

        int round = 0;


        final ArenaFighter[] winner = {null};
        try {

            preRoundActions(arenaFighterOne, arenaFighterTwo, (winner1) -> winner[0] = winner1);
            if (winner[0] != null) {
                System.out.println("Winner = " + winner[0].getName() + "; Left health point = " + winner[0].getHealth());
                return winner[0];
            }
            preRoundActions(arenaFighterTwo, arenaFighterOne, (winner1) -> winner[0] = winner1);
            if (winner[0] != null) {
                System.out.println("Winner = " + winner[0].getName() + "; Left health point = " + winner[0].getHealth());
                return winner[0];
            }

            while (round <= 10){

                int takeDamageOneFighter = arenaFighterTwo.takeDamage(arenaFighterOne.getDamage()); //deals damage
                int takeDamageTwoFighter = arenaFighterOne.takeDamage(arenaFighterTwo.getDamage()); //deals damage

                startAFight(arenaFighterOne, arenaFighterTwo, takeDamageTwoFighter);
                startAFight(arenaFighterTwo, arenaFighterOne, takeDamageOneFighter);


                if (arenaFighterOne.isAlive() && arenaFighterTwo.isAlive())
                    round++;

                else if (arenaFighterOne.isAlive()) {
                    System.out.println("Rounds passed = " + round);
                    System.out.println("Winner = " + arenaFighterOne.getName() + "; Left health point = " + arenaFighterOne.getHealth());
                    arenaFighterOne.setRegenHealth(arenaFighterOne.getFullHP());
                    arenaFighterOne.setReturnDamage(arenaFighterOne.getFullDamage());
                    winner[0] = arenaFighterOne;
                    return winner[0];
                } else if (arenaFighterTwo.isAlive()) {
                    System.out.println("Rounds passed = " + round);
                    System.out.println("Winner = " + arenaFighterTwo.getName() + "; Left health point = " + arenaFighterTwo.getHealth());
                    arenaFighterTwo.setRegenHealth(arenaFighterTwo.getFullHP());
                    arenaFighterTwo.setReturnDamage(arenaFighterTwo.getFullDamage());
                    winner[0] = arenaFighterTwo;
                    return winner[0];
                }

                if(round == 10) {
                    if (arenaFighterOne.getHealth() > arenaFighterTwo.getHealth()) {
                        System.out.println("Unanimous decision");
                        System.out.println("Winner = " + arenaFighterOne.getName() + "; Left health point = " + arenaFighterOne.getHealth());
                        arenaFighterOne.setRegenHealth(arenaFighterOne.getFullHP());
                        arenaFighterOne.setReturnDamage(arenaFighterOne.getFullDamage());
                        winner[0] = arenaFighterOne;
                        return winner[0];
                    } else if (arenaFighterTwo.getHealth() > arenaFighterOne.getHealth()) {
                        System.out.println("Unanimous decision");
                        System.out.println("Winner = " + arenaFighterTwo.getName() + "; Left health point = " + arenaFighterTwo.getHealth());
                        arenaFighterTwo.setRegenHealth(arenaFighterTwo.getFullHP());
                        arenaFighterTwo.setReturnDamage(arenaFighterTwo.getFullDamage());
                        winner[0] = arenaFighterTwo;
                        return winner[0];
                    }  else
                        throw new MyException(arenaFighterOne,arenaFighterTwo);
                }
            }

        } catch (MyException e) {
            e.getWinner();
        }
        return winner[0];
    }


    private void preRoundActions(ArenaFighter arenaFighterOne, ArenaFighter arenaFighterTwo, FightBreakAction.FightCallBack callBack) {
        if (arenaFighterOne instanceof FightBreakAction)
            ((FightBreakAction) arenaFighterOne).actionWithFight(arenaFighterTwo, callBack);
    }


    private void startAFight(ArenaFighter arenaFighterOne, ArenaFighter arenaFighterTwo, int takeDamageInFight) {
        if(arenaFighterOne instanceof ActionPreFight) {
            ((ActionPreFight) arenaFighterOne).actionWithFight(arenaFighterTwo);
        } else if (arenaFighterOne instanceof ActionPostFight)
        ((ActionPostFight) arenaFighterOne).action(arenaFighterTwo, takeDamageInFight);

    }

//    private void postRoundActions(ArenaFighter arenaFighterOne, ArenaFighter arenaFighterTwo, int damageTakeByArenaFightTwo) {
//        if (arenaFighterOne instanceof ActionPostFight)
//            ((ActionPostFight) arenaFighterOne).action(arenaFighterTwo, damageTakeByArenaFightTwo);
//    }

}