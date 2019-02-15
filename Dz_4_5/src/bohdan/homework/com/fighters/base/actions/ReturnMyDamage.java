package bohdan.homework.com.Fighters.Base.Actions;

import bohdan.homework.com.Fighters.Base.ArenaFighter;

public interface ReturnMyDamage {

    /**
     *
     * @param arenaFighterOur  Our Fighter
     * @param arenaFighterEnemy  Enemy Fighter
     * @return damage our fighter
     */
    default int getDamageVampirism(ArenaFighter arenaFighterOur, ArenaFighter arenaFighterEnemy) {
        return arenaFighterOur.getDamage() - (arenaFighterOur.getDamage() * (int)arenaFighterEnemy.getDefense());

    }
}
