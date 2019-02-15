package bohdan.homework.com.fighters.knights;

import bohdan.homework.com.fighters.base.actions.ReturnMyDamage;
import bohdan.homework.com.fighters.base.actions.ActionPreFight;
import bohdan.homework.com.fighters.base.ArenaFighter;

public class DarkKnight extends Knight implements ActionPreFight, ReturnMyDamage {

    public DarkKnight(String name, int health, int damage, double defense, double shield) {
        super(name, health, damage, defense, shield);
    }

    @Override
    public void actionWithFight(ArenaFighter arenaFighter) {

        int thisFighterDamage = getDamageVampirism(this,arenaFighter);

        setHealth(thisFighterDamage);

        if (getHealth() > getFullHP()) {
            setRegenHealth(getFullHP());
        }
    }
}


