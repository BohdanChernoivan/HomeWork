package bohdan.homework.com.Arena;

import bohdan.homework.com.Fighters.Base.Actions.ActionPostFight;
import bohdan.homework.com.Fighters.Base.Actions.ActionPreFight;
import bohdan.homework.com.Fighters.Base.Actions.FightBreakAction;
import bohdan.homework.com.Fighters.Base.ArenaFighter;

public class Arena {


    public ArenaFighter fight(ArenaFighter arenaFighterOne, ArenaFighter arenaFighterTwo) { //TODO: does't correctly work
        int round = 1;

        final ArenaFighter[] winner = {null};
        do {
            preRoundActions(arenaFighterOne,arenaFighterTwo, (winner1) -> winner[0] = winner1);
            if(winner[0] != null) return winner[0];
            preRoundActions(arenaFighterTwo, arenaFighterOne, (winner1) -> winner[0] = winner1);
            if(winner[0] != null) return winner[0];

            int takeDamageOne = arenaFighterTwo.takeDamage(arenaFighterOne.getDamage());
            int takeDamageTwo = arenaFighterOne.takeDamage(arenaFighterTwo.getDamage());

            postRoundActions(arenaFighterOne,arenaFighterTwo,takeDamageTwo );
            postRoundActions(arenaFighterTwo,arenaFighterOne, takeDamageOne);

            if (arenaFighterOne.isAlive() && arenaFighterTwo.isAlive())
                round++;

            else if (arenaFighterOne.isAlive()) {
                System.out.println("Rounds passed = " + round);
                System.out.println("Winner = " + arenaFighterOne.getName() + "; Left health point = " + arenaFighterOne.getHealth());
                arenaFighterOne.setRegenHealth(arenaFighterOne.getFullHP());
                arenaFighterOne.setReturnDamage(arenaFighterOne.getFullDamage());
                return arenaFighterOne;
            }
            else if (arenaFighterTwo.isAlive()) {
                System.out.println("Rounds passed = " + round);
                System.out.println("Winner = " + arenaFighterTwo.getName() + "; Left health point = " + arenaFighterTwo.getHealth());
                arenaFighterTwo.setRegenHealth(arenaFighterTwo.getFullHP());
                arenaFighterTwo.setReturnDamage(arenaFighterTwo.getFullDamage());
                return arenaFighterTwo;
            }
            else return null;

        } while (round < 11);

    return arenaFighterOne; // rewrite!!!
    }
    public void preRoundActions (ArenaFighter arenaFighterOne, ArenaFighter arenaFighterTwo, FightBreakAction.FightCallBack callBack) {
        if(arenaFighterOne instanceof ActionPreFight)
            ((ActionPreFight) arenaFighterOne).actionWithFight(arenaFighterTwo);
        if(arenaFighterOne instanceof FightBreakAction)
            ((FightBreakAction) arenaFighterOne).actionWithFight(arenaFighterTwo, callBack);
    }

    public void postRoundActions (ArenaFighter arenaFighterOne, ArenaFighter arenaFighterTwo, int damageTakeByArenaFightTwo) {
        if (arenaFighterOne instanceof ActionPostFight)
            ((ActionPostFight) arenaFighterOne).action(arenaFighterTwo,damageTakeByArenaFightTwo);
    }

}

/*



  System.out.println("Fight is over");

        if (arenaFighterOne.isAlive()) {
            System.out.println(arenaFighterOne.getName() + " won");
        } else if (arenaFighterTwo.isAlive()) {
            System.out.println(arenaFighterTwo.getName() + " won");
        } else
            System.out.println("Both are dead.");
            */