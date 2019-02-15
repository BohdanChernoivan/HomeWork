package bohdan.homework.com.fighters.base.actions;

import bohdan.homework.com.fighters.base.ArenaFighter;

public interface ReturnMyDamage {

    /**
     *
     * @param arenaFighterOur  Our Fighter
     * @param arenaFighterEnemy  Enemy Fighter
     * @return damage our fighter
     */
    default int getDamageVampirism(ArenaFighter arenaFighterOur, ArenaFighter arenaFighterEnemy) {
        return arenaFighterEnemy.getHealth() - arenaFighterEnemy.takeDamage(arenaFighterOur.getDamage());

    }
}
