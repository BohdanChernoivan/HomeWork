package bohdan.homework.com.Fighters.Vampires;

import bohdan.homework.com.Fighters.Base.Actions.ActionPreFight;
import bohdan.homework.com.Fighters.Base.ArenaFighter;

public class Vampire extends ArenaFighter implements ActionPreFight {

    public Vampire(String name, int health, int damage, double defense) {
        super(name, health, damage, defense);
    }



    @Override
    public void actionWithFight(ArenaFighter arenaFighter) {

        int myDamage = arenaFighter.getHealth() - arenaFighter.takeDamage(getDamage());
        setHealth(myDamage);
        setDamage(myDamage / 2);


        if (getHealth() > getFullHP()) {
            setRegenHealth(getFullHP());
        }
    }
}
