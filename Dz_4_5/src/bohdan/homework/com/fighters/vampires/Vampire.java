package bohdan.homework.com.Fighters.Vampires;

import bohdan.homework.com.Fighters.Base.Actions.ReturnMyDamage;
import bohdan.homework.com.Fighters.Base.Actions.ActionPreFight;
import bohdan.homework.com.Fighters.Base.ArenaFighter;

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
