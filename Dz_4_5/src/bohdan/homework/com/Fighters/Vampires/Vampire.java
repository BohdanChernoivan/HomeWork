package bohdan.homework.com.Fighters.Vampires;

import bohdan.homework.com.Fighters.Base.Actions.ActionPreFight;
import bohdan.homework.com.Fighters.Base.ArenaFighter;

public class Vampire extends ArenaFighter implements ActionPreFight {

    public Vampire(String name, int health, int damage, double defense) {
        super(name, health, damage, defense);
    }



    @Override
    public void actionWithFight(ArenaFighter arenaFighter) {
        if (getHealth() <= getFullHP() - getDamage()) {
            setHealth(getDamage());
            setDamage(getDamage() / 2);
        }
    }
}
