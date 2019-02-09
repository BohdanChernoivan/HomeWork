package bohdan.homework.com.Fighters.Vampires;

import bohdan.homework.com.Fighters.Base.Abilities.ElementalFighter;
import bohdan.homework.com.Fighters.Base.Actions.ActionPreFight;
import bohdan.homework.com.Fighters.Base.ArenaFighter;

import java.util.Random;

public class TopVampire extends Vampire implements ActionPreFight, ElementalFighter {

    Random random = new Random();

    public int getRandomElement() {
        int randomElement = random.nextInt(elements.length);
        return elements[randomElement];
        }

    public TopVampire(String name, int health, int damage, double defense) {
        super(name, health, damage, defense);
        getElement();
    }

    @Override
    public int getElement() {
        return getRandomElement();
    }



    @Override
    public void actionWithFight(ArenaFighter arenaFighter) {

        if (getHealth() <= getFullHP() - getDamage()) {
            setHealth(getDamage());
            setDamage(getDamage() / 2);
        }
        arenaFighter.takeDamage(getDamage() * bonusDamage(arenaFighter));
        switch (getElement()) {
            case 1:
                System.out.println(getName() + " get fire." );
                break;
            case 2:
                System.out.println(getName() + " get water.");
                break;
            case 4:
                System.out.println(getName() + " get earth.");
                break;
            case 8:
                System.out.println(getName() + " get air.");
                break;
        }
    }

    int bonusDamage(ArenaFighter arenaFighter) {
        int bonus = getСomparisonElementEnemy(arenaFighter instanceof ElementalFighter ? (((ElementalFighter)arenaFighter).getElement()) : 1);
        return bonus;
    }


    public int getСomparisonElementEnemy(int element) {
        int defaultElement = getElement() ^ element;
        int tempDefaultElement = ~defaultElement;
        int reversElements = tempDefaultElement | element;
        int sumElements = ~ reversElements;
        int count = 1;
        for (int e : elements) {
            count += (sumElements & e) > 0 ? 2 : 0;
        }
        return count;
    }
}
