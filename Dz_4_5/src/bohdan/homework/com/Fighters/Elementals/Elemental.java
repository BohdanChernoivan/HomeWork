package bohdan.homework.com.Fighters.Elementals;

import bohdan.homework.com.Fighters.Base.Abilities.ElementalFighter;
import bohdan.homework.com.Fighters.Base.Actions.ActionPreFight;
import bohdan.homework.com.Fighters.Base.ArenaFighter;

public class Elemental extends ArenaFighter implements ActionPreFight, ElementalFighter {

    int element;

    public Elemental(String name, int health, int damage, double defense, int element) {
        super(name, health, damage, defense);
        this.element = element;
    }

    @Override
    public void actionWithFight(ArenaFighter arenaFighter) {
        if (arenaFighter instanceof ElementalFighter ? getCoincideElement(((ElementalFighter)arenaFighter).getElement()) : false) {
            takeDamage(arenaFighter.getDamage() / 2);
            if(getHealth() <= getFullHP() - (getDamage() * 2)) {
                setHealth(getDamage() * 2);
            }
        }
    }

    @Override
    public boolean getCoincideElement(int element) {
        int defaultElement = getElement() & element;
        boolean count;
        for (int x : elements) {
            count = (defaultElement & x) > 0 ? true : false;
            if(count == true) return true;
        }
        return false;
    }



    @Override
    public int getElement() {
        return element;
    }
}


//    @Override
//    public int getСomparisonElementEnemy(int element) {
//        int defaultElement = getElement() & element;
//        int count = 0;
//        for (int e : elements) {
//            count += (defaultElement & e) > 0 ? 1 : 0;
//        }
//        return count;
//    }