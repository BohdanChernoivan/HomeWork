package bohdan.homework.com.Fighters.Knights;

import bohdan.homework.com.Fighters.Base.Actions.ActionPreFight;
import bohdan.homework.com.Fighters.Base.ArenaFighter;

public class DarkKnight extends Knight implements ActionPreFight {

    public DarkKnight(String name, int health, int damage, double defense, double shield) {
        super(name, health, damage, defense, shield);
    }

    @Override
    public void actionWithFight(ArenaFighter arenaFighter) {
        if (getHealth() <= getFullHP() - getDamage()) {
            setHealth(getDamage());
        }
    }
}


