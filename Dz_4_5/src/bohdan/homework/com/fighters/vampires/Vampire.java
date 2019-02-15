package bohdan.homework.com.fighters.vampires;

import bohdan.homework.com.fighters.base.actions.ReturnMyDamage;
import bohdan.homework.com.fighters.base.actions.ActionPreFight;
import bohdan.homework.com.fighters.base.ArenaFighter;

public class Vampire extends ArenaFighter implements ActionPreFight, ReturnMyDamage {

    public Vampire(String name, int health, int damage, double defense) {
        super(name, health, damage, defense);
    }


    @Override
    public void actionWithFight(ArenaFighter arenaFighter) {

        int thisFighterDamage = getDamageVampirism(this, arenaFighter);
        try {
            setHealth(thisFighterDamage);
            setDamage(thisFighterDamage / 2);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }

        if (getHealth() > getFullHP()) {
            setRegenHealth(getFullHP());
        }
    }
}
