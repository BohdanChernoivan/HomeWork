package bohdan.homework.com.Fighters.Base.Actions;

import bohdan.homework.com.Fighters.Base.ArenaFighter;

public interface ReturnMyDamage {

    /**
     *
     * @param arenaFighter  Our Fighter
     * @param arenaFighterEnemy  Enemy Fighter
     * @return damage our fighter
     */
    default int getDamageVampirism(ArenaFighter arenaFighter, ArenaFighter arenaFighterEnemy) {
        return arenaFighterEnemy.getHealth() - arenaFighterEnemy.takeDamage(arenaFighter.getDamage());
    }
}
