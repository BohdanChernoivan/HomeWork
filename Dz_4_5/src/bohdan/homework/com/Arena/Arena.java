package bohdan.homework.com.Arena;

import bohdan.homework.com.Fighters.Base.Actions.ActionPostFight;
import bohdan.homework.com.Fighters.Base.Actions.ActionPreFight;
import bohdan.homework.com.Fighters.Base.Actions.FightBreakAction;
import bohdan.homework.com.Fighters.Base.ArenaFighter;

public class Arena {


    public ArenaFighter fight(ArenaFighter arenaFighterOne, ArenaFighter arenaFighterTwo) {

        int round = 1;
        int takeDamageOneFighter = arenaFighterTwo.takeDamage(arenaFighterOne.getDamage()); //deals damage
        int takeDamageTwoFighter = arenaFighterOne.takeDamage(arenaFighterTwo.getDamage()); //deals damage

        final ArenaFighter[] winner = {null};
        try {
            do {
                preRoundActions(arenaFighterOne, arenaFighterTwo, (winner1) -> winner[0] = winner1);
                if (winner[0] != null) break;
                preRoundActions(arenaFighterTwo, arenaFighterOne, (winner1) -> winner[0] = winner1);
                if (winner[0] != null) break;

                postRoundActions(arenaFighterOne, arenaFighterTwo, takeDamageTwoFighter);
                postRoundActions(arenaFighterTwo, arenaFighterOne, takeDamageOneFighter);

                if (arenaFighterOne.isAlive() && arenaFighterTwo.isAlive())
                    round++;

                else if (arenaFighterOne.isAlive()) {
                    System.out.println("Rounds passed = " + round);
                    System.out.println("Winner = " + arenaFighterOne.getName() + "; Left health point = " + arenaFighterOne.getHealth());
                    arenaFighterOne.setRegenHealth(arenaFighterOne.getFullHP());
                    arenaFighterOne.setReturnDamage(arenaFighterOne.getFullDamage());
                    return arenaFighterOne;
                } else if (arenaFighterTwo.isAlive()) {
                    System.out.println("Rounds passed = " + round);
                    System.out.println("Winner = " + arenaFighterTwo.getName() + "; Left health point = " + arenaFighterTwo.getHealth());
                    arenaFighterTwo.setRegenHealth(arenaFighterTwo.getFullHP());
                    arenaFighterTwo.setReturnDamage(arenaFighterTwo.getFullDamage());
                    return arenaFighterTwo;
                }

            } while (round < 11);
        } catch (NullPointerException error) {
            System.out.println("There is no winner " + error);
        }

            if (arenaFighterOne.getHealth() > arenaFighterTwo.getHealth()) {
                System.out.println("Early win!");
                System.out.println("Winner = " + arenaFighterOne.getName() + "; Left health point = " + arenaFighterOne.getHealth());
                arenaFighterOne.setRegenHealth(arenaFighterOne.getFullHP());
                arenaFighterOne.setReturnDamage(arenaFighterOne.getFullDamage());
                return arenaFighterOne;
            } else if (arenaFighterTwo.getHealth() > arenaFighterOne.getHealth()) {
                System.out.println("Early win!");
                System.out.println("Winner = " + arenaFighterTwo.getName() + "; Left health point = " + arenaFighterTwo.getHealth());
                arenaFighterTwo.setRegenHealth(arenaFighterTwo.getFullHP());
                arenaFighterTwo.setReturnDamage(arenaFighterTwo.getFullDamage());
                return arenaFighterTwo;
            } else if (winner[0] != null) {
                return winner[0];
            } else return null;
    }


    private void preRoundActions (ArenaFighter arenaFighterOne, ArenaFighter arenaFighterTwo, FightBreakAction.FightCallBack callBack) {
        if(arenaFighterOne instanceof ActionPreFight)
            ((ActionPreFight) arenaFighterOne).actionWithFight(arenaFighterTwo);
        if(arenaFighterOne instanceof FightBreakAction)
            ((FightBreakAction) arenaFighterOne).actionWithFight(arenaFighterTwo, callBack);
    }

    private void postRoundActions (ArenaFighter arenaFighterOne, ArenaFighter arenaFighterTwo, int damageTakeByArenaFightTwo) {
        if (arenaFighterOne instanceof ActionPostFight)
            ((ActionPostFight) arenaFighterOne).action(arenaFighterTwo,damageTakeByArenaFightTwo);
    }

}