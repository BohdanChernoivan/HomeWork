package bohdan.homework.com.fighters.dragons;

import bohdan.homework.com.fighters.base.abilities.ElementalFighter;
import bohdan.homework.com.fighters.base.actions.ActionPreFight;
import bohdan.homework.com.fighters.base.ArenaFighter;

public class Dragon extends ArenaFighter implements ElementalFighter, ActionPreFight {


    public int element;


    public Dragon(String name, int health, int damage, double defense, int element) {
        super(name, health, damage, defense);
        this.element = element;
    }


    public int getElement() {
        return element;
    }

    @Override
    public void actionWithFight(ArenaFighter arenaFighter) {
        int damage = getDamage() * bonusDamage(arenaFighter);
        arenaFighter.takeDamage(damage);
    }


    int bonusDamage(ArenaFighter arenaFighter) {
        int bonusDamage = getСomparisonElementEnemy(arenaFighter instanceof ElementalFighter ? (((ElementalFighter)arenaFighter).getElement()) : 1);
        return bonusDamage;
    }


    public int getСomparisonElementEnemy(int element) {
        int defaultElement = this.getElement() ^ element;
        int tempDefaultElement = ~defaultElement;
        int reversElements = tempDefaultElement | element;
        int sumElements = ~ reversElements;
        int count = 1;
        for (int e : elements) {
            count += (sumElements & e) > 0 ? 1 : 0;
        }
        return count;
    }


}